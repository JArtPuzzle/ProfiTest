package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static Base.BaseTest.driver;


public class SpecialistListPage {

    private List<WebElement> SpecialistBlocks() {
        return driver.findElements(By.cssSelector(".listing__item.card.js-mini-profile"));
    }

    private WebElement MainHeader() {
        return driver.findElement(By.cssSelector(".titleH1.list_col-with_toggler"));
    }

    private WebElement serviceSelect() {
        return driver.findElement(By.cssSelector("#select2-chosen-5"));
    }

    public String getMainHeaderText() {
        return MainHeader().getText();
    }

    public String getServiceText() {
        return serviceSelect().getText();
    }

    public int getSpecialistsNumber() {
        return SpecialistBlocks().size();
    }

}
