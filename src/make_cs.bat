@echo off
pushd ..
rmdir java /s /q
popd
pushd lab01
call make_cs01
popd
pushd lab02
call make_cs02
popd
pushd lab03
call make_cs03
popd
pushd lab04
call make_cs04
popd
pushd lab05
call make_cs05
popd
pushd lab06
call make_cs06
popd
pushd lab07
call make_cs07
popd
pushd lab08
call make_cs08
popd
pushd lab09
call make_cs09
popd
pushd lab10
call make_cs10
popd
pushd lab11
call make_cs11
popd
pushd lab12 
call make_cs12
popd
pushd lab13
call make_cs13
popd
pushd lab14
call make_cs14
popd
pushd lab15
call make_cs15
popd
pause