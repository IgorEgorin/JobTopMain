package ru.jobtop.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 1 on 23.02.2018.
 */
public class Listing {

    private SelenideElement lE;
    private SelenideElement lisingBuyOut;
    private SelenideElement lisingCardTitle;
    private SelenideElement lisingCardMiddlePart;
    private SelenideElement lisingCardBottom;
    private SelenideElement lisingCardMoreInfo;
    private SelenideElement lisingCardApplicationToTaxiPark;
    private SelenideElement lisingLoadMore;
    private SelenideElement lisingPaginatorMaxNumber;
    private SelenideElement getLisingPaginatorForward;
    private SelenideElement getLisingPaginatorBack;
    private SelenideElement lisingBottomSelectYourFormat;
    private SelenideElement lisingBottomMoreInfo;
    private SelenideElement lisingBottomHideInfo;

    public Listing() {
        this.lE = $("[class=\"list_offers__content\"]");
        this.lisingBuyOut = lisingBuyOut;
        this.lisingCardTitle = lE.$("[class=\"offers__title\"]");
        this.lisingCardMiddlePart = lisingCardMiddlePart;
        this.lisingCardBottom = lisingCardBottom;
        this.lisingCardMoreInfo = lisingCardMoreInfo;
        this.lisingCardApplicationToTaxiPark = lisingCardApplicationToTaxiPark;
        this.lisingLoadMore = lisingLoadMore;
        this.lisingPaginatorMaxNumber = lisingPaginatorMaxNumber;
        this.getLisingPaginatorForward = getLisingPaginatorForward;
        this.getLisingPaginatorBack = getLisingPaginatorBack;
        this.lisingBottomSelectYourFormat = lisingBottomSelectYourFormat;
        this.lisingBottomMoreInfo = lisingBottomMoreInfo;
        this.lisingBottomHideInfo = lisingBottomHideInfo;
    }


    public SelenideElement getLisingBuyOut() {
        return lisingBuyOut;
    }

    public SelenideElement getListingCardTitle() {
        return lisingCardTitle;
    }

    public SelenideElement getLisingCardMiddlePart() {
        return lisingCardMiddlePart;
    }

    public SelenideElement getLisingCardBottom() {
        return lisingCardBottom;
    }

    public SelenideElement getLisingCardMoreInfo() {
        return lisingCardMoreInfo;
    }

    public SelenideElement getLisingCardApplicationToTaxiPark() {
        return lisingCardApplicationToTaxiPark;
    }

    public SelenideElement getLisingLoadMore() {
        return lisingLoadMore;
    }

    public SelenideElement getLisingPaginatorMaxNumber() {
        return lisingPaginatorMaxNumber;
    }

    public SelenideElement getGetLisingPaginatorForward() {
        return getLisingPaginatorForward;
    }

    public SelenideElement getGetLisingPaginatorBack() {
        return getLisingPaginatorBack;
    }

    public SelenideElement getLisingBottomSelectYourFormat() {
        return lisingBottomSelectYourFormat;
    }

    public SelenideElement getLisingBottomMoreInfo() {
        return lisingBottomMoreInfo;
    }

    public SelenideElement getLisingBottomHideInfo() {
        return lisingBottomHideInfo;
    }
}
