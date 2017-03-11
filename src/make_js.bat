@echo off
pushd ..
rmdir js /s /q
popd
pushd lab01
call make_js01
popd
pushd lab02
call make_js02
popd
pushd lab03
call make_js03
popd
pushd lab04
call make_js04
popd
pushd lab05
call make_js05
popd
pushd lab06
call make_js06
popd
pushd lab07
call make_js07
popd
pushd lab08
call make_js08
popd
pushd lab12
call make_js12
popd
pushd lab14
call make_js14
popd
pause