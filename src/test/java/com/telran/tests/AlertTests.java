package com.telran.tests;

import com.telran.pages.AlertPage;
import org.junit.Before;
import org.junit.Test;

public class AlertTests {

    AlertPage alert;

    @Before
    public void setUp() {
        alert = new AlertPage();
    }

    @Test
    public void alertSimpleTest() {
        alert.clickSimpleAlert();
    }

    @Test
    public void alertWaitTest() {
        alert.clickWaitAlert();
    }

    @Test
    public void alertPromptTest() {
        alert.clickPromptAlert("Rusaldo");
    }

    @Test
    public void alertConfirmBoxTest() {
        alert.clickConfirmAlert();
        alert.validConfirmationText();
    }
}
