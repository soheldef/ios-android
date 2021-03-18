package Tests;

import org.testng.annotations.Test;
import Pages.contactsearchpage;

public class searchname_test extends BaseClass{

	contactsearchpage contactsearchpage;

	@Test(priority = 1,enabled=true)
	public void Sum1intest1() throws InterruptedException  {
		Thread.sleep(3000);
		contactsearchpage = new contactsearchpage(driver);
		contactsearchpage.search("sara");	
	}
}
