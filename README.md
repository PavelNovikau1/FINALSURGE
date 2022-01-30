Diploma project: website testing automation framework 

https://log.finalsurge.com/


Technology stack on the project: 
            JAVA / MAVEN / TestNG / CUCUMBER / SELENIDE / ALLURE Reporting / Log4j

Execute test by @tags:

        mvn clean test -Dcucumber.filter.tags="@Critical"
        mvn clean test -Dcucumber.filter.tags="@SmokeTest"

Cross browser launch command (default chrome):

        mvn clean test -Dselenide.browser=opera
        mvn clean test -Dselenide.browser=firefox