var in4257l = ["0.7","0.3","0.05","-2","300"];
var in4257p = ["2297", "983", "101", "15", "-113"];
for (var i = 0; i < in4257l.length; i++){
	var out = document.getElementById("4257t" + i);
	try {
		if (task4257(in4257l[i], in4257p[i])){
			out.innerHTML = "Кабеля хватит. Расстояние меньше длины кабеля.";
		} else {
			out.innerHTML = "Кабеля не хватит. Длина кабеля меньше расстояния.";
		}
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in2291v1 = ["60.5", "17950", "0", "200", "-0.6", "0.1004"];
var in2291v2 = ["16.8", "5000", "10", "0", "0.2", "-0.028"];
for (var i = 0; i < in2291v1.length; i++){
	var out = document.getElementById("2291t" + i);
	try {
		var result = task2291(in2291v1[i], in2291v2[i]);
		out.innerHTML = result;
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in1763r = ["15", "29", "-17", "37"];
var in1763a = ["31", "41", "23", "-5"];
for (var i = 0; i < in1763r.length; i++){
	var out = document.getElementById("1763t" + i);
	try {
		var result = task1763(in1763r[i], in1763a[i]);
		out.innerHTML = result;
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in1945sc = ["17","13","7854","5808","-20","300"];
var in1945ss = ["19","19","8100","8100","4","-200"];
for (var i = 0; i < in1945sc.length; i++){
	var out = document.getElementById("1945t" + i);
	try {
		if (task1945(in1945sc[i],in1945ss[i])){
			out.innerHTML = "Круг уместится в квадрате";
		} else {
			out.innerHTML = "Круг не поместится в квадрате";
		}
	} catch (e) {
		out.innerHTML = e.message;
	}
}
var in6291a = ["13","21","29","61","211","-151","193","101"];
var in6291b = ["17","21","2","47","211","239","-193","83"];
var in6291c = ["14","37","29","47","211","239","3","-101"];
for (var i = 0; i < in6291a.length; i++){
	var out = document.getElementById("6291t" + i);
	try {
		if(task6291(in6291a[i],in6291b[i],in6291c[i])){
			out.innerHTML = "Треугольник является равнобедренным.";
		} else {
			out.innerHTML = "Треугольник не является равнобедренным.";
		}
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in3883 = ["1234","9171","100","98765"];
for (var i = 0; i < in3883.length; i++){
	var out = document.getElementById("3883t" + i);
	try {
		if (task3883(in3883[i])){
			out.innerHTML = "равно";
		} else {
			out.innerHTML = "не равно";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in4527 = ["1","2","3","8","-10","26","40","100","-20","300"];
for (var i = 0; i < in4527.length; i++){
	var out = document.getElementById("4527t" + i);
	try {
		out.innerHTML = task4527(in4527[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in6556a = ["3","13","23","-2","3","13","6911"];
var in6556b = ["5","11","3","8","-4","15","5881"];
var in6556c = ["7","7","9","9","5","-17","3203"];
var in6556d = ["9","19","11","7","6","19","-4639"];
for (var i = 0; i < in6556a.length; i++){
	var out = document.getElementById("6556t" + i);
	try {
		if(task6556(in6556a[i],in6556b[i],in6556c[i],in6556d[i])){
			out.innerHTML = "Размещение возможно";
		} else {
			out.innerHTML = "Размещение невозможно";
		}
	} catch(e) {
		out.innerHTML = e.message;
	}
}
var in2153 = ["0", "1", "2", "3", "4", "5", "13", "59", "60", "61"];
for (var i = 0; i < in2153.length; i++){
	var out = document.getElementById("2153t" + i);
	try {
		if (task2153(in2153[i])){
			out.innerHTML = "Зеленый";
		} else {
			out.innerHTML = "Красный";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5170 = ["6", "3219","7","2017","-10"];
for (var i = 0; i < in5170.length; i++){
	var out = document.getElementById("5170t" + i);
	try {
		if (task5170(in5170[i])){
			out.innerHTML = "число простое";
		} else {
			out.innerHTML = "число не простое";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}