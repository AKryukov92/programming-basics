document.getElementById("2475t0").innerHTML = task2475();

document.getElementById("5951t0").innerHTML = task5951();

document.getElementById("8696t0").innerHTML = task8696();

document.getElementById("8495t0").innerHTML = task8495();

document.getElementById("1315t0").innerHTML = task1315();

document.getElementById("3762t0").innerHTML = task3762();

var in3550 = ["2", "3", "-13", "0", "7", "11", "1027"];
for (var i = 0; i < in3550.length; i++){
	var out = document.getElementById("3550t" + i);
	out.innerHTML = task3550(i);
}

var in6572a = ["8","691","19"];
var in6572b = ["13", "703","3"];
for (var i = 0; i < in6572a.length; i++){
	var out = document.getElementById("6572t" + i);
	out.innerHTML = task6572(in6572a[i],in6572b[i]);
}

document.getElementById("4338t0").innerHTML = task4338(3, 11);
document.getElementById("4338t1").innerHTML = task4338(587, 613);
document.getElementById("4338t2").innerHTML = task4338(50, 41);
document.getElementById("4338t3").innerHTML = task4338(1000, 1000);

var in2084a = ["20","8","571","691","-71","64","19","401","800"];
var in2084b = ["30","13","580","703","-96","58","7","390","785"];
for (var i = 0; i < in2084a.length; i++){
	var out = document.getElementById("2084t" + i);
	out.innerHTML = task2084(in2084a[i],in2084b[i]).join(", ");
}

var in5411p = ["7","211","37","16","9","600"];
var in5411q = ["11","223","29","20","0","600"];
for (var i = 0; i < in5411p.length; i++){
	var out = document.getElementById("5411t" + i);
	out.innerHTML = task5411(in5411p[i],in5411q[i]);
}

var in8518 = ["a","d","h","i"];
for (var i = 0; i < in8518.length; i++){
	var out = document.getElementById("8518t" + i);
	out.innerHTML = task8518(in8518[i]);
}

var in7585 = ["10","15","20","9","21"];
for (var i = 0; i < in7585.length; i++){
	var out = document.getElementById("7585t" + i);
	out.innerHTML = task7585(in7585[i]);
}

var in8770 = ["30","37","40","8","100"];
for (var i = 0; i < in8770.length; i++){
	var out = document.getElementById("8770t" + i);
	out.innerHTML = task8770(in8770[i]);
}

var in7035 = [
	"6 5 7 8 3 4 1",
	"1 2 3 4 5 6",
	"3 4 1 2 3 4 1 2 3 1 2",
	"4 2 3 4 3 2",
	"4 4 4 4 4 3 8 9",
	"4 4 4 4",
	"4 3"];
for (var i = 0; i < in7035.length; i++){
	var out = document.getElementById("7035t" + i);
	out.innerHTML = task7035(in7035[i]);
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
var in1292 = ["a","b","d","h","i"];
for (var i = 0; i < in1292.length; i++){
	var out = document.getElementById("1292t" + i);
	out.innerHTML = task1292(in1292[i]);
}

var in7534chars = [
	"q a z",
	"q w e r t y",
	"a s d f",
	"a s d f",
	"z x c",
	"",
	"a a a"
];
var in7534amounts = [
	"3 2 5",
	"3 3 1 7 2 6",
	"9 0 7 2",
	"3 3 3",
	"1 2 3 4",
	"1 1 1",
	""
];
for (var i = 0; i < in7534chars.length; i++){
	var out = document.getElementById("7534t" + i);
	out.innerHTML = task7534(in7534chars[i], in7534amounts[i]);
}

var in2173 = [
	"5;6;7;8;9",
	"2;3;3;3;3;4",
	"5",
	"4;5;6;7;3;2;1",
	"9;8",
	"4;5;6;7;6;7;8",
	""
];
for (var i = 0; i < in2173.length; i++){
	var out = document.getElementById("2173t" + i);
	out.innerHTML = task2173(in2173[i]);
}

var in6492chars = [
	"a s d",
	"z x c v b",
	"q w e r t y",
	"a s d f",
	"z x c",
	"",
	"f d s a"
];
var in6492amounts = [
	"3 2 1",
	"1 3 5 0 4",
	"6 2 8 3 1 5",
	"3 3 3",
	"1 2 3 4",
	"1 2 3 4",
	""
];
for (var i = 0; i < in6492chars.length; i++){
	var out = document.getElementById("6492t" + i);
	out.innerHTML = task6492(in6492chars[i], in6492amounts[i]);
}