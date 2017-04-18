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
		out.innerHTML = task3354(in3354[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in5201 = ["13", "17", "0", "-2"];
for (var i = 0; i < in5201.length; i++){
	var out = document.getElementById("5201t" + i);
	try {
		out.innerHTML = task5201(in5201[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in2981 = ["19", "23", "0", "-7"];
for (var i = 0; i < in2981.length; i++){
	var out = document.getElementById("2981t" + i);
	try {
		out.innerHTML = task2981(in2981[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in4312a = ["1","2","0","-2","3"];
var in4312h = ["1","3","10","1","-4"];
for (var i = 0; i < in4312a.length; i++){
	var out = document.getElementById("4312t" + i);
	try {
		out.innerHTML = task4312(in4312a[i], in4312h[i]).toFixed(2);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in8833 = ["7606", "9", "0", "-7603"];
for (var i = 0; i < in8833.length; i++){
	var out = document.getElementById("8833t" + i);
	try {
		out.innerHTML = task8833(in8833[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in9020 = ["0", "-9", "61", "60", "62", "7573", "75"];
for (var i = 0; i < in9020.length; i++){
	var out = document.getElementById("9020t" + i);
	try {
		out.innerHTML = task9020(in9020[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in1934a = ["6047","-3","0","13","6221"];
var in1934b = ["-6011", "-7", "-50","0", "6373"];
for (var i = 0; i < in1934a.length; i++){
	var out = document.getElementById("1934t" + i);
	try {
		out.innerHTML = task1934(in1934a[i], in1934b[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
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
var in7619v1 = ["31", "0", "-13", "67"];
var in7619v2 = ["47", "7", "11", "-79"];
var in7619s = ["6833", "6829", "200", "400"];
for (var i = 0; i < in7619v1.length; i++){
	var out = document.getElementById("7619t" + i);
	try {
		var r = task7619(in7619v1[i], in7619v2[i], in7619s[i]);
		out.innerHTML = r.toFixed(4);
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
var in9130y = ["7211","11","7177"];
var in9130m1 = ["7219","3","7193"];
var in9130m2 = ["7213","7","7207"];
var in9130r = ["7207","13","0"];
for (var i = 0; i < in9130y.length; i++){
	var out = document.getElementById("9130t" + i);
	try {
		var r = task9130(in9130y[i], in9130m1[i],in9130m2[i], in9130r[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in2461a = ["7069", "0", "7019"];
var in2461b = ["7043", "7043", "7043"];
var in2461c = ["7039", "7039","7001"];
var in2461d = ["7057","7027","0"];
for (var i = 0; i < in2461a.length; i++){
	var out = document.getElementById("2461t" + i);
	try {
		var r = task2461(in2461a[i], in2461b[i],in2461c[i], in2461d[i]);
		out.innerHTML = r.toFixed(4);
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
var in5871 = ["6911", "3", "0.9"];
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
var in7937w = ["1721","2473","0","877","1181","3491"];
var in7937h = ["661","449","1879","0","1033","3533"];
var in7937c = ["11","23","1163","7","0","1297"];
var in7937d = ["7","11","109","19","127","0"];
for (var i = 0; i < in7937w.length; i++){
	var out = document.getElementById("7937t" + i);
	try {
		var r = task7937(in7937w[i], in7937h[i], in7937c[i], in7937d[i]);
		out.innerHTML = r;
	} catch(e){
		out.innerHTML = e.message;
	}
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
var in4845a = ["0","5","2","-1","20","5","7"];
var in4845b = ["3","9","7","4","4","-2","17"];
for (var i = 0; i < in4845a.length; i++){
	var out = document.getElementById("4845t" + i);
	try {
		out.innerHTML = task4845(in4845a[i], in4845b[i]);
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
var in2166 = ["cd","aa","xy","abc","f"];
for (var i = 0; i < in2166.length; i++){
	var out = document.getElementById("2166t" + i);
	try {
		out.innerHTML = task2166(in2166[i]);
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