package ru.jobtop.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 1 on 22.02.2018.
 */
public class Filter {

    private SelenideElement fE;
    private SelenideElement filPriceLeaseInputOne;
    private SelenideElement filPriceLeaseInputTwo;
    private SelenideElement filDragLeaseOne;
    private SelenideElement filDragLeaseTwo;

    private SelenideElement filLinkAvtomobili;
    private SelenideElement filListAvtomobiliInput;
    private ElementsCollection filCollectionChBoxCar;

    private SelenideElement filLinkClassCar;
    private ElementsCollection filCollectionClassCar;

    private SelenideElement filChbSmartPhone;
    private SelenideElement filChbBuyOut;
    private SelenideElement filChbWithOutDeposit;

    private SelenideElement filChbMainPageBuyOut;

    private SelenideElement filCarYearInputOne;
    private SelenideElement filCarYearInputTwo;
    private SelenideElement filDragCarYearOne;
    private SelenideElement filDragCarYearTwo;

    private SelenideElement filLinkTaxiPark;
    private SelenideElement filInputTaxiPark;
    private SelenideElement filListTaxiPark;

    private SelenideElement filLinkSchedule;
    private SelenideElement filListSchedule;

    private SelenideElement filLinkTypeOfPay;
    private SelenideElement filListTypeOfPay;

    private SelenideElement filLinkAggregators;
    private SelenideElement filInputAggregators;
    private SelenideElement filListAggregators;

    private SelenideElement filLinkCitizenship;
    private SelenideElement filListCitizenship;

    private SelenideElement filLinkDrivingExperience;
    private SelenideElement filListDrivingExperience;

    private SelenideElement filChbMoscowRegistration;
    private SelenideElement filchbDriverLisence;

    private SelenideElement filLinkAdditionally;

    private SelenideElement filLinkCompensations;
    private SelenideElement filListCompensations;

    private SelenideElement filLinkTypeFuel;
    private SelenideElement filFuelGasoline;
    private SelenideElement filFuelDiesel;
    private SelenideElement filFuelPropan;

    private SelenideElement filLinkGearBox;
    private SelenideElement filManualTr;
    private SelenideElement filAutoTr;

    private SelenideElement filLinkColorCar;
    private SelenideElement filListColorCar;

    private SelenideElement filColorLicensePlateAll;
    private SelenideElement filColorLicensePlateYellow;
    private SelenideElement filColorLicensePlateWhite;

    private SelenideElement filLinkResetAll;

    private SelenideElement filDeleteOneFilter;

    private SelenideElement filLinkFind;

    private SelenideElement filShowOffer;
    private SelenideElement filSelectAcar;



    public Filter() {
        this.fE = $("[class=\"filters\"]");
        this.filPriceLeaseInputOne = fE.$("[type=\"text\"]",0);
        this.filPriceLeaseInputTwo = fE.$("[type=\"text\"]",1);
        this.filDragLeaseOne = fE.$(".v_range__dot",0);
        this.filDragLeaseTwo = fE.$(".v_range__dot",1);
        this.filLinkAvtomobili = fE.$(byText("Автомобили"));
        this.filListAvtomobiliInput = fE.$("[class=\"v_select multiple active\"] [type=\"text\"]");
        this.filCollectionChBoxCar = fE.$$("[class=\"v_select multiple active\"] li");
        this.filLinkClassCar = fE.$(byText("Класс авто"));
        this.filCollectionClassCar = fE.$$("[class=\"v_select active\"] ul");
        this.filChbSmartPhone = fE.$(byText("смартфон"));
        this.filChbBuyOut = fE.$(byText("выкуп"));
        this.filChbMainPageBuyOut = fE.$(byText("возможность выкупа"));
        this.filChbWithOutDeposit = fE.$(byText("без залога"));
        this.filCarYearInputOne = fE.$("[type=\"text\"]",3);
        this.filCarYearInputTwo = fE.$("[type=\"text\"]",4);
        this.filDragCarYearOne = fE.$(".v_range__dot",2);
        this.filDragCarYearTwo = fE.$(".v_range__dot",3);
        this.filLinkTaxiPark = fE.$(byText("Таксопарки"));
        this.filInputTaxiPark = fE.$(byText("Таксопарки")).$("[type=\"text\"]");
        this.filListTaxiPark = fE.$(byText("Таксопарки")).$("[class=\"check\"]");
        this.filLinkSchedule = fE.$(byText("График работы"));
        this.filListSchedule = fE.$(byText("График работы")).$("[class=\"check\"]");
        this.filLinkTypeOfPay = fE.$(byText("Порядок выплат"));
        this.filListTypeOfPay = fE.$(byText("Порядок выплат")).$("[class=\"check\"]");
        this.filLinkAggregators = fE.$(byText("Агрегаторы"));
        this.filInputAggregators = fE.$(byText("Агрегаторы")).$("[input[type =\"text\"]");
        this.filListAggregators = fE.$(byText("Агрегаторы")).$("[class=\"check\"]");
        this.filLinkCitizenship = fE.$(byText("Гражданство"));
        this.filListCitizenship = fE.$(byText("Гражданство")).$("[class=\"check\"]");
        this.filLinkDrivingExperience = fE.$(byText("Стаж вождения"));
        this.filListDrivingExperience = fE.$(byText("Стаж вождения")).$("[class=\"check\"]");
        this.filChbMoscowRegistration = fE.$(byText("Московская прописка"));
        this.filchbDriverLisence = fE.$(byText("Водительские права РФ"));
        this.filLinkAdditionally = fE.$("[class=\"filters__roll\"]");
        this.filLinkCompensations = fE.$(byText("Компенсации"));
        this.filListCompensations = fE.$(byText("Компенсации")).$("[class=\"check\"]");
        this.filLinkTypeFuel = fE.$(byText("Тип топлива"));
        this.filFuelGasoline = fE.$(byText("Тип топлива")).$("[class=\"check\"]",0);
        this.filFuelDiesel = fE.$(byText("Тип топлива")).$("[class=\"check\"]",1);
        this.filFuelPropan = fE.$(byText("Тип топлива")).$("[class=\"check\"]",2);
        this.filLinkGearBox = fE.$(byText("Тип коробки"));
        this.filManualTr = fE.$(byText("Тип коробки")).$("[class=\"check\"]",0);
        this.filAutoTr = fE.$(byText("Тип коробки")).$("[class=\"check\"]",1);
        this.filLinkColorCar = fE.$(byText("Цвет авто"));
        this.filListColorCar = fE.$(byText("Цвет авто")).$("[class=\"check\"]");
        this.filColorLicensePlateAll = fE.$("[class=\"radio\"}").$(byText("Все номера"));
        this.filColorLicensePlateYellow = fE.$("[class=\"radio\"}").$(byText("Желтые номера"));
        this.filColorLicensePlateWhite = fE.$("[class=\"radio\"}").$(byText("Белые номера"));
        this.filLinkResetAll = fE.$("[class=\"filters__delete\"]");
        this.filLinkFind = fE.$("[class=\"btn-radius\"]");
        this.filDeleteOneFilter = fE.$("[class=\"delete\"]");
        this.filShowOffer = fE.$("[class=\"v_tooltip right info filters__tooltip\"]");
        this.filSelectAcar = $("[href=\"/arenda-avto-pod-taksi\"]");
    }

    public SelenideElement getfE() {
        return fE;
    }

    public SelenideElement getFilPriceLeaseInputOne() {
        return filPriceLeaseInputOne;
    }

    public SelenideElement getFilPriceLeaseInputTwo() {
        return filPriceLeaseInputTwo;
    }

    public SelenideElement getFilDragLeaseOne() {
        return filDragLeaseOne;
    }

    public SelenideElement getFilDragLeaseTwo() {
        return filDragLeaseTwo;
    }

    public SelenideElement getFilLinkAvtomobili() {
        return filLinkAvtomobili;
    }

    public SelenideElement getFilListAvtomobiliInput() {
        return filListAvtomobiliInput;
    }

    public ElementsCollection getFilCollectionChBoxCar() {
        return filCollectionChBoxCar;
    }

    public SelenideElement getFilLinkClassCar() {
        return filLinkClassCar;
    }

    public ElementsCollection getFilCollectionClassCar() {
        return filCollectionClassCar;
    }

    public SelenideElement getFilChbSmartPhone() {
        return filChbSmartPhone;
    }

    public SelenideElement getFilChbBuyOut() {
        return filChbBuyOut;
    }

    public SelenideElement getFilChbWithOutDeposit() {
        return filChbWithOutDeposit;
    }

    public SelenideElement getFilCarYearInputOne() {
        return filCarYearInputOne;
    }

    public SelenideElement getFilCarYearInputTwo() {
        return filCarYearInputTwo;
    }

    public SelenideElement getFilDragCarYearOne() {
        return filDragCarYearOne;
    }

    public SelenideElement getFilDragCarYearTwo() {
        return filDragCarYearTwo;
    }

    public SelenideElement getFilLinkTaxiPark() {
        return filLinkTaxiPark;
    }

    public SelenideElement getFilInputTaxiPark() {
        return filInputTaxiPark;
    }

    public SelenideElement getFilListTaxiPark() {
        return filListTaxiPark;
    }

    public SelenideElement getFilLinkSchedule() {
        return filLinkSchedule;
    }

    public SelenideElement getFilListSchedule() {
        return filListSchedule;
    }

    public SelenideElement getFilLinkTypeOfPay() {
        return filLinkTypeOfPay;
    }

    public SelenideElement getFilListTypeOfPay() {
        return filListTypeOfPay;
    }

    public SelenideElement getFilLinkAggregators() {
        return filLinkAggregators;
    }

    public SelenideElement getFilInputAggregators() {
        return filInputAggregators;
    }

    public SelenideElement getFilListAggregators() {
        return filListAggregators;
    }

    public SelenideElement getFilLinkCitizenship() {
        return filLinkCitizenship;
    }

    public SelenideElement getFilListCitizenship() {
        return filListCitizenship;
    }

    public SelenideElement getFilLinkDrivingExperience() {
        return filLinkDrivingExperience;
    }

    public SelenideElement getFilListDrivingExperience() {
        return filListDrivingExperience;
    }

    public SelenideElement getFilChbMoscowRegistration() {
        return filChbMoscowRegistration;
    }

    public SelenideElement getFilchbDriverLisence() {
        return filchbDriverLisence;
    }

    public SelenideElement getFilLinkAdditionally() {
        return filLinkAdditionally;
    }

    public SelenideElement getFilLinkCompensations() {
        return filLinkCompensations;
    }

    public SelenideElement getFilListCompensations() {
        return filListCompensations;
    }

    public SelenideElement getFilLinkTypeFuel() {
        return filLinkTypeFuel;
    }

    public SelenideElement getFilFuelGasoline() {
        return filFuelGasoline;
    }

    public SelenideElement getFilFuelDiesel() {
        return filFuelDiesel;
    }

    public SelenideElement getFilFuelPropan() {
        return filFuelPropan;
    }

    public SelenideElement getFilLinkGearBox() {
        return filLinkGearBox;
    }

    public SelenideElement getFilManualTr() {
        return filManualTr;
    }

    public SelenideElement getFilAutoTr() {
        return filAutoTr;
    }

    public SelenideElement getFilLinkColorCar() {
        return filLinkColorCar;
    }

    public SelenideElement getFilListColorCar() {
        return filListColorCar;
    }

    public SelenideElement getFilColorLicensePlateAll() {
        return filColorLicensePlateAll;
    }

    public SelenideElement getFilColorLicensePlateYellow() {
        return filColorLicensePlateYellow;
    }

    public SelenideElement getFilColorLicensePlateWhite() {
        return filColorLicensePlateWhite;
    }

    public SelenideElement getFilLinkResetAll() {
        return filLinkResetAll;
    }

    public SelenideElement getFilLinkFind() {
        return filLinkFind;
    }

    public SelenideElement getFilDeleteOneFilter() {return filDeleteOneFilter; }

    public SelenideElement getFilShowOffer() {
        return filShowOffer;
    }

    public SelenideElement getFilSelectAcar() {
        return filSelectAcar;
    }

}
