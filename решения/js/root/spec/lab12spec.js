it("в задаче 4411 должен получиться корректный результат", function(){
	var result = task4411(11.13);
	expect(result).toBeCloseTo(18.13, 4);
	result = task4411(-7919);
	expect(result).toBeCloseTo(-7912, 4);
	result = task4411(0);
	expect(result).toBeCloseTo(7, 4);
});

it("в задаче 2790 должен получиться корректный результат", function(){
	var result = task2790(6997);
	expect(result).toBeCloseTo(0.9205, 4);
	result = task2790(31);
	expect(result).toBeCloseTo(0.8572, 4);
	result = task2790(90);
	expect(result).toBeCloseTo(0, 4);
	result = task2790(0);
	expect(result).toBeCloseTo(1, 4);
	result = task2790(180);
	expect(result).toBeCloseTo(1, 4);
});

it("в задаче 5662 должен получиться корректный результат", function(){
	var result = task5662(1, 2, 3);
	expect(result).toEqual("Вещественных корней уравнения 1x^2 + 2x + 3 = 0 нет");
	expect(task5662(11, 13, 19)).toEqual("Вещественных корней уравнения 11x^2 + 13x + 19 = 0 нет");
	expect(task5662(3, 17, 5)).toEqual("У уравнения 3x^2 + 17x + 5 = 0 два вещественных корня");
	expect(task5662(5, 31, 29)).toEqual("У уравнения 5x^2 + 31x + 29 = 0 два вещественных корня");
	expect(task5662(3, 6, 3)).toEqual("Уравнение 3x^2 + 6x + 3 = 0 имеет один корень");
	expect(task5662(1, 2, 1)).toEqual("Уравнение 1x^2 + 2x + 1 = 0 имеет один корень");
	expect(task5662(0, 7, 13)).toEqual("Данное уравнение не является квадратным");
});

it("в задаче 3669 должен получиться корректный результат", function(){
    expect(task3669(8, 13)).toBeCloseTo(1235520, 4);
	expect(task3669(13, 8)).toBeCloseTo(1235520, 4);
	expect(task3669(159, 161)).toBeCloseTo(4095840, 4);
	expect(task3669(648, 648)).toBeCloseTo(648, 4);
	expect(task3669(-2, 600)).toBeCloseTo(0, 4);
	expect(task3669(35, 24)).toBeCloseTo(399703747322880000, 4);
});

it("в задаче 3669 должен получиться корректный результат", function(){
	expect(task1292("a")).toEqual("a");
	expect(task1292("b")).toEqual("ab");
	expect(task1292("d")).toEqual("abcd");
	expect(task1292("h")).toEqual("abcdefgh");
	expect(task1292("i")).toEqual("abcdefgh");
});

it("в задаче 3946 должен получиться корректный результат", function(){
	expect(task3946([1, 2, 3, 4, 1])).toBeCloseTo(2.2, 4);
	expect(task3946([1, 2, 3, 4, 1, 3, 4, 4, 4, 4])).toBeCloseTo(3, 4);
	expect(task3946([])).toBeCloseTo(0, 4);
});

it("в задаче 4283 должен получиться корректный результат", function(){
	expect(task4283(3, [1, 2, 3, 4, 1, 2])).toBeCloseTo(1, 4);
	expect(task4283(5, [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3])).toBeCloseTo(0, 4);
	expect(task4283(2, [3, 2, 2, 2, 2, 2])).toBeCloseTo(5, 4);
	expect(task4283(1, [4, 4, 4, 4, 4, 4])).toBeCloseTo(0, 4);
});

it("в задаче 6497 должен получиться корректный результат", function(){
	expect(task6497([9, 8, 9, 1, 1, 5, 1, 1])).toEqual([4.6250, 3.6250, 4.6250, 3.3750, 3.3750, 0.6250, 3.3750, 3.3750]);
	expect(task6497([5, 5, 5, 5, 5])).toEqual([0, 0, 0, 0, 0]);
	expect(task6497([])).toEqual([]);
	expect(task6497([1000000, 1, 1])).toEqual([666666.0000, 333333.0000, 333333.0000]);
});

it("в задаче 9774 должен получиться корректный результат", function(){
	var data1 = [9, 8, 7, 6, 5, 4];
	task9774(31, data1);
	expect(data1).toEqual([279, 248, 217, 186, 155, 124]);
	var data2 = [9, 8, 7, 6, 5, 4];
	task9774(-3, data2);
	expect(data2).toEqual([-27, -24, -21, -18, -15, -12]);
	var data3 = [98, 76, 54];
	task9774(11, data3);
	expect(data3).toEqual([1078, 836, 594]);
	var data4 = [];
	task9774(73, data4);
	expect(data4).toEqual([]);
});

it("в задаче 9271 должен получиться корректный результат", function(){
	var data1 = [5, 4, 6, 2, 3, 1];
	task9271(data1);
	expect(data1).toEqual([4, 3, 5, 1, 2, 0]);
	var data2 = [1, 2, 3, 4, 1, 2];
	task9271(data2);
	expect(data2).toEqual([0, 1, 2, 3, 0, 1]);
	var data3 = [3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2];
	task9271(data3);
	expect(data3).toEqual([2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1]);
	var data4 = [4, 2, 3, 4, 3, 2];
	task9271(data4);
	expect(data4).toEqual([2, 0, 1, 2, 1, 0]);
	var data5 = [4, 4, 4, 4, 4, 3, 2, 1];
	task9271(data5);
	expect(data5).toEqual([3, 3, 3, 3, 3, 2, 1, 0]);
	var data6 = [4, 4, 4, 4];
	task9271(data6);
	expect(data6).toEqual([0, 0, 0, 0]);
	var data7 = [4, 3];
	task9271(data7);
	expect(data7).toEqual([1, 0]);
});

it("в задаче 4847 должен получиться корректный результат", function(){
	expect(task4847(31, 59, 83)).toBeFalsy();
	expect(task4847(19, 19, 41)).toBeTruthy();
	expect(task4847(7, 11, 11)).toBeTruthy();
	expect(task4847(67, -67, 67)).toBeTruthy();
	expect(task4847(1, 1, 1)).toBeTruthy();
});

it("в задаче 6740 должен получиться корректный результат", function(){
	var f6740x = [0, 1, 2, 3, 4, 0, 4, 0, 4, 0, 4, 0, 1, 2, 3, 4];
	var f6740y = [0, 0, 0, 0, 0, -1, -1, -1.5, -1.5, -2, -2, -3, -3, -3, -3, -3]
	
	var t6740x = [1, 2, 3, 1, 2, 3, 1, 2, 3];
	var t6740y = [-1, -1, -1, -1.5, -1.5, -1.5, -2, -2, -2];
	
	for (var i = 0; i < f6740x.length; i++){
		expect(task6740(f6740x[i], f6740y[i])).toBeFalsy();
	}
	for (var i = 0; i < t6740x.length; i++){
		expect(task6740(t6740x[i], t6740y[i])).toBeTruthy();
	}
});