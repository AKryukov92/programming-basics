<?php
function task4411($x){
	return $x + 7;
}
function task9298($a){
	if ($a <= 0){
		throw new Exception('Значение A должно быть положительным');
	}
	return 6 * $a * $a;
}
function task3354($a){
	if ($a <= 0){
		throw new Exception('Значение A должно быть положительным');
	}
	return $a * $a * $a;
}
function task5201($r){
	if ($r <= 0){
		throw new Exception('Значение R должно быть положительным');
	}
	return round(2 * pi() * $r,4);
}
function task2981($r){
	if ($r <= 0){
		throw new Exception('Значение R должно быть положительным');
	}
	return round(4 * pi() * $r * $r * $r / 3, 4);
}
function task4312($a, $h){
	if ($a <= 0){
		throw new Exception('Значение A должно быть положительным');
	}
	if ($h <= 0){
		throw new Exception('Значение H должно быть положительным');
	}
	return round($a * $h / 2, 2);
}
function task8428($a){
	return $a * pi() / 180;
}
class class2361
{
	public $q;
	public $d;
	function class2361($t,$l){
		$this->q = floor($t * 100 / $l);
		$this->d = $t * 100 % $l;
	}
}
function task2361($t, $l){
	if ($t <= 0){
		throw new Exception('Значение T должно быть положительным');
	}
	if ($l <= 0){
		throw new Exception('Значение L должно быть положительным');
	}
	return new class2361($t, $l);
}
function task5063($a){
	return $a % 360;
}
function task7711($x){
	return round(sin($x * pi() / 180), 4);
}
function task8833($x){
	if ($x < 0){
		throw new Exception('Значение X должно быть неотрицательным');
	}
	return round(sqrt($x),4);
}
function task1262($y){
	return round(5 * cos($y * pi() / 180), 4);
}
function task9020($x){
	if ($x > 61){
		throw new Exception('Подкоренное выражение должно быть неотрицательным');
	}
	return round(3 * sqrt(61 - $x), 4);
}
function task1934($a, $b){
	if ($b > 0){
		throw new Exception("Значение B должно быть не положительным");
	}
	return round($a * sqrt(-7 * $b), 4);
}
function task7237($tc){
	if ($tc < -273.15){
		throw new Exception("Значение T должно быть выше абсолютного нуля");
	}
	return round($tc * 1.8 + 32, 4);
}
function task3943($x, $y){
	if ($y < 0){
		throw new Exception('Значение Y должно быть неотрицательным');
	}
	if ($x + sqrt($y) < 0){
		throw new Exception('Подкоренное выражение должно быть неотрицательным');
	}
	return round(-5*sqrt($x+sqrt($y)), 4);
}
function task7619($v1, $v2, $s){
	if ($v1 < 0){
		throw new Exception('Значение V1 должно быть неотрицательным');
	}
	if ($v2 < 0){
		throw new Exception('Значение V2 должно быть неотрицательным');
	}
	return round($s / ($v1 + $v2), 4);
}
function task3832($x1, $x2, $x3){
	return $x1 * $x2 + $x1 * $x3 + $x2 * $x3;
}
function task1346($v0, $t, $a){
	return round($v0*$t + $a * $t * $t / 2, 4);
}
class class9622
{
	public $t;
	public $wn;
	function class9622($m, $v, $h){
		$this->t = $m * $v * $v / 2;
		$this->wn = $m * $h * 9.8067;
	}
}
function task9622($m, $v, $h){
	if ($m <= 0){
		throw new Exception('Значение M должно быть положительным');
	}
	if ($v < 0){
		throw new Exception('Значение V должно быть положительным');
	}
	if ($h < 0){
		throw new Exception('Значение H должно быть неотрицательным');
	}
	return new class9622($m, $v, $h);
}
function task8873($r1, $r2){
	if ($r1 == 0){
		throw new Exception("Значение R1 должно быть не равно нулю");
	}
	if ($r2 == 0){
		throw new Exception("Значение R2 должно быть не равно нулю");
	}
	return round(1 / $r1 + 1 / $r2, 4);
}
function task7799($m, $a){
	return round($m * 9.8067 * cos($a * pi() / 180), 4);
}
function task9354($a, $b, $c){
	return $b * $b - 4 * $a * $c;
}
function task9130($y, $m1, $m2, $r){
	if ($r == 0){
		throw new Exception("Значение R должно быть не равно нулю");
	}
	return round($y * $m1 * $m2 / $r / $r, 4);
}
function task5895($a, $b, $c){
	return round(sqrt($a * $a + $b * $b - 2 * $a * $b * cos($c * pi() / 180)),4);
}
function task2461($a, $b, $c, $d){
	if ($a == 0){
		throw new Exception("Значение A должно быть не равно нулю");
	}
	if ($d == 0){
		throw new Exception("Значение D должно быть не равно нулю");
	}
	return round(($a * $d + $b * $c) / $a / $d, 4);
}
function task2790($x){
	$s = sin($x * pi() / 180);
	return round(sqrt(1 - $s * $s), 4);
}
function task2624($a, $b, $c, $x){
	$root = $a * $x * $x + $b * $x + $c;
	if ($root < 0){
		throw new Exception('Подкоренное выражение должно быть неотрицательным');
	}
	if ($root == 0){
		throw new Exception("Знаманатель не может быть равен нулю");
	}
	return round(1 / sqrt($root), 4);
}
function task5871($x){
	if ($x < 1){
		throw new Exception("Значение X должно быть не меньше 1");
	}
	return round((sqrt($x + 1) + sqrt($x - 1)) / 2 / sqrt($x), 4);
}
function task9164($a, $b){
	$ar = $a * pi() / 180;
	$br = $b * pi() / 180;
	return round(sin($ar) * cos($br) + cos($ar) * sin($br), 4);
}
function task7457($x){
	return 7 * $x * $x - 3 * $x + 6;
}
function task9865($a){
	return round(12 * $a * $a + 7 * $a - 16, 4);
}
function task3591($h){
	if ($h < 0){
		throw new Exception("Высота над уровнем Земли должна быть неотрицательна");
	}
	$r = 6350;
	$c = $r + $h;
	return round(sqrt($c * $c - $r * $r), 4);
}
function task3558($a, $b){
	return round(3 * sin($a * pi() / 90) * cos($b * pi() / 60), 4);
}
function task4366($x1, $x2){
	return round(sqrt($x2 * $x2 + $x1 * $x1), 4);
}
function task5789($xa, $ya, $xb, $yb){
	$dx = $xb - $xa;
	$dy = $yb - $ya;
	return round(sqrt($dx * $dx + $dy * $dy), 4);
}
function task6522($v1, $t1, $v2, $t2){
	$v = $v1 + $v2;
	if ($v1 < 0){
		throw new Exception("Значение v1 должно быть неотрицательным");
	}
	if ($v2 < 0){
		throw new Exception("Значение v2 должно быть неотрицательным");
	}
	$t = round(($t1 * $v1 + $t2 * $v2) / ($v1 + $v2), 4);
	return "V: $v T: $t";
}