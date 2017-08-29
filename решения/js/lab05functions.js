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
	return v1 * 1000 / 60 / 60 < v2;
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
function task8715(a,b,c){
	a = parseInt(a);
	b = parseInt(b);
	c = parseInt(c);
	return a<b && b<c;
}
function task8518(x){
	var ret = "a";
	if(x=="a"){
		ret += "+";
	}
	ret += "<br/>b";
	if(x=="b"){
		ret += "+";
	}
	ret += "<br/>c";
	if(x=="c"){
		ret += "+";
	}
	ret += "<br/>d";
	if(x=="d"){
		ret += "+";
	}
	ret += "<br/>e";
	if(x=="e"){
		ret += "+";
	}
	ret += "<br/>f";
	if(x=="f"){
		ret += "+";
	}
	ret += "<br/>g";
	if(x=="g"){
		ret += "+";
	}
	ret += "<br/>h";
	if(x=="h"){
		ret += "+";
	}
	return ret;
}
function task4847(x,y,z){
	x = parseInt(x);
	y = parseInt(y);
	z = parseInt(z);
	return x==y || y==z || x==z;
}
function task7991(x,y,z){
	var ret = [];
	if (-3 < x && x < 5){
		ret.push(x);
	}
	if (-3 < y && y < 5){
		ret.push(y);
	}
	if (-3 < z && z < 5){
		ret.push(z);
	}
	return ret;
}
function task6291(a,b,c){
	a = parseInt(a);
	b = parseInt(b);
	c = parseInt(c);
	return a==b || b==c || a==c;
}
function task3770(x,y,z){
	x = parseInt(x);
	y = parseInt(y);
	z = parseInt(z);
	if(x > y && x > z){
		return x;
	}
	if(y > x && y > z){
		return y;
	}
	if(z > x && z > y){
		return z;
	}
}
function task7178(m,p){
	m = parseInt(m);
	p = parseInt(p);
	if (p == 0){
		throw new Error("Значение P должно быть не равно нулю");
	}
	if (m%p==0){
		return m/p;
	} else {
		return "M не делится нацело на P";
	}
}
function task3883(a){
	a = parseInt(a);
	if (a < 1000 || a >9999){
		throw new Error("Значение A должно быть в интервале [1000, 9999]");
	}
	return Math.floor(a/100)%10 == a%10;
}
function task1999(x, y){
	return x <= -2 && y >= 1;
}
function task4042(x, y){
	return y <= 1.5 && y >= -2;
}
function task6351(x, y){
	return y <= 4 && x >= 1 && x <= 2;
}
function task5382(x, y){
	return y <= 4 && y >= 2 && x >= 1;
}
function task7088(x, y){
	return (x >= 2 && y >= 0) || (x >= 1 && y <= -1);
}
function task7250(x, y){
	return x >= 2 && (y >= 1 || y <= -1.5);
}
function task6740(x, y){
	return x >= 1 && x <= 3 && y >= -2 && y <= -1;
}
function task9038(x, y){
	return x >= 2 || (y <= 1.5 && y >= 0.5);
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
function task5635(t,r){
	validatePoint(t);
	validatePoint(r);
	validateRectangle(r);
	return r.x <= t.x &&
		t.x <= r.x + r.w &&
		r.y <= t.y &&
		t.y <= r.y + r.h;
}
function task3878(t,p1,p2){
	validatePoint(t);
	validatePoint(p1);
	validatePoint(p2);
	return (t.x - p1.x) / (p2.x - p1.x) == (t.y - p1.y) / (p2.y - p1.y);
}
function task1217check(i1,i2){
	validateInterval(i1);
	validateInterval(i2);
	return !(i1.b <= i2.a || i2.b <= i1.a);
}
function task1217x(i1, i2){
	if (i1.a < i2.a && i2.a < i1.b){
		if (i2.b > i1.b){
			return {a:i2.a, b:i1.b};
		} else {
			return {a:i2.a, b:i2.b};
		}
	} else {
		if (i2.b > i1.b){
			return {a:i1.a, b:i1.b};
		} else {
			return {a:i1.a, b:i2.b};
		}
	}
}
function task1438check(r1,r2){
	validateRectangle(r1);
	validateRectangle(r2);
	var r1x = {a:r1.x, b:r1.x + r1.w};
	var r2x = {a:r2.x, b:r2.x + r2.w};
	var r1y = {a:r1.y, b:r1.y + r1.h};
	var r2y = {a:r2.y, b:r2.y + r2.h};
	return task1217check(r1x, r2x) && task1217check(r1y, r2y);
}
function task1438x(r1,r2){
	var r1x = {a:r1.x, b:r1.x + r1.w};
	var r2x = {a:r2.x, b:r2.x + r2.w};
	var r1y = {a:r1.y, b:r1.y + r1.h};
	var r2y = {a:r2.y, b:r2.y + r2.h};
	var xx = task1217x(r1x, r2x);
	var xy = task1217x(r1y, r2y);
	return {
		x:xx.a,
		y:xy.a,
		w:xx.b-xx.a,
		h:xy.b-xy.a
	};
}
function task2153(t){
	if (t > 60 || t <= 0){
		throw new Error("Значение T должно быть в интервале [0, 59]");
	}
	return (t-1)%5 < 3;
}
function task7937(w,h,c,d){
	if (w <= 0){
		throw new Error("Значение W должно быть положительным");
	}
	if (h <= 0){
		throw new Error("Значение H должно быть положительным");
	}
	if (c <= 0){
		throw new Error("Значение C должно быть положительным");
	}
	if (d <= 0){
		throw new Error("Значение D должно быть положительным");
	}
	var cw = (w/c)*(h/d);
	var ch = (h/c)*(w/d);
	if (cw > ch){
		return cw.toFixed(4) + " при C вдоль W";
	} else {
		return ch.toFixed(4) + " при C вдоль H";
	}
}