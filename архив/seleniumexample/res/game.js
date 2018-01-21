var presentState=145;
var lastResponse;
var lastDecision="update";

var statuses=[
	"Вы успешно решили задачу.",
	"Произошло нечто ужасное. Вы проиграли.",
	"Коза съела капусту. Вы проиграли.",
	"Волк съел козу. Вы проиграли."
];
var characters = {
	wolf:"перевезти волка",
	goat:"перевезти козу",
	cabbage:"перевезти капусту",
	peasant:"переплыть одному"
};

function construct_button(character, active){
	if (active){
		return '<img id="' + character + '" src="/images/' + character + '.jpg" class="active" onclick="command(\'' + character +'\')"/>';
	} else {
		return '<img id="' + character + '" src="/images/' + character + '.jpg" onclick="command(\'' + character +'\')"/>'
	}
}

function construct_tip(response, borderName, error){
	var msg = "";
	if (error){
		msg = "Невозможно " + characters[lastDecision] + ". ";
	}
	var tip = [];
	response[borderName].forEach(function(val){
		tip.push(characters[val]);
	});
	msg += "Вы можете: " + tip.join(", ");
	$("#tip").html(msg);
}

function game_over(response){
	return typeof(response.status_code) != "undefined";
}

function construct_border(response, borderName, error){
	var isActive = response[borderName].includes("peasant") && !game_over(response);
	if (isActive){
		peasantSide = borderName;
		construct_tip(response, borderName, error);
	}
	var border = "";
	response[borderName].forEach(function(val){
		border += construct_button(val, isActive);
	});
	$("#" + borderName + "_side").html(border);
}

function redraw(response, error){
	console.log(response);
	presentState = response.id;
	construct_border(response, "left", error);
	construct_border(response, "right", error);
	if (game_over(response)){
		$("#tip").html(statuses[response.status_code] + " Обновите страницу, чтобы начать заново.");
	}
	lastResponse = response;
}

function update(response){
	redraw(response, false);
}

function report(){
	redraw(lastResponse, true);
}

function command(decision){
	var data = {
		present:presentState,
		option:decision
	};
	lastDecision = decision;
	$.get("boat.php", data).done(update).fail(report);
}

$.get("boat.php").done(update).fail(report);