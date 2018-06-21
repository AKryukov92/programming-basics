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