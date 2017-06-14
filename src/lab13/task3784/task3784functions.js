function task4257(l,p){
	if (l < 0){
		throw new Error("Значение L должно быть неотрицательным");
	}
	if (p < 0){
		throw new Error("Значение P должно быть неотрицательным");
	}
	return l*1000<p*0.305;
}
function task2291(velocityInKmH,velocityInMS){
	if (velocityInKmH < 0){
		throw new Error("Значение velocityInKmH должно быть неотрицательным");
	}
	if (velocityInMS < 0){
		throw new Error("Значение velocityInMS должно быть неотрицательным");
	}
	var velocityInMS1 = velocityInKmH * 1000 / 60 / 60;
	if (velocityInMS1 < velocityInMS){
		return velocityInKmH + " км/ч меньше " + velocityInMS + " м/с";
	} else {
		return velocityInMS + " км/ч меньше " + velocityInKmH + "м/с";
	}
}
function task1763(r,a) {
	if (r < 0){
		throw new Error("Значение R должно быть неотрицательным");
	}
	if (a < 0){
		throw new Error("Значение A должно быть неотрицательным");
	}
	var areaSquare = a * a;
	var areaCircle = Math.PI * r * r;
	if (areaCircle < areaSquare) {
		return "Площадь квадрата " + areaSquare.toFixed(4) + " больше площади круга " + areaCircle.toFixed(4);
	} else {                     
		return "Площадь круга " + areaCircle.toFixed(4) + " больше площади квадрата " + areaSquare.toFixed(4);
	}
}
function task1945(sc, ss){
	if (sc < 0){
		throw new Error("Площадь круга должна быть положительной");
	}
	if (ss < 0){
		throw new Error("Площадь квадрата должна быть положительной");
	}
	return Math.sqrt(sc/Math.PI) < Math.sqrt(ss)/2;
}
function task6291(a,b,c){
	if (a < 0)
	{
		throw new Error("Значение A должно быть неотрицательным");
	}
	if (b < 0)
	{
		throw new Error("Значение B должно быть неотрицательным");
	}
	if (c < 0)
	{
		throw new Error("Значение C должно быть неотрицательным");
	}
	a = parseInt(a);
	b = parseInt(b);
	c = parseInt(c);
	return a==b || b==c || a==c;
}
function task3883(a){
	a = parseInt(a);
	if (a < 1000 || a >9999){
		throw new Error("Значение A должно быть в интервале [1000, 9999]");
	}
	return Math.floor(a/100)%10 == a%10;
}
function task4527(a){
	if (a < -10 || a > 100){
		throw new Error("Значение A должно быть в интервале [-10, 100]");
	}
	if (a == 40){
		return "40'ой";
	}
	if (a == 0){
		return "0'ой";
	}
	var abs = a < 0 ? -a : a;
	if (abs%10 == 1 || abs%10 == 4 || abs%10 == 5 || abs%10 == 9 || a%10 == 0 || a == 12 || a == 13 || a == 16 || a == 17 || a == 18){
		return a + "'ый";
	}
	if (abs%10 == 2 || abs%10 == 6 || abs%10 == 7 || abs%10 == 8){
		return a +"'ой";
	}
	if (abs%10 == 3){
		return a + "'ий";
	}
	throw new Error("неожиданное число");
}
function task6556(a,b,c,d){
	if (a < 0){
		throw new Error("Значение A должно быть неотрицательным");
	}
	if (b < 0){
		throw new Error("Значение B должно быть неотрицательным");
	}
	if (c < 0){
		throw new Error("Значение C должно быть неотрицательным");
	}
	if (d < 0){
		throw new Error("Значение D должно быть неотрицательным");
	}
	return a<c && b<d;
}
function validatePoint(p){
	if (p.y < 0){
		throw new Error("Координата y должна быть неотрицательна");
	}
	if (p.x < 0){
		throw new Error("Координата x должна быть неотрицательна");
	}
}
function validateRectangle(r){
	if (r.h <= 0){
		throw new Error("Высота должна быть положительна");
	}
	if (r.w <= 0){
		throw new Error("Ширина должна быть положительна");
	}
}
function validateInterval(i){
	if(i.a > i.b){
		throw new Error("Значение A должно быть меньше значения B");
	}
}
function task2153(t){
	if (t < 0 || 60 <= t){
		throw new Error("Значение T должно быть в интервале [0, 59]");
	}
	return t%5 < 3;
}
function task5170(y){
	y = parseInt(y);
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