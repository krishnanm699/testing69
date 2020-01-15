package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		WebElement buttonlogin = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		flash(buttonlogin, driver);// highlight the element
		drawborder(buttonlogin, driver);// draw a border

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Scrrenshot/javascript.png"));
		// generateAlerer(driver, "error in login button");//generate Alert
		// clickelement(buttonlogin, driver);//click on any element by using JS executor
		// driver.navigate().refresh();
		refreshbrowser(driver);
		// get the tile of the page
		System.out.println(getTiltle(driver));
		System.out.println(getinnertext(driver));
		// scrollPageDown(driver);
		WebElement downpage = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		scrollIntoView(downpage, driver);
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 21; i++) {
			changecolor("rgb(0,200,0)", element, driver);
			changecolor(bgcolor, element, driver);

		}
	}

	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
	}

	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border ='3px solid red'", element);
	}

	public static void generateAlerer(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickelement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static void refreshbrowser(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static String getTiltle(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title").toString();
		return title;
	}

	public static String getinnertext(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String ineettextdetails = js.executeScript("return document.documentElement.innerText").toString();
		return ineettextdetails;
	}

	public static void scrollPageDown(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}