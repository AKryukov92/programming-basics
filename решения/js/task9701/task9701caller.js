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


var in7237 = ["0","-5","-40","-100","-17.7777","20.5","691.9","-273.15","-300"];
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


var in8873r1 = ["7331","3","15","-11","0","7309"];
var in8873r2 = ["7321","5","-7","96","7307","0"];
for (var i = 0; i < in8873r1.length; i++){
	var out = document.getElementById("8873t" + i);
	try {
		out.innerHTML = task8873(in8873r1[i], in8873r2[i]).toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}


var in2624a = ["11", "6991", "3", "-6959", "0", "1"];
var in2624b = ["13", "6983", "11", "6949", "0", "2"];
var in2624c = ["17", "6977", "-241", "6947", "0", "-3"];
var in2624x = ["19", "6961", "1", "6917", "0", "1"];
for (var i = 0; i < in2624a.length; i++){
	var out = document.getElementById("2624t" + i);
	try {
		var r = task2624(in2624a[i], in2624b[i],in2624c[i], in2624x[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}


var in1346v = ["3", "100", "0", "7411", "10", "19", "-13"];
var in1346t = ["7", "5", "33", "7433", "-15", "0", "80"];
var in1346a = ["11", "-10", "17", "7417", "9", "23", "63"];
var out1346 = [290.5, 375, 9256.5, 204947815919.5, 0, 0, 0];
for (var i = 0; i < in1346v.length; i++){
	var out = document.getElementById("1346t" + i);
	try {
		var result = task1346(in1346v[i], in1346t[i], in1346a[i]);
		out.innerHTML = result.toFixed(4) + " (" + out1346[i].toFixed(4) + ")";
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


var in7619v1 = ["31", "0", "6", "17", "-11", "-79", "10"];
var in7619v2 = ["47", "7", "0", "19", "13", "67", "20"];
var in7619s = ["6833", "6829", "100", "0", "200", "400", "-500"];
for (var i = 0; i < in7619v1.length; i++){
	var out = document.getElementById("7619t" + i);
	try {
		var r = task7619(in7619v1[i], in7619v2[i], in7619s[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}


var in9130m1 = ["3", "7219", "7193", "-5", "10"];
var in9130m2 = ["7", "7213", "7187", "4", "0"];
var in9130r = ["13", "7207", "0", "10", "15"];
for (var i = 0; i < in9130m1.length; i++){
	var out = document.getElementById("9130t" + i);
	try {
		var r = task9130(in9130m1[i],in9130m2[i], in9130r[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}


var in2461a = ["11", "7069", "0", "7019"];
var in2461b = ["3000", "7043", "7043", "7043"];
var in2461c = ["5", "7039", "7039","7001"];
var in2461d = ["7", "7057","7027","0"];
for (var i = 0; i < in2461a.length; i++){
	var out = document.getElementById("2461t" + i);
	try {
		var r = task2461(in2461a[i], in2461b[i],in2461c[i], in2461d[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}


var in7799m = ["5","7292", "10", "7", "9", "0"];
var in7799a = ["45", "30", "90", "91", "100", "30"];
for (var i = 0; i < in7799m.length; i++){
	var out = document.getElementById("7799t" + i);
	try {
		out.innerHTML = task7799(in7799m[i], in7799a[i]).toFixed(4);
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

var in7222 = [
	"4607009520018",
	"9785750200641",
	"9785964300694",
	"123456789012",
	"12345678901234567890"
];
for (var i = 0; i < in7222.length; i++) {
	var out = document.getElementById("7222t" + i);
	try {
		out.innerHTML = task7222(in7222[i]);
	} catch (e) {
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

var in1433 = [
	"q;w;e",
	"q;w;e;r",
	"q;w;e;r;t;y;u;i;o",
	"q;w;e;r;t;y;u;i;o;p",
	"q",
	""
];
for (var i = 0; i < in1433.length; i++){
	var out = document.getElementById("1433t" + i);
	try {
		out.innerHTML = task1433(in1433[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in7085 = [
	"q w e r t y",
	"q w e r t y",
	"a s d f",
	"q w e r t y",
	"a s d f",
	"q w e r t y",
	"a s d f",
	"q w e r t y",
	"q w e r t y",
	"a s d f"
];
var in7085s = [1, 3, 2, 5, 3, 6, 0, 8, -2, 5];
for (var i = 0; i < in7085.length; i++){
	var out = document.getElementById("7085t" + i);
	try {
		out.innerHTML = task7085(in7085s[i], in7085[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}

var in7834 = [
	"a,s,d,f,g,h,j,k",
	"q,w,e,r,t,y,u",
	"q,w,e,r,t,y",
	"qa,ws,ed,rf,tg",
	"za,xs,cd,vf",
	"qaz,wsx,edc",
	"qwerty,asdfg",
	"zxcvbnm",
	""
];
for (var i = 0; i < in7834.length; i++){
	var out = document.getElementById("7834t" + i);
	try {
		out.innerHTML = task7834(in7834[i]);
	} catch (e){
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


var in8769p = ["1","8","1","0","0","4","1","-1","5"];
var in8769q = ["3","10","4","5","5","2","7","0","10"];
var in8769data = ["1 2 3 4 1 2", "3 4 4 2 3 4 1 2 3 1 2", "11 12 13 5 11 12", "4 2 3 4 3 2", "4 4 4 4 4 3 2 1", "1 2 3 4 1 2", "4 4 4 4", "4 3", "1 2 3 4"];
for (var i = 0; i < in8769p.length; i++){
	var out = document.getElementById("8769t" + i);
	try {
		out.innerHTML = task8769(in8769p[i],in8769q[i],in8769data[i]);
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


var in9354a = ["7247", "7", "-11", "0", "0"];
var in9354b = ["7243", "1", "-13", "1", "1000"];
var in9354c = ["7229", "3", "-17", "3", "2000"];
for (var i = 0; i < in9354a.length; i++){
	var out = document.getElementById("9354t" + i);
	try {
		out.innerHTML = task9354(in9354a[i], in9354b[i], in9354c[i]).toFixed(4);
	} catch (e) {
		out.innerHTML = e.message;
	}
}


var in3490y = ["3", "10", "0", "13", "-10", "11"];
var in3490w = ["2", "300", "15", "0", "100", "-500"];
for (var i = 0; i < in3490y.length; i++){
	var out = document.getElementById("3490t" + i);
	try {
		out.innerHTML = task3490(in3490y[i], in3490w[i]) + "см";
	} catch (e) {
		out.innerHTML = e.message;
	}
}

var in3095 = [
	"q,w,e,r",
	"as,df,gh",
	"zx,cv",
	"p,o,o,t,p"];
for (var i = 0; i < in3095.length; i++){
	var out = document.getElementById("3095t" + i);
	try {
		out.innerHTML = task3095(in3095[i]);
	} catch (e){
		out.innerHTML = e.message;
	}
}