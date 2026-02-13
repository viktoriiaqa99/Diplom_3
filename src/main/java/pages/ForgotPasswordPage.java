import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    private By emailInput = By.xpath("//input[@type='text']");
    private By loginLink = By.linkText("Войти");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ввод email на странице восстановления пароля")
    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    @Step("Переход обратно на страницу логина")
    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }
}
