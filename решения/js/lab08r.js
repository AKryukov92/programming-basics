var in4425a = ["0","3","9","5","-1","0"];
var in4425data = ["q w e r", "q w e r", "q w e r t y u i o p", "q w e r", "q w e r", ""];
for (var i = 0; i < in4425a.length; i++){
	var out = document.getElementById("4425t" + i);
	try {
		out.innerHTML = task4425(in4425a[i], in4425data[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5683 = [
	"qw er ty",
	"qw er ty ui op",
	"asd fgh jkl",
	"",
	"q w e r a s d f z x c v"
];
for (var i = 0; i < in5683.length; i++){
	var out = document.getElementById("5683t" + i);
	out.innerHTML = task5683(in5683[i]);
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
var in7369top = [
	"q a z w s x",
	"e d c",
	"a a a a",
	"r f v",
	""
];
var in7369left = [
	"q w e",
	"a s d f g h j",
	"a a a a",
	"",
	"z x c v"
];
for (var i = 0; i < in7369left.length; i++){
	var out = document.getElementById("7369t" + i);
	out.innerHTML = task7369(in7369left[i], in7369top[i]);
}
var in5894top = [
	"q a z",
	"qw fg hj ty kl",
	"oiuy hjkl vbmn",
	"a s d f",
	""
];
var in5894left = [
	"q w e",
	"qw er ty ui op",
	"asdf ghjk",
	"",
	"zxc vbn"
];
for (var i = 0; i < in5894left.length; i++){
	var out = document.getElementById("5894t" + i);
	try {
		var result = task5894(in5894left[i], in5894top[i]);
		out.innerHTML = "Повторений: " + result;
	} catch (e) {
		out.innerHTML = e.message;
	}
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
var in9271 = ["1 2 3 4 1 2", "3 4 1 2 3 4 1 2 3 1 2", "4 2 3 4 3 2","4 4 4 4 4 3 2 1","4 4 4 4", "4 3"];
for (var i = 0; i < in9271.length; i++){
	var out = document.getElementById("9271t" + i);
	out.innerHTML = task9271(in9271[i]).join(" ");
}
var in8769p = ["1","8","0","0","1","-1","5"];
var in8769q = ["3","10","5","5","7","0","10"];
var in8769data = ["1 2 3 4 1 2", "3 4 4 2 3 4 1 2 3 1 2", "4 2 3 4 3 2", "4 4 4 4 4 3 2 1", "4 4 4 4", "4 3", "1 2 3 4"];
for (var i = 0; i < in8769p.length; i++){
	var out = document.getElementById("8769t" + i);
	try {
		out.innerHTML = task8769(in8769p[i],in8769q[i],in8769data[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
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
var in4283k = ["3","5","2","1"];
var in4283data = ["1 2 3 4 1 2","1 2 3 4 1 2 3 4 1 2 3","3 2 2 2 2 2", "4 4 4 4 4 4"];
for (var i = 0; i < in4283k.length; i++){
	var out = document.getElementById("4283t" + i);
	out.innerHTML = task4283(in4283k[i], in4283data[i]);
}
var in7703 = ["1 2 3 4 1 2","1 2 3 4 1 2 3 4 1 2 3","3 2 2 2 2 2","4 4 4 4 4 4"];
for (var i = 0; i < in7703.length; i++){
	var out = document.getElementById("7703t" + i);
	out.innerHTML = task7703(in7703[i]).join(" ");
}
var in5541 = ["1 2 3 4 1 2", "1 1 3 3 2 2"];
for (var i = 0; i < in5541.length; i++){
	var out = document.getElementById("5541t" + i);
	var data = task5541(in5541[i]);
	var result = "";
	for (item in data){
		result += item + " ";
	}
	out.innerHTML = result;
}
var in9182 = ["1 2 3 4 5 6","1 2 3 1 2 6","1 1 1 1 1 1"];
for (var i = 0; i < in9182.length; i++){
	var out = document.getElementById("9182t" + i);
	out.innerHTML = task9182(in9182[i]);
}
