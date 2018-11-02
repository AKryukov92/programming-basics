chcp 65001
set lang=csharp
set index=2
set title=Арифметические операторы
set chapter=Линейные алгоритмы
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

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

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task3862" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task9231" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task4411" class="example"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task3832" class="supervision"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task7457"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task9865"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task8428" class="example"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task7711" class="example"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1262" class="supervision"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task9164"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task3558"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task9298" class="example"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task4312" class="supervision"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task3354"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task5201"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task2981"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task8833" class="example"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task9020" class="supervision"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task1934"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task3943"^>№ 20^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task2361" class="example"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task5063"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task5870"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task7237"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task7619"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task1346"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task9622"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task8873"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task7799"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task9354"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task9130"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task5895"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task2461"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task2790"^>№ 34^</a^>^</li^> ^
 ^<li^>^<a href="#task2624"^>№ 35^</a^>^</li^> ^
 ^<li^>^<a href="#task5871"^>№ 36^</a^>^</li^> ^
 ^<li^>^<a href="#task3591"^>№ 37^</a^>^</li^> ^
 ^<li^>^<a href="#task4366"^>№ 38^</a^>^</li^> ^
 ^<li^>^<a href="#task5789"^>№ 39^</a^>^</li^> ^
 ^<li^>^<a href="#task6522"^>№ 40^</a^>^</li^> ^
 ^<li^>^<a href="#task3490"^>№ 41^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task3862.html>>%filename%
echo ^<div^>Руководство по самостоятельному выполнению задачи ^<a href="конспекты\pre3862.html" target="_blank"^>(открыть в новой вкладке)^</a^>^</div^>>>%filename%
type task9231.html>>%filename%
echo ^<div^>Руководство по самостоятельному выполнению задачи ^<a href="конспекты\pre9231.html" target="_blank"^>(открыть в новой вкладке)^</a^>^</div^>>>%filename%
type task4411.html>>%filename%
echo ^<div^>Руководство по самостоятельному выполнению задачи ^<a href="конспекты\pre4411.html" target="_blank"^>(открыть в новой вкладке)^</a^>^</div^>>>%filename%
type task3832.html>>%filename%
type task7457.html>>%filename%
type task9865.html>>%filename%
type task8428.html>>%filename%
type link_c7_p32.5.html>>%filename%
type task7711.html>>%filename%
echo ^<div^>Руководство по самостоятельному выполнению задачи ^<a href="конспекты\pre7711.html" target="_blank"^>(открыть в новой вкладке)^</a^>^</div^>>>%filename%
type task1262.html>>%filename%
type task9164.html>>%filename%
type task3558.html>>%filename%
type task9298.html>>%filename%
type task4312.html>>%filename%
type task3354.html>>%filename%
type link_c3_p11.1.html>>%filename%
type task5201.html>>%filename%
type task2981.html>>%filename%
type task8833.html>>%filename%
type task9020.html>>%filename%
type link_c3_p11.2.html>>%filename%
type task1934.html>>%filename%
type task3943.html>>%filename%
type task2361.html>>%filename%
type task5063.html>>%filename%
type task5870.html>>%filename%
type task7237.html>>%filename%
type task7619.html>>%filename%
type task1346.html>>%filename%
type task9622.html>>%filename%
type link_c3_p12.1.html>>%filename%
type task8873.html>>%filename%
type task7799.html>>%filename%
type task9354.html>>%filename%
type task9130.html>>%filename%
type task5895.html>>%filename%
type task2461.html>>%filename%
type task2790.html>>%filename%
type task2624.html>>%filename%
type task5871.html>>%filename%
type task3591.html>>%filename%
type task4366.html>>%filename%
type task5789.html>>%filename%
type task6522.html>>%filename%
type task3490.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd images
copy "task7799.png" "..\..\..\%lang%\images\task7799.png"
popd

if x%1==x start "" %filename%
cd ..
call prepare_theory csharp 3862 cs lab02
call prepare_theory csharp 9231 cs lab02
call prepare_theory csharp 4411 cs lab02
call prepare_theory csharp 7711 cs lab02