package com.ourProject.tests;

import com.ourProject.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends LoginPage {

    @Test
    public void test(){

        login();

    }

}
