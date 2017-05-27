chcp 65001
set lang=js
set index=2
set title=Арифметические операторы
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
 ^<body class="section"^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^> ^
 ^<h2^>%title%^</h2^>>> %filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task4411" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task9298" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task3354"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task5201" class="supervision"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task2981"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task4312"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task8428" class="example"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task2361" class="example"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task5063"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task7711" class="example"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task8833" class="example"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task1262" class="supervision"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task9020" class="supervision"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task1934"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task7237"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task3943"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task7619"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task3832"^>№ 18^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task1346"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task9622"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task8873"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task7799"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task9354"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task9130"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task5895"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task2461"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task2790"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task2624"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task5871"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task9164"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task7457"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task9865"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task3591"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task3558"^>№ 34^</a^>^</li^> ^
 ^<li^>^<a href="#task4366"^>№ 35^</a^>^</li^> ^
 ^<li^>^<a href="#task5789"^>№ 36^</a^>^</li^> ^
 ^<li^>^<a href="#task6522"^>№ 37^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task4411.html>>%filename%
type task9298.html>>%filename%
type task3354.html>>%filename%
type task5201.html>>%filename%
type task2981.html>>%filename%
type task4312.html>>%filename%
type task8428.html>>%filename%
type task2361.html>>%filename%
type task5063.html>>%filename%
type task7711.html>>%filename%
type task8833.html>>%filename%
type task1262.html>>%filename%
type task9020.html>>%filename%
type task1934.html>>%filename%
type task7237.html>>%filename%
type task3943.html>>%filename%
type task7619.html>>%filename%
type task3832.html>>%filename%
type task1346.html>>%filename%
type task9622.html>>%filename%
type task8873.html>>%filename%
type task7799.html>>%filename%
type task9354.html>>%filename%
type task9130.html>>%filename%
type task5895.html>>%filename%
type task2461.html>>%filename%
type task2790.html>>%filename%
type task2624.html>>%filename%
type task5871.html>>%filename%
type task9164.html>>%filename%
type task7457.html>>%filename%
type task9865.html>>%filename%
type task3591.html>>%filename%
type task3558.html>>%filename%
type task4366.html>>%filename%
type task5789.html>>%filename%
type task6522.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

if x%1==x start "" %filename%