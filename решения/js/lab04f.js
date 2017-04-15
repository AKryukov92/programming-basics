function task8495(){
	var r = "";
	var i = 0;
	while(i < 13){
		r+="!";
		i++;
	}
	return r;
}
function task1315(){
	var r = "";
	var i = 17;
	while(i <= 47){
		r += i + " ";
		i++;
	}
	return r;
}
function task6066(a,b){
	a = parseInt(a);
	b = parseInt(b);
	if (a > b){
		throw new Error("Значение A должно быть не больше значения B");
	}
	var r = "";
	var i = a;
	while (i <= b){
		r += i + "<br/>";
		i++;
	}
	return r;
}
function task2565(a,b){
	a = parseInt(a);
	b = parseInt(b);
	if (a > b){
		throw new Error("Значение A должно быть не больше значения B");
	}
	var r = "";
	var i = b;
	while (i >= a){
		r += i + " ";
		i--;
	}
	return r;
}
function task2594(a,b){
	a = parseInt(a);
	if (a < 0){
		throw new Error("Значение A должно быть неотрицательным");
	}
	var r = "&quot;";
	var i = 0;
	while (i < a){
		r += b;
		i++;
	}
	r += "&quot;";
	return r;
}
function task2321(a,b){
	a = parseInt(a);
	b = parseInt(b);
	var i = a, n = b;
	if (a > b){
		i = b;
		n = a;
	}
	var r = "";
	while(i <= n){
		r += i + " ";
		i++;
	}
	return r;
}
function task5053(a,b){
	a = parseInt(a);
	b = parseInt(b);
	var r = "";
	if (a > b){
		while (a >= b){
			r += a + " ";
			a--;
		}
	} else {
		while (a <= b){
			r += a + " ";
			a++;
		}
	}
	return r;
}
function task3762(){
	var i = 1;
	var r = "";
	while (i <= 20){
		r += i + "    " + i * 453 + "<br/>";
		i++;
	}
	return r;
}
function task3550(){
	var i = 1;
	var r = "";
	while (i < 10){
		r += i + " x 7 = " + i*7 + "<br/>";
		i++;
	}
	return r;
}
function task2475(){
	var a = 100;
	var sum = 0;
	while (a <= 500){
		sum += a;
		a++;
	}
	return sum;
}
function task9180(a){
	a = parseInt(a);
	if (a < -100 || a > 500){
		throw new Error("Значение A должно быть в интервале [-100, 500]");
	}
	var sum = 0;
	while(a <= 500){
		sum += a;
		a++;
	}
	return sum;
}
function task1544(b){
	b = parseInt(b);
	if (b < -10 || b > 10000){
		throw new Error("Значение b должно быть в интервале [-10,10000]");
	}
	var sum = 0;
	while (b >= -10){
		sum += b;
		b--;
	}
	return sum;
}
function task9562(a,b){
	a = parseInt(a);
	b = parseInt(b);
	var i = a, n = b;
	if (a > b){
		i = b;
		n = a;
	}
	var sum = 0;
	while(i <= n){
		sum += i;
		i++;
	}
	return sum;
}
function task3669(a,b){
	a = parseInt(a);
	b = parseInt(b);
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
function task5951(){
	var i = 20;
	var sum = 0;
	while(i <= 40){
		sum += i*i*i;
		i++;
	}
	return sum;
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
function task6580(a,b){
	a = parseInt(a);
	b = parseInt(b);
	var i = a, n = b;
	if (a > b){
		i = b;
		n = a;
	}
	var sum = 0;
	while (i <= n){
		sum += i*i;
		i++;
	}
	return sum;
}
function task7585(x){
	var i = 10;
	var r = "";
	while (i <= 20){
		r += i;
		if (i == x){
			r += "+";
		}
		r += "<br/>";
		i++;
	}
	return r;
}
function task1483(n){
	n = parseInt(n);
	if (n < 0){
		throw new Error("Значение N должно быть неотрицательным");
	}
	var i = 0;
	var r = "";
	while (i < n){
		r += "!";
		if (i%5 == 0){
			r += " ";
		}
		i++;
	}
	return r;
}
function task3983(n){
	n = parseInt(n);
	if (n < 0){
		throw new Error("Значение N должно быть неотрицательным");
	}
	var i = 0;
	var r = "";
	while (i < n){
		r += "#";
		if (i%20 == 0){
			r += "<br/>"
		}
		i++;
	}
	return r;
}