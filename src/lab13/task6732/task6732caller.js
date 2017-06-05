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
var in4236 = ["3","12","15","-1","16"];
for (var i = 0; i < in4236.length; i++){
	var out = document.getElementById("4236t" + i);
	try {
		out.innerHTML = task4236(in4236[i]);
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
var in4075 = ["5","15","0","-2"];
for (var i = 0; i < in4075.length; i++){
	var out = document.getElementById("4075t" + i);
	try {
		out.innerHTML = task4075(in4075[i]);
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
var in5238w = ["5","4","3","0","7","-11","29"];
var in5238h = ["5","5","5","5","0","4","-2"];
for (var i = 0; i < in5238w.length; i++){
	var out = document.getElementById("5238t" + i);
	try {
		out.innerHTML = task5238(in5238w[i], in5238h[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}