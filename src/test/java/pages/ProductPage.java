package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    private final SelenideElement tittle = $$(byXpath("//rz-label/span")).get(0);


    public ProductPage checkProduct() {
        tittle.shouldBe(visible);
        return this;
    }

}
