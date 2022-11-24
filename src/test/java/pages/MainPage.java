package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    // ElementsCollection sideBarMenu = $$(byXpath("//a[@class='menu-categories__link']"));

    SelenideElement compAndLaptop = $(byXpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]/a"));


/*    public MainPage checkCategoryQuantity(int size) {
        sideBarMenu.shouldHave(CollectionCondition.size(size));
        return this;
    }*/

    public LaptopPage clickOnCategoryCompAndLaptop(SelenideElement category) {
        category.shouldBe(Condition.visible); 
        category.click();
        return page(LaptopPage.class);
    }

}
