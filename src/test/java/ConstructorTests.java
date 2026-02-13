import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.ConstructorPage;

import static org.junit.Assert.assertEquals;

public class ConstructorTests extends BaseTest {

    @Test
    @DisplayName("Переключение между вкладками конструктора")
    @Description("Проверка переключения между вкладками Булки, Соусы и Начинки")
    public void constructorTabsSwitchTest() {
        ConstructorPage page = new ConstructorPage(driver);

        assertEquals("Соусы", page.clickSauces());
        assertEquals("Начинки", page.clickFillings());
        assertEquals("Булки", page.clickBuns());
    }
}