package com.generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constants;
import com.util.HighLighter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLogin {

	public void getLogin() {
		// open any browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// upcasting
		SeleniumPageFactory pf = new SeleniumPageFactory(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// go to application URL
		driver.navigate().to(Constants.URL);
		// put user= Explicit wait = webDriver wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(pf.getUser()));
		HighLighter.getColor(driver, pf.getUser(), "red");
		pf.getUser().click();
		pf.getUser().sendKeys(Constants.user);
		// put password
		HighLighter.getColor(driver, pf.getPassword(), "green");
		pf.getPassword().click();
		pf.getPassword().sendKeys(Constants.password);
		// login button click
		HighLighter.getColor(driver, pf.getLoginBtn(), "black");
		pf.getLoginBtn().click();
		// validate login==> with java(if else condition )>> Best = Testng(Assert)
		HighLighter.getColor(driver, pf.getDashboard(), "white");
		boolean loginStatus = pf.getDashboard().isDisplayed();
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(loginStatus);
		sf.assertAll();

	}
}