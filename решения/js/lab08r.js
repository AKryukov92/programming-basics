var in1223 = ["1 2 3 4 1", "1 2 3 4 1 2 3 4 1 2", ""];
for (var i = 0; i < in1223.length; i++){
	var out = document.getElementById("1223t" + i);
	out.innerHTML = task1223(in1223[i]).join(" ");
}
var in3940l = ["1 2 3 4 1", "1 2 3 4 1 3 4 4 4 4", "1 2 3", "1 2 3"];
var in3940r = ["2 3 4 1 2", "3 4 1 2 3 4 1 2 3 4", "3 4", "3 4 1 2"];
for (var i = 0; i < in3940l.length; i++){
	var out = document.getElementById("3940t" + i);
	try {
		out.innerHTML = task3940(in3940l[i], in3940r[i]).join(" ");
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in8311b = ["0","1","2","3","2","8","11","-1","8"];
var in8311e = ["3","3","3","10","2","2","8","5","50"];
var in8311data = ["1 2 3 4 1", "1 2 3 4 1", "1 2 3 4 1", "1 2 3 4 1 2 3 4 1 2 3",
"1 2 3 4 1 2 3 4 1 2 3", "1 2 3 4 1 2 3 4 1 2 3",
"1 2 3 4 1 2 3 4 1 2 3", "1 2 3 4 1 2 3 4 1 2 3", "1 2 3 4 1 2 3 4 1 2 3"];
for (var i = 0; i < in8311b.length; i++){
	var out = document.getElementById("8311t" + i);
	try {
		out.innerHTML = task8311(in8311b[i], in8311e[i], in8311data[i]).join(" ");
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in3134p = ["0","2","4","-1","2","19","1"];
var in3134q = ["3","5","2","5","17","2","-5"];
var in3134data = "1 2 3 4 1 2";
for (var i = 0; i < in3134p.length; i++){
	var out = document.getElementById("3134t" + i);
	try {
		out.innerHTML = task3134(in3134p[i], in3134q[i], in3134data).join(" ");
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in9774m = ["31","-3"];
var in9774data = ["1 2 3 4 1 2", "1 2 3 4 1 2"];
for (var i = 0; i < in9774m.length; i++){
	var out = document.getElementById("9774t" + i);
	out.innerHTML = task9774(in9774m[i], in9774data[i]).join(" ");
}
var in9711 = ["1 2 3 4 1 2", "3 4 1 2 3 4 1 2 3 4", ""];
for (var i = 0; i < in9711.length; i++){
	var out = document.getElementById("9711t" + i);
	out.innerHTML = task9711(in9711[i]).join(" ");
}
var in3333s = ["1","3","6","8","99","-2","-9"];
var in3333data = "1 2 3 4 1 2";
for (var i = 0; i < in3333s.length; i++){
	var out = document.getElementById("3333t" + i);
	out.innerHTML = task3333(in3333s[i], in3333data).join(" ");
}
var in8820 = ["1 2 3 4 1 2", "1 2 3 4 1 2 3 4 1 2 3"];
for (var i = 0; i < in8820.length; i++){
	var out = document.getElementById("8820t" + i);
	out.innerHTML = task8820(in8820[i]).join(" ");
}

var in9271 = ["1 2 3 4 1 2", "3 4 1 2 3 4 1 2 3 1 2", "4 2 3 4 3 2","4 4 4 4 4 3 2 1","4 4 4 4", "4 3"];
for (var i = 0; i < in9271.length; i++){
	var out = document.getElementById("9271t" + i);
	out.innerHTML = task9271(in9271[i]).join(" ");
}
var in4497x = ["1","3","5"];
var in4497y = ["33","55","1"];
var in4497data = ["1 2 3 4 1 2","1 2 3 4 1 2", "1 2 3 4 1 2"];
for (var i = 0; i < in4497x.length; i++){
	var out = document.getElementById("4497t" + i);
	out.innerHTML = task4497(in4497x[i],in4497y[i],in4497data[i]).join(" ");
}
var in3218 = ["1 2 3 4 1 2", "1 2 3 4 1 2 3 4 1 2 3"];
for (var i = 0; i < in3218.length; i++){
	var out = document.getElementById("3218t" + i);
	out.innerHTML = task3218(in3218[i]).join(" ");
}
var in7703 = ["1 2 3 4 1 2","1 2 3 4 1 2 3 4 1 2 3","3 2 2 2 2 2","4 4 4 4 4 4"];
for (var i = 0; i < in7703.length; i++){
	var out = document.getElementById("7703t" + i);
	out.innerHTML = task7703(in7703[i]).join(" ");
}
var in5541 = ["1 1 1 1", "1 1 2 2", "1 1 1 2", "1 2 3 4", "1 2 3 4 1 2", "1 1 3 3 2 2"];
for (var i = 0; i < in5541.length; i++){
	var out = document.getElementById("5541t" + i);
	var data = task5541(in5541[i]);
	var result = "";
	for (item in data){
		result += item + " ";
	}
	out.innerHTML = result;
}