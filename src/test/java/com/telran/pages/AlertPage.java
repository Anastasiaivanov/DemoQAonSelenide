package com.telran.pages;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AlertPage {

    public AlertPage() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/alerts");
    }

    private By simpleAlert = By.id("alertButton");
    private By waitAlert = By.id("timerAlertButton");
    private By confirmBoxAlert = By.id("confirmButton");
    private By confirmResult = By.id("confirmResult");
    private By promptAlert = By.id("promtButton");
    private By promptResult = By.id("promptResult");

    public void clickSimpleAlert() {
        $(simpleAlert).click();
        confirm();
    }

    public void clickWaitAlert() {
        $(waitAlert).click();
        sleep(5000);
        confirm();
    }

    public void clickConfirmAlert() {
        $(confirmBoxAlert).click();
        confirm();
    }

    public void validConfirmationText() {
        $(confirmResult).shouldHave(text("You selected OK"));
        String text = $(confirmResult).text();
        System.out.println(text);
    }

    public void clickPromptAlert(String text) {
        $(promptAlert).click();
        prompt(text);
        $(promptResult).shouldHave(text("You entered " + text));
    }
}
