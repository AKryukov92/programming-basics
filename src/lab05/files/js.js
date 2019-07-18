function work19(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (x <= -2){
		if (y >= 1){
			div_out.innerHTML = "Принадлежит";
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	} else {
		if (y >= 1){
			div_out.innerHTML = "Не принадлежит";
		} else {
			div_out.innerHTML = "Принадлежит";
		}
	}
}
function work20(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (y <= 1.5){
		if(y >= -2) {
			div_out.innerHTML = "Принадлежит";
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	} else {
		if(y >= -2) {
			div_out.innerHTML = "Принадлежит";
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	}
}
function work21(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (y <= 4) {
		if (1 <= x) {
			if (x <= 2) {
				div_out.innerHTML = "Принадлежит";
			} else {
				div_out.innerHTML = "Не принадлежит";
			}
		}
	} else {
		if (1 <= x) {
			if (x <= 2) {
				div_out.innerHTML = "Принадлежит";
			} else {
				div_out.innerHTML = "Не принадлежит";
			}
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	}
}
function work22(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (2 <= y){
		if (x >= 1) {
			div_out.innerHTML = "Принадлежит";
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	} else {
		if (y <= 4){
			div_out.innerHTML = "Принадлежит";
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	}
}
function work23(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (2 <= x) {
		if (y <= -1) {
			div_out.innerHTML = "Принадлежит";
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	} else if (1 <= x) {
		if (0 <= y) {
			div_out.innerHTML = "Принадлежит";
		} else {
			div_out.innerHTML = "Не принадлежит";
		}
	} else {
		div_out.innerHTML = "Не принадлежит";
	}
}
function work24(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (2 < x){
		div_out.innerHTML = "Не принадлежит";
	} else {
		if (y >= 1){
			div_out.innerHTML = "Принадлежит";
		}
		if (y <= -1.5){
			div_out.innerHTML = "Принадлежит";
		}
		if (y < 1){
			if (1.5 < y) {
				div_out.innerHTML = "Не принадлежит";
			} else {
				div_out.innerHTML = "Принадлежит";
			}
		} else {
			div_out.innerHTML = "Принадлежит";
		}
	}
}
function work25(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (1 <= x && -2 <= y) {
		if (y > -1) {
			div_out.innerHTML = "Принадлежит";
		} else {
			if (x > 3) {
				div_out.innerHTML = "Не принадлежит";
			} else {
				div_out.innerHTML = "Принадлежит";
			}
		}
	} else {
		div_out.innerHTML = "Не принадлежит";
	}
}
function work26(){
	var div_out = document.getElementById("out");
	var in_x = document.getElementById("inX");
	var in_y = document.getElementById("inY");
	var x = parseFloat(in_x.value);
	var y = parseFloat(in_y.value);
	if (x >= 2){
		div_out.innerHTML = "Принадлежит";
	} else {
		if (y < 0.5){
			div_out.innerHTML = "Не принадлежит";
		}
	}
	if(y > 1.5) {
		div_out.innerHTML = "Не принадлежит";
	} else {
		div_out.innerHTML = "Принадлежит";
	}
}