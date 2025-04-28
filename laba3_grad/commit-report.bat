@echo off
setlocal

:: Переход в папку с отчетами
cd /d "%~dp0target\surefire-reports"

:: Добавляем файл в индекс
git add TEST-org.example.demo.SimpleTest.xml

:: Делаем коммит
git commit -m "Автоматический коммит тест-отчета"


endlocal
