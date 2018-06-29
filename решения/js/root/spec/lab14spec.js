describe("ЛР 14", function(){
	it("вычисление расстояния между точками. Координаты заданы  4 числами", function(){
		expect(distanceBetweenInts(1, 1, 3, 4)).toBeCloseTo(3.6056, 4);
		expect(distanceBetweenInts(-2, 4, 8, -10)).toBeCloseTo(17.2046, 4);
		expect(distanceBetweenInts(0, 0, -5, -7)).toBeCloseTo(8.6023, 4);
		expect(distanceBetweenInts(0, 0, 0, 0)).toBeCloseTo(0, 4);
		expect(distanceBetweenInts(-1, -3, 2, 9)).toBeCloseTo(12.3693, 4);
	});
	
	it("вычисление расстояния между точками. Координаты заданы 2 объектами", function(){
		var p1 = {x:1, y:1};
		var p2 = {x:3, y:4};
		expect(distanceBetweenObjects(p1, p2)).toBeCloseTo(3.6056, 4);
		p1 = {x:-2, y:4};
		p2 = {x:8, y:-10};
		expect(distanceBetweenObjects(p1, p2)).toBeCloseTo(17.2046, 4);
		p1 = {x:0, y:0};
		p2 = {x:-5, y:-7};
		expect(distanceBetweenObjects(p1, p2)).toBeCloseTo(8.6023, 4);
		p1 = {x:0, y:0};
		p2 = {x:0, y:0};
		expect(distanceBetweenObjects(p1, p2)).toBeCloseTo(0, 4);
		p1 = {x:-1, y:-3};
		p2 = {x:2, y:9};
		expect(distanceBetweenObjects(p1, p2)).toBeCloseTo(12.3693, 4);
	});
	
	it("вычисление расстояния от одной точки до другой. Координаты другой точки заданы 2 числами", function(){
		var p = {
			x:1, y:1,
			distanceTo:function(x, y){
				var dx = this.x - x;
				var dy = this.y - y;
				return Math.sqrt(dx * dx + dy * dy);
			}
		};
		expect(p.distanceTo(3, 4)).toBeCloseTo(3.6056, 4);
		p.x = -2;
		p.y = 4;
		expect(p.distanceTo(8, -10)).toBeCloseTo(17.2046, 4);
		p.x = 0;
		p.y = 0;
		expect(p.distanceTo(-5, -7)).toBeCloseTo(8.6023, 4);
		expect(p.distanceTo(0, 0)).toBeCloseTo(0, 4);
		p.x = -1;
		p.y = -3;
		expect(p.distanceTo(2, 9)).toBeCloseTo(12.3693, 4);
	});
	
	it("вычисление расстояния от одной точки до другой. Координаты другой точки заданы 1 объектом", function(){
		var p1 = {
			x:1, y:1,
			distanceTo:function(p){
				var dx = this.x - p.x;
				var dy = this.y - p.y;
				return Math.sqrt(dx * dx + dy * dy);
			}
		};
		var p2 = {x:3, y:4};
		expect(p1.distanceTo(p2)).toBeCloseTo(3.6056, 4);
		p1.x = -2;
		p1.y = 4;
		p2 = {x:8, y:-10};
		expect(p1.distanceTo(p2)).toBeCloseTo(17.2046, 4);
		p1.x = 0;
		p1.y = 0;
		p2 = {x:-5, y:-7};
		expect(p1.distanceTo(p2)).toBeCloseTo(8.6023, 4);
		p2 = {x:0, y:0};
		expect(p1.distanceTo(p2)).toBeCloseTo(0, 4);
		p1.x = -1;
		p1.y = -3;
		p2 = {x:2, y:9};
		expect(p1.distanceTo(p2)).toBeCloseTo(12.3693, 4);
	});
	
	it("проверка пересечения интервалов. Границы заданы 4 числами", function(){
		expect(hasIntersectionInts(2, 3, 5, 7)).toBeFalsy();
		expect(hasIntersectionInts(11, 17, 13, 19)).toBeTruthy();
		expect(hasIntersectionInts(23, 37, 29, 31)).toBeTruthy();
		expect(hasIntersectionInts(43, 53, 41, 47)).toBeTruthy();
		expect(hasIntersectionInts(5, 15, 0, 30)).toBeTruthy();
		expect(hasIntersectionInts(67, 71, 59, 61)).toBeFalsy();
		var err = new Error("Значение A должно быть меньше значения B");
		expect(function(){ hasIntersectionInts(79, 73, 83, 89) }).toThrow(err);
		expect(function(){ hasIntersectionInts(97, 101, 107, 103) }).toThrow(err);
	});
	
	it("проверка пересечения интервалов. Границы заданы 2 объектами", function(){
		expect(hasIntersectionObjects({a:2,b:3},{a:5,b:7})).toBeFalsy();
		expect(hasIntersectionObjects({a:11,b:17},{a:13,b:19})).toBeTruthy();
		expect(hasIntersectionObjects({a:23,b:37},{a:29,b:31})).toBeTruthy();
		expect(hasIntersectionObjects({a:43,b:53},{a:41,b:47})).toBeTruthy();
		expect(hasIntersectionObjects({a:5,b:15},{a:0,b:30})).toBeTruthy();
		expect(hasIntersectionObjects({a:67,b:71},{a:59,b:61})).toBeFalsy();
		var err = new Error("Значение A должно быть меньше значения B");
		expect(function(){ hasIntersectionObjects({a:79,b:73},{a:83,b:89}) }).toBeTruthy();
		expect(function(){ hasIntersectionObjects({a:97,b:101},{a:107,b:103}) }).toBeTruthy();
	});
	
	it("проверка пересечения одного интервала с другим. Границы другого интервала заданы 2 числами", function(){
		var r = {
			a:2,b:3,
			intersects:function(a,b){
				return hasIntersectionInts(this.a, this.b, a, b);
			}
		};
		expect(r.intersects(5,7)).toBeFalsy();
		r.a = 11;
		r.b = 17;
		expect(r.intersects(13,19)).toBeTruthy();
		r.a = 23;
		r.b = 37;
		expect(r.intersects(29, 31)).toBeTruthy();
		r.a = 43;
		r.b = 53;
		expect(r.intersects(41, 47)).toBeTruthy();
		r.a = 5;
		r.b = 15;
		expect(r.intersects(0, 30)).toBeTruthy();
		r.a = 67;
		r.b = 71;
		expect(r.intersects(59, 61)).toBeFalsy();
		var err = new Error("Значение A должно быть меньше значения B");
		r.a = 79;
		r.b = 73;
		expect(function(){ r.intersects(83, 89) }).toThrow(err);
		r.a = 97;
		r.b = 101;
		expect(function(){ r.intersects(107, 103) }).toThrow(err);
	});
	
	it("проверка пересечения одного интервала с другим. Границы другого интервала заданы 1 объектом",function(){
		var r1 = {
			a:2, b:3,
			intersects:function(other){
				return hasIntersectionObjects(this, other);
			}
		};
		expect(r1.intersects({a:5,b:7})).toBeFalsy();
		r1.a = 11;
		r1.b = 17;
		expect(r1.intersects({a:13,b:19})).toBeTruthy();
		r1.a = 23;
		r1.b = 37;
		expect(r1.intersects({a:29,b:31})).toBeTruthy();
		r1.a = 43;
		r1.b = 53;
		expect(r1.intersects({a:41,b:47})).toBeTruthy();
		r1.a = 5;
		r1.b = 15;
		expect(r1.intersects({a:0,b:30})).toBeTruthy();
		r1.a = 67;
		r1.b = 71;
		expect(r1.intersects({a:59,b:61})).toBeFalsy();
		var err = new Error("Значение A должно быть меньше значения B");
		r1.a = 79;
		r1.b = 73;
		expect(function(){ r1.intersects({a:83,b:89}) }).toThrow(err);
		r1.a = 97;
		r1.b = 101;
		expect(function(){ r1.intersects({a:107,b:103}) }).toThrow(err);
	});
	
	it("вычисление расстояния между точками. Координаты заданы 2 экземплярами прототипа", function(){
		var p1 = new Point(1, 1), p2 = new Point(3, 4);
		expect(p1.distanceTo(p2)).toBeCloseTo(3.6056, 4);
		expect(p2.distanceTo(p1)).toBeCloseTo(3.6056, 4);
		
		p1 = new Point(-2, 4), p2 = new Point(8, -10);
		expect(p1.distanceTo(p2)).toBeCloseTo(17.2046, 4);
		expect(p2.distanceTo(p1)).toBeCloseTo(17.2046, 4);
		
		p1 = new Point(0, 0), p2 = new Point(-5, -7);
		expect(p1.distanceTo(p2)).toBeCloseTo(8.6023, 4);
		expect(p2.distanceTo(p1)).toBeCloseTo(8.6023, 4);
		
		p1 = new Point(0, 0), p2 = new Point(0, 0);
		expect(p1.distanceTo(p2)).toBeCloseTo(0, 4);
		expect(p2.distanceTo(p1)).toBeCloseTo(0, 4);
		
		p1 = new Point(-1, -3), p2 = new Point(2, 9);
		expect(p1.distanceTo(p2)).toBeCloseTo(12.3693, 4);
		expect(p2.distanceTo(p1)).toBeCloseTo(12.3693, 4);
	});
	
	it("проверка пересечения интервалов. Границы интервалов заданы 2 экземплярами прототипа",function(){
		var r1 = new Range(2, 3), r2 = new Range(5, 7);
		expect(r1.intersects(r2)).toBeFalsy();
		expect(r2.intersects(r1)).toBeFalsy();
		
		r1 = new Range(11, 17), r2 = new Range(13, 19);
		expect(r1.intersects(r2)).toBeTruthy();
		expect(r2.intersects(r2)).toBeTruthy();
		
		r1 = new Range(23, 37), r2 = new Range(29, 31);
		expect(r1.intersects(r2)).toBeTruthy();
		expect(r2.intersects(r2)).toBeTruthy();
		
		r1 = new Range(43, 53), r2 = new Range(41, 47);
		expect(r1.intersects(r2)).toBeTruthy();
		expect(r2.intersects(r2)).toBeTruthy();
		
		r1 = new Range(5, 15), r2 = new Range(0, 30);
		expect(r1.intersects(r2)).toBeTruthy();
		expect(r2.intersects(r2)).toBeTruthy();
		
		r1 = new Range(67, 71), r2 = new Range(59, 61);
		expect(r1.intersects(r2)).toBeFalsy();
		expect(r2.intersects(r1)).toBeFalsy();
		
		var err = new Error("Значение A должно быть меньше значения B");
		
		expect(function(){ 
			r1 = new Range(79, 73), r2 = new Range(83, 89);
			r1.intersects(r2)
		}).toThrow(err);
		expect(function(){ 
			r1 = new Range(79, 73), r2 = new Range(83, 89);
			r2.intersects(r1)
		}).toThrow(err);
		
		expect(function(){
			r1 = new Range(97, 101), r2 = new Range(107, 103);
			r1.intersects(r2)
		}).toThrow(err);
		expect(function(){ 
			r1 = new Range(97, 101), r2 = new Range(107, 103);
			r2.intersects(r1)
		}).toThrow(err);
	});
});