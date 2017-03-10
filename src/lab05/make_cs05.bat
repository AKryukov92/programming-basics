chcp 65001
set lang=csharp
set index=5
set chapter=Разветвленные алгоритмы
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

pushd ..\..\%lang%\
mkdir images
popd

pushd ..\..\images
copy "Области 1.png" "..\%lang%\images\Области 1.png"
copy "Области 2.png" "..\%lang%\images\Области 2.png"
copy "Области 3.png" "..\%lang%\images\Области 3.png"
copy "Области 4.png" "..\%lang%\images\Области 4.png"
copy "Области 5.png" "..\%lang%\images\Области 5.png"
copy "Области 6.png" "..\%lang%\images\Области 6.png"
copy "Области 7.png" "..\%lang%\images\Области 7.png"
copy "Области 8.png" "..\%lang%\images\Области 8.png"
copy "Области 9.png" "..\%lang%\images\Области 9.png"
copy "Области 10.png" "..\%lang%\images\Области 10.png"
copy "Области 11.png" "..\%lang%\images\Области 11.png"
copy "Области 12.png" "..\%lang%\images\Области 12.png"
copy "Области 13.png" "..\%lang%\images\Области 13.png"
copy "Области 14.png" "..\%lang%\images\Области 14.png"
copy "Области 15.png" "..\%lang%\images\Области 15.png"
copy "Области 16.png" "..\%lang%\images\Области 16.png"
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
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>>%filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing3587"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing2217"^>П 2^</a^>^</li^> ^
 ^<li^>^<a href="#writing1824"^>П 3^</a^>^</li^> ^
 ^<li^>^<a href="#writing2564"^>П 4^</a^>^</li^> ^
 ^<li^>^<a href="#writing8487"^>П 5^</a^>^</li^> ^
 ^<li^>^<a href="#writing8045"^>П 6^</a^>^</li^> ^
 ^<li^>^<a href="#task8878"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3072"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task5980"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task8174"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task4257"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task2291"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task1763"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task5662"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1945"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task1186"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task8715"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task8518"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task4847"^>№ 13^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task7991"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task6291"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task3770"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task7178"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task3883"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task4527"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task20"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task21"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task22"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task23"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task24"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task25"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task26"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task27"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task28"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task29"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task30"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task31"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task32"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task33"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task34"^>№ 34^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writing3587.html>>%filename%
type writing2217.html>>%filename%
type writing1824.html>>%filename%
type writingcs2564.html>>%filename%
type writingcs8487.html>>%filename%
type writing8045.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task8878.html>>%filename%
type task3072.html>>%filename%
type task5980.html>>%filename%
type task8174.html>>%filename%
type task4257.html>>%filename%
type task2291.html>>%filename%
type task1763.html>>%filename%
type task5662.html>>%filename%
type task1945.html>>%filename%
type task1186.html>>%filename%
type task8715.html>>%filename%
type task8518.html>>%filename%
type task4847.html>>%filename%
type task7991.html>>%filename%
type task6291.html>>%filename%
type task3770.html>>%filename%
type task7178.html>>%filename%
type task3883.html>>%filename%
type task4527.html>>%filename%
type task20.html>>%filename%
type task21.html>>%filename%
type task22.html>>%filename%
type task23.html>>%filename%
type task24.html>>%filename%
type task25.html>>%filename%
type task26.html>>%filename%
type task27.html>>%filename%
type task28.html>>%filename%
type task29.html>>%filename%
type task30.html>>%filename%
type task31.html>>%filename%
type task32.html>>%filename%
type task33.html>>%filename%
type task34.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%