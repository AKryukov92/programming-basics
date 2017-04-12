function task4411(x){
	return (parseFloat(x) + 7).toFixed(4);
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
	return (2 * Math.PI * r).toFixed(4);
}
function task2981(r){
	if (r <= 0){
		throw new Error("Значение R должно быть положительным");
	}
	return (4 * Math.PI * r*r*r /3).toFixed(4);
}
function task4312(a,h){
	if (a <= 0){
		throw new Error("Значение A должно быть положительным");
	}
	if (h <= 0){
		throw new Error("Значение H должно быть положительным");
	}
	return (a * h / 2).toFixed(2);
}
function task8428(a){
	return (a * Math.PI/180).toFixed(4);
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
	return Math.sin(x*Math.PI/180).toFixed(4);
}
function task8833(x){
	if (x < 0){
		throw new Error("Значение X должно быть неотрицательным");
	}
	return Math.sqrt(x).toFixed(4);
}
function task1262(y){
	return (5 * Math.cos(y * Math.PI/180)).toFixed(4);
}
function task9020(x){
	if (x < 0){
		throw new Error("Значение X должно быть неотрицательным");
	}
	return (3 * Math.sqrt(x)).toFixed(4);
}