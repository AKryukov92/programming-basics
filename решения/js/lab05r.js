
var in3072p = ["173", "359", "439", "0"];
var in3072q = ["179", "271", "-761", "-15"];
for (var i = 0; i < in3072p.length; i++){
	var out = document.getElementById("3072t" + i);
	var r = task3072(in3072p[i], in3072q[i]);
	out.innerHTML = "Максимальное " + r.max + ", минимальное " + r.min;
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
var in2291v1 = ["60.5", "17950", "-0.6", "0.1004"];
var in2291v2 = ["16.8", "5000", "0.2", "-0.028"];
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
var in1945sc = ["17", "13", "7854", "5808", "-20", "300"];
var in1945ss = ["19", "19", "8100", "8100", "4", "-200"];
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
var in8518 = ["a","d","h","i"];
for (var i = 0; i < in8518.length; i++){
	var out = document.getElementById("8518t" + i);
	out.innerHTML = task8518(in8518[i]);
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
var in3878t = [{x:2,y:2},{x:1,y:3},{x:0,y:0},{x:0,y:1},{x:1,y:1},{x:-1,y:1}];
var in3878p1 = [{x:1,y:1},{x:0,y:0},{x:1,y:1},{x:1,y:1},{x:1,y:1},{x:1,y:1}];
var in3878p2 = [{x:3,y:3},{x:2,y:6},{x:2,y:2},{x:2,y:2},{x:2,y:2},{x:2,y:2}];
for (var i = 0; i < in3878t.length; i++){
	var out = document.getElementById("3878t" + i);
	try {
		if (task3878(in3878t[i], in3878p1[i], in3878p2[i])){
			out.innerHTML = "Точка принадлежит прямой";
		} else {
			out.innerHTML = "Точка не принадлежит прямой";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in1217i1 = [{a:2,b:3},{a:11,b:17},{a:23,b:37},{a:43,b:53},{a:5,b:15},{a:67,b:71},{a:79,b:73},{a:97,b:101}];
var in1217i2 = [{a:5,b:7},{a:13,b:19},{a:29,b:31},{a:41,b:47},{a:0,b:30},{a:59,b:61},{a:83,b:89},{a:107,b:103}];
for (var i = 0; i < in1217i1.length; i++){
	var out = document.getElementById("1217t" + i);
	try {
		if (task1217check(in1217i1[i], in1217i2[i])){
			var r = task1217x(in1217i1[i], in1217i2[i]);
			out.innerHTML = "пересекаются (" + r.a + ";" + + r.b + ")";
		} else {
			out.innerHTML = "Не пересекаются";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in1438r1 = [{x:10,y:10,h:200,w:100},{x:25,y:25,h:200,w:200},{x:102,y:200,h:100,w:200},{x:500,y:200,h:100,w:200},{x:60,y:70,h:120,w:200},{x:100,y:100,h:200,w:200},{x:150,y:150,h:150,w:300},{x:100,y:0,h:100,w:500},{x:5,y:0,h:10,w:10},{x:105,y:5,h:10,w:10},{x:150,y:150,h:50,w:300},{x:0,y:0,h:802,w:200},{x:200,y:200,h:100,w:100},{x:125,y:138,h:0,w:1},{x:100,y:100,h:120,w:220}];
var in1438r2 = [{x:50,y:50,h:300,w:350},{x:225,y:225,h:200,w:200},{x:0,y:500,h:100,w:120},{x:10,y:400,h:100,w:120},{x:50,y:50,h:120,w:200},{x:200,y:200,h:50,w:50},{x:150,y:150,h:150,w:300},{x:0,y:200,h:700,w:100},{x:0,y:5,h:10,w:10},{x:100,y:0,h:10,w:30},{x:100,y:100,h:300,w:200},{x:0,y:0,h:610,w:610},{x:900,y:200,h:100,w:10},{x:205,y:202,h:61,w:62},{x:220,y:100,h:120,w:220}];
for (var i = 0; i < in1438r1.length; i++){
	var out = document.getElementById("1438t" + i);
	try {
		if (task1438check(in1438r1[i], in1438r2[i])){
			var r = task1438x(in1438r1[i], in1438r2[i]);
			out.innerHTML = "пересекаются " + JSON.stringify(r);
		} else {
			out.innerHTML = "Не пересекаются";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in2153 = ["13","44","60","0","61"];
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
