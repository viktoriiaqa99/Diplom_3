package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    private By loginButton = By.xpath("//button[text()='Войти в аккаунт']");
    private By personalAccountButton = By.xpath("//p[text()='Личный Кабинет']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickPersonalAccount() {
        driver.findElement(personalAccountButton).click();
    }
}
