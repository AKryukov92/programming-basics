chcp 65001
set lang=java
if "%1"=="" (
  set index=2
) else (
  set index=%1
)
set chapter=Организация вычислений
set filename="..\..\%lang%\Задания к %index% практической работе.html"

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
 ^<li^>^<a href="#task6924"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task9298" class="example"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task4913" class="supervision"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task4312"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task3354"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task5201"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task2981"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task8833" class="example"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task9020" class="supervision"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task1934"^>№ 21^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task3943"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task2361" class="example"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task5063"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task5870"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task7237"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task7619"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task1346"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task9622"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task8873"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task7799"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task9354"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task9130"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task5895"^>№ 34^</a^>^</li^> ^
 ^<li^>^<a href="#task2461"^>№ 35^</a^>^</li^> ^
 ^<li^>^<a href="#task2790"^>№ 36^</a^>^</li^> ^
 ^<li^>^<a href="#task2624"^>№ 37^</a^>^</li^> ^
 ^<li^>^<a href="#task5871"^>№ 38^</a^>^</li^> ^
 ^<li^>^<a href="#task3591"^>№ 39^</a^>^</li^> ^
 ^<li^>^<a href="#task4366"^>№ 40^</a^>^</li^> ^
 ^<li^>^<a href="#task5789"^>№ 41^</a^>^</li^> ^
 ^<li^>^<a href="#task6522"^>№ 42^</a^>^</li^> ^
 ^<li^>^<a href="#task3490"^>№ 43^</a^>^</li^> ^
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
echo ^<div^>Руководство по самостоятельному выполнению задачи ^<a href="конспекты\pre8428.html" target="_blank"^>(открыть в новой вкладке)^</a^>^</div^>>>%filename%
type link_c7_p32.5.html>>%filename%
type task7711.html>>%filename%
type task1262.html>>%filename%
type task9164.html>>%filename%
type task3558.html>>%filename%
type task6924.html>>%filename%
type task9298.html>>%filename%
type task4913.html>>%filename%
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

pushd ..
call prepare_theory java 3862 java lab02
call prepare_theory java 9231 java lab02
call prepare_theory java 4411 java lab02
call prepare_theory java 8428 java lab02
popd

if "%2"=="" start "" %filename%