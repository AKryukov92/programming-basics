function task1860(a){
	console.log("Мы стремимся к " + a);
}
function task4411(x){
	return x + 7;
}
function task2790(xDeg){
    var s = Math.sin(xDeg * Math.PI / 180);
    return Math.sqrt(1 - s * s);
}
function task5662(a,b,c){
	if (a == 0){
		return "Данное уравнение не является квадратным";
	}
	var d = b*b - 4*a*c;
	if(d > 0){
		return "У уравнения "+ a + "x^2 + " + b + "x + " + c + " = 0 два вещественных корня";
	} else if (d == 0){
		return "Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет один корень";
	} else {
		return "Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет";
	}
}
function task3669(a,b){
	var i = a, n = b;
	if (a > b){
		i = b;
		n = a;
	}
	var mul = 1;
	while(i <= n){
		mul *= i;
		i++;
	}
	return mul;
}

function task1292(x){
	var arr = "a,b,c,d,e,f,g,h".split(',');
	var result = "";
	for (var i = 0; i < arr.length; i++){
		result += arr[i];
		if (x == arr[i]){
			return result;
		}
	}
	return result;
}

function task3946(arr){
	if (arr.length == 0){
		return 0;
	}
	var sum = 0;
	for (var i = 0; i < arr.length; i++){
		sum += arr[i];
	}
	return sum/arr.length;
}
function task4283(k, arr){
	var count = 0;
	for (var i = 0; i < arr.length; i++){
		if (arr[i] == k){
			count++;
		}
	}
	return count;
}
function task6497(arr) {
	if (arr.length == 0) {
		return [];
	}
	var sum = 0;
	for (var i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	var avg = sum / arr.length;
	var deltas = [];
	for (var i = 0; i < arr.length; i++) {
		deltas.push(Math.abs(arr[i]- avg));
	}
	return deltas;
}

function task9774(m, arr){
	for (var i = 0; i < arr.length; i++){
		arr[i] = arr[i] * m;
	}
}

function task9271(arr){
	var min = arr[0];
	for (var i = 1; i < arr.length; i++){
		if (min > arr[i]){
			min = arr[i];
		}
	}
	for (var i = 0; i < arr.length; i++){
		arr[i] = arr[i] - min;
	}
}

function task4847(x, y, z){
	return x == y || y == z || x == z;
}

function task6740(x, y){
	return x >= 1 && x <= 3 && y >= -2 && y <= -1;
}

function task7891(arr) {
	if (arr.length % 2 != 0){
		throw new Error("В массиве должно быть четное количество элементов");
	}
	let result = [];
	for (let i = 0; i < arr.length; i+=2){
		result.push(parseFloat(arr[i]));
		result.push(parseFloat(arr[i + 1]));
		result.push(parseFloat(arr[i]) + parseFloat(arr[i + 1]));
	}
	return result;
}