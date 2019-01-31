//Lab01
task1662();
var x = 3, y = 5;
if (x = y){
	console.log(x);
}
var standard = "Вот дом,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nА это пшеница,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nА это весёлая птица-синица,"
+ "\nКоторая часто ворует пшеницу,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nВот кот,"
+ "\nКоторый пугает и ловит синицу,"
+ "\nКоторая часто ворует пшеницу,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nВот пёс без хвоста,"
+ "\nКоторый за шиворот треплет кота,"
+ "\nКоторый пугает и ловит синицу,"
+ "\nКоторая часто ворует пшеницу,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nА это корова безрогая,"
+ "\nЛягнувшая старого пса без хвоста,"
+ "\nКоторый за шиворот треплет кота,"
+ "\nКоторый пугает и ловит синицу,"
+ "\nКоторая часто ворует пшеницу,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nА это старушка, седая и строгая,"
+ "\nКоторая доит корову безрогую,"
+ "\nЛягнувшую старого пса без хвоста,"
+ "\nКоторый за шиворот треплет кота,"
+ "\nКоторый пугает и ловит синицу,"
+ "\nКоторая часто ворует пшеницу,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nА это ленивый и толстый пастух,"
+ "\nКоторый бранится с коровницей строгою,"
+ "\nКоторая доит корову безрогую,"
+ "\nЛягнувшую старого пса без хвоста,"
+ "\nКоторый за шиворот треплет кота,"
+ "\nКоторый пугает и ловит синицу,"
+ "\nКоторая часто ворует пшеницу,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек."
+ "\n"
+ "\nВот два петуха,"
+ "\nКоторые будят того пастуха,"
+ "\nКоторый бранится с коровницей строгою,"
+ "\nКоторая доит корову безрогую,"
+ "\nЛягнувшую старого пса без хвоста,"
+ "\nКоторый за шиворот треплет кота,"
+ "\nКоторый пугает и ловит синицу,"
+ "\nКоторая часто ворует пшеницу,"
+ "\nКоторая в тёмном чулане хранится"
+ "\nВ доме,"
+ "\nКоторый построил Джек.\n"
;
var result = task8693();
if (result == standard)
{
	document.getElementById("8693t0").innerHTML = "Совпадает";
}
else if (standard.startsWith(result))
{
	document.getElementById("8693t0").innerHTML = "Пока совпадает";
}
else
{
	document.getElementById("8693t0").innerHTML = "Не совпадает";
}

//Lab02
var in2361t = ["400","103","2", "300","-800"];
var in2361l = ["17","29","313", "-70","20"];
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


//Lab05
var in3072p = ["173", "359", "439", "0"];
var in3072q = ["179", "271", "-761", "-15"];
for (var i = 0; i < in3072p.length; i++){
	var out = document.getElementById("3072t" + i);
	var r = task3072(in3072p[i], in3072q[i]);
	out.innerHTML = "Максимальное " + r.max + ", минимальное " + r.min;
}

var in1186x = ["6.35","4.71","19.99","-2.28","-18.71","3.44","-0.09"];
var in1186y = ["2.7","5.59","-9.57","16.92","-7.6","-14.98","-16.6"];
var in1186z = ["5.08","-18.55","12.75","6.14","6.27","-8.26","-1.84"];
for (var i = 0; i < in1186x.length; i++){
	var out = document.getElementById("1186t" + i);
	var arr = task1186(in1186x[i], in1186y[i], in1186z[i]);
	out.innerHTML = arr.join(";");
}

var in7991x = ["6.35","4.71","19.99","10","-2.28"];
var in7991y = ["2.7","2.59","-1.57","10","16.92"];
var in7991z = ["5.08","-18.55","2.75","10","6.14"];
for (var i = 0; i < in7991x.length; i++){
	var out = document.getElementById("7991t" + i);
	var arr = task7991(in7991x[i],in7991y[i],in7991z[i]);
	out.innerHTML = arr.join(" ");
}

var in7178m = ["36","41","15"];
var in7178p = ["2","7","0"];
for (var i = 0; i < in7178m.length; i++){
	var out = document.getElementById("7178t" + i);
	try {
		out.innerHTML = task7178(in7178m[i],in7178p[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in5635p = [{x:30,y:20},{x:120,y:30},{x:210,y:40},{x:50,y:120},{x:150,y:130},{x:200,y:150},{x:80,y:190},{x:160,y:180},{x:220,y:200},{x:100,y:110},{x:130,y:100},{x:190,y:140},{x:180,y:170},{x:100,y:100},{x:190,y:100},{x:100,y:170},{x:190,y:170},{x:-10,y:30},{x:40,y:-20}];
for (var i = 0; i < in5635p.length; i++){
	var out = document.getElementById("5635t" + i);
	try {
		if (task5635(in5635p[i], {x:100,y:100,h:70,w:90})){
			out.innerHTML = "точка внутри";
		} else {
			out.innerHTML = "точка снаружи";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in3878t = [{x:2,y:2},{x:1,y:3},{x:0,y:0},{x:0,y:1},{x:1,y:1},{x:2,y:2},{x:-1,y:1}];
var in3878p1 = [{x:1,y:1},{x:0,y:0},{x:1,y:1},{x:1,y:1},{x:1,y:1},{x:0,y:4},{x:1,y:1}];
var in3878p2 = [{x:3,y:3},{x:2,y:6},{x:2,y:2},{x:2,y:2},{x:2,y:2},{x:4,y:0},{x:2,y:2}];
for (var i = 0; i < in3878t.length; i++){
	var out = document.getElementById("3878t" + i);
	try {
		if (task3878(in3878t[i], in3878p1[i], in3878p2[i])){
			out.innerHTML = "Точка принадлежит прямой";
		} else {
			out.innerHTML = "Точка не принадлежит прямой";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in1217i1 = [{a:2,b:3},{a:11,b:17},{a:23,b:37},{a:43,b:53},{a:5,b:15},{a:67,b:71},{a:79,b:73},{a:97,b:101}];
var in1217i2 = [{a:5,b:7},{a:13,b:19},{a:29,b:31},{a:41,b:47},{a:0,b:30},{a:59,b:61},{a:83,b:89},{a:107,b:103}];
for (var i = 0; i < in1217i1.length; i++){
	var out = document.getElementById("1217t" + i);
	try {
		if (task1217check(in1217i1[i], in1217i2[i])){
			var r = task1217x(in1217i1[i], in1217i2[i]);
			out.innerHTML = "пересекаются (" + r.a + ";" + + r.b + ")";
		} else {
			out.innerHTML = "Не пересекаются";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in1438r1 = [{x:10,y:10,h:200,w:100},{x:25,y:25,h:200,w:200},{x:102,y:200,h:100,w:200},{x:500,y:200,h:100,w:200},{x:60,y:70,h:120,w:200},{x:100,y:100,h:200,w:200},{x:150,y:150,h:150,w:300},{x:100,y:0,h:100,w:500},{x:5,y:0,h:10,w:10},{x:105,y:5,h:10,w:10},{x:150,y:150,h:50,w:300},{x:0,y:0,h:802,w:200},{x:200,y:200,h:100,w:100},{x:125,y:138,h:0,w:1},{x:100,y:100,h:120,w:220}];
var in1438r2 = [{x:50,y:50,h:300,w:350},{x:225,y:225,h:200,w:200},{x:0,y:500,h:100,w:120},{x:10,y:400,h:100,w:120},{x:50,y:50,h:120,w:200},{x:200,y:200,h:50,w:50},{x:150,y:150,h:150,w:300},{x:0,y:200,h:700,w:100},{x:0,y:5,h:10,w:10},{x:100,y:0,h:10,w:30},{x:100,y:100,h:300,w:200},{x:0,y:0,h:610,w:610},{x:900,y:200,h:100,w:10},{x:205,y:202,h:61,w:62},{x:220,y:100,h:120,w:220}];
for (var i = 0; i < in1438r1.length; i++){
	var out = document.getElementById("1438t" + i);
	try {
		if (task1438check(in1438r1[i], in1438r2[i])){
			var r = task1438x(in1438r1[i], in1438r2[i]);
			out.innerHTML = "пересекаются " + JSON.stringify(r);
		} else {
			out.innerHTML = "Не пересекаются";
		}
	} catch(e){
		out.innerHTML = e.message;
	}
}


//Lab06
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

var in8418 = ["6","385","-9"];
for (var i = 0; i < in8418.length; i++){
	var out = document.getElementById("8418t" + i);
	try {
		out.innerHTML = task8418(in8418[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}


//Lab07
var in9279 = ["ab","bc","ac","bb","cde","a"];
for (var i = 0; i < in9279.length; i++){
	var out = document.getElementById("9279t" + i);
	try {
		out.innerHTML = task9279(in9279[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in1703 = [
    "x>3",
    "r >= 1000",
    "value <=-2",
    "y < 0",
    "x <",
    ">13",
    "y   0",
    "x+7",
    "a < b < c",
    "x < xA && x + w > xA",
    "x > y > z",
    "a x < 17",
    "y > 19 23"];
for (var i = 0; i < in1703.length; i++){
	var out = document.getElementById("1703t" + i);
	try {
		out.innerHTML = task1703(in1703[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}

//Lab08
var in1223 = ["q w e r t y",
                "q w e r t y q w e r",
                "as df gh jk",
                ""];
for (var i = 0; i < in1223.length; i++){
	var out = document.getElementById("1223t" + i);
	out.innerHTML = task1223(in1223[i]).join(" ");
}

var in3940l = [
"1 2 3 4 1", 
"1 2 3 4 1 3 4 4 4 4", 
"1 2 3", 
"1 2 3"];
var in3940r = [
"2 3 4 1 2", 
"3 4 1 2 3 4 1 2 3 4", 
"3 4", 
"3 4 1 2"];
for (var i = 0; i < in3940l.length; i++){
	var out = document.getElementById("3940t" + i);
	try {
		out.innerHTML = task3940(in3940l[i], in3940r[i]).join(" ");
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in8311b = ["0","1","2","3","2","8","11","-1","8"];
var in8311e = ["3","3","3","10","2","2","8","5","50"];
var in8311data = ["z x c v b",
            "z x c v b",
            "z x c v b",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h"];
for (var i = 0; i < in8311b.length; i++){
	var out = document.getElementById("8311t" + i);
	try {
		out.innerHTML = task8311(in8311b[i], in8311e[i], in8311data[i]).join(" ");
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in3134p = ["0","2","4","-1","2","19","1"];
var in3134q = ["3","5","2","5","17","2","-5"];
var in3134data = "a s d f g h";
for (var i = 0; i < in3134p.length; i++){
	var out = document.getElementById("3134t" + i);
	try {
		out.innerHTML = task3134(in3134p[i], in3134q[i], in3134data);
	} catch(e){
		out.innerHTML = e.message;
	}
}

var in9774m = ["31","-3","11","73"];
var in9774data = ["9 8 7 6 5 4",
            "9 8 7 6 5 4",
            "98 76 54",
            ""];
for (var i = 0; i < in9774m.length; i++){
	var out = document.getElementById("9774t" + i);
	out.innerHTML = task9774(in9774m[i], in9774data[i]).join(" ");
}

var in9711 = [
"q w e r t y", 
"a s d f g h j k l m", 
"zx cv bn m", 
""];
for (var i = 0; i < in9711.length; i++){
	var out = document.getElementById("9711t" + i);
	out.innerHTML = task9711(in9711[i]).join(" ");
}

var in3333s = ["1","3","2","6","8","5","99","10","-2","-9"];
var in3333 = [
  "q w e r t y",
  "q w e r t y",
  "a s d f",
  "q w e r t y",
  "q w e r t y",
  "a s d f",
  "q w e r t y",
  "a s d f",
  "q w e r t y",
  "q w e r t y"
];
for (var i = 0; i < in3333s.length; i++){
	var out = document.getElementById("3333t" + i);
	out.innerHTML = task3333(in3333s[i], in3333[i]).join(" ");
}

var in8820 = [
"q w e r t y", 
"as df gh", 
"q w e r t y a s d f g"];
for (var i = 0; i < in8820.length; i++){
	var out = document.getElementById("8820t" + i);
	out.innerHTML = task8820(in8820[i]).join(" ");
}

var in9271 = [
"1 2 3 4 1 2",
"3 4 1 2 3 4 1 2 3 1 2", 
"4 2 3 4 3 2",
"4 4 4 4 4 3 2 1",
"4 4 4 4", 
"4 3"];
for (var i = 0; i < in9271.length; i++){
	var out = document.getElementById("9271t" + i);
	out.innerHTML = task9271(in9271[i]).join(" ");
}

var in4497x = ["1","3","5"];
var in4497y = ["33","55","1"];
var in4497data = [
"1 2 3 4 1 2",
"1 2 3 4 1 2", 
"1 2 3 4 1 2"];
for (var i = 0; i < in4497x.length; i++){
	var out = document.getElementById("4497t" + i);
	out.innerHTML = task4497(in4497x[i],in4497y[i],in4497data[i]).join(" ");
}

var in3218 = [
	"4 1 1 1",
	"1 4 2 1",
	"3 4 1 5",
	"1 2 3 4 1 2",
	"1 2 3 4 1 2 3 4 1 2 3"];
for (var i = 0; i < in3218.length; i++){
	var out = document.getElementById("3218t" + i);
	out.innerHTML = task3218(in3218[i]).join(" ");
}

var in7703 = [
"1 2 3 4 1 2",
"1 2 3 4 1 2 3 4 1 2 3",
"3 2 2 2 2 2",
"4 4 4 4 4 4"];
for (var i = 0; i < in7703.length; i++){
	var out = document.getElementById("7703t" + i);
	out.innerHTML = task7703(in7703[i]).join(" ");
}

var in5541 = [
"1 1 1 1", 
"1 1 2 2", 
"1 1 1 2", 
"1 2 3 4", 
"1 2 3 4 1 2", 
"1 1 3 3 2 2"];
for (var i = 0; i < in5541.length; i++){
	var out = document.getElementById("5541t" + i);
	var data = task5541(in5541[i]);
	var result = "";
	for (item in data){
		result += item + " ";
	}
	out.innerHTML = result;
}

var in6497 = [
	"9 8 9 1 1 5 1 1",
	"5 5 5 5 5",
	"",
	"1000000 1 1"
];
for (var j = 0; j < in6497.length; j++){
	var out = document.getElementById("6497t" + j);
	var sb = ""
	var result = task6497(in6497[j]);
	for (var i = 0; i < result.length; i++){
		sb += result[i].toFixed(4);
		sb += "  ";
	}
	out.innerHTML = sb;
}

var in5648 = [
	"9 8 9 1 1 5 1 1",
	"5 5 5 5 5",
	"",
	"1000000 1 1"
];
for (var i = 0; i < in5648.length; i++){
	var out = document.getElementById("5648t" + i);
	try {
		var sigma = task5648(in5648[i]);
		out.innerHTML = sigma.toFixed(4);
	} catch (e){
		out.innerHTML = e.message;
	}
}

var tuples6924 = [
	[-50, -86.6025, 60, 0],
	[10, 0, 0, 10],
	[11, 13, 7, 17],
	[-70.7106, 50, 60, 0],
	[-86.6025, 50, 60, 0],
	[3, 4, 4, 3]
];
for (var i = 0; i < tuples6924.length; i++){
	var out = document.getElementById("6924t" + i);
	var arr = tuples6924[i];
	out.innerHTML = task6924(arr[0], arr[1], arr[2], arr[3]);
}

var tuples8867 = [
	[1, 3, 2],
	[-4, 5, 0],
	[-2, 7, -10],
	[0, 5, 7],
	[4, 4, 4],
	[4, -2, 3]
];
for (var i = 0; i < tuples8867.length; i++){
	var out = document.getElementById("8867t" + i);
	try {
		var arr = tuples8867[i];
		out.innerHTML = task8867(arr[0], arr[1], arr[2]);
	} catch (e) {
		out.innerHTML = e.message;
	}
}

var in7865 = [-5, -11, -3, 10, 5, 19, 0, -20, 20];
for (var i = 0; i < in7865.length; i++){
	var out = document.getElementById("7865t" + i);
	out.innerHTML = task7865(in7865[i]);
}