package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    private By loginLink = By.linkText("Войти");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void returnToLogin() {
        driver.findElement(loginLink).click();
    }
}
