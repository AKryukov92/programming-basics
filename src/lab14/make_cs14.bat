chcp 65001
set lang=csharp
set index=14
set chapter=Классы и объекты
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

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task8403" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3185" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2092" class="supervision"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task9914"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task6011" class="example"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task6037"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task2809" class="example"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task7297"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task5242"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task1379"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task2401"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task5421" class="example"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task9713"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task7301" class="example"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task2000"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task5449" class="example"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task2662"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task4147" class="example"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task1953"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task5032" class="example"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task3567"^>№ 21^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task8403.html>>%filename%
type task3185.html>>%filename%
type task2092.html>>%filename%
type task9914.html>>%filename%
type task6011.html>>%filename%
type task6037.html>>%filename%
type task2809.html>>%filename%
type task7297.html>>%filename%
type task5242.html>>%filename%
type task1379.html>>%filename%
type task2401.html>>%filename%
type task5421.html>>%filename%
type task9713.html>>%filename%
type task7301.html>>%filename%
type task2000.html>>%filename%
type task5449.html>>%filename%
type task2662.html>>%filename%
type task4147.html>>%filename%
type task1953.html>>%filename%
type link_c2_p6.1.html>>%filename%
type task5032.html>>%filename%
type link_c7_p34.1.html>>%filename%
type task3567.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\files\
mkdir task5032
mkdir task3567
popd

pushd "task5032"
copy "*" "..\..\..\%lang%\files\task5032\*"
popd
pushd "task3567"
copy "*" "..\..\..\%lang%\files\task3567\*"
popd

pushd ..\..\%lang%\
rmdir lab14 /s /q
mkdir lab14
popd
xcopy ..\..\решения\cs\lab14 ..\..\%lang%\lab14\lab14 /s /I
xcopy ..\..\решения\cs\ClassesExample ..\..\%lang%\lab14\ClassesExample /s /I

if x%1==x start "" %filename%