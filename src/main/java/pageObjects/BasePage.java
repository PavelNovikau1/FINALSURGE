package pageObjects;

import static com.codeborne.selenide.Selenide.open;
import constants.IConstants;
import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class BasePage implements IConstants {

    public void openPage(String url) {
        log.info(String.format("Open URL: '%s'", url));
        open(BASE_URL + url);
    }
}
