var in4411 = ["11.13", "-7919", "0"];
for (var i = 0; i < in4411.length; i++){
	var out = document.getElementById("4411t" + i);
	out.innerHTML = task4411(in4411[i]);
}
var in9298 = ["1","5","0","-2"];
for (var i = 0; i < in9298.length; i++){
	var out = document.getElementById("9298t" + i);
	try {
		out.innerHTML = task9298(in9298[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in3354 = ["7", "11", "0", "-3"];
for (var i = 0; i < in3354.length; i++){
	var out = document.getElementById("3354t" + i);
	try {
		out.innerHTML = task3354(in3354[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in5201 = ["13", "17", "0", "-2"];
for (var i = 0; i < in5201.length; i++){
	var out = document.getElementById("5201t" + i);
	try {
		out.innerHTML = task5201(in5201[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in2981 = ["19", "23", "0", "-7"];
for (var i = 0; i < in2981.length; i++){
	var out = document.getElementById("2981t" + i);
	try {
		out.innerHTML = task2981(in2981[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in4312a = ["1","2","0","-2","3"];
var in4312h = ["1","3","10","1","-4"];
for (var i = 0; i < in4312a.length; i++){
	var out = document.getElementById("4312t" + i);
	try {
		out.innerHTML = task4312(in4312a[i], in4312h[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in8428 = ["45","1125","0","360","90","2000"];
for (var i = 0; i < in8428.length; i++){
	var out = document.getElementById("8428t" + i);
	out.innerHTML = task8428(in8428[i]);
}
var in2361t = ["400","103","300","-800"];
var in2361l = ["17","29","-70","20"];
for (var i = 0; i < in2361t.length; i++){
	var out = document.getElementById("2361t" + i);
	try {
		out.innerHTML = task2361(in2361t[i], in2361l[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in5063 = ["365","45","1125","1500","2000","0","360"];
for (var i = 0; i < in5063.length; i++){
	var out = document.getElementById("5063t" + i);
	out.innerHTML = task5063(in5063[i]);
}
var in7711 = ["45", "1125", "7639", "360", "90"];
for (var i = 0; i < in7711.length; i++){
	var out = document.getElementById("7711t" + i);
	out.innerHTML = task7711(in7711[i]);
}
var in8833 = ["7606", "9", "0", "-7603"];
for (var i = 0; i < in8833.length; i++){
	var out = document.getElementById("8833t" + i);
	try {
		out.innerHTML = task8833(in8833[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in1262 = ["7583", "200", "360", "90"];
for (var i = 0; i < in1262.length; i++){
	var out = document.getElementById("1262t" + i);
	out.innerHTML = task1262(in1262[i]);
}
var in9020 = ["7573", "75", "0", "-9"];
for (var i = 0; i < in9020.length; i++){
	var out = document.getElementById("9020t" + i);
	try {
		out.innerHTML = task9020(in9020[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}
