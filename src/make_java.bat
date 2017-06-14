@echo off
chcp 65001
pushd ..\java
rmdir files /s /q
rmdir images /s /q
rmdir конспекты /s /q
del *.html
del *.docx
mkdir files
mkdir images
mkdir конспекты
popd
pushd lab01
call make_java01 skip
popd
pushd lab02
call make_java02 skip
popd
pushd lab05
call make_java05 skip
popd
pushd lab06
call make_java06 skip
popd
pushd lab07
call make_java07 skip
popd
pushd lab08
call make_java08 skip
popd
pushd lab09
call make_java09 skip
popd
pushd lab10
call make_java10 skip
popd
pushd lab11
call make_java11 skip
popd
pushd lab12 
call make_java12 skip
popd
pushd lab13
call make_java13 skip
popd
pushd lab14
call make_java14 skip
popd
pushd lab15
call make_java15 skip
popd
pause