package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static Base.BaseTest.driver;


public class SpecialistListPage {

    private List<WebElement> blocksSpecialists() {
        return driver.findElements(By.cssSelector(".listing__item.card.js-mini-profile"));
    }

    private WebElement labelSpecialist() {
        return driver.findElement(By.cssSelector(".titleH1.list_col-with_toggler"));
    }

    private WebElement labelGroupSpecialist() {
        return driver.findElement(By.cssSelector(".js-breadcrumb>span"));
    }

    public String getTxtLabel() {
        return labelSpecialist().getText();
    }

    public String getGroupTxtLabel() {
        return labelGroupSpecialist().getText();
    }

    public int getSpecialistCount () {
        return blocksSpecialists().size();
    }

}
