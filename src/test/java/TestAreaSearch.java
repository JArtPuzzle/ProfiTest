import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class TestAreaSearch extends BaseTest {

    @Test(description = "Проверка чегото")
    public void navigateMainPage() {
        MAIN_PAGE.openSite().searchBySpecialist("Сантехник");
        softAssert.assertEquals(SPECIALIST_LIST_PAGE.getTxtLabel(), "Сантехники", "Проверка, что  лейбл имеет правильное  имя.");
        softAssert.assertEquals(SPECIALIST_LIST_PAGE.getGroupTxtLabel(), "Мастера по ремонту", "Проверка, что  лейбл имеет правильное  имя.");
        softAssert.assertAll();
    }

    @Test
    public void checkSpecialistCount() {
        MAIN_PAGE.openSite().searchBySpecialist("Сантехник");
        assertEquals(SPECIALIST_LIST_PAGE.getSpecialistCount(), 20, "Проверк количества.");
    }
}
