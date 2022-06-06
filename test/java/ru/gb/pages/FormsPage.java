package ru.gb.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import ru.gb.locators.FormsPageLocators;

public class FormsPage {
    private FormsPageLocators locator() {
        return new FormsPageLocators();
    }

    @Step("Кликаем по кнопке 'Switch' в форме")
    public FormsPage clickSwitchButton() {
        Selenide.$(locator().switchButton()).click();
        return new FormsPage();
    }

    @Step("Проверяем текст")
    public FormsPage checkSwitchText(String text) {
        Selenide.$(locator().switchOffText()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Кликаем по кнопке Active")
    public FormsPage clickActiveButton() {
        Selenide.$(locator().buttonActive()).click();
        return new FormsPage();
    }
    @Step("Проверяем текст")
    public FormsPage checkActiveButtonText(String text) {
        Selenide.$(locator().buttonActiveText()).shouldHave(Condition.text(text));
        return new FormsPage();
    }
}
