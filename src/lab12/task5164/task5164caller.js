var in1860 = ["знаниям","цели","результату"];
for (var i = 0; i < in1860.length; i++){
	var out = document.getElementById("1860t" + i);
	out.innerHTML = task1860(in1860[i]);
}
var in4764 = ["трудности","загадки","сложные задачи"];
for (var i = 0; i < in4764.length; i++){
	var out = document.getElementById("4764t" + i);
	out.innerHTML = task4764(in4764[i]);
}
var in2429 = ["просто", "интересно","перспективно"];
for (var i = 0; i < in2429.length; i++){
	var out = document.getElementById("2429t" + i);
	out.innerHTML = task2429(in2429[i]);
}
var in7472a = ["начало", "сила", "курица", "шаг"];
var in7472b = ["конец", "знание", "яйцо", "шаг"];
for (var i = 0; i < in7472a.length; i++){
	var out = document.getElementById("7472t" + i);
	out.innerHTML = task7472(in7472a[i], in7472b[i]);
}
task2862();
var in9231 = ["9.780327", "-273.15", "0.00006"];
for (var i = 0; i < in9231.length; i++){
	var out = document.getElementById("9231t" + i);
	out.innerHTML = task9231(in9231[i]);
}
var in8624 = ["811", "1583"];
for (var i = 0; i < in8624.length; i++){
	var out = document.getElementById("8624t" + i);
	out.innerHTML = task8624(in8624[i]);
}
var in2959 = ["123456789","fa93f"];
for (var i = 0; i < in2959.length; i++){
	var out = document.getElementById("2959t" + i);
	out.innerHTML = task2959(in2959[i]);
}
var in7271x = ["5", "-1"];
var in7271y = ["7", "1000"];
for (var i = 0; i < in7271x.length; i++){
	var out = document.getElementById("7271t" + i);
	out.innerHTML = task7271(in7271x[i], in7271y[i]);
}
var in2632cx = ["50","400","254"];
var in2632cy = ["50","300","356"];
var in2632r = ["40","200","100"];
var in2632f = ["yellow", "green","#cc6600"];
for (var i = 0; i < in2632cx.length; i++){
	var out = document.getElementById("2632t" + i);
	out.innerHTML = task2632(in2632cx[i], in2632cy[i], in2632r[i], in2632f[i]);
}
var in4343user = ["test", "admin", "akryukov"];
var in4343pass = ["pass", "7e8efd48d69c", "123"];
var in4343host = ["localhost", "production-node1", "localhost"];
var in4343port = ["5432", "5432", "dev-node1"];
var in4343db = ["my_db", "bank", "bank"];
for (var i = 0; i < in4343user.length; i++){
	var out = document.getElementById("4343t" + i);
	out.innerHTML = task4343(in4343user[i], in4343pass[i], in4343host[i], in4343port[i], in4343db[i]);
}