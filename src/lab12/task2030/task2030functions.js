function task8878(a,b){
	return parseInt(a) > parseInt(b);
}
function task8715(a,b,c){
	a = parseInt(a);
	b = parseInt(b);
	c = parseInt(c);
	return a<b && b<c;
}
function task4847(x,y,z){
	x = parseInt(x);
	y = parseInt(y);
	z = parseInt(z);
	return x==y || y==z || x==z;
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
function task7491(s){
	return "abcdefwxyz".indexOf(s) != -1;
}
function task4515(raw){
	var arr = raw.split(" ");
	for (var i = 0; i < arr.length; i++){
		for (var j = i + 1; j < arr.length; j++){
			if (arr[i] == arr[j]){
				return true;
			}
		}
	}
	return false;
}