chcp 65001
set lang=js
set index=12
set title=Функции
set chapter=Оформление подпрограмм с помощью функций
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
 ^<a name="heading"^>^<h1^>%title%^</h1^>^</a^> ^
 ^<h2^>%chapter%^</h2^>>> %filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing3939"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing1516"^>П 2^</a^>^</li^> ^
 ^<li^>^<a href="#writing8861"^>П 3^</a^>^</li^> ^
 ^<li^>^<a href="#task5164"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2354"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2030"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7649"^>№ 4^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writingjs3939.html>>%filename%
type writingjs1516.html>>%filename%
type writingjs8861.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type taskjs5164.html>>%filename%
type taskjs2354.html>>%filename%
type taskjs2030.html>>%filename%
type taskjs7649.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%
 
pushd ..\..\%lang%\
mkdir files
popd

pushd ..\..\%lang%\files\
mkdir task2354
mkdir task2030
mkdir task5164
mkdir task7649
popd

pushd task2354
copy "task2354caller.js" "..\..\..\%lang%\files\task2354\task2354caller.js"
copy "task2354layout.html" "..\..\..\%lang%\files\task2354\task2354layout.html"
popd

pushd task2030
copy "task2030caller.js" "..\..\..\%lang%\files\task2030\task2030caller.js"
copy "task2030layout.html" "..\..\..\%lang%\files\task2030\task2030layout.html"
popd

pushd task5164
copy "task5164caller.js" "..\..\..\%lang%\files\task5164\task5164caller.js"
copy "task5164layout.html" "..\..\..\%lang%\files\task5164\task5164layout.html"
popd

pushd task7649
copy "task7649caller.js" "..\..\..\%lang%\files\task7649\task7649caller.js"
copy "task7649layout.html" "..\..\..\%lang%\files\task7649\task7649layout.html"
popd

if x%1==x start "" %filename%