chcp 65001
set lang=js
set index=7
set chapter=Строки
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
 ^<li^>^<a href="#task7491" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task9631" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9812"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task9279"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task4845" class="example"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task5728"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task7222"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task5923"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task4265" class="supervision"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task2166" class="supervision"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task9116" class="supervision"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task9925" class="example"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task3657" class="example"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task6599"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task1618"^>№ 15^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task7491.html>>%filename%
type task9631.html>>%filename%
type task9812.html>>%filename%
type task9279.html>>%filename%
type task4845.html>>%filename%
type task5728.html>>%filename%
type task7222.html>>%filename%
type task5923.html>>%filename%
type task4265.html>>%filename%
type task2166.html>>%filename%
type task9116.html>>%filename%
type task9925.html>>%filename%
type task3657.html>>%filename%
type task6599.html>>%filename%
type task1618.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

if x%1==x start "" %filename%