import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstructorPage {

    private WebDriver driver;

    private By bunsTab = By.xpath("//span[text()='Булки']/parent::div");
    private By saucesTab = By.xpath("//span[text()='Соусы']/parent::div");
    private By fillingsTab = By.xpath("//span[text()='Начинки']/parent::div");

    private By bunsSection = By.xpath("//h2[text()='Булки']");
    private By saucesSection = By.xpath("//h2[text()='Соусы']");
    private By fillingsSection = By.xpath("//h2[text()='Начинки']");

    public ConstructorPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Клик по табу «Булки»")
    public void clickBunsTab() {
        driver.findElement(bunsTab).click();
    }

    @Step("Клик по табу «Соусы»")
    public void clickSaucesTab() {
        driver.findElement(saucesTab).click();
    }

    @Step("Клик по табу «Начинки»")
    public void clickFillingsTab() {
        driver.findElement(fillingsTab).click();
    }

    @Step("Проверка отображения секции «Булки»")
    public boolean isBunsSectionDisplayed() {
        return driver.findElement(bunsSection).isDisplayed();
    }

    @Step("Проверка отображения секции «Соусы»")
    public boolean isSaucesSectionDisplayed() {
        return driver.findElement(saucesSection).isDisplayed();
    }

    @Step("Проверка отображения секции «Начинки»")
    public boolean isFillingsSectionDisplayed() {
        return driver.findElement(fillingsSection).isDisplayed();
    }
}
