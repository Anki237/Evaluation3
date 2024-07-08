package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Makemytrip {
	WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);

	    driver=new ChromeDriver();
	}

	@Given("enter the url")
	public void enter_the_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
	    
	}

	@When("click on hotels")
	public void click_on_hotels() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("a[href=\"https://www.makemytrip.com/hotels/\"]")).click();
	    
	}

	@When("enter location Munnar, Date {int} July to {int} July, Room {int}, Adult {int}")
	public void enter_location_munnar_date_july_to_july_room_adult(Integer int1, Integer int2, Integer int3, Integer int4) throws InterruptedException {
		WebElement cityInput = driver.findElement(By.cssSelector("[data-cy=\"hotelCityLabel\"]"));
        cityInput.click();
        Thread.sleep(2000);
        WebElement citySearchBox = driver.findElement(By.cssSelector("[placeholder=\"Where do you want to stay?\"]"));
        citySearchBox.sendKeys("Munnar");
       Thread.sleep(2000); 
      // WebElement munnarOption = driver.findElement(By.xpath("//p[contains(text(),'Munnar, Kerala')]"));
       //munnarOption.click();
       driver.findElement(By.id("checkin")).click();
       Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[1]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[4]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
	   
	   
	    
	}

	@When("price per night 5000max")
	public void price_per_night_5000max() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Price per Night']")).click();
		 Thread.sleep(2000);
		   driver.findElement(By.xpath("//li[contains(text(),'₹2500-₹5000')]")).click();
	   
	}

	@When("click on search")
	public void click_on_search() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='hsw_search_button']")).click();
	}

	@Then("validate result is visible")
	public void validate_result_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("list the hotel name")
	public void list_the_hotel_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
