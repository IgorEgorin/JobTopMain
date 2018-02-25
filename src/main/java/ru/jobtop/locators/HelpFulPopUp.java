package ru.jobtop.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 1 on 24.02.2018.
 */
public class HelpFulPopUp {

    private SelenideElement eLhelpFulPopUp;
    private SelenideElement hFLinkPopUpExperienceDrive;
    private SelenideElement hFListPopUpThreeYear;
    private SelenideElement hFListPopUpFourYear;
    private SelenideElement hFListPopUpMoreFive;
    private SelenideElement hFLinkPopUpCitizenship;
    private SelenideElement hFListPopUpCitizenship;
    private SelenideElement hFListPopUpGoToSearch;
    private SelenideElement hFPopUpClose;

    public HelpFulPopUp() {
        this.eLhelpFulPopUp = $("[class=\"start_modal__right\"]");;
        this.hFLinkPopUpExperienceDrive = eLhelpFulPopUp.$(byText("Выберите Ваш стаж"));
        this.hFListPopUpThreeYear = eLhelpFulPopUp.$(byText("3 года"));
        this.hFListPopUpFourYear = eLhelpFulPopUp.$(byText("4 года"));
        this.hFListPopUpMoreFive = eLhelpFulPopUp.$(byText("5 лет и более"));
        this.hFLinkPopUpCitizenship = eLhelpFulPopUp.$(byText("Выберите Ваше гражданство"));
        this.hFListPopUpCitizenship = eLhelpFulPopUp.$("[class=\"check\"]");
        this.hFListPopUpGoToSearch = eLhelpFulPopUp.$("[class=\"btn-radius\"]");
        this.hFPopUpClose = eLhelpFulPopUp.$("[class='v_modal__close']");
    }

    public SelenideElement geteLhelpFulPopUp() {
        return eLhelpFulPopUp;
    }

    public SelenideElement gethFLinkPopUpExperienceDrive() {
        return hFLinkPopUpExperienceDrive;
    }

    public SelenideElement gethFListPopUpThreeYear() {
        return hFListPopUpThreeYear;
    }

    public SelenideElement gethFListPopUpFourYear() {
        return hFListPopUpFourYear;
    }

    public SelenideElement gethFListPopUpMoreFive() {
        return hFListPopUpMoreFive;
    }

    public SelenideElement gethFLinkPopUpCitizenship() {
        return hFLinkPopUpCitizenship;
    }

    public SelenideElement gethFListPopUpCitizenship() {
        return hFListPopUpCitizenship;
    }

    public SelenideElement gethFListPopUpGoToSearch() {
        return hFListPopUpGoToSearch;
    }

    public SelenideElement gethFPopUpClose() {
        return hFPopUpClose;
    }
}
