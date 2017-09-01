call ant txslt
call sdocex
for /D %%i in (intro* chapter* appendix*) do copy %%i\binary.jar html4\%%i_binary.jar
copy blib.jar html4
for /D %%i in (intro* chapter* appendix*) do xcopy %%i\src html4\%%i\src\ /S /E /H /C /Y /R
rem xcopy introduction_cns\html html4\introduction_cns\html\ /S /E /H /C /Y /R
