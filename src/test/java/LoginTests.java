import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.MainPage;
import util.UserGenerator;

import static org.junit.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    @DisplayName("Вход через кнопку Войти в аккаунт на главной")
    @Description("Проверка входа через кнопку Войти в аккаунт на главной странице")
    public void loginFromMainButtonTest() {
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
    @DisplayName("Вход через кнопку Личный кабинет")
    @Description("Проверка входа через кнопку Личный кабинет на главной странице")
    public void loginFromPersonalAccountTest() {
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
    @DisplayName("Вход через форму регистрации")
    @Description("Проверка входа через ссылку в форме регистрации")
    public void loginFromRegistrationFormTest() {
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
    @DisplayName("Вход через форму восстановления пароля")
    @Description("Проверка входа через ссылку в форме восстановления пароля")
    public void loginFromForgotPasswordFormTest() {
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