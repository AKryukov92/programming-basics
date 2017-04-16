document.getElementById("8495t0").innerHTML = task8495();
document.getElementById("1315t0").innerHTML = task1315();
var in6066a = ["8", "691", "3000"];
var in6066b = ["13", "702", "24"];
for (var i = 0; i < in6066a.length; i++){
	var out = document.getElementById("6066t" + i);
	try {
		out.innerHTML = task6066(in6066a[i], in6066b[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in2565a = ["8","691","3000"];
var in2565b = ["13","703","24"];
for (var i = 0; i < in2565a.length; i++){
	var out = document.getElementById("2565t" + i);
	try {
		out.innerHTML = task2565(in2565a[i], in2565b[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in2594a = ["8","15","0","-1"];
var in2594b = ["#", " ", "?", "*"];
for (var i = 0; i < in2594a.length; i++){
	var out = document.getElementById("2594t" + i);
	try {
		out.innerHTML = task2594(in2594a[i], in2594b[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in2321a = ["8","691","23"];
var in2321b = ["13","702","11"];
for (var i = 0; i < in2321a.length; i++){
	var out = document.getElementById("2321t" + i);
	out.innerHTML = task2321(in2321a[i],in2321b[i]);
}
var in5053a = ["8","691","27"];
var in5053b = ["13","702","17"];
for (var i = 0; i < in5053a.length; i++){
	var out = document.getElementById("5053t" + i);
	out.innerHTML = task5053(in5053a[i],in5053b[i]);
}
document.getElementById("3762t0").innerHTML = task3762();
document.getElementById("3550t0").innerHTML = task3550();
document.getElementById("2475t0").innerHTML = task2475();
var in9180 = ["-100","7","368","501","-101"];
for (var i = 0; i < in9180.length; i++){
	var out = document.getElementById("9180t" + i);
	try {
		out.innerHTML = task9180(in9180[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in1544 = ["12","70","368","10000","-11","10001"];
for (var i = 0; i < in1544.length; i++){
	var out = document.getElementById("1544t" + i);
	try {
		out.innerHTML = task1544(in1544[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in9562a = ["15","25","80","3000"];
var in9562b = ["27","44","100","24"];
for (var i = 0; i < in9562a.length; i++){
	var out = document.getElementById("9562t" + i);
	out.innerHTML = task9562(in9562a[i],in9562b[i]);
}
var in3669a = ["8","159","648","-2","50"];
var in3669b = ["13","161","648","600","24"];
for (var i = 0; i < in3669a.length; i++){
	var out = document.getElementById("3669t" + i);
	out.innerHTML = task3669(in3669a[i],in3669b[i]);
}
document.getElementById("5951t0").innerHTML = task5951();
var in2802 = ["4","11","19","-1","0"];
for (var i = 0; i < in2802.length; i++){
	var out = document.getElementById("2802t" + i);
	try {
		out.innerHTML = task2802(in2802[i]).toFixed(4);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in6580a = ["15", "25", "80", "3000"];
var in6580b = ["27", "44", "100", "24"];
for (var i = 0; i < in6580a.length; i++){
	var out = document.getElementById("6580t" + i);
	out.innerHTML = task6580(in6580a[i],in6580b[i]);
}
var in7585 = ["10","15","20","9","21"];
for (var i = 0; i < in7585.length; i++){
	var out = document.getElementById("7585t" + i);
	out.innerHTML = task7585(in7585[i]);
}
var in1483 = ["4","18","42","0","-9"];
for (var i = 0; i < in1483.length; i++){
	var out = document.getElementById("1483t" + i);
	try {
		out.innerHTML = task1483(in1483[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in3983 = ["5","23","51","0","-7"];
for (var i = 0; i < in3983.length; i++){
	var out = document.getElementById("3983t" + i);
	try {
		out.innerHTML = task3983(in3983[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in8770 = ["30","37","40","8","100"];
for (var i = 0; i < in8770.length; i++){
	var out = document.getElementById("8770t" + i);
	out.innerHTML = task8770(in8770[i]);
}
var in4236 = ["3","12","15","-1","16"];
for (var i = 0; i < in4236.length; i++){
	var out = document.getElementById("4236t" + i);
	try {
		out.innerHTML = task4236(in4236[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5969a = ["8", "28", "80", "3000"];
var in5969b = ["13","44","98","24"];
for (var i = 0; i < in5969a.length; i++){
	var out = document.getElementById("5969t" + i);
	out.innerHTML = task5969(in5969a[i],in5969b[i]);
}
document.getElementById("8696t0").innerHTML = task8696();
var in8418 = ["6","385","-9"];
for (var i = 0; i < in8418.length; i++){
	var out = document.getElementById("8418t" + i);
	try {
		out.innerHTML = task8418(in8418[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5170 = ["6", "3219","7","2017","-10"];
for (var i = 0; i < in5170.length; i++){
	var out = document.getElementById("5170t" + i);
	try {
		if (task5170(in5170[i])){
			out.innerHTML = "число простое";
		} else {
			out.innerHTML = "число не простое";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in8395 = ["1","13","-1","21"];
for (var i = 0; i < in8395.length; i++){
	var out = document.getElementById("8395t" + i);
	try {
		out.innerHTML = task8395(in8395[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5568 = ["1","10","-2","23"];
for (var i = 0; i < in5568.length; i++){
	var out = document.getElementById("5568t" + i);
	try {
		out.innerHTML = task5568(in5568[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in2592s = ["#","?","*","=","o","!"];
var in2592w = ["5","7","90","0","-2","20"];
var in2592h = ["3","10","0","15","8","-6"];
for (var i = 0; i < in2592s.length; i++){
	var out = document.getElementById("2592t" + i);
	try {
		out.innerHTML = task2592(in2592s[i], in2592w[i], in2592h[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in4075 = ["5","15","0","-2"];
for (var i = 0; i < in4075.length; i++){
	var out = document.getElementById("4075t" + i);
	try {
		out.innerHTML = task4075(in4075[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in7517w = ["1","7","5","0","23","-3","7"];
var in7517h = ["1","3","5","17","0","11","-7"];
for (var i = 0; i < in7517w.length; i++){
	var out = document.getElementById("7517t" + i);
	try {
		out.innerHTML = task7517(in7517w[i], in7517h[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5448s = ["#","\\","^","*","56"];
var in5448h = ["6","3","0","-2","-3"];
for (var i = 0; i < in5448s.length; i++){
	var out = document.getElementById("5448t" + i);
	try {
		out.innerHTML = task5448(in5448s[i], in5448h[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in6572a = ["8","691","19"];
var in6572b = ["13", "703","3"];
for (var i = 0; i < in6572a.length; i++){
	var out = document.getElementById("6572t" + i);
	out.innerHTML = task6572(in6572a[i],in6572b[i]);
}
var in5238w = ["5","4","0","7","-11","29"];
var in5238h = ["5","5","5","0","4","-2"];
for (var i = 0; i < in5238w.length; i++){
	var out = document.getElementById("5238t" + i);
	try {
		out.innerHTML = task5238(in5238w[i], in5238h[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
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
var in5171s1 = ["#","?","*","=","o","!"];
var in5171s2 = ["0","-","!","+","T","."];
var in5171w = ["5","7","90","0","-2","20"];
var in5171h = ["3", "10", "0","15","8","-6"];
for (var i = 0; i < in5171s1.length; i++){
	var out = document.getElementById("5171t" + i);
	try {
		out.innerHTML = task5171(in5171s1[i], in5171s2[i], in5171w[i], in5171h[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in1862s1 = ["#","?","*","=","o","!"];
var in1862s2 = ["0","-","!","+","T","."];
var in1862w = ["5","7","90","0","-2","20"];
var in1862h = ["3", "10", "0","15","8","-6"];
for (var i = 0; i < in1862s1.length; i++){
	var out = document.getElementById("1862t" + i);
	try {
		out.innerHTML = task1862(in1862s1[i], in1862s2[i], in1862w[i], in1862h[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}