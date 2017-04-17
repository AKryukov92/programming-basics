function task4425(a, str){
	if (str == ""){
		throw new Error("Исходная строка пуста");
	}
	var arr = str.split(" ");
	if (a < 0 || a >= arr.length){
		throw new Error("Число A должно быть в интервале [0, размер массива)");
	}
	return arr[a];
}
function task1223(raw){
	var ret = [];
	if (raw == ""){
		return ret;
	}
	var arr = raw.split(" ");
	for (var i = arr.length - 1; i >= 0; i--){
		ret.push(parseInt(arr[i]));
	}
	return ret;
}
function task3946(raw){
	if (raw == ""){
		return 0;
	}
	var arr = raw.split(" ");
	var sum = 0;
	for (var i = 0; i < arr.length; i++){
		sum += parseInt(arr[i]);
	}
	return sum/arr.length;
}
function task3940(left, right){
	var larr = left.split(" ");
	var rarr = right.split(" ");
	if (larr.length != rarr.length){
		throw new Error("Размеры массивов должны быть одинаковы");
	}
	var ret = [];
	for (var i = 0; i < larr.length; i++){
		var l = parseInt(larr[i]);
		var r = parseInt(rarr[i]);
		ret.push(l*r);
	}
	return ret;
}
function task8311(b, e, raw){
	var arr = raw.split(" ");
	if (b < 0 || b >= arr.length){
		throw new Error("Число B должно быть в интервале [0, размер массива)");
	}
	if (e < 0 || e >= arr.length){
		throw new Error("Число E должно быть в интервале [0, размер массива)");
	}
	var ret = [];
	var i, n;
	b = parseInt(b);
	e = parseInt(e);
	if (b < e){
		i = b;
		n = e;
	} else {
		i = e;
		n = b;
	}
	while(i <= n){
		ret.push(parseInt(arr[i]));
		i++;
	}
	return ret;
}
function task3134(p, q, raw){
	var arr = raw.split(" ");
	if (p < 0 || p >= arr.length ){
		throw new Error("Число P должно быть в интервале [0, размер массива)");
	}
	if (q < 0 || q >= arr.length){
		throw new Error("Число Q должно быть в интервале [0, размер массива)");
	}
	var ret = [];
	var t = arr[p];
	arr[p] = arr[q];
	arr[q] = t;
	for (var i = 0; i < arr.length; i++){
		ret.push(arr[i]);
	}
	return ret;
}
function task9774(m, raw){
	var arr = raw.split(" ");
	var ret = [];
	for (var i = arr.length - 1; i >= 0; i--){
		ret.push(parseInt(arr[i]) * m);
	}
	return ret;
}
function task9711(raw){
	var arr = raw.split(" ");
	var ret = [];
	ret.push(arr[arr.length - 1]);
	for (var i = 0; i < arr.length - 1; i++){
		ret.push(arr[i]);
	}
	return ret;
}
function task3333(s, raw){
	var arr = raw.split(" ");
	var ret = [];
	var ds;
	if (s < 0){
		ds = -s % arr.length;
	} else {
		ds = arr.length - s % arr.length;
	}
	for (var i = ds; i < arr.length; i++){
		ret.push(arr[i]);
	}
	for (var i = 0; i < ds; i++){
		ret.push(arr[i]);
	}
	return ret;
}
function task8820(raw){
	var arr = raw.split(" ");
	var ret = [];
	for (var i = arr.length - 1; i >= 0; i--){
		ret.push(arr[i]);
	}
	return ret;
}
function task7290(b, raw){
	var arr = raw.split(" ");
	if (b < 0 || b >= arr.length){
		throw new Error("Число B должно быть в интервале [0, размер массива)");
	}
	var t = parseInt(arr[b]);
	var count = 0;
	for (var i = 0; i < arr.length; i++){
		if (parseInt(arr[i]) < t){
			count++;
		}
	}
	return count;
}
function task5694(x){
	var arr = ["a", "b", "c", "d", "e", "f", "g", "h"];
	var ret = "";
	for (var i = 0; i < arr.length; i++){
		ret += arr[i];
		if (arr[i] == x){
			ret += "+";
		}
		ret += "<br/>";
	}
	return ret;
}
function task6806(x){
	var arr = [11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20];
	var ret = "";
	for (var i = 0; i < arr.length; i++){
		ret += arr[i];
		if (arr[i] == x){
			ret += "+";
		}
		ret += "\n";
	}
	return ret;
}
function task4515(raw){
	var arr = raw.split(" ");
	for (var i = 0; i < arr.length; i++){
		for (var j = i + 1; j < arr.length; j++){
			if (arr[i] == arr[j]){
				return true;
			}
		}
	}
	return false;
}
function task7035(raw){
	var arr = raw.split(" ");
	var min = parseInt(arr[0]);
	for (var i = 1; i < arr.length; i++){
		var current = parseInt(arr[i]);
		if (current < min){
			min = current;
		}
	}
	return min;
}