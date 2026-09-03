package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;

//import com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserType;
//import com.microsoft.playwright.Page;
//import com.microsoft.playwright.Playwright;

public class FirstTest extends BaseTest {
	
	 @Test
	   public void verifyTitle() {
	       page.navigate("https://www.google.com/ncr");
	       // Optional: Handle cookie popup
	       if (page.isVisible("button:has-text('Accept all')")) {
	           page.click("button:has-text('Accept all')");
	       }
	       System.out.println("Google NCR opened successfully...!");
	       System.out.println("Page Title: " + page.title());
	   }
	
	
	
// public static void main(String[] args) {
		
//		try(Playwright playwright = Playwright.create()){
//			
//			Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//			Page page = browser.newPage();
//			page.navigate("https://google.com");
//			System.out.println("The page Title is :"+page.title());
//			browser.close();
//		}
		
		
//	}

}
