function distanceBetweenInts(x1, y1, x2, y2){
	var dx = x1 - x2;
	var dy = y1 - y2;
	return Math.sqrt(dx * dx + dy * dy);
}

function distanceBetweenObjects(p1, p2){
	var dx = p1.x - p2.x;
	var dy = p1.y - p2.y;
	return Math.sqrt(dx * dx + dy * dy);
}

function hasIntersectionInts(a1, b1, a2, b2){
	if (a1 > b1 || a2 > b2){
		throw new Error("Значение A должно быть меньше значения B");
	}
	return !(b1 <= a2 || b2 <= a1);
}

function hasIntersectionObjects(r1, r2){
	return hasIntersectionInts(r1.a, r1.b, r2.a, r2.b);
}

function Point(x,y){
	this.x = x;
	this.y = y;
}

Point.prototype = {
	distanceTo: function(p){
		var dx = this.x - p.x;
		var dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}

function Range(a,b){
	if (a > b){
		throw new Error("Значение A должно быть меньше значения B");
	}
	this.a = a;
	this.b = b;
}

Range.prototype = {
	intersects: function(other){
		return !(this.b <= other.a || other.b <= this.a);
	}
}