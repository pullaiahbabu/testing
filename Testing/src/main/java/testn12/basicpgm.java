package testn12;

import org.testng.annotations.Test;

public class basicpgm {
	
	@Test(priority = 1,description = "login functionality is completed")
	
	public void login() {
		
		System.out.println("functionality login is working");
		
	}
	
	@Test(priority = 2,description = "cart functionality is completed")
	
	public void cart() {
		
		System.out.println("cart functionality is working");
		
	}
	@Test(priority = 3,description = "payment functionality is completed")
	
	public void payment() {
		
		System.out.println("payment functionality is working");
	}
 
}
