package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By loginButtonHome = By.xpath("//button[text()='Войти в аккаунт']");
    private By personalAccountButton = By.xpath("//p[text()='Личный Кабинет']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Клик по кнопке «Войти в аккаунт»")
    public void clickLoginButtonHome() {
        driver.findElement(loginButtonHome).click();
    }

    @Step("Клик по кнопке «Личный кабинет»")
    public void clickPersonalAccountButton() {
        driver.findElement(personalAccountButton).click();
    }
}
