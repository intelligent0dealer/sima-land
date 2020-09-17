package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement loginIn = $(By.className("b-circle-text"));
    SelenideElement loginForm = $(By.id("login-entity"));
    SelenideElement passwordForm = $(By.id("login-password"));
    SelenideElement enterButton = $(By.xpath("//*[@id='login-form']/div[2]/div[4]/input"));
    SelenideElement userCard = $(By.xpath("//*[@id='/page-header/']/div[2]/div[1]/div/div[2]/nav/div[3]/a/svg"));
    SelenideElement catalog = $(By.className("heading"));
    SelenideElement searchForm = $(By.xpath("//*[@id='page-header']/div[2]/div[1]/div/div[1]/div/form/div/input"));
    SelenideElement searchButton = $(By.xpath("//*[@id='page-header']/div[2]/div[1]/div/div[1]/div/form/button"));
    SelenideElement searchResults = $(By.xpath("/html/body/div[3]/div[2]/div[1]/div"));
    public MainPage() {
    }

    public void loginPageClick() {
        loginIn.click();
    }

    public void inputAuth (String login, String password) {
        loginForm.setValue("random@email.com");
        passwordForm.setValue("password");
    }

    public void pressEnter(){
        enterButton.click();
    }

    public void authS() {
        userCard.click();
    }

    public void checkCatalog() {
        catalog.shouldNotHave(text("404")).click();
    }

    public void checkLoginIn() {
        loginIn.shouldNotHave(text("404")).click();;
    }

    public void checkSearch() {
        searchForm.setValue("Text");
        searchButton.click();
        searchResults.shouldNotHave(text("404"));
    }

}