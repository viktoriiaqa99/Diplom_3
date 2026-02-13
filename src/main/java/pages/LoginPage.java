package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By emailInput = By.name("name");
    private By passwordInput = By.name("Пароль");
    private By loginButton = By.xpath("//button[text()='Войти']");
    private By registerLink = By.linkText("Зарегистрироваться");
    private By forgotPasswordLink = By.linkText("Восстановить пароль");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void goToRegister() {
        driver.findElement(registerLink).click();
    }

    public void goToForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
    }
}
