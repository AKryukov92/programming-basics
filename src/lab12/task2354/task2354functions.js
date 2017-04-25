function task4411(x){
	return parseFloat(x) + 7;
}
function task8428(a){
	return a * Math.PI/180;
}
function task1262(y){
	return 5 * Math.cos(y * Math.PI/180);
}
function task2790(x) {
	var s = Math.sin(x * Math.PI / 180);
	return Math.sqrt(1-s*s);
}
function task9164(a,b){
	a = a * Math.PI/180;
	b = b * Math.PI/180;
	return Math.sin(a)*Math.cos(b)+Math.cos(a)*Math.sin(b);
}
function task5789(xa,ya,xb,yb){
	var dx = xb-xa;
	var dy = yb-ya;
	return Math.sqrt(dx*dx+dy*dy);
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
function task4265(s){
	if (s.startsWith("s")){
		return s.toLowerCase();
	}
	if (s.startsWith("U")){
		return s.toUpperCase();
	}
	return s;
}
function task3946(raw){
	if (raw == ""){
		return 0;
	}
	var arr = raw.split(" ");
	var sum = 0;
	for (var i = 0; i < arr.length; i++){
		sum += parseInt(arr[i]);
	}
	return sum/arr.length;
}
function task7035(raw){
	var arr = raw.split(" ");
	var min = parseInt(arr[0]);
	for (var i = 1; i < arr.length; i++){
		var current = parseInt(arr[i]);
		if (current < min){
			min = current;
		}
	}
	return min;
}
function task4283(k,raw){
	var arr = raw.split(" ");
	var count = 0;
	for (var i = 0; i < arr.length; i++){
		if (parseInt(arr[i]) == k){
			count++;
		}
	}
	return count;
}
function task9182(raw){
	var arr = raw.split(" ");
	var data = {};
	for (var i = 0; i < arr.length; i++){
		data[arr[i]] = true;
	}
	var count = 0;
	for (item in data){
		count++;
	}
	return count;
}