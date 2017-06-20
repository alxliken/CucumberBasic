package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jnunez on 6/6/17.
 */
public class LoginStep {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I should set userform page");
    }


    
    

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Enter user name and password");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Click login button");
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        /*
        List<List<String>> data = table.raw();
        System.out.println("Value is: " + data.get(0).get(0).toString());
        System.out.println("Value is: " + data.get(0).get(1).toString());
        */

        List<User> users = new ArrayList<User>();

        //Store all the users
        users = table.asList(User.class);
        for (User user: users) {
            System.out.println("The username is " + user.username );
            System.out.println("The password is " + user.password);
        }



    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("Username is : " + userName );
        System.out.println("Password is : " + password);
    }

    public class User
    {
        public String username;
        public String password;

        public User(String username, String password) {
            username = username;
            password = password;
        }
    }


}
