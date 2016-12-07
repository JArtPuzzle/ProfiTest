package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.BaseTest.MAIN_URL;
import static Base.BaseTest.driver;


public class MainPage {

    private WebElement fieldSearch() {
        return driver.findElement(By.id("s2id_autogen5"));
    }

    private WebElement inputSearch() {
        return driver.findElement(By.id("s2id_autogen6_search"));
    }

    private WebElement btnFind() {
        return driver.findElement(By.cssSelector(".btn-block.btn-middle"));
    }

    public SpecialistListPage searchBySpecialist (String text) {
        fieldSearch().click();
        inputSearch().sendKeys(text);
        btnFind().click();
        return new SpecialistListPage();
    }

    public MainPage openSite() {
        driver.get(MAIN_URL);
        return this;
    }
}