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
function task3550(v){
	var i = 1;
	var r = "";
	while (i <= 9){
		r += i + " x " + v + " = " + i*v + "<br/>";
		i++;
	}
	return r;
}
function task2475(){
	var result = "Ход решения: ";
	var a = 100;
	var sum = 0;
	while (a <= 500){
		sum += a;
		result += sum;
		result += " ";
		a++;
	}
	result += "</br>Ответ:";
	result += sum;
	return result;
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
	var result = "Ход решения: ";
	var i = 20;
	var sum = 0;
	while(i <= 40){
		result += sum;
		result += "+";
		result += (i*i*i);
		result += "= ";
		sum += i*i*i;
		i++;
	}
	result += "</br>Ответ: ";
	result += sum;
	return result;
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
function task4264(n){
	n = parseInt(n);
	if (n < 0){
		throw new Error("Значение N должно быть неотрицательным");
	}
	var r = "";
	var i = 0;
	var j = 0;
	while (i <= n){
		j++;
		if(j == 4){
			j = 0;
		}
		r += i + " - " + j + "<br>";
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
function task8770(x){
	var r = "";
	for (var i = 30; i <= 40; i++){
		if (i == x){
			r += i + "+<br/>";
		} else {
			r += i + "-<br/>";
		}
	}
	return r;
}
function task4236(y){
	if (y < 0 || y > 15){
		throw new Error("Значение Y должно быть в интервале [0, 15]");
	}
	var r = "";
	var i = 0;
	while(i < y){
		r += "#";
		i++;
	}
	while(i < 15){
		r += ".";
		i++;
	}
	return r;
}
function task5969(a,b){
	a = parseInt(a);
	b = parseInt(b);
	var i = a, n = b;
	if (a > b){
		i = b;
		n = a;
	}
	var sum = 0;
	while (i <= n){
		if (i%7 == 0){
			sum += i;
		}
		i++;
	}
	return sum;
}
function task8696(){
	var result = "Ход решения: ";
	var count = 0;
	for (var i = 100; i < 1000; i++){
		result += i;
		if (i%13 == 0){
			result += "+";
			count ++;
		}
		result += " ";
	}
	result += "</br>Ответ: ";
	result += count;
	return result;
}
function task8418(x){
	x = parseInt(x);
	if (x <= 0){
		throw new Error("Значение X должно быть положительным");
	}
	var r = "";
	for (var i = 1; i <= x; i++){
		if (x%i == 0){
			r += i + " ";
		}
	}
	return r;
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
function task8395(w){
	w = parseInt(w);
	if (w < 0 || w > 20){
		throw new Error("Значение W должно быть в интервале [0, 20]");
	}
	var ca = "", cb = "", cc = "", cd = "", ce = "", cf = "", cg = "", ch = "";
	for (var i = 0; i < w; i++){
		ca += "a";
		cb += "b";
		cc += "c";
		cd += "d";
		ce += "e";
		cf += "f";
		cg += "g";
		ch += "h";
	}
	return ca + "<br/>" + cb + "<br/>" + cc + "<br/>" + cd + "<br/>" + ce + "<br/>" + cf + "<br/>" + cg + "<br/>" + ch;
}
function task5568(w){
	if (w < 0 || w > 20){
		throw new Error("Значение W должно быть в интервале [0, 20]");
	}
	var r = "";
	for (var i = 0; i < 10; i++){
		for (var j = 0; j < w; j++){
			r += i;
		}
		r += "<br/>"
	}
	return r;
}
function task2592(s,w,h){
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательным");
	}
	if (w < 0){
		throw new Error("Значение W должно быть неотрицательным");
	}
	var r = "";
	for (var i = 0; i < h; i++){
		for (var j = 0; j < w; j++){
			r += s;
		}
		r += "<br/>";
	}
	return r;
}
function task4075(w){
	if (w < 0){
		throw new Error("Значение W должно быть неотрицательным");
	}
	if (w < 2){
		return "";
	}
	var c1 = "+";
	var c2 = "|";
	for (var i = 1; i < w - 1; i++){
		c1 += "-";
		c2 += ".";
	}
	return c1 + "+<br/>" + c2 + "|<br/>" + c1 + "+";
}
function task7517(w,h){
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательным");
	}
	if (w < 0){
		throw new Error("Значение W должно быть неотрицательным");
	}
	if (h == 0 || w == 0){
		return "";
	}
	var r = " ";
	for (var i = 0; i < w; i++){
		r += i;
	}
	r += "<br/>";
	for (var i = 0; i < h; i++){
		r += i;
		for (var j = 0; j < w; j++){
			r += " ";
		}
		r += "|<br/>";
	}
	r += " ";
	for (var i = 0; i < w; i++){
		r += "-";
	}
	return r;
}
function task5448(s,h){
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательным");
	}
	var r = "";
	for (var i = 1; i <= h; i++){
		for (var j = 0; j < i; j++){
			r += s;
		}
		r += "<br/>";
	}
	return r;
}
function task6572(a,b){
	a = parseInt(a);
	b = parseInt(b);
	var i = 0, n;
	if (a < b){
		n = b - a;
		min = a;
	} else {
		n = a - b;
		min = b;
	}
	if (min%2 == 0){
		min ++;
	}
	var r = "";
	while(i <= n){
		for (var j = 0; j < i/2; j++){
			r += ".";
		}
		r += (i + min);
		r += "\n";
		i += 2;
	}
	return r;
}
function task5238(w,h){
	if (w < 0){
		throw new Error("Значение W должно быть неотрицательно");
	}
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательно");
	}
	if (w == 0 || h == 0){
		return "";
	}
	var r = "";
	for (var i = 0; i < h; i++){
		var j = 0;
		while (j < w - i){
			r += "+";
			j++;
		}
		while (j < w){
			r += "#";
			j++;
		}
		r += "\n";
	}
	return r;
}
function task2084(a,b){
	a = parseInt(a);
	b = parseInt(b);
	var ret = [];
	if (a < b){
		while (a <= b){
			if (a%2 != 0){
				ret.push(a);
			}
			a++;
		}
	} else {
		while (b <= a){
			if (a%2 != 0){
				ret.push(a);
			}
			a--;
		}
	}
	return ret;
}
function task5411(p,q){
	p = parseInt(p);
	q = parseInt(q);
	var i = 1, n, min;
	if (p < q){
		min = p;
		n = q - p;
	} else {
		min = q;
		n = p - q;
	}
	var r = min;
	while (i <= n/2){
		r += "&lt;";
		r += (i + min);
		i++;
	}
	while (i <= n){
		r += "&gt;";
		r += (i + min);
		i++;
	}
	return r;
}
function task5171(s1,s2,w,h){
	w = parseInt(w);
	h = parseInt(h);
	if (w < 0){
		throw new Error("Значение W должно быть неотрицательно");
	}
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательно");
	}
	if (w == 0 || h == 0){
		return "";
	}
	var r = "";
	for (var i = 0; i < h; i++){
		for (var j = 0; j < w; j++){
			if (i%2 == 0){
				r += s1;
			} else {
				r += s2;
			}
		}
		r += "<br/>";
	}
	return r;
}
function task1862(s1,s2,w,h){
	w = parseInt(w);
	h = parseInt(h);
	 if (w < 0){
		throw new Error("Значение W должно быть неотрицательно");
	}
	if (h < 0){
		throw new Error("Значение H должно быть неотрицательно");
	}
	if (w == 0 || h == 0){
		return "";
	}
	var r = "";
	for (var i = 0; i < h; i++){
		for (var j = 0; j < w; j++){
			if (j%2 == 0){
				r += s1;
			} else {
				r += s2;
			}
		}
		r += "\n";
	}
	return r;
}
function task4338(a, b){
	var begin, end;
	if (a < b){
		begin = a;
		end = b;
	} else {
		begin = b;
		end = a;
	}
	var i = begin, j = end;
	var r = "";
	while(i <= end){
		r += i + " " + j + "\n";
		i++;
		j--;
	}
	return r;
}