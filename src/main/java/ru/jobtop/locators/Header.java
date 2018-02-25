package ru.jobtop.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 1 on 22.02.2018.
 */
public class Header {

    private SelenideElement headerElement;
    private SelenideElement linkLocation;
    private SelenideElement linkForDrivers;
    private SelenideElement linkForTaxiPark;
    private SelenideElement linkHeaderVideo;

    public Header() {
        this.headerElement = $("[class=\"attach\"]");
        this.linkLocation = headerElement.$("[class=\"header__city-value\"]");
        this.linkForDrivers = headerElement.$(byText("ВОДИТЕЛЯМ"));
        this.linkForTaxiPark = headerElement.$(byText("ТАКСОПАРКАМ"));
        this.linkHeaderVideo = headerElement.$("[class=\"header__faq clearfix\"]");
    }

    public SelenideElement getLinkLocation() {
        return linkLocation;
    }

    public SelenideElement getLinkForDrivers() {
        return linkForDrivers;
    }

    public SelenideElement getLinkForTaxiPark() {
        return linkForTaxiPark;
    }

    public SelenideElement getLinkHeaderVideo() {
        return linkHeaderVideo;
    }
}

