Diploma project: website testing automation framework. 

https://log.finalsurge.com/


Technology stack on the project: 
         JAVA / MAVEN / SELENIDE / TestNG / CUCUMBER  / ALLURE Reporting / CircleCI

Execute test by @tags:

        mvn clean test -Dcucumber.filter.tags="@Critical"
        mvn clean test -Dcucumber.filter.tags="@SmokeTest"
        mvn clean test -Dcucumber.filter.tags="@Login"

Cross browser launch command (default chrome):

        mvn clean test -Dselenide.browser=opera
        mvn clean test -Dselenide.browser=firefox