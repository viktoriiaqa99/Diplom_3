package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstructorPage {

    private WebDriver driver;

    private By bunsTab = By.xpath("//span[text()='Булки']");
    private By saucesTab = By.xpath("//span[text()='Соусы']");
    private By fillingsTab = By.xpath("//span[text()='Начинки']");
    private By activeTab = By.xpath("//div[contains(@class,'tab_tab_type_current')]");

    public ConstructorPage(WebDriver driver) {
        this.driver = driver;
    }

    public String clickBuns() {
        driver.findElement(bunsTab).click();
        return driver.findElement(activeTab).getText();
    }

    public String clickSauces() {
        driver.findElement(saucesTab).click();
        return driver.findElement(activeTab).getText();
    }

    public String clickFillings() {
        driver.findElement(fillingsTab).click();
        return driver.findElement(activeTab).getText();
    }
}
