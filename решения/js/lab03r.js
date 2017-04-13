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