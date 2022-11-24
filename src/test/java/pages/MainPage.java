package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    SelenideElement compAndLaptop = $(byXpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]/a"));


    public LaptopPage clickOnCategoryCompAndLaptop(SelenideElement category) {
        category.shouldBe(Condition.visible); 
        category.click();
        return page(LaptopPage.class);
    }

}
