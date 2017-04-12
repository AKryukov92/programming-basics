function task4411(x){
	var c = parseFloat(x) + 7;
	return c.toFixed(4);
}
function task9298(a){
	if (a <= 0){
		throw new Error("Значение A должно быть положительным");
	}
	return 6 * a * a;
}
function task3354(a){
	if (a <= 0){
		throw new Error("Значение A должно быть положительным");
	}
	return a * a * a;
}
function task5201(r){
	if (r <= 0){
		throw new Error("Значение R должно быть положительным");
	}
	var c = 2 * Math.PI * r;
	return c.toFixed(4);
}
function task2981(r){
	if (r <= 0){
		throw new Error("Значение R должно быть положительным");
	}
	var v = 4 * Math.PI * r * r * r / 3;
	return v.toFixed(4);
}
function task4312(a,h){
	if (a <= 0){
		throw new Error("Значение A должно быть положительным");
	}
	if (h <= 0){
		throw new Error("Значение H должно быть положительным");
	}
	var s = a * h / 2;
	return s.toFixed(2);
}
function task8428(a){
	var b = a * Math.PI/180;
	return b.toFixed(4);
}
function task2361(t,l){
	if (t <= 0){
		throw new Error("Значение T должно быть положительным");
	}
	if (l <= 0){
		throw new Error("Значение L должно быть положительным");
	}
	t = parseInt(t) * 100;
	l = parseInt(l);
	return Math.floor(t/l) + " шт и " + t%l + " см";
}
function task5063(a){
	return parseInt(a)%360;
}
function task7711(x){
	var r = Math.sin(x*Math.PI/180);
	return r.toFixed(4);
}
function task8833(x){
	if (x < 0){
		throw new Error("Значение X должно быть неотрицательным");
	}
	var r = Math.sqrt(x);
	return r.toFixed(4);
}
function task1262(y){
	var r = 5 * Math.cos(y * Math.PI/180);
	return r.toFixed(4);
}
function task9020(x){
	if (x < 0){
		throw new Error("Значение X должно быть неотрицательным");
	}
	var r = 3 * Math.sqrt(x);
	return r.toFixed(4);
}
function task1934(a,b){
	if (b > 0){
		throw new Error("Значение B должно быть не положительным");
	}
	var r = a*Math.sqrt(-7*b);
	return r.toFixed(4);
}
function task7237(tc){
	if (tc < -273.15){
		throw new Error("Значение T должно быть выше абсолютного нуля");
	}
	var tf = tc * 1.8 + 32;
	return tf.toFixed(4);
}
function task3943(x,y){
	if (y < 0){
		throw new Error("Значение y должно быть неотрицательным");
	}
	var t = parseInt(x) + Math.sqrt(y);
	if (t < 0){
		throw new Error("Подкоренное выражение должно быть неотрицательным");
	}
	var r = -5 * Math.sqrt(t);
	return r.toFixed(4);
}
function task7619(v1, v2, s){
	if (v1 < 0){
		throw new Error("Значение v1 должно быть неотрицательным");
	}
	if (v2 < 0){
		throw new Error("Значение v2 должно быть неотрицательным");
	}
	var t = s/(parseInt(v1)+parseInt(v2));
	return t.toFixed(4);
}
function task3832(x1,x2,x3){
	return x1*x2+x1*x3+x2*x3;
}
function task1346(v0,t,a){
	return v0*t+a*t*t/2;
}
function task9622(m,v,h){
	if (m < 0){
		throw new Error("Значение M должно быть положительным");
	}
	if (v < 0){
		throw new Error("Значение V должно быть положительным");
	}
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательным");
	}
	var t = m*v*v/2;
	var wn = m*h*9.8067;
	return "T: " + t.toFixed(4) + " Wn: " + wn.toFixed(4);
}
function task8873(r1, r2){
	if (r1 == 0){
		throw new Error("Значение r1 должно быть не равно нулю");
	}
	if (r2 == 0){
		throw new Error("Значение r2 должно быть не равно нулю");
	}
	var r = 1/r1 + 1/r2;
	return r.toFixed(4);
}
function task7799(m,a){
	var r = m*9.8067*Math.cos(a*Math.PI/180);
	return r.toFixed(4);
}
function task9354(a,b,c){
	var r = b*b-4*a*c;
	return r.toFixed(4);
}
function task9130(y,m1,m2,r){
	if (r == 0){
		throw new Error("Значение r должно быть не равно нулю");
	}
	var c = y*m1*m2/r/r;
	return c.toFixed(4);
}
function task5895(a,b,c){
	var r = Math.sqrt(a*a+b*b-2*a*b*Math.cos(c*Math.PI/180));
	return r.toFixed(4);
}
function task2461(a,b,c,d){
	if (a == 0){
		throw new Error("Значение a должно быть не равно нулю");
	}
	if (d == 0){
		throw new Error("Значение d должно быть не равно нулю");
	}
	var r = (a*d+b*c)/a/d;
	return r.toFixed(4);
}