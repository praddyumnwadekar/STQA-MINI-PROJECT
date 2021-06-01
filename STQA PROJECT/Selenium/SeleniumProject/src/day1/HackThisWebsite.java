package day1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HackThisWebsite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.hackthissite.org/");
		driver.manage().window().maximize();

		
		
		// declaration and instantiation of objects/variables
		// Title test Case
		String actualTitle = driver.getTitle();
		String expectedTitle = "HackThisSite";

		if (actualTitle.equals(expectedTitle))
			System.out.println("Title Match");
		else
			System.out.println("Please check the title of the page");

		Thread.sleep(1000);

		
		
		
		//Register Page
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/a")).click();

		WebElement usernameRegister = driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/div[4]/div[1]/div/input"));
		WebElement passwordRegister = driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/div[4]/div[2]/div/input"));
		WebElement passwordRegisterConfirm = driver.findElement(By.name("password2"));
		WebElement secretQuestionRegister = driver.findElement(By.name("question"));
		WebElement secretAnswer = driver.findElement(By.name("answer"));
		WebElement secretAnswerConfirm = driver.findElement(By.name("answer2"));
		WebElement emailAddress = driver.findElement(By.name("email"));
		WebElement emailAddressConfirm = driver.findElement(By.name("email2"));
		WebElement termsOfServices = driver.findElement(By.id("agree"));

		usernameRegister.sendKeys("asdfgh5765a");
		passwordRegister.sendKeys("ABcde1234567890");
		passwordRegisterConfirm.sendKeys("ABcde1234567890");
		secretQuestionRegister.sendKeys("How are you ?");
		secretAnswer.sendKeys("I am good");
		secretAnswerConfirm.sendKeys("I am good");
		emailAddress.sendKeys("bivafid179@liaphoto.com");
		emailAddressConfirm.sendKeys("bivafid179@liaphoto.com");
		termsOfServices.click();

		String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		// Type the entered captcha to the text box
		driver.findElement(By.name("validation")).sendKeys(captchaVal);

		driver.findElement(By.name("submit")).click();

		
		Thread.sleep(1000);
		
		
		
		//Forget Password

		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/a[2]")).click();

		String actualForgetPasswordUrl = "https://www.hackthissite.org/user/resetpass";
		String expectedForgetPasswordUrl = driver.getCurrentUrl();

		if (actualForgetPasswordUrl.equalsIgnoreCase(expectedForgetPasswordUrl)) {
			System.out.println("ForgetPassword is reached");

			WebElement usernameForgetPassword = driver.findElement(
					By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/form/input"));
			WebElement submit = driver.findElement(By
					.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/form/div/input"));
			usernameForgetPassword.sendKeys("qwert_1234");
			submit.click();

			String expectedContent = "Email successfully sent";
			String actualContent = driver
					.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/center/div/div[1]"))
					.getText();

			if (actualContent.equalsIgnoreCase(expectedContent)) {
				System.out.println("Email Successfully sent ");
			} else {
				System.out.println("Invalid Username");
			}

		} else {
			System.out.println("ForgetPassword Test failed");
		}
		
		
		Thread.sleep(1000);
	
		
		// FORGET USERNAME INVALID
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/a[3]")).click();
		WebElement forgetUsername1 = driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td[2]/input"));
		forgetUsername1.sendKeys("haxojop978@mmgaklan");
		String captchaValForgetUsername1 = JOptionPane.showInputDialog("Please enter the captcha value:");
		// Type the entered captcha to the text box
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input"))
				.sendKeys(captchaValForgetUsername1);

		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[4]/td/input"))
				.click();

		String error = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div"))
				.getText();

		if (!error.isEmpty()) {
			if(error.equalsIgnoreCase("You cannot leave the email field blank ")||error.equalsIgnoreCase("That's not a valid email address"))
				System.out.println("Please Enter Correct Email ID");
			else
			{
				System.out.println("You must complete the captcha");
			}
		}
		
		
		Thread.sleep(1000);


		//////////////////////////////////////////////////////////////////////////
		
		// Forget username VALID

		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/a[3]")).click();
		WebElement forgetUsername = driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td[2]/input"));
		forgetUsername.sendKeys("dodoha9810@cocyo.com");
		String captchaValForgetUsername = JOptionPane.showInputDialog("Please enter the captcha value:");
		// Type the entered captcha to the text box
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input"))
				.sendKeys(captchaValForgetUsername);

		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[4]/td/input"))
				.click();
		
		
		
		Thread.sleep(1000);
		// LOGIN Process INVALID

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("btn_submit"));
		username.sendKeys("xyz@gmail.com");
		password.sendKeys("password");
		login.click();

		String actualUrl = "https://www.hackthissite.org/";
		String expectedUrl = driver.getCurrentUrl();

		if (!actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Login Test Pass");
			driver.navigate().to("https://www.hackthissite.org/");
			
		} else {
			System.out.println("Login Test failed");
		}

		
		Thread.sleep(1000);
		

		//LOGIN PROCESS Valid
		//driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/span/a")).click();
		WebElement username1 = driver.findElement(By.name("username"));
		WebElement password1 = driver.findElement(By.name("password"));
		WebElement login1 = driver.findElement(By.name("btn_submit"));
		username1.sendKeys("qwert_1234567890");
		password1.sendKeys("Qwert@1234567890");
		login1.click();

		String actualUrl1 = "https://www.hackthissite.org/";
		String expectedUrl1 = driver.getCurrentUrl();

		if (actualUrl1.equalsIgnoreCase(expectedUrl1)) {
			System.out.println("Login Test Pass");
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/a[3]")).click();
		} else {
			System.out.println("Login Test failed");
		}
		
		
		Thread.sleep(1000);
		// Click on the Support hackthissite Advertisement with us.

		driver.findElement(By.xpath("/html/body/div[2]/a[2]/img[1]")).click();
	
		String actualTitleOfAdvertisement = driver.getTitle();
		String expectedTitleOfAdvertisement = "HackThisSite";

		if (actualTitleOfAdvertisement.equals(expectedTitleOfAdvertisement)) {
			System.out.println("Successfully navigate to the advertisement");
		} else
			System.out.println("Test case Failed");


		
		Thread.sleep(1000);
		// Register Page
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/form/div/p[3]/input"))
				.click();

		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div/div/a[1]")).click();

		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "HackThisSite :: Register";

		if (actualTitle1.equals(expectedTitle1)) {
			System.out.println("In registration page");
		} else
			System.out.println("Not in registration page");

		

		
		Thread.sleep(1000);
		
		
		// Tor
		driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click();

		String actualUrlOfTor = "http://hackthisjogneh42n5o7gbzrewxee3vyu6ex37ukyvdw6jm66npakiyd.onion/";
		String expectedUrlOfTor = driver.getCurrentUrl();

		if (actualUrlOfTor.equalsIgnoreCase(expectedUrlOfTor)) {
			System.out.println("Tor.Onion is not reached");
			driver.navigate().back();
		} else {
			System.out.println("Test failed");
		}

		Thread.sleep(1000);

		
		
		// Discord
		driver.findElement(By.xpath("/html/body/div[1]/a[4]")).click();

		String actualUrlOfDiscord = "https://discord.com/invite/khEkhgJ";
		// System.out.println(driver.getCurrentUrl());

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		String expectedUrlOfDiscord = driver.switchTo().window(tabs2.get(1)).getCurrentUrl();
		// System.out.println(expectedUrlOfDiscord);
		driver.close();
		driver.switchTo().window(tabs2.get(0));

		if (actualUrlOfDiscord.equalsIgnoreCase(expectedUrlOfDiscord)) {
			System.out.println("Discord is reached");
			// driver.navigate().to("https://www.hackthissite.org/");
		} else {
			System.out.println("Discord Test failed");
		}

		Thread.sleep(1000);
		
		
		// Forum
		driver.findElement(By.xpath("/html/body/div[1]/a[5]")).click();

		String actualUrlOfForum = "https://www.hackthissite.org/forums/";
		String expectedUrlOfForum = driver.getCurrentUrl();

		if (actualUrlOfForum.equalsIgnoreCase(expectedUrlOfForum)) {
			System.out.println("Forum is reached");
			driver.navigate().to("https://www.hackthissite.org/");
		} else {
			System.out.println("Forum Test failed");
		}

		Thread.sleep(1000);

		
		
		// Store
		driver.findElement(By.xpath("/html/body/div[1]/a[6]")).click();

		String actualUrlOfStore = "https://www.cafepress.com/htsstore";
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		String expectedUrlOfStore = driver.switchTo().window(tabs3.get(1)).getCurrentUrl();

		driver.close();
		driver.switchTo().window(tabs3.get(0));

		if (actualUrlOfStore.equalsIgnoreCase(expectedUrlOfStore)) {
			System.out.println("Store is reached");
			driver.navigate().to("https://www.hackthissite.org/");
		} else {
			System.out.println("Store Test failed");
		}

		Thread.sleep(1000);
		
		

		// UrlShorterner

		driver.findElement(By.xpath("/html/body/div[1]/a[7]")).click();

		String actualUrlOfUrlShort = "https://hts.io/";
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		String expectedUrlOfUrlShort = driver.switchTo().window(tabs4.get(1)).getCurrentUrl();

		driver.close();
		driver.switchTo().window(tabs4.get(0));

		if (actualUrlOfUrlShort.equalsIgnoreCase(expectedUrlOfUrlShort)) {
			System.out.println("UrlShort is reached");
			driver.navigate().to("https://www.hackthissite.org/");
		} else {
			System.out.println("UrlShort Test failed");
		}

		Thread.sleep(1000);

	
		
		// CryptoPaste
		driver.findElement(By.xpath("/html/body/div[1]/a[8]")).click();

		String actualUrlOfUrlCrypto = "https://cryptopaste.org/";
		ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		String expectedUrlOfUrlCrypto = driver.switchTo().window(tabs5.get(1)).getCurrentUrl();
		driver.close();
		driver.switchTo().window(tabs4.get(0));

		if (actualUrlOfUrlCrypto.equalsIgnoreCase(expectedUrlOfUrlCrypto)) {
			System.out.println("CryptoPaste is reached");
			driver.navigate().to("https://www.hackthissite.org/");
		} else {
			System.out.println("CryptoPaste Test failed");
		}
	
		driver.close();
		driver.quit();
	}

}
