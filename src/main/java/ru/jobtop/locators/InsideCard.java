package ru.jobtop.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 1 on 24.02.2018.
 */
public class InsideCard {

    private SelenideElement eI;
    private SelenideElement insCardTitle;
    private SelenideElement insCardSpecAvto;

    public InsideCard(
    ) {
        this.eI = $("[class=\"attach\"]");
        this.insCardTitle = $("[class=\"card__title\"]");
        this.insCardSpecAvto = eI.$("[class=\"card__spec-list\"]");
    }

    public SelenideElement getInsCardTitle() {
        return insCardTitle;
    }

    public SelenideElement getInsCardSpecAvto() {
        return insCardSpecAvto;
    }
}
