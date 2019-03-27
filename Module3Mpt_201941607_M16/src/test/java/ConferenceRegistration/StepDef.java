package ConferenceRegistration;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBean.ConferencePageFactory;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

private WebDriver driver;
ConferencePageFactory cpf;
@Given("^User is on ConferenceRegistration Page$")
public void user_is_on_ConferenceRegistration_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Module 2\\BDD\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	cpf=new ConferencePageFactory(driver);
	driver.get("file:///D:/Set%20B/ConferenceRegistartion.html#");
}

@Then("^check the title of the page$")
public void check_the_title_of_the_page() throws Throwable {
	String title=driver.getTitle();
	if(title.contentEquals("Conference Registartion")) System.out.println("****** Title Matched");
	else System.out.println("****** Title NOT Matched");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
}

@When("^user leaves first Name blank$")
public void user_leaves_first_Name_blank() throws Throwable {
   cpf.setPffname("");
}

@When("^clicks the button$")
public void clicks_the_button() throws Throwable {
    cpf.setPfnext();
}

@Then("^display alert msg$")
public void display_alert_msg() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
    System.out.println("******" + alertMessage);
    driver.close();
}

@When("^user leaves last Name blank and clicks the button$")
public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
    cpf.setPffname("Manish");
    cpf.setPflname("");
    cpf.setPfnext();

}

@When("^user enters all data$")
public void user_enters_all_data() throws Throwable {
    cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    
    cpf.setPfmobile("7252090047");
    cpf.setPfpeople("3");
    cpf.setPfaddress("Capgemini");
    cpf.setPfaddress2("GLC");
    cpf.setPfcity("Pune");
    cpf.setPfstate("Maharashtra");
    cpf.setPfmember();
    
}

@When("^user enters incorrect email format and clicks the button$")
public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
	
    cpf.setPfemail("manishgmail.com");
    cpf.setPfnext();
}

@When("^user leaves MobileNo blank and clicks the button$")
public void user_leaves_MobileNo_blank_and_clicks_the_button() throws Throwable {
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
    cpf.setPfmobile("");
    cpf.setPfpeople("3");
    cpf.setPfaddress("Capgemini");
    cpf.setPfaddress2("GLC");
    cpf.setPfcity("Pune");
    cpf.setPfstate("Maharashtra");
    cpf.setPfmember();
    cpf.setPfnext();
}

@When("^user enters incorrect mobileNo format and clicks the button$")
public void user_enters_incorrect_mobileNo_format_and_clicks_the_button(DataTable arg1) throws Throwable {
   
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
	List<String> objList = arg1.asList(String.class);
	//hpf.setPfmobile(objList);	Thread.sleep(1000);
	cpf.setPfnext();
	
	for(int i=0; i<objList.size(); i++) {
		if(Pattern.matches("^[7-9]{1}[0-9]{9}$", objList.get(i))) {
		System.out.println("***** Matched" + objList.get(i) + "*****");
		}
		else {
			System.out.println("***** NOT Matched" + objList.get(i) + "*****");
		}
	}
}

@Given("^User is on ConferenceRegistration page$")
public void user_is_on_ConferenceRegistration_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Module 2\\BDD\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	cpf=new ConferencePageFactory(driver);
	driver.get("file:///D:/Set%20B/ConferenceRegistartion.html#");
}

@When("^user leaves Building Name & Room No blank and clicks the button$")
public void user_leaves_Building_Name_Room_No_blank_and_clicks_the_button() throws Throwable {
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
    cpf.setPfmobile("7252090047");
    cpf.setPfpeople("3");
    cpf.setPfaddress("");
    cpf.setPfaddress2("GLC");
    cpf.setPfcity("Pune");
    cpf.setPfstate("Maharashtra");
    cpf.setPfmember();
    cpf.setPfnext();
}

@When("^user leaves Area Name blank and clicks the button$")
public void user_leaves_Area_Name_blank_and_clicks_the_button() throws Throwable {
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
    cpf.setPfmobile("7252090047");
    cpf.setPfpeople("3");
    cpf.setPfaddress("Capgemini");
    cpf.setPfaddress2("");
    cpf.setPfcity("Pune");
    cpf.setPfstate("Maharashtra");
    cpf.setPfmember();
    cpf.setPfnext();
}

@When("^user doesnot select city$")
public void user_doesnot_select_city() throws Throwable {
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
    cpf.setPfmobile("7252090047");
    cpf.setPfpeople("3");
    cpf.setPfaddress("Capgemini");
    cpf.setPfaddress2("GLC");
    cpf.setPfcity("Select City");
    cpf.setPfstate("Maharashtra");
    cpf.setPfmember();
    cpf.setPfnext();
}

@When("^user doesnot select state$")
public void user_doesnot_select_state() throws Throwable {
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
    cpf.setPfmobile("7252090047");
    cpf.setPfpeople("3");
    cpf.setPfaddress("Capgemini");
    cpf.setPfaddress2("GLC");
    cpf.setPfcity("Pune");
    cpf.setPfstate("Select State");
    cpf.setPfmember();
    cpf.setPfnext();
}

@When("^user leaves Conference full-Access blank and clicks the button$")
public void user_leaves_Conference_full_Access_blank_and_clicks_the_button() throws Throwable {
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
    cpf.setPfmobile("7252090047");
    cpf.setPfpeople("3");
    cpf.setPfaddress("Capgemini");
    cpf.setPfaddress2("GLC");
    cpf.setPfcity("Pune");
    cpf.setPfstate("Maharashtra");
    
    cpf.setPfnext();
}
//entering all valid data
@When("^user enters all valid data$")
public void user_enters_all_valid_data() throws Throwable {
	cpf.setPffname("Manish");
    cpf.setPflname("Kumar");
    cpf.setPfemail("manish@gmail.com");
    cpf.setPfmobile("7252090047");
    cpf.setPfpeople("3");
    cpf.setPfaddress("Capgemini");
    cpf.setPfaddress2("GLC");
    cpf.setPfcity("Pune");
    cpf.setPfstate("Maharashtra");
    cpf.setPfmember();
    
}
//checking whether page is navigated to correct page or not
@Then("^navigate to Payment Details page$")
public void navigate_to_Payment_Details_page() throws Throwable {
	cpf.setPfnext();
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
    System.out.println("******" + alertMessage);
    Thread.sleep(1000);
	String title=driver.getTitle();
	if(title.contentEquals("Payment Details")) System.out.println("****** Title Matched");
	else System.out.println("****** Title NOT Matched");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

	driver.close();
}


}
