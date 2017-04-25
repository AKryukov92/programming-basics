var STR = "abcdefwxyz";
var STR2 = "abcdacadbacdaabaadc";
function task9020(x){
	if (x > 61){
		throw new Error("Подкоренное выражение должно быть неотрицательным");
	}
	return 3 * Math.sqrt(61-x);
}
function task7237(tc){
	if (tc < -273.15){
		throw new Error("Значение T должно быть выше абсолютного нуля");
	}
	return tc * 1.8 + 32;
}
function task3943(x,y){
	if (y < 0){
		throw new Error("Значение y должно быть неотрицательным");
	}
	var t = parseInt(x) + Math.sqrt(y);
	if (t < 0){
		throw new Error("Подкоренное выражение должно быть неотрицательным");
	}
	return -5 * Math.sqrt(t);
}
function task8873(r1, r2){
	if (r1 == 0){
		throw new Error("Значение r1 должно быть не равно нулю");
	}
	if (r2 == 0){
		throw new Error("Значение r2 должно быть не равно нулю");
	}
	return 1/r1 + 1/r2;
}
function task2624(a,b,c,x){
	var root = a * x * x + b * x + c;
	if (root < 0){
		throw new Error("Подкоренное выражение должно быть неотрицательным");
	}
	if (root == 0){
		throw new Error("Знаменатель не может быть равен нулю");
	}
	return 1/Math.sqrt(root);
}
function task5871(x){
	if (x < 1){
		throw new Error("Значение X должно быть не меньше 1");
	}
	x = parseInt(x);
	return (Math.sqrt(x+1)+Math.sqrt(x-1))/2/Math.sqrt(x);
}
function task3591(h){
	if (h < 0){
		throw new Error("Высота над уровнем Земли должна быть неотрицательна");
	}
	h = parseInt(h);
	var r = 6350;
	var c = r+h;
	return Math.sqrt(c*c-r*r);
}
function task2802(n){
	if (n <= 0){
		throw new Error("Значение N должно быть положительным");
	}
	var i = 2;
	var sum = 1;
	while (i <= n){
		sum += 1/i;
		i++;
	}
	return sum;
}
function task9631(s){
	if (STR.indexOf(s) == -1){
		throw new Error("Значение отсутствует в строке");
	}
	return STR.length - STR.indexOf(s) - 1;
}
function task9812(a,b){
	if (STR.indexOf(a) == -1){
		throw new Error("Значение A отсутствует в строке");
	}
	if (STR.indexOf(b) == -1){
		throw new Error("Значение B отсутствует в строке");
	}
	var ia = STR.indexOf(a);
	var ib = STR.indexOf(b);
	if (ia > ib){
		return ia - ib - 1;
	} else {
		return ib - ia - 1;
	}
}
function task5728(a,b){
	if (STR.indexOf(a) == -1){
		throw new Error("Значение A отсутствует в строке");
	}
	if (STR.indexOf(b) == -1){
		throw new Error("Значение B отсутствует в строке");
	}
	var ia = STR.indexOf(a);
	var ib = STR.indexOf(b);
	if (ia > ib){
		return STR.substring(ib + 1, ia);
	} else {
		return STR.substring(ia + 1, ib);
	}
}
function task5923(a,b){
	a = parseInt(a);
	b = parseInt(b);
	if (b < 0){
		throw new Error("Значение B должно быть неотрицательно");
	}
	if (a + b >= STR.length){
		throw new Error("Сумма значений A и B должна быть меньше длины строки");
	}
	if (a < 0 || a >= STR.length){
		throw new Error("Значение A должно быть в интервале [0,длина строки)");
	}
	return STR.substring(0,a) + STR.substring(a+b);
}
function task9116(str){
	if(!str.startsWith('"') || !str.endsWith('"')){
		throw new Error("Строка должна начинаться и заканчиваться кавычкой");
	}
	return str.substring(1,str.length-1).trim();
}
function task1618(line){
	var openIndex;
	var depth = 0;
	var closeIndex;
	var lastIndex = 0;
	var r = "";
	while(lastIndex < line.length){
		closeIndex = line.indexOf("}", lastIndex);
		openIndex = line.indexOf("{", lastIndex);
		if (openIndex >= 0 && openIndex < closeIndex) {
			depth++;
			lastIndex = openIndex;
		}
		if (openIndex >= 0 && closeIndex < 0){
			depth++;
			lastIndex = openIndex;
		}
		if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0){
			depth--;
			lastIndex = closeIndex;
		}
		if (openIndex < 0 && closeIndex >=0){
			depth--;
			lastIndex = closeIndex;
		}
		if (openIndex < 0 && closeIndex < 0){
			break;
		}
		if (depth < 0){
			throw new Error(r + " Неожиданный символ '}'");
		}
		r += depth;
		lastIndex++;
	}
	if (depth > 0){
		throw new Error(r + " Неожиданный конец строки");
	}
	return r;
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