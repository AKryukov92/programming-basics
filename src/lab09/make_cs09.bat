chcp 65001
set lang=csharp
set index=9
set chapter=Чтение файлов
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
 ^<body^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#task6175" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task4488" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task4954" class="supervision"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task4642"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task5537"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task5847"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task4769"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task9930"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task6861"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task3226"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task4372"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task4463"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task1668"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task9417"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task2137"^>№ 15^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

type info.html>>%filename%

echo ^<div class="section"^>>>%filename%

type task6175.html>>%filename%
type task4488.html>>%filename%
type task4954.html>>%filename%
type task4642.html>>%filename%
type task5537.html>>%filename%
type task5847.html>>%filename%
type task4769.html>>%filename%
type link_c2_p8.3.html>>%filename%
type task9930.html>>%filename%
type task6861.html>>%filename%
type task3226.html>>%filename%
type task4372.html>>%filename%
type task4463.html>>%filename%
type task1668.html>>%filename%
type task9417.html>>%filename%
type task2137.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\files\
mkdir task6175
mkdir task4488
mkdir task4954
mkdir task4642
mkdir task5537
mkdir task5847
mkdir task4769
mkdir task9930
mkdir task6861
mkdir task3226
mkdir task4372
mkdir task4463
mkdir task1668
mkdir task9417
mkdir task2137
popd

pushd "task6175"
copy "*" "..\..\..\%lang%\files\task6175\*"
popd
pushd "task4488"
copy "*" "..\..\..\%lang%\files\task4488\*"
popd
pushd "task4954"
copy "*" "..\..\..\%lang%\files\task4954\*"
popd
pushd "task4642"
copy "*" "..\..\..\%lang%\files\task4642\*"
popd
pushd "task5537"
copy "*" "..\..\..\%lang%\files\task5537\*"
popd
pushd "task5847"
copy "*" "..\..\..\%lang%\files\task5847\*"
popd
pushd "task4769"
copy "*" "..\..\..\%lang%\files\task4769\*"
popd
pushd "task9930"
copy "*" "..\..\..\%lang%\files\task9930\*"
popd
pushd "task6861"
copy "*" "..\..\..\%lang%\files\task6861\*"
popd
pushd "task3226"
copy "*" "..\..\..\%lang%\files\task3226\*"
popd
pushd "task4372"
copy "*" "..\..\..\%lang%\files\task4372\*"
popd
pushd "task4463"
copy "*" "..\..\..\%lang%\files\task4463\*"
popd
pushd "task1668"
copy "*" "..\..\..\%lang%\files\task1668\*"
popd
pushd "task9417"
copy "*" "..\..\..\%lang%\files\task9417\*"
popd
pushd "task2137"
copy "*" "..\..\..\%lang%\files\task2137\*"
popd

if x%1==x start "" %filename%