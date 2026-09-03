package Pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

	private final Page page;
	
	public HomePage(Page page) {
		this.page=page;
		
	}
	
	public void clickAdmin() {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Admin")).click();

	}
	
}
