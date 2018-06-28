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