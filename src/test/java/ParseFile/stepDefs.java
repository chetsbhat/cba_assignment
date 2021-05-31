package ParseFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;


public class stepDefs extends CreateTestData {
   public CreateTestData createTestData;

    @Given("I Open Test file")
    public void i_open_test_file() throws IOException{
        //reading test file
     myFile();
    }

    @When("I read test file")
    public void i_read_test_file() {

    }

    @Then("I copy key value pairs in excel")
    public void i_copy_key_value_pairs_in_excel() {

    }

    @Then("I close the excel file")
    public void i_close_the_excel_file() {

    }

}
