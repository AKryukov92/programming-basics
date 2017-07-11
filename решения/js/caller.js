//Lab01
task1662();
//Lab02
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
var in6522v1 = ["1", "1","5","-2","4"];
var in6522t1 = ["30","-20","90","10","100"];
var in6522v2 = ["3","10","1","5","-10"];
var in6522t2 = ["20","20","-10","50","4"];
for (var i = 0; i < in6522v1.length; i++){
	var out = document.getElementById("6522t" + i);
	try {
		var r = task6522(in6522v1[i], in6522t1[i], in6522v2[i], in6522t2[i]);
		out.innerHTML = r.volume.toFixed(4) + " " + r.temperature.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}