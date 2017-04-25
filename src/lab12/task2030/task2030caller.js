var in4847x = ["31","19","7","67","1"];
var in4847y = ["59","19","11","-67","1"];
var in4847z = ["83","41","11","67","1"];
for (var i = 0; i < in4847x.length; i++){
    var out = document.getElementById("4847t" + i);
    if (task4847(in4847x[i],in4847y[i],in4847z[i])){
        out.innerHTML = "Среди чисел есть равные";
    } else {
        out.innerHTML = "Числа не равны друг другу.";
    }
}

var in4042x = [2, 1, 0, -1, -2];
var in4042y = [2, 1.5, 0, -2, -3];
for (var i = 0; i < in4042x.length; i++){
    var out = document.getElementById("4042t" + i);
    var ret = "{" + in4042x[i] + ";" + in4042y[i];
    if (task4042(in4042x[i], in4042y[i])){
        ret += "} принадлежит области";
    } else {
        ret += "} не принадлежит области";
    }
    out.innerHTML = ret;
}

var in6351x = [0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3];
var in6351y = [5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2];
for (var i = 0; i < in6351x.length; i++){
    var out = document.getElementById("6351t" + i);
    var ret = "{" + in6351x[i] + ";" + in6351y[i];
    if (task6351(in6351x[i], in6351y[i])){
        ret += "} принадлежит области";
    } else {
        ret += "} не принадлежит области";
    }
    out.innerHTML = ret;
}

var in5382x = [5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0];
var in5382y = [5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1];
for (var i = 0; i < in5382x.length; i++){
    var out = document.getElementById("5382t" + i);
    var ret = "{" + in5382x[i] + ";" + in5382y[i];
    if (task5382(in5382x[i], in5382y[i])){
        ret += "} принадлежит области";
    } else {
        ret += "} не принадлежит области";
    }
    out.innerHTML = ret;
}

var in7250x = [1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3];
var in7250y = [2, 2, 2, 1, 1, 1, 0, 0, 0, -1.5, -1.5, -1.5, -2, -2, -2];
for (var i = 0; i < in7250x.length; i++){
    var out = document.getElementById("7250t" + i);
    var ret = "{" + in7250x[i] + ";" + in7250y[i];
    if (task7250(in7250x[i], in7250y[i])){
        ret += "} принадлежит области";
    } else {
        ret += "} не принадлежит области";
    }
    out.innerHTML = ret;
}

var in9038x = [1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3];
var in9038y = [2, 2, 2, 1.5, 1.5, 1.5, 1, 1, 1, 0.5, 0.5, 0.5, 0, 0, 0];
for (var i = 0; i < in9038x.length; i++){
    var out = document.getElementById("9038t" + i);
    var ret = "{" + in9038x[i] + ";" + in9038y[i];
    if (task9038(in9038x[i], in9038y[i])){
        ret += "} принадлежит области";
    } else {
        ret += "} не принадлежит области";
    }
    out.innerHTML = ret;
}

var in7491 = ["bx","fw","123"];
for (var i = 0; i < in7491.length; i++){
    var out = document.getElementById("7491t" + i);
    if (task7491(in7491[i])){
        out.innerHTML = "Содержится";
    } else {
        out.innerHTML = "Не содержится";
    }
}

var in4515 = ["9 8 7 6 5", "4 3 2 1 5 6 7 8 9 0", "1 2 3 1"];
for (var i = 0; i < in4515.length; i++){
    var out = document.getElementById("4515t" + i);
    if (task4515(in4515[i])){
        out.innerHTML = "Повторения есть";
    } else {
        out.innerHTML = "Повторений нет";
    }
}

var in7491 = ["bx","fw","123"];
for (var i = 0; i < in7491.length; i++){
	var out = document.getElementById("7491t" + i);
	if (task7491(in7491[i])){
		out.innerHTML = "Содержится";
	} else {
		out.innerHTML = "Не содержится";
	}
}

var in4515 = ["9 8 7 6 5", "4 3 2 1 5 6 7 8 9 0", "1 2 3 1"];
for (var i = 0; i < in4515.length; i++){
	var out = document.getElementById("4515t" + i);
	if (task4515(in4515[i])){
		out.innerHTML = "Повторения есть";
	} else {
		out.innerHTML = "Повторений нет";
	}
}