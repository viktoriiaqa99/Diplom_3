package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    private By nameInput = By.xpath("//label[text()='Имя']/following-sibling::input");
    private By emailInput = By.xpath("//label[text()='Email']/following-sibling::input");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By registerButton = By.xpath("//button[text()='Зарегистрироваться']");
    private By passwordError = By.xpath("//p[contains(@class,'input__error')]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ввод имени")
    public void setName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    @Step("Ввод email")
    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    @Step("Ввод пароля")
    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    @Step("Клик по кнопке «Зарегистрироваться»")
    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    @Step("Получение текста ошибки пароля")
    public String getPasswordErrorText() {
        return driver.findElement(passwordError).getText();
    }
}
