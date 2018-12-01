package com.selenium;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ShouldBe;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;
import selenide.pages.GoogleSearchSelenide;

import static com.codeborne.selenide.Selenide.$;


public class SelenideGoogleSearch extends SelenideTestBase {

    private GoogleSearchSelenide googleSearchSelenide = new GoogleSearchSelenide ();


    @BeforeClass
    public void setUp (){
        Selenide.open("https://google.com/");
    }

    @Test
    public void lookingForSelenide (){
        googleSearchSelenide.addAndClick();
        googleSearchSelenide.writeListOfTheElements();

    }



}
