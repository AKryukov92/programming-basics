var STR = "abcdefwxyz";
var STR2 = "abcdacadbacdaabaadc";
function task7491(s){
	return STR.indexOf(s) != -1;
}
function task9631(s){
	if (STR.indexOf(s) == -1){
		throw new Error("Значение отсутствует в строке");
	}
	return STR.length - STR.indexOf(s) - 1;
}
function task9812(a,b){
	if (STR.indexOf(a) == -1){
		throw new Error("Значение A отсутствует в строке");
	}
	if (STR.indexOf(b) == -1){
		throw new Error("Значение B отсутствует в строке");
	}
	var ia = STR.indexOf(a);
	var ib = STR.indexOf(b);
	if (ia > ib){
		return ia - ib - 1;
	} else {
		return ib - ia - 1;
	}
}
function task9279(x){
	if (x.length != 2){
		throw new Error("Вводимая строка должна содержать ровно 2 символа");
	}
	var r = "";
	var i = STR2.indexOf(x);
	while(i != -1){
		r += i + " ";
		i = STR2.indexOf(x,i+1);
	}
	return r;
}
function task4845(a,b){
	a = parseInt(a);
	b = parseInt(b);
	if (a < 0 || a >= STR.length){
		throw new Error("Значение A должно быть в интервале [0,длина строки)");
	}
	if (b < 0 || b >= STR.length){
		throw new Error("Значение B должно быть в интервале [0,длина строки)");
	}
	if (a < b){
		return STR.substring(a, b + 1);
	} else {
		return STR.substring(b, a + 1);
	}
}
function task5728(a,b){
	if (STR.indexOf(a) == -1){
		throw new Error("Значение A отсутствует в строке");
	}
	if (STR.indexOf(b) == -1){
		throw new Error("Значение B отсутствует в строке");
	}
	var ia = STR.indexOf(a);
	var ib = STR.indexOf(b);
	if (ia > ib){
		return STR.substring(ib + 1, ia);
	} else {
		return STR.substring(ia + 1, ib);
	}
}
function task7222(code){
	if (code.length != 13)
	{
		throw new Error("Некорректная длина штрих-кода");
	}
	var country = code.substring(0, 2);
	var manufacturer = code.substring(3, 6);
	var product = code.substring(7, 11);
	var checksum = code.substring(12, 13);
	return "Код страны: " + country +
			"<br/>Код изготовителя: " + manufacturer +
			"<br/>Код товара: " + product +
			"<br/>Контрольное число: " + checksum;
}
function task5923(a,b){
	a = parseInt(a);
	b = parseInt(b);
	if (b < 0){
		throw new Error("Значение B должно быть неотрицательно");
	}
	if (a + b >= STR.length){
		throw new Error("Сумма значений A и B должна быть меньше длины строки");
	}
	if (a < 0 || a >= STR.length){
		throw new Error("Значение A должно быть в интервале [0,длина строки)");
	}
	return STR.substring(0,a) + STR.substring(a+b);
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
function task2166(x){
	if (x.length != 2){
		throw new Error("Вводимая строка должна содержать ровно 2 символа");
	}
	return STR2.replace(new RegExp(x,'g')," ");
}
function task9116(str){
	if(!str.startsWith('"') || !str.endsWith('"')){
		throw new Error("Строка должна начинаться и заканчиваться кавычкой");
	}
	return str.substring(1,str.length-1).trim();
}
function task9925(str){
	return str.split(",").length;
}
function task1618(line){
	var openIndex;
	var depth = 0;
	var closeIndex;
	var lastIndex = 0;
	var r = "";
	while(lastIndex < line.length){
		closeIndex = line.indexOf("}", lastIndex);
		openIndex = line.indexOf("{", lastIndex);
		if (openIndex >= 0 && openIndex < closeIndex) {
			depth++;
			r += depth;
			lastIndex = openIndex;
		}
		if (openIndex >= 0 && closeIndex < 0){
			depth++;
			r += depth;
			lastIndex = openIndex;
		}
		if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0){
			r += depth;
			depth--;
			lastIndex = closeIndex;
		}
		if (openIndex < 0 && closeIndex >=0){
			r += depth;
			depth--;
			lastIndex = closeIndex;
		}
		if (openIndex < 0 && closeIndex < 0){
			break;
		}
		if (depth < 0){
			throw new Error(r + " Неожиданный символ '}'");
		}
		lastIndex++;
	}
	if (depth > 0){
		throw new Error(r + " Неожиданный конец строки");
	}
	return r;
}
function task1703(s){
	var ltSignPos = s.indexOf("<");
	var ltSignPosEnd = s.lastIndexOf("<");
	var gtSignPos = s.indexOf(">");
	var gtSignPosEnd = s.lastIndexOf(">");
	var signPos;
	var description;
	if (ltSignPos >= 0) {
		if (gtSignPos > 0 || ltSignPosEnd != ltSignPos) {
			throw new Error("В выражении должен быть только один знак сравнения");
		}
		description = "меньше";
		signPos = ltSignPos;
	} else if (gtSignPos >= 0) {
		if (gtSignPosEnd != gtSignPos) {
			throw new Error("В выражении должен быть только один знак сравнения");
		}
		description = "больше";
		signPos = gtSignPos;
	} else {
		throw new Error("Отсутствует знак сравнения");
	}
	var leftSide = s.substring(0, signPos).trim();
	if (leftSide == ""){
		throw new Error("Слева от знака сравнения ожидается переменная");
	}
	if (leftSide.includes(" ")){
		var statement = leftSide.substring(0, leftSide.lastIndexOf(" "));
		var variable = leftSide.substring(leftSide.lastIndexOf(" ") + 1);
		throw new Error("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + variable + "\"");
	}
	var rightSide, special;
	if (s.substring(signPos+1).startsWith("=")){
		rightSide = s.substring(signPos+2).trim();
		special = "либо равно числу";
	} else {
		rightSide = s.substring(signPos+1).trim();
		special = "числа";
	}
	if (rightSide == ""){
		throw new Error("Справа от знака сравнения ожидается ограничение");
	}
	if (rightSide.includes(" ")){
		var constraint = rightSide.substring(0, rightSide.lastIndexOf(" "));
		var statement = rightSide.substring(rightSide.lastIndexOf(" ") + 1);
		throw new Error("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + constraint + "\"");
	}
	return "Значение переменной " + leftSide + " " + description + " " + special + " " + rightSide;
}