chcp 65001
set lang=js
set index=5
set chapter=Разветвленные алгоритмы
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
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>>%filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task8878" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3072" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task5980" class="example"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task8174"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task4257" class="example"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task2291"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task1763"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task5662"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1945"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task1186"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task8715" class="example"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task4847" class="example"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task8867"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task7865"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task7991"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task4858"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task6589"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task6291"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task3770"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task3864"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task7178"^>№ 21^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task3883" class="supervision"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task8518" class="example"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task1292"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task4527"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task6556"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task5635"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task3878"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task1217"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task1438"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task2153"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task7937"^>№ 32^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p8.1.html>>%filename%
type task8878.html>>%filename%
type task3072.html>>%filename%
type link_c4_p15.1.html>>%filename%
type task5980.html>>%filename%
type link_c4_p19.4.html>>%filename%
type task8174.html>>%filename%
type task4257.html>>%filename%
type link_c4_p19.2.html>>%filename%
type task2291.html>>%filename%
type task1763.html>>%filename%
type task5662.html>>%filename%
type task1945.html>>%filename%
type task1186.html>>%filename%
type task8715.html>>%filename%
type task4847.html>>%filename%
type task8867.html>>%filename%
type task7865.html>>%filename%
type link_c4_p19.3.html>>%filename%
type task7991.html>>%filename%
type task4858.html>>%filename%
type task6589.html>>%filename%
type task6291.html>>%filename%
type task3770.html>>%filename%
type task3864.html>>%filename%
type task7178.html>>%filename%
type task3883.html>>%filename%
type task8518.html>>%filename%
type link_c4_p15.2.html>>%filename%
type task1292.html>>%filename%
type task4527.html>>%filename%
type task6556.html>>%filename%
type link_c4_p19.1.html>>%filename%
type task5635.html>>%filename%
type link_c2_p5.3.html>>%filename%
type task3878.html>>%filename%
type task1217.html>>%filename%
type task1438.html>>%filename%
type task2153.html>>%filename%
type task7937.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd images
copy "Области 1.png" "..\..\..\%lang%\images\Области 1.png"
copy "Области 2.png" "..\..\..\%lang%\images\Области 2.png"
copy "Области 3.png" "..\..\..\%lang%\images\Области 3.png"
copy "Области 4.png" "..\..\..\%lang%\images\Области 4.png"
copy "Области 5.png" "..\..\..\%lang%\images\Области 5.png"
copy "Области 6.png" "..\..\..\%lang%\images\Области 6.png"
copy "Области 7.png" "..\..\..\%lang%\images\Области 7.png"
copy "Области 8.png" "..\..\..\%lang%\images\Области 8.png"
copy "Области 9.png" "..\..\..\%lang%\images\Области 9.png"
copy "Области 10.png" "..\..\..\%lang%\images\Области 10.png"
copy "Области 11.png" "..\..\..\%lang%\images\Области 11.png"
copy "Области 12.png" "..\..\..\%lang%\images\Области 12.png"
copy "Области 13.png" "..\..\..\%lang%\images\Области 13.png"
copy "Области 14.png" "..\..\..\%lang%\images\Области 14.png"
copy "Области 15.png" "..\..\..\%lang%\images\Области 15.png"
copy "Области 16.png" "..\..\..\%lang%\images\Области 16.png"
copy "example6556.png" "..\..\..\%lang%\images\example6556.png"
copy "example5635.png" "..\..\..\%lang%\images\example5635.png"
popd

if x%1==x start "" %filename%