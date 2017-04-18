function task4411(x){
	return parseFloat(x) + 7;
}
function task8428(a){
	return a * Math.PI/180;
}
function task5063(a){
	return parseInt(a)%360;
}
function task7711(x){
	return Math.sin(x*Math.PI/180);
}
function task1262(y){
	return 5 * Math.cos(y * Math.PI/180);
}
function task3832(x1,x2,x3){
	return x1*x2+x1*x3+x2*x3;
}
function task1346(v0,t,a){
	return v0*t+a*t*t/2;
}
function task7799(m,a){
	return m*9.8067*Math.cos(a*Math.PI/180);
}
function task9354(a,b,c){
	return b*b-4*a*c;
}
function task5895(a,b,c){
	return Math.sqrt(a*a+b*b-2*a*b*Math.cos(c*Math.PI/180));
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
function task7457(x){
	return 7*x*x-3*x+6;
}
function task9865(a){
	return 12*a*a+7*a-16;
}
function task3558(a,b){
	var alpha = 2*a*Math.PI/180;
	var beta = 3*b*Math.PI/180;
	return 3*Math.sin(alpha)*Math.cos(beta);
}
function task4366(x1,x2){
	return Math.sqrt(x2*x2+x1*x1);
}
function task5789(xa,ya,xb,yb){
	var dx = xb-xa;
	var dy = yb-ya;
	return Math.sqrt(dx*dx+dy*dy);
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
function task2475(){
	var a = 100;
	var sum = 0;
	while (a <= 500){
		sum += a;
		a++;
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
	var count = 0;
	for (var i = 100; i < 1000; i++){
		if (i%13 == 0){
			count ++;
		}
	}
	return count;
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
function task9925(str){
	return str.split(",").length;
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