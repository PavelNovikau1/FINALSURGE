package steps;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.extern.log4j.Log4j2;
import page_objects.CoachingUpgradePage;
import page_objects.EquipmentPage;
import page_objects.EquipmentShoesPage;
import page_objects.HeaderPage;
import page_objects.LoginPage;
import page_objects.LogoutPage;
import page_objects.OtherCalculatorsModalPage;
import page_objects.TrainingCalendarPage;
import page_objects.WorkoutAddPage;
import page_objects.WorkoutDetailsPage;
import page_objects.WorkoutReportPage;
import page_objects.WorkoutsCalculatorModalPage;

@Log4j2
abstract class AbstractSteps {

    LoginPage loginPage;
    TrainingCalendarPage trainingCalendarPage;
    HeaderPage headerPage;
    LogoutPage logoutPage;
    WorkoutAddPage workoutAddPage;
    WorkoutDetailsPage workoutDetailsPage;
    EquipmentPage equipmentPage;
    EquipmentShoesPage equipmentShoesPage;
    WorkoutsCalculatorModalPage workoutsCalculatorModalPage;
    OtherCalculatorsModalPage otherCalculatorsModalPage;
    WorkoutReportPage workoutReportPage;
    CoachingUpgradePage coachingUpgradePage;

    @Before
    public void setUp() {
        selectBrowser();
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        pageObjectsInitializer();
        setupAllureReports();
    }

    @After
    public void quit() {
        getWebDriver().quit();
    }

    protected void pageObjectsInitializer() {
        loginPage = new LoginPage();
        headerPage = new HeaderPage();
        logoutPage = new LogoutPage();
        trainingCalendarPage = new TrainingCalendarPage();
        workoutAddPage = new WorkoutAddPage();
        workoutDetailsPage = new WorkoutDetailsPage();
        equipmentPage = new EquipmentPage();
        equipmentShoesPage = new EquipmentShoesPage();
        workoutsCalculatorModalPage = new WorkoutsCalculatorModalPage();
        otherCalculatorsModalPage = new OtherCalculatorsModalPage();
        workoutReportPage = new WorkoutReportPage();
        coachingUpgradePage = new CoachingUpgradePage();
    }

    protected void selectBrowser() {
        try {
            Configuration.browser = System.getProperty("selenide.browser", "chrome");
        } catch (Exception e) {
            log.fatal("Error, browser is not started!");
        }
    }
    @BeforeAll
     static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }
}
