var in8878a = ["5", "11", "-2", "-13"];
var in8878b = ["6", "7", "3", "-18"];
for (var i = 0; i < in8878a.length; i++){
	var out = document.getElementById("8878t" + i);
	if(task8878(in8878a[i], in8878b[i])){
		out.innerHTML = "Первое";
	} else {
		out.innerHTML = "Второе";
	}
}
var in3072p = ["173", "359", "439", "0"];
var in3072q = ["179", "271", "-761", "-15"];
for (var i = 0; i < in3072p.length; i++){
	var out = document.getElementById("3072t" + i);
	var r = task3072(in3072p[i], in3072q[i]);
	out.innerHTML = "Максимальное " + r.max + ", минимальное " + r.min;
}
var in5980 = ["9","0","-7"];
for (var i = 0; i < in5980.length; i++){
	var out = document.getElementById("5980t" + i);
	out.innerHTML = task5980(in5980[i]);
}
var in8174 = ["-5", "-11", "7", "13", "0"];
for (var i = 0; i < in8174.length; i++){
	var out = document.getElementById("8174t" + i);
	out.innerHTML = task8174(in8174[i]);
}
var in4257l = ["0.7","0.3","0.05","-2","300"];
var in4257p = ["2297", "983", "101", "15", "-113"];
for (var i = 0; i < in4257l.length; i++){
	var out = document.getElementById("4257t" + i);
	try {
		if (task4257(in4257l[i], in4257p[i])){
			out.innerHTML = "Расстояние в километрах меньше";
		} else {
			out.innerHTML = "Расстояние в футах меньше";
		}
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in2291v1 = ["0.004", "0.0013", "-0.0006", "0.1004"];
var in2291v2 = ["13000", "5000", "3989", "-2891"];
for (var i = 0; i < in2291v1.length; i++){
	var out = document.getElementById("2291t" + i);
	try {
		if (task2291(in2291v1[i], in2291v2[i])){
			out.innerHTML = "V1 (км/ч) меньше V2 (м/с)";
		} else {
			out.innerHTML = "V2 (м/с) меньше V1(км/ч)";
		}
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in1763r = ["15", "29", "-17", "37"];
var in1763a = ["31", "41", "23", "-5"];
for (var i = 0; i < in1763r.length; i++){
	var out = document.getElementById("1763t" + i);
	try {
		if (task1763(in1763r[i], in1763a[i])){
			out.innerHTML = "Площадь квадрата больше площади круга";
		} else {
			out.innerHTML = "Площадь круга больше площади квадрата";
		}
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in5662a = ["1", "3", "3", "0"];
var in5662b = ["2", "17", "6", "7"];
var in5662c = ["3", "5", "3", "13"];
for (var i = 0; i < in5662a.length; i++){
	var out = document.getElementById("5662t" + i);
	var r = task5662(in5662a[i], in5662b[i], in5662c[i]);
	out.innerHTML = r;
}
var in1945sc = ["17","13","-20","300"];
var in1945ss = ["19","19","4","-200"];
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
var in1186x = ["6.35","4.71","19.99","-2.28","-18.71","3.44","-0.09"];
var in1186y = ["2.7","5.59","-9.57","16.92","-7.6","-14.98","-16.6"];
var in1186z = ["5.08","-18.55","12.75","6.14","6.27","-8.26","-1.84"];
for (var i = 0; i < in1186x.length; i++){
	var out = document.getElementById("1186t" + i);
	var arr = task1186(in1186x[i], in1186y[i], in1186z[i]);
	out.innerHTML = arr.join(";");
}
var in8715a = ["1","-4","7","0","4","-2","10","5"];
var in8715b = ["2","0","4","5","4","4","3","1"];
var in8715c = ["3","5","-2","-7","4","3","5","7"];
for (var i = 0; i < in8715a.length; i++){
	var out = document.getElementById("8715t" + i);
	if (task8715(in8715a[i],in8715b[i],in8715c[i])){
		out.innerHTML = "Выполняется";
	} else {
		out.innerHTML = "Не выполняется";
	}
}
var in8518 = ["a","d","h","i"];
for (var i = 0; i < in8518.length; i++){
	var out = document.getElementById("8518t" + i);
	out.innerHTML = task8518(in8518[i]);
}
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
var in7991x = ["6.35","4.71","19.99","-2.28"];
var in7991y = ["2.7","2.59","-1.57","16.92"];
var in7991z = ["5.08","-18.55","2.75","6.14"];
for (var i = 0; i < in7991x.length; i++){
	var out = document.getElementById("7991t" + i);
	var arr = task7991(in7991x[i],in7991y[i],in7991z[i]);
	out.innerHTML = arr.join(" ");
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
var in3770x = ["1","7","0"];
var in3770y = ["2","4","5"];
var in3770z = ["3","-2","-7"];
for (var i = 0; i < in3770x.length; i++){
	var out = document.getElementById("3770t" + i);
	var r = task3770(in3770x[i], in3770y[i], in3770z[i]);
	out.innerHTML = r;
}
var in7178m = ["36","41","15"];
var in7178p = ["2","7","0"];
for (var i = 0; i < in7178m.length; i++){
	var out = document.getElementById("7178t" + i);
	try {
		out.innerHTML = task7178(in7178m[i],in7178p[i]);
	} catch(e){
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
var in5635p = [{x:1,y:1},{x:5,y:5},{x:3,y:1},
{x:3,y:1},{x:0,y:-1},{x:1,y:1},
{x:1,y:1},{x:1,y:1},{x:1,y:1}];
var in5635r = [
{x:0,y:0,h:2,w:3},{x:0,y:0,h:2,w:3},{x:0,y:0,h:2,w:3},
{x:0,y:0,h:2,w:3},{x:0,y:0,h:1,w:1},{x:2,y:2,h:0,w:3},
{x:2,y:2,h:-1,w:3},{x:2,y:2,h:3,w:0},{x:2,y:2,h:3,w:-1}];
for (var i = 0; i < in5635p.length; i++){
	var out = document.getElementById("5635t" + i);
	try {
		if (task5635(in5635p[i], in5635r[i])){
			out.innerHTML = "точка внутри";
		} else {
			out.innerHTML = "точка не внутри";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}