function task8878(a,b){
	return parseInt(a) > parseInt(b);
}
function task3072(p,q){
	if (parseInt(p) > parseInt(q)){
		return { max:p, min:q };
	} else {
		return { max:q, min:p };
	}
}
function task5980(k){
	if (parseInt(k)>0){
		return Math.sqrt(k);
	} else {
		return k*k;
	}
}
function task8174(a){
	if (parseInt(a) > 0){
		return a;
	} else {
		return -a;
	}
}
function task4257(l,p){
	if (l < 0){
		throw new Error("Значение L должно быть неотрицательным");
	}
	if (p < 0){
		throw new Error("Значение P должно быть неотрицательным");
	}
	return l*1000<p*0.305;
}
function task2291(v1,v2){
	if (v1 < 0){
		throw new Error("Значение V1 должно быть неотрицательным");
	}
	if (v2 < 0){
		throw new Error("Значение V2 должно быть неотрицательным");
	}
	return v1 * 1000 * 60 * 60 < v2;
}
function task1763(r,a) {
	if (r < 0){
		throw new Error("Значение R должно быть неотрицательным");
	}
	if (a < 0){
		throw new Error("Значение A должно быть неотрицательным");
	}
	return Math.PI * r * r < a * a;
}
function task5662(a,b,c){
	if (a == 0){
		return "Данное уравнение не является квадратным";
	}
	var d = b*b - 4*a*c;
	if(d > 0){
		return "Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет";
	} else if (d == 0){
		return "У уравнения "+ a + "x^2 + " + b + "x + " + c + " два вещественных корня";
	} else {
		return "Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет один корень";
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
function task1186(x,y,z){
	var ret = [];
	if (x >= 0){
		x = x*x;
	}
	ret.push(parseFloat(x).toFixed(4));
	if (y >= 0){
		y = y*y;
	}
	ret.push(parseFloat(y).toFixed(4));
	if (z >= 0){
		z = z*z;
	}
	ret.push(parseFloat(z).toFixed(4));
	return ret;
}