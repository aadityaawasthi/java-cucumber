package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Contact_Form {
	 public static WebDriver driver;
	 
	    @Given("^I am on Home Page of \"([^\"]*)\"$")
	    public void i_am_on_Home_Page_of(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(arg1);
	    }
}
