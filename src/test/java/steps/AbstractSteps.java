package steps;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.log4j.Log4j2;
import pageObjects.CoachingUpgradePage;
import pageObjects.EquipmentPage;
import pageObjects.EquipmentShoesPage;
import pageObjects.HeaderPage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.OtherCalculatorsModalPage;
import pageObjects.TrainingCalendarPage;
import pageObjects.WorkoutAddPage;
import pageObjects.WorkoutDetailsPage;
import pageObjects.WorkoutReportPage;
import pageObjects.WorkoutsCalculatorModalPage;

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
}
