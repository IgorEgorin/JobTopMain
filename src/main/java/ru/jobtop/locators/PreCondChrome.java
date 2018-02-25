package ru.jobtop.locators;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;

/**
 * Created by 1 on 22.02.2018.
 */
public class PreCondChrome extends OverAllPage {

    @Before
    public void setUp() throws Exception {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "Chrome";
        Selenide.open("https://jobtop.ru/");

    }

    @After
    public void tearDown() throws Exception {
        Selenide.close();

    }
}