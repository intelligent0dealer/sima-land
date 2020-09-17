import com.codeborne.selenide.Selenide;
import config.SelenideCfg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class AuthTest {
    private SelenideCfg config;
    MainPage mainPage = new MainPage();



    @Before
    public void setUp() {
        config = new SelenideCfg();
        open("/");
    }

    @Test
    public void TestForSima() {
        mainPage.loginPageClick();
        mainPage.inputAuth("random@email.com", "password");
        mainPage.pressEnter();
        // mainPage.authS(); // проверка: проходим в раздел избранное (доступен только при залогине)
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
    @Test
    public void TestForSimaAgain() {
          mainPage.checkCatalog(); // проверка происходит по css селектору, при 404 проверка не пройдет
          mainPage.checkLoginIn(); // можно просто использовать assert.getTitle и текст 404
          mainPage.checkSearch(); // проверка функции поиска
    }
}