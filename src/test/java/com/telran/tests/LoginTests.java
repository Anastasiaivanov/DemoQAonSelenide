package com.telran.tests;

import com.telran.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTests {

    LoginPage login;

    @Before
    public void setUp() {
        login = new LoginPage();
    }

    @Test
    public void loginPositiveTest() {
        login.login("rusaldo", "Rusaldo12345!!");
        login.validLoginWithId();
    }

    @Test
    public void loginNegativeTest() {
        login.login("rusaldo", "Rusaldo12345");
        login.invalidPassword();
    }
}
