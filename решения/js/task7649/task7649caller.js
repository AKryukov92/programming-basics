document.getElementById("2475t0").innerHTML = task2475();

document.getElementById("5951t0").innerHTML = task5951();

document.getElementById("8696t0").innerHTML = task8696();

document.getElementById("8495t0").innerHTML = task8495();

document.getElementById("1315t0").innerHTML = task1315();

document.getElementById("3762t0").innerHTML = task3762();

document.getElementById("3550t0").innerHTML = task3550();

var in6572a = ["8","691","19"];
var in6572b = ["13", "703","3"];
for (var i = 0; i < in6572a.length; i++){
	var out = document.getElementById("6572t" + i);
	out.innerHTML = task6572(in6572a[i],in6572b[i]);
}

var in2084a = ["20","8","571","691","-71","64","19","401","800"];
var in2084b = ["30","13","580","703","-96","58","7","390","785"];
for (var i = 0; i < in2084a.length; i++){
	var out = document.getElementById("2084t" + i);
	out.innerHTML = task2084(in2084a[i],in2084b[i]).join(", ");
}

var in5411p = ["7","211","37"];
var in5411q = ["11","223","29"];
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