package pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Main {

    //    Перейти на https://rozetka.com.ua/
    //    В сайд меню перейти в раздел Ноутбуки и компьютеры
    //    Перейти в категорию Ноутбуки

    //    Примерить фильтр "Продавец" Rozetka
    //    Примерить фильтр "Цена" установть цену до - 100000
    //    Перейти на продуктовую первого товара с плашкой " ТОП ПРОДАЖІВ"
    //    Проверить что на продуктовой странице отображается плашка " ТОП ПРОДАЖІВ"*/
    protected static void resetSettings() {
        Configuration.timeout = 6000;
    }

    private MainPage mainPage = new MainPage();

    @BeforeMethod
    public void before() {
        resetSettings();
        open("https://rozetka.com.ua/ua/");
    }

    @Test
    public void rozetkaLaptopTest() {
        mainPage
                .clickOnCategoryCompAndLaptop(mainPage.compAndLaptop)
                .clickOnCategoryLaptop()
                .filterRozetka()
                .filterSliderMax()
                .checkProduct();
    }
}
