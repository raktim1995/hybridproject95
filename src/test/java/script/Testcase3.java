package script;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.Corejava;
import pomPages.SkillaryLoginPage;
import pomPages.Wishlist;

public class Testcase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillaryLoginPage sl = new SkillaryLoginPage(driver);
		sl.searchtb(pdata.getPropertydata("coursedata"));
		sl.searchtb(null);
		
	 Corejava cj = new Corejava(driver);
	 cj.corejavapack();
	 
	 Wishlist ws = new Wishlist(driver);
	 utilites.switchFrame(driver);
	 
	 ws.playbutton();
	 Thread.sleep(50000);
	 
	 ws.pausebutton();
	 
	 utilites.switchbackframe(driver);
	 
	 ws.addtowishlist();
	}

}
