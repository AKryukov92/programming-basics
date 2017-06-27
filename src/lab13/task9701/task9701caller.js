try {
	var out = document.getElementById("9020t0");
	out.innerHTML = task9020("0").toFixed(4);
} catch (e){
	var out = document.getElementById("9020t0");
	out.innerHTML = e.message;
}
var out = document.getElementById("9020t1");
try {
	out.innerHTML = task9020("-9").toFixed(4);
} catch (e){
	out.innerHTML = e.message;
}
out = document.getElementById("9020t2");
try {
	out.innerHTML = task9020("61").toFixed(4);
} catch (e){
	out.innerHTML = e.message;
}
out = document.getElementById("9020t3");
try {
	out.innerHTML = task9020("60").toFixed(4);
} catch (e){
	out.innerHTML = e.message;
}
out = document.getElementById("9020t4");
try {
	out.innerHTML = task9020("62").toFixed(4);
} catch (e){
	out.innerHTML = e.message;
}
out = document.getElementById("9020t5");
try {
	out.innerHTML = task9020("7573").toFixed(4);
} catch (e){
	out.innerHTML = e.message;
}
out = document.getElementById("9020t6");
try {
	out.innerHTML = task9020("75").toFixed(4);
} catch (e){
	out.innerHTML = e.message;
}


var in7237 = ["0","20.5","691.9","-273.15","-300"];
for (var i = 0; i < in7237.length; i++){
	var out = document.getElementById("7237t" + i);
	try {
		out.innerHTML = task7237(in7237[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in3943x = ["-5", "7507", "7489", "-7481"];
var in3943y = ["81", "7499", "-7487", "7477"];
for (var i = 0; i < in3943x.length; i++){
	var out = document.getElementById("3943t" + i);
	try {
		out.innerHTML = task3943(in3943x[i], in3943y[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in8873r1 = ["7331","3","0","7309"];
var in8873r2 = ["7321","5","7307","0"];
for (var i = 0; i < in8873r1.length; i++){
	var out = document.getElementById("8873t" + i);
	try {
		out.innerHTML = task8873(in8873r1[i], in8873r2[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in2624a = ["6991", "11", "-6959", "0"];
var in2624b = ["6983", "13", "6949", "0"];
var in2624c = ["6977", "17", "6947", "0"];
var in2624x = ["6961", "19", "6917", "0"];
for (var i = 0; i < in2624a.length; i++){
	var out = document.getElementById("2624t" + i);
	try {
		var r = task2624(in2624a[i], in2624b[i],in2624c[i], in2624x[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in5871 = ["6911", "5", "6", "2", "0", "-4"];
for (var i = 0; i < in5871.length; i++){
	var out = document.getElementById("5871t" + i);
	try {
		var r = task5871(in5871[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in3591 = ["0", "200", "6857", "-500"];
for (var i = 0; i < in3591.length; i++){
	var out = document.getElementById("3591t" + i);
	try {
		out.innerHTML = task3591(in3591[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in2802 = ["4","11","19","-1","0"];
for (var i = 0; i < in2802.length; i++){
	var out = document.getElementById("2802t" + i);
	try {
		out.innerHTML = task2802(in2802[i]).toFixed(4);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in9631 = ["z","a","g"];
for (var i = 0; i < in9631.length; i++){
	var out = document.getElementById("9631t" + i);
	try {
		out.innerHTML = task9631(in9631[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in9812a = ["a","w","g","x"];
var in9812b = ["x","d","z","u"];
for (var i = 0; i < in9812a.length; i++){
	var out = document.getElementById("9812t" + i);
	try {
		out.innerHTML = task9812(in9812a[i], in9812b[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5728a = ["a","c","y","g","a"];
var in5728b = ["z","d","d","z","l"];
for (var i = 0; i < in5728a.length; i++){
	var out = document.getElementById("5728t" + i);
	try {
		out.innerHTML = task5728(in5728a[i], in5728b[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in5923a = ["5","6","0","-1","10","5"];
var in5923b = ["3","0","7","1","3","-2"];
for (var i = 0; i < in5923a.length; i++){
	var out = document.getElementById("5923t" + i);
	try {
		out.innerHTML = task5923(in5923a[i], in5923b[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in9116 = ['"   12345"', '"abcdef    "', '"  xyz  "',
'"  a b  "', '" pq"rt "','asdf"','"xyz','p"w"'];
for (var i = 0; i < in9116.length; i++){
	var out = document.getElementById("9116t" + i);
	try {
		out.innerHTML = task9116(in9116[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in1618 = ["{}","{{}}","{{}}{}","{{}{}}","{{{{}{}}{{}{{}}{}}}{{}{}}}","{","{{}","{{}}{","{{{}}{}{}}{{}{}{}","}","{}}","{{{}{}}}{{}{}}{{}}}"];
for (var i = 0; i < in1618.length; i++){
	var out = document.getElementById("1618t" + i);
	try {
		out.innerHTML = task1618(in1618[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
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
var in8769p = ["1","8","1","0","0","1","-1","5"];
var in8769q = ["3","10","4","5","5","7","0","10"];
var in8769data = ["1 2 3 4 1 2", "3 4 4 2 3 4 1 2 3 1 2", "11 12 13 5 11 12", "4 2 3 4 3 2", "4 4 4 4 4 3 2 1", "4 4 4 4", "4 3", "1 2 3 4"];
for (var i = 0; i < in8769p.length; i++){
	var out = document.getElementById("8769t" + i);
	try {
		out.innerHTML = task8769(in8769p[i],in8769q[i],in8769data[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}