@echo off
chcp 65001
pushd ..\java
rmdir files /s /q
rmdir images /s /q
rmdir конспекты /s /q
rmdir handlers /s /q
del *.html
del *.docx
mkdir files
mkdir images
mkdir конспекты
popd
pushd lab01
call make_java01 1 skip
popd
pushd lab02
call make_java02 2 skip
popd
pushd lab03
call make_java03 3 skip
popd
pushd lab04
call make_java04 4 skip
popd
pushd lab05
call make_java05 5 skip
popd
pushd lab06
call make_java06 6 skip
popd
pushd lab07
call make_java07 7 skip
popd
pushd lab061
call make_java061 8 skip
popd
pushd lab08
call make_java08 9 skip
popd
pushd lab09
call make_java09 10 skip
popd
pushd lab10
call make_java10 11 skip
popd
REM pushd lab11
REM call make_java11 -1 skip
REM popd
pushd lab12 
call make_java12 12 skip
popd
pushd lab13
call make_java13 13 skip
popd
pushd lab14
call make_java14 14 skip
popd
pushd lab15
call make_java15 15 skip
popd
REM pushd lab16
REM call make_java16 -2 skip
REM popd
pause