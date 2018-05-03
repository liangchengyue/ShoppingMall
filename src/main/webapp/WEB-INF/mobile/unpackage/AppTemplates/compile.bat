%~d0
cd %~dp0
call tmod --no-watch
copy /Y "%~dp0..\AppTemplatesBuild\template.js" "%~dp0..\..\js\template.js"
ping -n 3 127.1 >nul