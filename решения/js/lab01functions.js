function task1662(){
	document.getElementById("1662t0").innerHTML = "+---+<br/>|   |<br/>|   |<br/>+---+";
	document.getElementById("1662t1").innerHTML = "#<br/>##<br/>###<br/>####";
	document.getElementById("1662t2").innerHTML = " /\\<br/>//\\\\<br/>//\\\\<br/> ][";
	document.getElementById("1662t3").innerHTML = '{ "x":15, "y": 28.7 }';
	document.getElementById("1662t4").innerHTML = "Три девицы под окном<br/>" +
		"Пряли поздно вечерком.<br/>" +
		'"Кабы я была царица, —<br/>' +
		"Говорит одна девица, —<br/>" +
		"То на весь крещеный мир<br/>" +
		'Приготовила б я пир".<br/>' +
		'"Кабы я была царица, —<br/>' +
		"Говорит ее сестрица, —<br/>" +
		"То на весь бы мир одна<br/>" +
		'Наткала я полотна".<br/>' +
		'"Кабы я была царица, —<br/>' +
		"Третья молвила сестрица, —<br/>" +
		"Я б для батюшки-царя<br/>" +
		'Родила богатыря".<br/>';
	document.getElementById("1662t5").innerHTML = '&lt;!DOCTYPE html&gt;<br/>' +
		"&lt;html&gt;<br/>" +
		"&lt;head&gt;<br/>" +
		'    &lt;meta charset="utf-8"/&gt;<br/>' +
		"&lt;head/&gt;<br/>" +
		"&lt;body&gt;<br/>" +
		"    &lt;h1&gt;Мой первый векторный рисунок&lt;/h1&gt;<br/>" +
		'    &lt;svg width="800" height="600"&gt;<br/>' +
		'        &lt;circle cx="50" cy="50" r="40" stroke="green"<br/>' +
		'		stroke-width="4" fill="yellow"/&gt;<br/>' +
		"    &lt;/svg&gt;<br/>" +
		"&lt;/body&gt;<br/>" +
		"&lt;/html&gt;<br/>";
}
function task1860(a){
	return "Мы стремимся к " + a;
}
function task4764(a){
	return a + " нас не остановят";
}
function task2429(a){
	return "Программирование это " + a + "!";
}
function task7472(a,b){
	return b + " " + a;
}
function task3862(){
	document.getElementById("3862t0").innerHTML = Math.PI.toFixed(4) + "<br/>" + Math.E.toFixed(4);
}
function task9231(a){
	return parseFloat(a).toFixed(4);
}
function task8624(k){
	return '"' + k + '"';
}
function task2959(id){
	return "SELECT first_name, last_name, group<br/>" +
	"FROM students WHERE student_id = '" + id + "'";
}
function task7271(x, y) {
	return "INSERT INTO points (x, y) VALUES ('" + x + "', '" + y + "');";
}
function task2632(cx, cy, r, fill) {
	return '&lt;circle cx="' + cx + '" cy="' + cy + '"<br/>r="' + r + '" fill="' + fill + '"/&gt;';
}
function task4343(user, pass, host, port, db) {
	return "User ID=" + user + ";Password=" + pass + ";<br/>Host=" + host + ";Port=" + port + ";Database=" + db + ";";
}
function task7474(a, b, c) {
	return "Квадратное уравнение " + a + "*x*x + " + b + "*x + " + c + " = 0.</br>" +
		"Его дискриминант вычисляется по формуле: d = " + b + "*" + b + " - 4*" + a + "*" + c;
}