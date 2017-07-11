
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