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
function task5694(x){
	var arr = ["a", "b", "c", "d", "e", "f", "g", "h"];
	var ret = "";
	for (var i = 0; i < arr.length; i++){
		ret += arr[i];
		if (arr[i] == x){
			ret += "+";
		}
		ret += "<br/>";
	}
	return ret;
}
function task6806(x){
	var arr = [11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20];
	var ret = "";
	for (var i = 0; i < arr.length; i++){
		ret += arr[i];
		if (arr[i] == x){
			ret += "+";
		}
		ret += "\n";
	}
	return ret;
}