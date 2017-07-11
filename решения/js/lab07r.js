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
var in9279 = ["ab","bc","ac","cde","a"];
for (var i = 0; i < in9279.length; i++){
	var out = document.getElementById("9279t" + i);
	try {
		out.innerHTML = task9279(in9279[i]);
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
var in7491 = ["bx","fw","123"];
for (var i = 0; i < in7491.length; i++){
	var out = document.getElementById("7491t" + i);
	if (task7491(in7491[i])){
		out.innerHTML = "Содержится";
	} else {
		out.innerHTML = "Не содержится";
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
var in4265 = ["sABCD","Uxyz","s","F123","Sopqr"];
for (var i = 0; i < in4265.length; i++){
	var out = document.getElementById("4265t" + i);
	out.innerHTML = task4265(in4265[i]);
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
var in9116 = ['"   12345"', '"abcdef    "', '"  xyz  "','"  a b  "', '" pq"rt "','asdf"','"xyz','p"w"'];
for (var i = 0; i < in9116.length; i++){
	var out = document.getElementById("9116t" + i);
	try {
		out.innerHTML = task9116(in9116[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}
var in9925 = ["один, два, три, четыре, пять","янв,фев,март","один"];
for (var i = 0; i < in9925.length; i++){
	var out = document.getElementById("9925t" + i);
	out.innerHTML = task9925(in9925[i]);
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