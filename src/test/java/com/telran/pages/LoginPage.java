package com.telran.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private By userNameLocator = By.id("userName");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("login");
    private By userTextLocator = By.id("userName-value");
    private By invalidDataLocator = By.id("name");

    public LoginPage() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/login");
    }

    public void login(String username, String pwd) {
        $(userNameLocator).val(username);
        $(passwordLocator).val(pwd);
        $(loginButtonLocator).click();
    }

    public void validLoginWithId() {
        $(userTextLocator).shouldBe(Condition.visible)
                .waitUntil(Condition.visible, 4000);
        //$(userTextLocator).shouldBe(Condition.visible); можно просто так оставить, он ждет всегда 4 сек
    }

    /*public void validLoginWithText(String text) {
        $(userTextLocator).shouldHave(text, 4000);
    }*/
    public void invalidPassword() {
        $(invalidDataLocator).shouldBe(Condition.visible);
    }
}
