package ru.jobtopRunnerClass.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.jobtop.locators.PreCondChrome;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by 1 on 22.02.2018.
 */
public class TestMain extends PreCondChrome {


    @Test
    public void avtomobiliList(){
        toMainFilter();
        filter.getFilLinkAvtomobili().click();
        for (SelenideElement x : filter.getFilCollectionChBoxCar()
             ) {
//            System.out.println(x.getText());
//            System.out.println("слоник");
            x.click();
            filter.getFilShowOffer().click();
            sleep(3000);
            if ($(byText("Мы не смогли найти объявления по вашему запросу")).isDisplayed()){
                System.out.println("машинка не найдена");
                $("[class=\"delete\"]",0).click();
            }
            else {
                filter.getFilLinkAvtomobili().click();
                System.out.println("икс в блоке елсе " + x);
//                Assert.assertTrue(listing.getListingCardTitle().has(Condition.text("Audi A6")));
//                System.out.println(listing.getListingCardTitle().getText());
//                $("[class=\"delete\"]",0).click();


            }

        }
    }



    @Ignore
    @Test
    public void classAvto() throws Exception {
        toMainFilter();
        filter.getFilLinkClassCar().click();
        sleep(2000);
        for (SelenideElement x:filter.getFilCollectionClassCar()
             ) {
             if (x.has(Condition.text("Класс авто"))) {
                 x.click();
                 Assert.assertTrue(filter.getFilLinkClassCar().exists());
                 continue;
             }
             else
              {
                  x.click();
                  filter.getFilShowOffer().click();
                  listing.getListingCardTitle().click();
                  Assert.assertTrue(insideCard.getInsCardSpecAvto().has(Condition.text(x.getText())));
//                  System.out.println(textColl);
             }


        }







    }

    public void toMainFilter() {
        filter.getFilSelectAcar().click();
        helpFulPopUp.gethFListPopUpGoToSearch().click();
    }
}
