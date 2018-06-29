chcp 65001
set lang=js
set index=14
set chapter=Объекты
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
 ^<li^>^<a href="#task5789" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task6011" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task8403" class="example"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task3185" class="example"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task6589"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task6037"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task9914"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task4916"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task7301" class="example"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task2000"^>№ 10^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type taskjs5789.html>>%filename%
type taskjs6011.html>>%filename%
type taskjs8403.html>>%filename%
type taskjs3185.html>>%filename%
type taskjs6589.html>>%filename%
type taskjs6037.html>>%filename%
type taskjs9914.html>>%filename%
type taskjs4916.html>>%filename%
REM type taskjs2809.html>>%filename% пропущены, потому что equals не требуется для понимания коллекций 
REM type taskjs5449.html>>%filename% и не поддерживается языком из коробки
REM type taskjs2662.html>>%filename%

REM type taskjs8265.html>>%filename% может быть оставить ради тренировки реализации методов в прототипе
type taskjs7301.html>>%filename%
type taskjs2000.html>>%filename%
REM type taskjs5421.html>>%filename% Сделать через JSON.parse и JSON.stringify
REM type taskjs9713.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

if x%1==x start "" %filename%