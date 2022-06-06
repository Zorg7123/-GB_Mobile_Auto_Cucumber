package ru.gb.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import ru.gb.locators.SwipePageLocators;

public class SwipePage {
    private SwipePageLocators locator() {return new SwipePageLocators();}

    @Step("Проверяем наличие заголовка")
    public SwipePage checkSwipeText(String text) {
        Selenide.$(locator().swipeHorizontalText()).shouldHave(Condition.text(text));
        return new SwipePage();
    }

    @Step("Кликаем по кнопке 'Fully Open Source' в форме")
    public SwipePage clickFullyButton() {
        Selenide.$(locator().FullyButton()).click();
        return new SwipePage();
    }
}
