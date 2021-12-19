package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPageSteps {
	public static WebDriver driver;
	//public static String browser = "chrome";
	
	@Before
	public void setUp() {
		System.out.println("Before Hooks methods running...");
	}

	
	

	
	    @Given("^user is on login page$")    
	    public void user_is_already_on_the_login_page() throws InterruptedException {
	   	 
	   	 	System.setProperty("webdriver.chrome.driver","C://Users//Jiju//workspace//chromedriver.exe");
	   		 WebDriverManager.chromedriver().setup();
	   		 driver = new ChromeDriver();
	   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   	     driver.get("https://www.saucedemo.com/");
	   	 Thread.sleep(7000);
	   	 
	    }
	    
	    @When("^user gets the title of the page$")
	    public void title_of_the_login_page_is_free_CRM() {
	    	WebElement element = driver.findElement(By.xpath("//*[@id='root']/div/div[1]"));
	   	 String title = element.getText();
	   	 System.out.println(title);
	   	 //Assert.assertEquals("Swag Labs",title);
	   	 
	    }
	    
	    
	    @Then("^user enters username and password$")
	    public void user_enters_creditials() throws InterruptedException {
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");;
	   	 driver.findElement(By.name("password")).sendKeys("secret_sauce");
	   	 //driver.findElement(By.id("login-button")).click();
	   	 
	   	Thread.sleep(7000);
	    }
	    
	    @Then("^user clicks on login button$")
	    public void click_button() throws InterruptedException{
	 
	    	driver.findElement(By.id("login-button")).submit();
	    	Thread.sleep(7000);
	    }
	    
	    //public void user_click_login_button() throws Throwable {
//	   	 WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
//	   	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	   	 js.executeScript("arguments[0].click();", loginbtn);
//	   	 throw new PendingException();
//	   	 
//	    }


	    
	    @Given("^user is in product items$")
	    public void on_product_items_page(){
	    	//WebElement element = driver.findElement(By.xpath("//*[@id='header_container']/div[1]/div[2]/div"));
	    	//String title = driver.getTitle();
		   	 //System.out.println(element);
	    	driver.get("https://www.saucedemo.com/inventory.html");
	    }
	    
	  
	    @When("^user select the item and user click on ADD TO CART$")
	    public void select_add_to_the_cart() throws InterruptedException {
	    	
	    	WebElement element = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
	    	element.click();
	    	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	    	Thread.sleep(7000);
	    }
	    
	  @Then("^user move BACK TO PRODUCTS$")
	  public void move_back_to_product_catalog() {
		  
		  driver.findElement(By.name("back-to-products")).click();
	  }
	    
	    @Then("^user add another item and ADD TO CART$")
	    public void add_another_item_and_add_to_cart() throws InterruptedException {
	    	
	    	WebElement element = driver.findElement(By.xpath("//*[@id='item_0_title_link']/div"));
	    	element.click();
	    	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	    	driver.findElement(By.name("back-to-products")).click();
	    	Thread.sleep(7000);
	    }
	    
	    @Then("^Again user select the item and ADD TO CART$")
	    public void again_add_another_item_and_add_to_cart() throws InterruptedException {
	    	
	    	WebElement element = driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
	    	element.click();
	    	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	    	driver.findElement(By.name("back-to-products")).click();
	    	Thread.sleep(7000);
	    }
	    
	    
	    
	    @Given("^User goto YOUR CART and REMOVE an item$")
	    public void goto_cart_and_remove_an_item() throws InterruptedException{
	    	
	    	WebElement element = driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span"));
	    	element.click();
	    	driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	    	Thread.sleep(7000);
	    }
	    
	    
	    @When("^User click on CHECKOUT$")
	    public void click_on_checkout() {
	    	
	    	driver.findElement(By.id("checkout")).click();
	    }
	    
	    @Then("^CHECKOUT INFORMAtION$")
	    public void checkout_information() throws InterruptedException {
	    	driver.findElement(By.id("first-name")).sendKeys("jiju");
	    	driver.findElement(By.id("last-name")).sendKeys("Thankachan");
	    	driver.findElement(By.id("postal-code")).sendKeys("492006");
	    	
	    	Thread.sleep(7000);
	    }
	    
	    @Then("^User Click on CONTINUE Button and click FINISH$")
	    public void click_on_continue() {
	    	driver.findElement(By.id("continue")).click();
	    	
	    	driver.findElement(By.id("finish")).click();
	    	
	    }
	    
	    
	    @After
	    public void tearDown(){
	    	System.out.println("After Hooks methods running...");
	    	//driver.close();
	    }
}
