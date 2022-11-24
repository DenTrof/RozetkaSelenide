package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class LaptopPage {

    public final SelenideElement laptops = $(byXpath("//*[contains(@href, 'c80004')]"));
    public final SelenideElement filterRozertka = $(byXpath("//rz-filter-checkbox//a[@data-id='Rozetka']"));
    public final SelenideElement filterSliderMax = $(byXpath("//rz-scrollbar//rz-filter-slider//input[@formcontrolname='max']"));
    public final SelenideElement itemOne = $$(byXpath("//rz-catalog-tile//a")).get(0);


    public LaptopPage clickOnCategoryLaptop() {
        laptops.shouldBe(visible);
        laptops.click();
        return page(LaptopPage.class);
    }


    public LaptopPage filterRozetka() {
        filterRozertka.shouldBe(visible);
        filterRozertka.click();
        return page(LaptopPage.class);
    }

    public ProductPage filterSliderMax() {
        filterSliderMax.shouldBe(visible);
        filterSliderMax.setValue("100000").pressEnter();
        itemOne.shouldBe(visible);
        itemOne.click();
        return page(ProductPage.class);
    }

}
