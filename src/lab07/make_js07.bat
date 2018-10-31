chcp 65001
set lang=js
set index=7
set chapter=Работа с массивами
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
 ^<li^>^<a href="#task4425" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1433"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task7834"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task5683" class="example"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task1223"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task8311"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task3134" class="example"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task9711"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task7085"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task8820"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task3333"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task9774" class="example"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task3940"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task3946"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task6497"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task5648"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task5694" class="example"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task1292"^>№ 18^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task6806"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task8613"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task7534"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task2173"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task7369" class="supervision"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task5894"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task4515"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task7290" class="example"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task7035"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task9271"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task8769"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task4497"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task3218"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task6492"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task4283" class="supervision"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task7703"^>№ 34^</a^>^</li^> ^
 ^<li^>^<a href="#task5541"^>№ 35^</a^>^</li^> ^
 ^<li^>^<a href="#task9182"^>№ 36^</a^>^</li^> ^
 ^<li^>^<a href="#task3095"^>№ 37^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task4425.html>>%filename%
type task1433.html>>%filename%
type task7834.html>>%filename%
type task5683.html>>%filename%
type link_c3_p12.8.html>>%filename%
type task1223.html>>%filename%
type task8311.html>>%filename%
type task3134.html>>%filename%
type task9711.html>>%filename%
type task7085.html>>%filename%
type task8820.html>>%filename%
type task3333.html>>%filename%
type task9774.html>>%filename%
type task3940.html>>%filename%
type task3946.html>>%filename%
type task6497.html>>%filename%
type task5648.html>>%filename%
type task5694.html>>%filename%
type task1292.html>>%filename%
type task6806.html>>%filename%
type task8613.html>>%filename%
type task7534.html>>%filename%
type task2173.html>>%filename%
type task7369.html>>%filename%
type task5894.html>>%filename%
type task4515.html>>%filename%
type task7290.html>>%filename%
type task7035.html>>%filename%
type task9271.html>>%filename%
type task8769.html>>%filename%
type task4497.html>>%filename%
type task3218.html>>%filename%
type task6492.html>>%filename%
type task4283.html>>%filename%
type task7703.html>>%filename%
type task5541.html>>%filename%
type task9182.html>>%filename%
type task3095.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

if x%1==x start "" %filename%