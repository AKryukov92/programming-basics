var in4425a = ["0","3","9","5","-1","0"];
var in4425data = ["4 3 2 1", "4 3 2 1", "0 9 8 7 6 5 4 3 2 1", "4 3 2 1", "4 3 2 1", ""];
for (var i = 0; i < in4425a.length; i++){
	var out = document.getElementById("4425t" + i);
	try {
		out.innerHTML = task4425(in4425a[i], in4425data[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in1223 = ["1 2 3 4 1", "1 2 3 4 1 2 3 4 1 2", ""];
for (var i = 0; i < in1223.length; i++){
	var out = document.getElementById("1223t" + i);
	out.innerHTML = task1223(in1223[i]).join(" ");
}
var in3946 = ["1 2 3 4 1", "1 2 3 4 1 3 4 4 4 4", ""];
for (var i = 0; i < in3946.length; i++){
	var out = document.getElementById("3946t" + i);
	out.innerHTML = task3946(in3946[i]);
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
var in8311b = ["0","3","2","8","11","-1","8"];
var in8311e = ["3","10","2","2","8","5","50"];
var in8311data = ["1 2 3 4 1", "1 2 3 4 1 2 3 4 1 2 3",
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
var in7290b = ["3", "2", "0", "4", "7", "1", "-5", "10"];
var in7290data = ["1 1 1 3 4 1", "1 2 3 4 1 2", "3 4 1 2 3 4 1 2 3 1 2",
"4 2 3 4 3 2", "4 4 4 4 4 3 2 1", "4 4 4 4", "1 1 1 3 4 1", "1 2 3"];
for (var i = 0; i < in7290b.length; i++){
	var out = document.getElementById("7290t" + i);
	try {
		out.innerHTML = task7290(in7290b[i], in7290data[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5694 = ["a", "d", "h", "i", "z"];
for (var i = 0; i < in5694.length; i++){
	var out = document.getElementById("5694t" + i);
	out.innerHTML = task5694(in5694[i]);
}
var in6806 = ["10","15","20","9","23"];
for (var i = 0; i < in6806.length; i++){
	var out = document.getElementById("6806t" + i);
	out.innerHTML = task6806(in6806[i]);
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
var in7035 = ["1 2 3 4 5 6", "3 4 1 2 3 4 1 2 3 1 2", "4 2 3 4 3 2", "4 4 4 4 4 3 8 9", "4 4 4 4", "4 3"];
for (var i = 0; i < in7035.length; i++){
	var out = document.getElementById("7035t" + i);
	out.innerHTML = task7035(in7035[i]);
}
