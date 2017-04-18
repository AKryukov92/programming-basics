chcp 65001
set lang=java
set index=3
set title=Работа с цифрами чисел
set chapter=Линейные алгоритмы
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %title%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^> ^
 ^<h2^>%title%^</h2^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing3929"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing3083"^>П 2^</a^>^</li^> ^
 ^<li^>^<a href="#writing7546"^>П 3^</a^>^</li^> ^
 ^<li^>^<a href="#task8545"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1288"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2614"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7170"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task2709"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task3402"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task8781"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task8771"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task3091"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task2195"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task1184"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task2667"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task5917"^>№ 13^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writing3929.html>>%filename%
type writing3083.html>>%filename%
type writing7546.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task8545.html>>%filename%
type task1288.html>>%filename%
type task2614.html>>%filename%
type task7170.html>>%filename%
type task2709.html>>%filename%
type task3402.html>>%filename%
type task8781.html>>%filename%
type task8771.html>>%filename%
type task3091.html>>%filename%
type task2195.html>>%filename%
type task1184.html>>%filename%
type task2667.html>>%filename%
type task5917.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

if x%1==x start "" %filename%