@echo off 

set sourcefile=E:\IdeaWorkspace\lmt-FD-casc
set targetfile=X:\apache-tomcat-8.0.28-jiami\webapps\casc

xcopy %sourcefile%\target\classes\*.class %targetfile%\WEB-INF\classes\*.class /d /s /e /f /r /k /y
xcopy %sourcefile%\src\main\webapp\webpage\*.jsp %targetfile%\webpage\*.jsp /d /s /e /f /r /k /y
xcopy %sourcefile%\src\main\webapp\*.js %targetfile%\*.js /d /s /e /f /r /k /y
xcopy %sourcefile%\src\main\resources\language\*.properties %targetfile%\WEB-INF\classes\language\*.properties /d /s /e /f /r /k /y



