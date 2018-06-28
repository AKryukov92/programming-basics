describe("ЛР 13", function(){
	it("в задаче 4411 должен получиться корректный результат", function(){
		expect(task9020(0)).toBeCloseTo(23.4307)
		expect(task9020(-9)).toBeCloseTo(25.0998)
		expect(task9020(61)).toBeCloseTo(0)
		expect(task9020(60)).toBeCloseTo(3)
		var err = new Error("Подкоренное выражение должно быть неотрицательным")
		expect(function(){ task9020(62) }).toThrow(err)
		expect(function(){ task9020(7573) }).toThrow(err)
		expect(function(){ task9020(75) }).toThrow(err)
	});

	it("в задаче 3943 должен получиться корректный результат", function(){
		expect(task3943(-5, 81)).toBeCloseTo(-10, 4);
		expect(task3943(7507, 7499)).toBeCloseTo(-435.7062, 4);
		expect(function(){ task3943(7489, -7487) }).toThrow(new Error("Значение y должно быть неотрицательным"));
		expect(function(){ task3943(-7481, 7477) }).toThrow(new Error("Подкоренное выражение должно быть неотрицательным"));
	});

	it("в задаче 7799 должен получиться корректный результат", function(){
		expect(task7799(5, 45)).toBeCloseTo(34.671920, 6)
		expect(task7799(7297, 30)).toBeCloseTo(61972.336135, 6)
		expect(task7799(10, 90)).toBeCloseTo(0, 6)
		expect(task7799(7, 91)).toBeCloseTo(0, 6)
		expect(task7799(9, 100)).toBeCloseTo(0, 6)
		expect(function(){ task7799(0, 30) }).toThrow(new Error("Масса должна быть положительной"))
	});

	it("в задаче 9354 должен получиться корректный результат", function(){
		expect(task9354(7,1,3)).toBeCloseTo(-83, 4)
		expect(task9354(7247, 7243, 7229)).toBeCloseTo(-157093203, 4)
		expect(task9354(-11, -13, -17)).toBeCloseTo(-579, 4)
		expect(function(){ task9354(0, 1, 3) }).toThrow(new Error("Уравнение y=0x^2+1x+3 не является квадратным"));
		expect(function(){ task9354(0, 1000, 2000) }).toThrow(new Error("Уравнение y=0x^2+1000x+2000 не является квадратным"));
	});

	it("в задаче 5170 должен получиться корректный результат", function(){
		expect(task5170(6)).toBeFalsy();
		expect(task5170(3219)).toBeFalsy();
		expect(task5170(7)).toBeTruthy();
		expect(task5170(2017)).toBeTruthy();
		expect(function(){ task5170(-10) }).toThrow(new Error("Значение Y должно быть положительным"));
	});
});