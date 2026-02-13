package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;

    private By nameInput =
            By.xpath("//label[text()='Имя']/following::input[1]");

    private By emailInput =
            By.xpath("//label[text()='Email']/following::input[1]");

    private By passwordInput =
            By.xpath("//label[text()='Пароль']/following::input[1]");

    private By registerButton =
            By.xpath("//button[text()='Зарегистрироваться']");

    private By passwordError =
            By.xpath("//p[text()='Некорректный пароль']");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void register(String name, String email, String password) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(registerButton).click();
    }

    public boolean isPasswordErrorDisplayed() {
        return driver.findElement(passwordError).isDisplayed();
    }
}
