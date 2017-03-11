@echo off
pushd ..
rmdir php /s /q
popd
pushd lab01
call make_php01
popd
pushd lab02
call make_php02
popd
pushd lab05
call make_php05
popd
pushd lab06
call make_php06
popd
pushd lab07
call make_php07
popd
pushd lab08
call make_php08
popd
pushd lab09
call make_php09
popd
pushd lab10
call make_php10
popd
pushd lab12 
call make_php12
popd
pause