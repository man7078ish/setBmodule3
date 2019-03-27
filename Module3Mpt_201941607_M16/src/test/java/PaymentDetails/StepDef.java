package PaymentDetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBean.ConferencePageFactory;
import PageBean.PaymentPageFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

private WebDriver driver;
PaymentPageFactory ppf;

//initialization of driver and page
@Given("^User is on Payment Details page$")
public void user_is_on_Payment_Details_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Module 2\\BDD\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ppf=new PaymentPageFactory(driver);
	driver.get("file:///D:/Set%20B/PaymentDetails.html");
}
//checking title
@Then("^check the title of the page$")
public void check_the_title_of_the_page() throws Throwable {
	String title=driver.getTitle();
	if(title.contentEquals("Payment Details")) System.out.println("****** Title Matched");
	else System.out.println("****** Title NOT Matched");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

	driver.close();
}

@When("^user leaves CardHolderName blank and clicks the button$")
public void user_leaves_CardHolderName_blank_and_clicks_the_button() throws Throwable {
    ppf.setPfcardholder("");
    ppf.setPfbutton();
}

@Then("^display alert msg$")
public void display_alert_msg() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
    System.out.println("******" + alertMessage);
    driver.close();
}

@When("^user leaves DebitCardNo blank and clicks the button$")
public void user_leaves_DebitCardNo_blank_and_clicks_the_button() throws Throwable {
    ppf.setPfcardholder("Manish");
    ppf.setPfdebit("");
    ppf.setPfbutton();
}

@When("^user leaves expirationMonth blank and clicks the button$")
public void user_leaves_expirationMonth_blank_and_clicks_the_button() throws Throwable {
	ppf.setPfcardholder("Manish");
    ppf.setPfdebit("12345678912345");
    ppf.setPfcvv("123");
    ppf.setPfmonth("");
    ppf.setPfbutton();
}



@When("^user leaves expirationYr blank and clicks the button$")
public void user_leaves_expirationYr_blank_and_clicks_the_button() throws Throwable {
	ppf.setPfcardholder("Manish");
    ppf.setPfdebit("12345678912345");
    ppf.setPfcvv("123");
    ppf.setPfmonth("11");
    ppf.setPfyear("");
    ppf.setPfbutton();
}

@When("^user enters all valid data$")
public void user_enters_all_valid_data() throws Throwable {
	ppf.setPfcardholder("Manish");
    ppf.setPfdebit("12345678912345");
    ppf.setPfcvv("123");
    ppf.setPfmonth("11");
    ppf.setPfyear("2021");
    
}

@Then("^display alert with success$")
public void display_alert_with_success() throws Throwable {
	ppf.setPfbutton();
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
    System.out.println("******" + alertMessage);
    driver.close();
	
		    
}


}
