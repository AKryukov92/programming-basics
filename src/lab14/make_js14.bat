chcp 65001
set lang=js
set index=14
set chapter=Объекты
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %chapter%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body class="section"^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task8403" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3185" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2092"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task9914"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task2809" class="supervision"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task7297"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task5242"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task1379"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task2401"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task5421"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task9713"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task7301" class="example"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task2000"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task4147"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task1953"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task3956"^>№ 16^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type taskjs8403.html>>%filename%
type taskjs3185.html>>%filename%
type taskjs2092.html>>%filename%
type taskjs9914.html>>%filename%
type taskjs2809.html>>%filename%
type taskjs7297.html>>%filename%
type taskjs5242.html>>%filename%
type taskjs1379.html>>%filename%
type taskjs2401.html>>%filename%
type taskjs5421.html>>%filename%
type taskjs9713.html>>%filename%
type taskjs7301.html>>%filename%
type taskjs2000.html>>%filename%
type taskjs4147.html>>%filename%
type taskjs1953.html>>%filename%
type taskjs3956.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

if x%1==x start "" %filename%