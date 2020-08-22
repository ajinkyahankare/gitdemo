package Sel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		
	 Options opt = driver.manage();
	 Window win = opt.window();
	 win.maximize();
		
		
		//driver.manage().window().maximize();
		driver.navigate().to("http://www.sinhgad.edu");
		String b = driver.getTitle();			
		System.out.println(b);
		
	}

}
