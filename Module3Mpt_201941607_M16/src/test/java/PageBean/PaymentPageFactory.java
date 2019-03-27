package PageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageFactory {
WebDriver driver;
	@FindBy(how=How.ID, using="txtCardholderName")
	@CacheLookup
	WebElement pfcardholder;

	@FindBy(id="txtDebit")
	@CacheLookup
	WebElement pfdebit;

	@FindBy(name="cvv")
	@CacheLookup
	WebElement pfcvv;
	
	@FindBy(id="txtMonth")
	@CacheLookup
	WebElement pfmonth;
	
	@FindBy(id="txtYear")
	@CacheLookup
	WebElement pfyear;
	
	@FindBy(how=How.ID, using="btnPayment")
	@CacheLookup
	WebElement pfbutton;

	public WebElement getPfcardholder() {
		return pfcardholder;
	}

	public void setPfcardholder(String scardholder) {
		pfcardholder.sendKeys(scardholder);
	}

	public WebElement getPfdebit() {
		return pfdebit;
	}

	public void setPfdebit(String sdebit) {
		pfdebit.sendKeys(sdebit);
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public void setPfcvv(String scvv) {
		pfcvv.sendKeys(scvv);
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public void setPfmonth(String smonth) {
		pfmonth.sendKeys(smonth);
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPfyear(String syear) {
		pfyear.sendKeys(syear);
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();;
	}

	public PaymentPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
