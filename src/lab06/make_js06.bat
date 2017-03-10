chcp 65001
set lang=js
set index=6
set chapter=Циклические алгоритмы
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %chapter%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing7779"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#task8495"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1315"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task6066"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task2565"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task2594"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task3762"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task3550"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task2475"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task9180"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task1544"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task9562"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task3669"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task5951"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task2802"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task6580"^>№ 15^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task7585"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task8770"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task4236"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task5969"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task8696"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task8418"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task8395"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task5568"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task2592"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task4075"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task7517"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task5448"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task6572"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task5238"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task2084"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task5411"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task5171"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task1862"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task9238"^>№ 34^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writingjs7779.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task8495.html>>%filename%
type task1315.html>>%filename%
type task6066.html>>%filename%
type task2565.html>>%filename%
type task2594.html>>%filename%
type task3762.html>>%filename%
type task3550.html>>%filename%
type task2475.html>>%filename%
type task9180.html>>%filename%
type task1544.html>>%filename%
type task9562.html>>%filename%
type task3669.html>>%filename%
type task5951.html>>%filename%
type task2802.html>>%filename%
type task6580.html>>%filename%
type task7585.html>>%filename%
type task8770.html>>%filename%
type task4236.html>>%filename%
type task5969.html>>%filename%
type task8696.html>>%filename%
type task8418.html>>%filename%
type task8395.html>>%filename%
type task5568.html>>%filename%
type task2592.html>>%filename%
type task4075.html>>%filename%
type task7517.html>>%filename%
type task5448.html>>%filename%
type task6572.html>>%filename%
type task5238.html>>%filename%
type task2084.html>>%filename%
type task5411.html>>%filename%
type task5171.html>>%filename%
type task1862.html>>%filename%
type task9238.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%