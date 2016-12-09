import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Тесты для проверки поиска по специалисту, переход на страницу со списком специалистов.
 */
public class TestSearchBySpecialist extends BaseTest {

    @Test(description = "Проверка количества специалистов")
    public void checkSpecialistCount() {
        MAIN_PAGE.openSite().searchBySpecialist("Сантехник");
        assertEquals(SPECIALIST_LIST_PAGE.getSpecialistsNumber(), 20, "Некорректное количество специалистов");
    }

    @Test(description = "Проверка атрибутов страницы со списком специалистов")
    public void navigateMainPage() {
        MAIN_PAGE.openSite().searchBySpecialist("Сантехник");
        softAssert.assertEquals(SPECIALIST_LIST_PAGE.getServiceText(), "сантехника", "Некорректный текст в поле Услуга");
        softAssert.assertEquals(SPECIALIST_LIST_PAGE.getMainHeaderText(), "Сантехники", "Некорректный заголовок");
        softAssert.assertAll();
    }
}
