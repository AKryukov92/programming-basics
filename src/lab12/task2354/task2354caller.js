var in4411 = ["11.13", "-7919", "0"];
for (var i = 0; i < in4411.length; i++){
	var out = document.getElementById("4411t" + i);
	out.innerHTML = task4411(in4411[i]).toFixed(4);
}
var in8428 = ["45","1125","0","360","90","2000"];
for (var i = 0; i < in8428.length; i++){
	var out = document.getElementById("8428t" + i);
	out.innerHTML = task8428(in8428[i]).toFixed(4);
}
var in1262 = ["7583", "200", "360", "90"];
for (var i = 0; i < in1262.length; i++){
	var out = document.getElementById("1262t" + i);
	out.innerHTML = task1262(in1262[i]).toFixed(4);
}
var in2790 = ["6997", "31", "0"];
for (var i = 0; i < in2790.length; i++){
	var out = document.getElementById("2790t" + i);
	out.innerHTML = task2790(in2790[i]).toFixed(4);
}
var in9164a = ["90", "90", "7559"];
var in9164b = ["90", "0", "7549"];
for (var i = 0; i < in9164a.length; i++){
	var out = document.getElementById("9164t" + i);
	out.innerHTML = task9164(in9164a[i], in9164b[i]).toFixed(4);
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
var in5662a = ["1", "3", "3", "0"];
var in5662b = ["2", "17", "6", "7"];
var in5662c = ["3", "5", "3", "13"];
for (var i = 0; i < in5662a.length; i++){
	var out = document.getElementById("5662t" + i);
	var r = task5662(in5662a[i], in5662b[i], in5662c[i]);
	out.innerHTML = r;
}
var in3770x = ["1","7","0"];
var in3770y = ["2","4","5"];
var in3770z = ["3","-2","-7"];
for (var i = 0; i < in3770x.length; i++){
	var out = document.getElementById("3770t" + i);
	var r = task3770(in3770x[i], in3770y[i], in3770z[i]);
	out.innerHTML = r;
}
var in3669a = ["8","159","648","-2","50"];
var in3669b = ["13","161","648","600","24"];
for (var i = 0; i < in3669a.length; i++){
	var out = document.getElementById("3669t" + i);
	out.innerHTML = task3669(in3669a[i],in3669b[i]);
}
var in4265 = ["sABCD","Uxyz","s","F123","Sopqr"];
for (var i = 0; i < in4265.length; i++){
	var out = document.getElementById("4265t" + i);
	out.innerHTML = task4265(in4265[i]);
}
var in3946 = ["1 2 3 4 1", "1 2 3 4 1 3 4 4 4 4", ""];
for (var i = 0; i < in3946.length; i++){
	var out = document.getElementById("3946t" + i);
	out.innerHTML = task3946(in3946[i]);
}
var in7035 = ["1 2 3 4 5 6", "3 4 1 2 3 4 1 2 3 1 2", "4 2 3 4 3 2", "4 4 4 4 4 3 8 9", "4 4 4 4", "4 3"];
for (var i = 0; i < in7035.length; i++){
	var out = document.getElementById("7035t" + i);
	out.innerHTML = task7035(in7035[i]);
}
var in4283k = ["3","5","2","1"];
var in4283data = ["1 2 3 4 1 2","1 2 3 4 1 2 3 4 1 2 3","3 2 2 2 2 2", "4 4 4 4 4 4"];
for (var i = 0; i < in4283k.length; i++){
	var out = document.getElementById("4283t" + i);
	out.innerHTML = task4283(in4283k[i], in4283data[i]);
}
var in9182 = ["1 2 3 4 5 6","1 2 3 1 2 6","1 1 1 1 1 1"];
for (var i = 0; i < in9182.length; i++){
	var out = document.getElementById("9182t" + i);
	out.innerHTML = task9182(in9182[i]);
}