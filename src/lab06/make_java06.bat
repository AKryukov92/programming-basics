chcp 65001
set lang=java
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

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing7779"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#task8495" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1315" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task6066" class="supervision"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task2565"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task2594" class="supervision"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task2321"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task5053"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task3762"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task3550"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task2475" class="example"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task9180" class="supervision"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task1544"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task9562"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task3669"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task5951"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task2802"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task6580"^>№ 17^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task7585" class="supervision"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task3983" class="supervision"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task8770"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task4236" class="supervision"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task5969" class="example"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task8696"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task8418"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task5170"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task8395" class="supervision"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task5568" class="supervision"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task2592"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task4075"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task7517"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task5448"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task6572"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task5238"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task2084"^>№ 34^</a^>^</li^> ^
 ^<li^>^<a href="#task5411"^>№ 35^</a^>^</li^> ^
 ^<li^>^<a href="#task5171"^>№ 36^</a^>^</li^> ^
 ^<li^>^<a href="#task1862"^>№ 37^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writingjava7779.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task8495.html>>%filename%
type task1315.html>>%filename%
type task6066.html>>%filename%
type task2565.html>>%filename%
type task2594.html>>%filename%
type task2321.html>>%filename%
type task5053.html>>%filename%
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
type task3983.html>>%filename%
type task8770.html>>%filename%
type task4236.html>>%filename%
type task5969.html>>%filename%
type task8696.html>>%filename%
type task8418.html>>%filename%
type task5170.html>>%filename%
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

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%