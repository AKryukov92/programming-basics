@echo off
pushd ..
rmdir java /s /q
popd
pushd lab01
call make_java01 skip
popd
pushd lab02
call make_java02 skip
popd
pushd lab03
call make_java03 skip
popd
pushd lab04
call make_java04 skip
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