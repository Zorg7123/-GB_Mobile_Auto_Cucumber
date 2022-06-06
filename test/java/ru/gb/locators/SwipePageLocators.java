package ru.gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SwipePageLocators {
    public By swipeHorizontalText() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe-screen\"]/android.view.ViewGroup[1]/android.widget.TextView");}


    public By FullyButton() {
        return MobileBy.xpath ("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
    }
}
