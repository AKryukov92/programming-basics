var out1860 = document.getElementById("1860t0");
var temp = task1860("знаниям");
out1860.innerHTML = temp;

out1860 = document.getElementById("1860t1");
temp = task1860("цели");
out1860.innerHTML = temp;

out1860 = document.getElementById("1860t2");
temp = task1860("результату");
out1860.innerHTML = temp;


var out4764 = document.getElementById("4764t0");
out4764.innerHTML = task4764("трудности");

out4764 = document.getElementById("4764t1");
out4764.innerHTML = task4764("загадки");

out4764 = document.getElementById("4764t2");
out4764.innerHTML = task4764("сложные задачи");


document.getElementById("2429t0").innerHTML = task2429("просто");
document.getElementById("2429t1").innerHTML = task2429("интересно");
document.getElementById("2429t2").innerHTML = task2429("перспективно");


var in7472a = "начало";
var in7472b = "конец";
var out7472 = task7472(in7472a, in7472b);
document.getElementById("7472t0").innerHTML = out7472;
in7472a = "сила";
in7472b = "знание";
out7472 = task7472(in7472a, in7472b);
document.getElementById("7472t1").innerHTML = out7472;
in7472a = "курица";
in7472b = "яйцо";
out7472 = task7472(in7472a, in7472b);
document.getElementById("7472t2").innerHTML = out7472;
in7472a = "шаг";
in7472b = "шаг";
out7472 = task7472(in7472a, in7472b);
document.getElementById("7472t3").innerHTML = out7472;


task3862();


var in9231 = ["9.780327", "-273.15", "0.00006"];
document.getElementById("9231t0").innerHTML = task9231(in9231[0]);
document.getElementById("9231t1").innerHTML = task9231(in9231[1]);
document.getElementById("9231t2").innerHTML = task9231(in9231[2]);


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

document.getElementById("7474t0").innerHTML = task7474(1, 2, 3);
document.getElementById("7474t1").innerHTML = task7474(-3, 0, 2);