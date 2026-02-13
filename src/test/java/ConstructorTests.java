import org.junit.Test;
import pages.ConstructorPage;

import static org.junit.Assert.assertEquals;

public class ConstructorTests extends BaseTest {

    @Test
    public void constructorTabsSwitchTest() {
        ConstructorPage page = new ConstructorPage(driver);

        assertEquals("Соусы", page.clickSauces());
        assertEquals("Начинки", page.clickFillings());
        assertEquals("Булки", page.clickBuns());
    }
}
