package ru.gb.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.gb.base.BaseTest;
import ru.gb.pages.FormsPage;

public class CheckFormsSteps extends BaseTest{
    FormsPage formsPage;

    @Given("^User is on Forms page$")
    public void user_is_on_Forms_page() {
        formsPage = openApp().clickFormsMenuButton();

    }

    @When("^User click switch button$")
    public void user_click_switch_button() {
        formsPage.clickSwitchButton();
    }

    @Then("^User should see message \"([^\"]*)\"$")
    public void user_should_see_message(String arg1) {
        formsPage.checkSwitchText(arg1);
    }



    @When("User click Active button")
    public void user_click_active_button() {
        formsPage.clickActiveButton();

    }

    @Then("User should see a text box {string}")
    public void user_should_see_a_text_box(String string) {
        formsPage.checkActiveButtonText(string);

    }
}
