describe("ЛР 14", function(){
	it("вычисление расстояния между точками. Координаты заданы  4 целыми числами", function(){
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
	
	it("вычисление расстояния от одной точки до другой. Координаты другой точки заданы 2 целыми числами", function(){
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
});