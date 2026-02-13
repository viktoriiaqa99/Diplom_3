import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By emailInput = By.xpath("//label[text()='Email']/following-sibling::input");
    private By passwordInput = By.xpath("//label[text()='Пароль']/following-sibling::input");
    private By loginButton = By.xpath("//button[text()='Войти']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ввод email")
    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    @Step("Ввод пароля")
    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    @Step("Клик по кнопке «Войти»")
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
