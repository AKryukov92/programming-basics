function task9020(x){
	if (x > 61){
		throw new Error("Подкоренное выражение должно быть неотрицательным");
	}
	return 3 * Math.sqrt(61 - x);
}
function task3943(x,y){
	if (y < 0){
		throw new Error("Значение y должно быть неотрицательным");
	}
	var root = x + Math.sqrt(y);
	if (root < 0){
		throw new Error("Подкоренное выражение должно быть неотрицательным");
	}
	return -5 * Math.sqrt(root);
}
function task7799(mass, aDeg){
	if (mass <= 0){
		throw new Error("Масса должна быть положительной");
	}
	if (aDeg >= 90){
		return 0;
	}
	var g = 9.8067;
	return mass*g*Math.cos(aDeg*Math.PI/180);
}
function task9354(a, b, c){
	if (a == 0){
		throw new Error("Уравнение y=" + a + "x^2+" + b + "x+" + c + " не является квадратным");
	}
	return b*b-4*a*c;
}
function task5170(y){
	if (y <= 0){
		throw new Error("Значение Y должно быть положительным");
	}
	var count = 0;
	for (var i = 2; i<=y/2+1; i++){
		if (y%i == 0){
			count++;
		}
	}
	return count == 0;
}