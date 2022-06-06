package ru.gb.tests.forms;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckActiveButton extends BaseTest{
    public static final String Active_Button_Text = "This button is active";
    @Test
    @Description("Проверяем сообщение")
    public void CheckOff() {
        openApp()
                .clickFormsMenuButton()
                .clickActiveButton()
                .checkActiveButtonText(Active_Button_Text);
    }
}
