package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagePF {

	WebDriver driver;
	public  RediffHomepagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Search field
	@FindBy(id="srchword")
	WebElement search;
	public WebElement Search() {
		return search;
	}
	//Search field submit
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	public WebElement Submit() {
		return submit;
	}
}
