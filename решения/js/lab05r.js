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
var in1999x = [-3, -2, -1, -3, -2, -1, -3, -2, -1];
var in1999y = [2, 2, 2, 1, 1, 1, 0, 0, 0];
for (var i = 0; i < in1999x.length; i++){
	var out = document.getElementById("1999t" + i);
	var ret = "{" + in1999x[i] + ";" + in1999y[i];
	if (task1999(in1999x[i], in1999y[i])){
		ret += "} принадлежит области";
	} else {
		ret += "} не принадлежит области";
	}
	out.innerHTML = ret;
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
var in7088x = [0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1,
	1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5];
var in7088y = [1, 1, 1, 1, 1, 0, 0, 0, 0, 0, -0.5, -0.5,
	-0.5, -0.5, -0.5, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2];
for (var i = 0; i < in7088x.length; i++){
	var out = document.getElementById("7088t" + i);
	var ret = "{" + in7088x[i] + ";" + in7088y[i];
	if (task7088(in7088x[i], in7088y[i])){
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
var in6740x = [0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4];
var in6740y = [0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1.5, -1.5, -1.5, -1.5, -1.5, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3];
for (var i = 0; i < in6740x.length; i++){
	var out = document.getElementById("6740t" + i);
	var ret = "{" + in6740x[i] + ";" + in6740y[i];
	if (task6740(in6740x[i], in6740y[i])){
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
var in7937w = ["1721","2473","0","877","1181","3491"];
var in7937h = ["661","449","1879","0","1033","3533"];
var in7937c = ["11","23","1163","7","0","1297"];
var in7937d = ["7","11","109","19","127","0"];
for (var i = 0; i < in7937w.length; i++){
	var out = document.getElementById("7937t" + i);
	try {
		var r = task7937(in7937w[i], in7937h[i], in7937c[i], in7937d[i]);
		out.innerHTML = r;
	} catch(e){
		out.innerHTML = e.message;
	}
}
