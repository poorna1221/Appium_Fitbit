		package StepDefinition;
		
		import java.io.File;
		import java.net.MalformedURLException;
		import java.net.URL;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import io.appium.java_client.remote.AndroidMobileCapabilityType;
		import cucumber.api.java.en.Given;
		import cucumber.api.java.en.Then;
		import cucumber.api.java.en.When;
		import io.appium.java_client.MobileElement;
		import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.android.AndroidElement;
		import io.appium.java_client.remote.MobileCapabilityType;
		import org.junit.Assert;
		
		public class FitBitAppLogin {
			AndroidDriver<AndroidElement> driver;
		
			@Given("^Fitbit app is opened$")
			public void fitbit_app_is_opened() throws MalformedURLException {
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PoornaEmulator");
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
				capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.fitbit.FitbitMobile");
				capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.fitbit.FirstActivity");
				driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
			}
		
			@When("^user enters username and password and click on login button$")
			public void user_enters_username_and_password_and_click_on_login_button() throws InterruptedException {
				
				  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
				  Thread.sleep(5000);
				  driver.findElementById("com.fitbit.FitbitMobile:id/login_email").sendKeys(
				  "poornachandrarao.948@gmail.com");
				  driver.findElementById("com.fitbit.FitbitMobile:id/login_password").sendKeys(
				  "test123456");
				  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
				  
			}
		
			@When("^user enters \"(.*?)\" and \"(.*?)\" and click on login button$")
			public void user_enters_and_and_click_on_login_button(String username, String password) throws Throwable {
		
				  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
				  Thread.sleep(5000);
				  driver.findElementById("com.fitbit.FitbitMobile:id/login_email").sendKeys(username);
				  driver.findElementById("com.fitbit.FitbitMobile:id/login_password").sendKeys(password);
				  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
			}
		
			
			@Then("^verify if user is not logged into appliction$")
			public void verify_if_user_is_not_logged_into_appliction() throws Throwable {
				waitForPresence(driver,5000,"android:id/message");
				Assert.assertEquals("Invalid email or password",driver.findElementById("android:id/message").getText());
				
				  driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
			}
		
			
			
			
			@Then("^verify if the user is logged into the fitbit app$")
			public void verify_if_the_user_is_logged_into_the_fitbit_app() throws InterruptedException {
			
				boolean objectinloginpage = waitForPresence(driver,25000,"com.fitbit.FitbitMobile:id/today");
	
				Assert.assertTrue(objectinloginpage);
				
				
			}
			public static boolean waitForPresence(AndroidDriver<AndroidElement> driver, int timeLimitInSeconds, String targetResourceId){
		
				boolean isElementPresent;
				try{
					WebElement	mobileElement ;
					WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
					mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(targetResourceId)));
					isElementPresent = mobileElement.isDisplayed();
					return isElementPresent;	
				}catch(Exception e){
					isElementPresent = false;
					System.out.println(e.getMessage());
					return isElementPresent;
				} }
		}
