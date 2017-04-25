function task2565(a,b){
	a = parseInt(a);
	b = parseInt(b);
	if (a > b){
		throw new Error("Значение A должно быть не больше значения B");
	}
	var r = "";
	var i = b;
	while (i >= a){
		r += i + " ";
		i--;
	}
	return r;
}
function task2594(a,b){
	a = parseInt(a);
	if (a < 0){
		throw new Error("Значение A должно быть неотрицательным");
	}
	var r = "&quot;";
	var i = 0;
	while (i < a){
		r += b;
		i++;
	}
	r += "&quot;";
	return r;
}
function task1483(n){
	n = parseInt(n);
	if (n < 0){
		throw new Error("Значение N должно быть неотрицательным");
	}
	var i = 0;
	var r = "";
	while (i < n){
		r += "!";
		if (i%5 == 0){
			r += " ";
		}
		i++;
	}
	return r;
}
function task3983(n){
	n = parseInt(n);
	var i = 0;
	var r = "";
	while (i < n){
		r += "#";
		if (i%20 == 0){
			r += "<br/>"
		}
		i++;
	}
	return r;
}
function task4236(y){
	if (y < 0 || y > 15){
		throw new Error("Значение Y должно быть в интервале [0, 15]");
	}
	var r = "";
	var i = 0;
	while(i < y){
		r += "#";
		i++;
	}
	while(i < 15){
		r += ".";
		i++;
	}
	return r;
}
function task8395(w){
	w = parseInt(w);
	if (w < 0 || w > 20){
		throw new Error("Значение W должно быть в интервале [0, 20]");
	}
	var ca = "", cb = "", cc = "", cd = "", ce = "", cf = "", cg = "", ch = "";
	for (var i = 0; i < w; i++){
		ca += "a";
		cb += "b";
		cc += "c";
		cd += "d";
		ce += "e";
		cf += "f";
		cg += "g";
		ch += "h";
	}
	return ca + "<br/>" + cb + "<br/>" + cc + "<br/>" + cd + "<br/>" + ce + "<br/>" + cf + "<br/>" + cg + "<br/>" + ch;
}
function task5568(w){
	if (w < 0 || w > 20){
		throw new Error("Значение W должно быть в интервале [0, 20]");
	}
	var r = "";
	for (var i = 0; i < 10; i++){
		for (var j = 0; j < w; j++){
			r += i;
		}
		r += "<br/>"
	}
	return r;
}
function task4075(w){
	if (w < 0){
		throw new Error("Значение W должно быть неотрицательным");
	}
	if (w < 2){
		return "";
	}
	var c1 = "+";
	var c2 = "|";
	for (var i = 1; i < w - 1; i++){
		c1 += "-";
		c2 += ".";
	}
	return c1 + "+<br/>" + c2 + "|<br/>" + c1 + "+";
}
function task5448(s,h){
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательным");
	}
	var r = "";
	for (var i = 1; i <= h; i++){
		for (var j = 0; j < i; j++){
			r += s;
		}
		r += "<br/>";
	}
	return r;
}
function task5238(w,h){
	if (w < 0){
		throw new Error("Значение W должно быть неотрицательно");
	}
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательно");
	}
	if (w == 0 || h == 0){
		return "";
	}
	var r = "";
	for (var i = 0; i < h; i++){
		var j = 0;
		while (j < w - i){
			r += "+";
			j++;
		}
		while (j < w){
			r += "#";
			j++;
		}
		r += "\n";
	}
	return r;
}