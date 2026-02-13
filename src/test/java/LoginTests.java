import org.junit.Test;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.MainPage;
import util.UserGenerator;

import static org.junit.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    public void loginFromMainButtonTest() {
        // Вход через кнопку "Войти в аккаунт" на главной
        user = UserGenerator.randomUser();
        accessToken = userApi.register(user)
                .extract()
                .path("accessToken");

        MainPage mainPage = new MainPage(driver);
        mainPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user.getEmail(), user.getPassword());

        assertTrue(driver.getCurrentUrl().contains("/"));
    }

    @Test
    public void loginFromPersonalAccountTest() {
        // Вход через кнопку "Личный кабинет"
        user = UserGenerator.randomUser();
        accessToken = userApi.register(user)
                .extract()
                .path("accessToken");

        MainPage mainPage = new MainPage(driver);
        mainPage.clickPersonalAccount();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user.getEmail(), user.getPassword());

        assertTrue(driver.getCurrentUrl().contains("/"));
    }

    @Test
    public void loginFromRegistrationFormTest() {
        // Вход через кнопку в форме регистрации
        user = UserGenerator.randomUser();
        accessToken = userApi.register(user)
                .extract()
                .path("accessToken");

        MainPage mainPage = new MainPage(driver);
        mainPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToRegister();

        driver.navigate().back();

        loginPage.login(user.getEmail(), user.getPassword());

        assertTrue(driver.getCurrentUrl().contains("/"));
    }

    @Test
    public void loginFromForgotPasswordFormTest() {
        // Вход через кнопку в форме восстановления пароля
        user = UserGenerator.randomUser();
        accessToken = userApi.register(user)
                .extract()
                .path("accessToken");

        MainPage mainPage = new MainPage(driver);
        mainPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToForgotPassword();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        forgotPasswordPage.returnToLogin();

        loginPage.login(user.getEmail(), user.getPassword());

        assertTrue(driver.getCurrentUrl().contains("/"));
    }
}
