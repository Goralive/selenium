package selenide.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchSelenide {
    private SelenideElement headSearch = $("#lst-ib");
    private ElementsCollection listOfElements = $$("h3.r a");

    public void addAndClick (){
        headSearch.val("Selenide").submit();
    }

    public void writeListOfTheElements (){
        System.out.println(listOfElements.size());
    }

}
