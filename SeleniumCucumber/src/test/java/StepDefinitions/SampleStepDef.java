package StepDefinitions;

import io.cucumber.java.en.*;

public class SampleStepDef {

    @Given("Open Google calculator")
    public void open_google_calculator() {
        System.out.println("Opening Calculator");
    }

    @When("Enter {int}+{int} in search text box")
    public void enter_in_search_text_box(Integer int1, Integer int2) {
        System.out.println("Entering text in search box "+int1+" + "+int2);
    }

    @And("Press Enter")  // We can use @When or And here, both works
    public void press_enter() {
        System.out.println("Press Enter");
    }

    @Then("We should get result as {int}")
    public void we_should_get_result_as(Integer int1) {
        System.out.println("Verify the output as: "+int1);
    }

    @But("Nothing else")  // We can use @Then or But here, both works
    public void nothing_else() {
        System.out.println("Nothing Else");
    }

}
