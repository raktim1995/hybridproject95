package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoLoginPage {
	
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursetab;

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraning;
	
	@FindBy(xpath="(//option[text()='Select category'])")
	private WebElement searchcatgory;
	
	
	
	
	public WebElement getSearchcatgory() {
		return searchcatgory;
	}

	public SkillaryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumtraining()
	{
		seleniumtraning.click();
	}

}
