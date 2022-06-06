package ru.gb.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    @Before
    public void prepareData() {
        System.out.println("Перед тестом");
    }

    @After
    public void clearData() {
        System.out.println("После теста");
    }
}
