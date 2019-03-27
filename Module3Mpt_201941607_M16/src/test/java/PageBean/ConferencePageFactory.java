package PageBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConferencePageFactory {

WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement pffname;
	
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement pflname;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement pfemail;
	
	@FindBy(css="input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement pfmobile;
	
	@FindBy(name="size")
	@CacheLookup
	WebElement pfpeople;
	
	@FindBy(name="Address")
	@CacheLookup
	WebElement pfaddress;
	
	@FindBy(name="Address2")
	@CacheLookup
	WebElement pfaddress2;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement pfcity;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement pfstate;
	
	@FindBy(name="memberStatus")
	@CacheLookup
	WebElement pfmember;
	
	@FindBy(linkText="Next")
	@CacheLookup
	WebElement pfnext;

	public WebElement getPffname() {
		return pffname;
	}

	public void setPffname(String sfname) {
		pffname.sendKeys(sfname);
	}

	public WebElement getPflname() {
		return pflname;
	}

	public void setPflname(String slname) {
		pflname.sendKeys(slname);
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public void setPfemail(String semail) {
		pfemail.sendKeys(semail);
	}

	public WebElement getPfmobile() {
		return pfmobile;
	}

	public void setPfmobile(String smobile) {
		pfmobile.sendKeys(smobile);
	}

	public WebElement getPfpeople() {
		return pfpeople;
	}

	public void setPfpeople(String speople) {
		Select drppeople = new Select(pfpeople);
		drppeople.selectByVisibleText(speople);
	}

	public WebElement getPfaddress() {
		return pfaddress;
	}

	public void setPfaddress(String saddress) {
		pfaddress.sendKeys(saddress);
	}

	public WebElement getPfaddress2() {
		return pfaddress2;
	}

	public void setPfaddress2(String saddress2) {
		pfaddress2.sendKeys(saddress2);
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public void setPfcity(String scity) {
		Select drpCity = new Select(pfcity);
		drpCity.selectByVisibleText(scity);
	}

	public WebElement getPfstate() {
		return pfstate;
	}

	public void setPfstate(String sstate) {
		Select drpState = new Select(pfstate);
		drpState.selectByVisibleText(sstate);
	}

	public WebElement getPfmember() {
		return pfmember;
	}

	public void setPfmember() {
		pfmember.click();
	}

	public WebElement getPfnext() {
		return pfnext;
	}

	public void setPfnext() {
		pfnext.click();
	}

	public ConferencePageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
