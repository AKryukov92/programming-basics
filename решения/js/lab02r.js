var in4411 = ["11.13", "-7919", "0"];
for (var i = 0; i < in4411.length; i++){
	var out = document.getElementById("4411t" + i);
	out.innerHTML = task4411(in4411[i]).toFixed(4);
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
var in8428 = ["45","1125","0","360","90","2000"];
for (var i = 0; i < in8428.length; i++){
	var out = document.getElementById("8428t" + i);
	out.innerHTML = task8428(in8428[i]).toFixed(4);
}
var in2361t = ["400","103","300","-800"];
var in2361l = ["17","29","-70","20"];
for (var i = 0; i < in2361t.length; i++){
	var out = document.getElementById("2361t" + i);
	try {
		var r = task2361(in2361t[i], in2361l[i]);
		out.innerHTML = r.q + " шт и " + r.d + " см";
	} catch (e){
		out.innerHTML = e.message;
	}
}
var in5063 = ["365","45","1125","1500","2000","0","360"];
for (var i = 0; i < in5063.length; i++){
	var out = document.getElementById("5063t" + i);
	out.innerHTML = task5063(in5063[i]);
}
var in7711 = ["45", "1125", "7639", "360", "90"];
for (var i = 0; i < in7711.length; i++){
	var out = document.getElementById("7711t" + i);
	out.innerHTML = task7711(in7711[i]).toFixed(4);
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
var in1262 = ["7583", "200", "360", "90"];
for (var i = 0; i < in1262.length; i++){
	var out = document.getElementById("1262t" + i);
	out.innerHTML = task1262(in1262[i]).toFixed(4);
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
var in3832x1 = ["7451", "3" ,"-2"];
var in3832x2 = ["7433", "7", "-2029"];
var in3832x3 = ["7417", "11", "0"];
for (var i = 0; i < in3832x1.length; i++){
	var out = document.getElementById("3832t" + i);
	out.innerHTML = task3832(in3832x1[i], in3832x2[i], in3832x3[i]);
}
var in1346v0 = ["7411", "3"];
var in1346t = ["7433", "7"];
var in1346a = ["7417", "11"];
for (var i = 0; i < in1346v0.length; i++){
	var out = document.getElementById("1346t" + i);
	out.innerHTML = task1346(in1346v0[i], in1346t[i], in1346a[i]);
}
var in9622m = ["7351","19","-1","2","3"];
var in9622v = ["7349","23","4","-5","6"];
var in9622h = ["7333","29","7","8","-9"];
for (var i = 0; i < in9622m.length; i++){
	var out = document.getElementById("9622t" + i);
	try {
		var r = task9622(in9622m[i], in9622v[i], in9622h[i]);
		out.innerHTML = "T: " + r.t.toFixed(4) + " Wn: " + r.wn.toFixed(4);
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
var in7799m = ["5","7292", "10", "7", "9", "0"];
var in7799a = ["45", "30", "90", "91", "100", "30"];
for (var i = 0; i < in7799m.length; i++){
	var out = document.getElementById("7799t" + i);
	out.innerHTML = task7799(in7799m[i], in7799a[i]).toFixed(4);
}
var in9354a = ["7247", "7"];
var in9354b = ["7243", "1"];
var in9354c = ["7229", "3"];
for (var i = 0; i < in9354a.length; i++){
	var out = document.getElementById("9354t" + i);
	out.innerHTML = task9354(in9354a[i], in9354b[i], in9354c[i]).toFixed(4);
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
var in5895a = ["7109", "3"];
var in5895b = ["7103", "7"];
var in5895c = ["7079","13"];
for (var i = 0; i < in5895a.length; i++){
	var out = document.getElementById("5895t" + i);
	var r = task5895(in5895a[i], in5895b[i], in5895c[i]);
	out.innerHTML = r.toFixed(4);
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
var in2790 = ["6997", "31", "0"];
for (var i = 0; i < in2790.length; i++){
	var out = document.getElementById("2790t" + i);
	out.innerHTML = task2790(in2790[i]).toFixed(4);
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
var in9164a = ["90", "90", "7559"];
var in9164b = ["90", "0", "7549"];
for (var i = 0; i < in9164a.length; i++){
	var out = document.getElementById("9164t" + i);
	out.innerHTML = task9164(in9164a[i], in9164b[i]).toFixed(4);
}
var in7457 = ["6883", "-6871", "0"];
for (var i = 0; i < in7457.length; i++){
	var out = document.getElementById("7457t" + i);
	out.innerHTML = task7457(in7457[i]);
}
var in9865 = ["6869", "-6863", "0", "-1.482634"];
for (var i = 0; i < in9865.length; i++){
	var out = document.getElementById("9865t" + i);
	out.innerHTML = task9865(in9865[i]).toFixed(4);
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
var in3558a = ["45","200","7523"];
var in3558b = ["90", "45","7517"];
for (var i = 0; i < in3558a.length; i++){
	var out = document.getElementById("3558t" + i);
	out.innerHTML = task3558(in3558a[i], in3558b[i]).toFixed(4);
}
var in4366x1 = ["7459","-3","0"];
var in4366x2 = ["7457","-7","0"];
for (var i = 0; i < in4366x1.length; i++){
	var out = document.getElementById("4366t" + i);
	out.innerHTML = task4366(in4366x1[i], in4366x2[i]).toFixed(4);
}
var in5789xa = ["1","-2","0","0","-1"];
var in5789ya = ["1","4","0","0","-3"];
var in5789xb = ["3","8","-5","0","2"];
var in5789yb = ["4", "-10", "-7", "0", "9"];
for (var i = 0; i < in5789xa.length; i++){
	var out = document.getElementById("5789t" + i);
	var r = task5789(in5789xa[i], in5789ya[i], in5789xb[i], in5789yb[i]);
	out.innerHTML = r.toFixed(4);
}
var in6522v1 = ["1", "1","5","-2","4"];
var in6522t1 = ["30","-20","90","10","100"];
var in6522v2 = ["3","10","1","5","-10"];
var in6522t2 = ["20","20","-10","50","4"];
for (var i = 0; i < in6522v1.length; i++){
	var out = document.getElementById("6522t" + i);
	try {
		var r = task6522(in6522v1[i], in6522t1[i], in6522v2[i], in6522t2[i]);
		out.innerHTML = r.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}