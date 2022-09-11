package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbttn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebttn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addwishtlist;
	
	
	public Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void playbutton()
	{
		playbttn.click();
	}
	
	public void pausebutton()
	{
		pausebttn.click();
	}
	
	public void addtowishlist()
	{
		addwishtlist.click();
	}

}
