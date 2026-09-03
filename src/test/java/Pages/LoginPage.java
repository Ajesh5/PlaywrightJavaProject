package Pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	private final String usernameinput="input[name='username']";
	private final String passwordinput="input[name='password']";
	private final String loginbutton="button[type='submit']";
	
	public LoginPage(Page page) {
		this.page=page;
	}
	
	public void navigate() {
		page.navigate("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	public void login(String username,String password) {
		
		page.fill(usernameinput, username);
		page.fill(passwordinput, password);
		page.click(loginbutton);
	}

}
