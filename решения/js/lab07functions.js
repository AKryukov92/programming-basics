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
function task1433(str){
	if(str == ""){
		throw new Error("Исходная строка пуста");
	}
	var arr = str.split(";");
	var index = Math.floor((arr.length-1)/2);
	return "Индекс: " + index + ", элемент: " + arr[index];
}
function task5683(str){
	if (str === ""){
		return "";
	}
	var ret = "";
	var arr = str.split(" ");
	for (var i = 0; i < arr.length; i++){
		ret += arr[i] + " " + i + "<br/>";
	}
	return ret;
}
function task1223(raw){
	var ret = [];
	if (raw == ""){
		return ret;
	}
	var arr = raw.split(" ");
	for (var i = arr.length - 1; i >= 0; i--){
		ret.push(arr[i]);
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

function task6497(raw) {
	if (typeof(raw) == "undefined"){
		return [];
	}
	if (raw.length == 0) {
		return [];
	}
	var arr = raw.split(" ");
	var sum = 0;
	for (var i = 0; i < arr.length; i++) {
		sum += parseFloat(arr[i]);
	}
	var avg = sum / arr.length;
	var deltas = [];
	for (var i = 0; i < arr.length; i++) {
		deltas.push(Math.abs(parseFloat(arr[i]) - avg));
	}
	return deltas;
}

function task5648(raw) {
	if (raw == "") {
		throw new Error("Дана пустая последовательность");
	}
	var arr = raw.split(" ");
	var drr = [];
	var sum = 0;
	for (var i = 0; i < arr.length; i++) {
		drr[i] = parseFloat(arr[i]);
		sum += drr[i];
	}
	var avg = sum / arr.length;
	var sumOfD = 0;
	for (var i = 0; i < arr.length; i++) {
		var d = (drr[i] - avg);
		sumOfD += d * d;
	}
	return Math.sqrt(1.0 / (arr.length - 1.0) * sumOfD);
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
		ret.push(arr[i]);
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
	var ret = [];
	if (raw == ""){
		return ret;
	}
	var arr = raw.split(" ");
	for (var i = 0; i < arr.length; i++){
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
function task7085(s, raw){
	var arr = raw.split(" ");
	if (s <= 0 || arr.length <= s) {
		throw new Error("Количество позиций при сдвиге должно быть в интервале [0, длина массива)");
	}
	var sb = "";
	for (var j = 0; j < s; j++) {
		var t = arr[arr.length - 1];
		for (var i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = t;
		for (var i = 0; i < arr.length; i++) {
			sb += arr[i];
			sb += ' ';
		}
		sb += '\n';
	}
	return sb;
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
function task7534(charsRaw, amountsRaw){
	if (charsRaw == ""){
		return "Отсутствуют данные о символах";
	}
	if (amountsRaw == ""){
		return "Отсутствуют данные о количествах";
	}
	var chars = charsRaw.split(" ");
	var amounts = amountsRaw.split(" ");
	if (chars.length != amounts.length){
		return "Длины массивов не совпадают";
	}
	var sb = "";
	for (var i = 0; i < chars.length; i++){
		var amount = parseInt(amounts[i]);
		for (var j = 0; j < amount; j++){
			sb += chars[i];
		}
		sb += "\n";
	}
	return sb;
}
function task7369(leftRaw, topRaw){
	if (leftRaw == ""){
		return "Данные слева отсутствуют";
	}
	if(topRaw == ""){
		return "Данные сверху отсутствуют";
	}
	var leftArr = leftRaw.split(" ");
	var topArr = topRaw.split(" ");
	var sb = "  ";
	sb += topRaw;
	sb += "\n";
	for (var i = 0; i < leftArr.length; i++){
		sb += leftArr[i];
		for (var j = 0; j < topArr.length; j++){
			if(leftArr[i] == topArr[j]){
				sb += " +";
			} else {
				sb += "  ";
			}
		}
		sb += "|\n";
	}
	sb += " ";
	for(var i = 0; i < topArr.length;i++){
		sb += "--";
	}
	return sb.toString();
}
function task5894(leftRaw, topRaw) {
	if (leftRaw == ""){
		throw new Error("Данные слева отсутствуют");
	}
	if(topRaw == ""){
		throw new Error("Данные сверху отсутствуют");
	}
	var count = 0;
	var leftArr = leftRaw.split(" ");
	var topArr = topRaw.split(" ");
	for (var i = 0; i < leftArr.length; i++){
		for (var j = 0; j < topArr.length; j++){
			if(leftArr[i] == topArr[j]){
				count++;
			}
		}
	}
	return count;
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
	var result = "Ход решения:<br/>Начинаю с " + min;
	for (var i = 1; i < arr.length; i++){
		var current = parseInt(arr[i]);
		result += "</br>Сравниваю " + min + " и " + current;
		if (current < min){
			result += "</br>Заменяю";
			min = current;
		}
	}
	result += "</br>В массиве {" + raw + "} минимальный элемент это " + min;
	return result;
}
function task9271(raw){
	var arr = raw.split(" ");
	var ret = [];
	if (arr.length == 0){
		return ret;
	}
	var min = parseInt(arr[0]);
	for (var i = 1; i < arr.length; i++){
		var current = parseInt(arr[i]);
		if (current < min){
			min = current;
		}
	}
	for (var i = 0; i < arr.length; i++){
		ret.push(parseInt(arr[i]) - min);
	}
	return ret;
}
function task8769(p,q,raw){
	var arr = raw.split(" ");
	var i, n;
	if (p < 0 || p >= arr.length){
		throw new Error("Число P должно быть в интервале [0, размер массива)");
	}
	if (q < 0 || q >= arr.length){
		throw new Error("Число Q должно быть в интервале [0, размер массива)");
	}
	if (p < q){
		i = p;
		n = q;
	} else {
		i = q;
		n = p;
	}
	var min = parseInt(arr[i]);
	while(i <= n){
		var current = parseInt(arr[i]);
		if (current < min){
			min = current;
		}
		i++;
	}
	return min;
}
function task4497(x,y,raw){
	var arr = raw.split(" ");
	var ret = [];
	for (var i = 0; i < arr.length; i++){
		var current = parseInt(arr[i]);
		if (current == x){
			ret.push(y);
		} else {
			ret.push(current);
		}
	}
	return ret;
}
function task3218(raw){
	var arr = raw.split(" ");
	var ret = [];
	var data = [];
	for (var i = 0; i < arr.length; i++){
		data[i] = parseInt(arr[i]);
	}
	for (var i = 0; i < arr.length; i++){
		var min = i;
		for (var j = i; j < arr.length; j++){
			if (data[j] < data[min]){
				min = j;
			}
		}
		var t = data[min];
		data[min] = data[i];
		data[i] = t;
		ret.push(t);
	}
	return ret;
}
function task4283(k,raw){
	var arr = raw.split(" ");
	var count = 0;
	for (var i = 0; i < arr.length; i++){
		if (parseInt(arr[i]) == k){
			count++;
		}
	}
	return count;
}
function task7703(raw){
	var arr = raw.split(" ");
	var ret = [];
	for (var i = 0; i < arr.length; i++){
		var count = 0;
		for (var j = 0; j < arr.length; j++){
			if (arr[j] == arr[i]){
				count++;
			}
		}
		ret.push(count);
	}
	return ret;
}
function task5541(raw){
	var arr = raw.split(" ");
	var data = {};
	for (var i = 0; i < arr.length; i++){
		data[arr[i]] = true;
	}
	return data;
}
function task9182(raw){
	var arr = raw.split(" ");
	var data = {};
	for (var i = 0; i < arr.length; i++){
		data[arr[i]] = true;
	}
	var count = 0;
	for (item in data){
		count++;
	}
	return count;
}
function task6492(charsRaw, amountsRaw){
	if (charsRaw == ""){
		return "Отсутствуют данные о символах";
	}
	if (amountsRaw == ""){
		return "Отсутствуют данные о количествах";
	}
	var chars = charsRaw.split(" ");
	var amounts = amountsRaw.split(" ");
	if (chars.length != amounts.length){
		return "Длины массивов не совпадают";
	}
	var max = amounts[0];
	for (var i = 1; i < amounts.length; i++) {
		if (max < amounts[i]){
			max = amounts[i];
		}
	}
	var sb = "";
	for (var i = 0; i < max; i++){
		for (var j = 0; j < chars.length; j++){
			if (i < amounts[j]){
				sb += chars[j];
			} else {
				sb += " ";
			}
		}
		sb += "\n";
	}
	return sb;
}