import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Mini_project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Testing\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.bankofamerica.com/");
		d.manage().window().maximize();
	
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) d;
		Actions a=new Actions(d);
		Thread.sleep(1000);
		
		WebElement e=d.findElement(By.id("navSavings"));
		e.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		
		Thread.sleep(1000); 
		WebElement f=d.findElement(By.id("NAV_SECURITY"));
		f.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		WebElement g=d.findElement(By.id("reviewScamAlert"));
		g.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		
		String text = d.findElement(By.xpath("//*[@id=\"reviewScamModule\"]/div/div[2]/h3")).getText();
		System.out.println(text);
		System.out.println("--------------------");
		String textex = d.findElement(By.xpath("//*[@id=\"reviewScamModule\"]/div/div[2]/ul")).getText();
		System.out.println(textex);
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-400)");
		d.findElement(By.xpath("//*[@id=\"globalNavModule\"]/header/div[2]/div[1]/div/a/img")).click(); 
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"NAV_CONTACT_US\"]")).click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		
		String print=d.findElement(By.xpath("//*[@id=\"connectSocialMediaModule\"]/section/div/div[2]")).getText();
		System.out.println("-----------------");
		System.out.println(print);
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"globalNavModule\"]/header/div[2]/div[1]/div/a/img")).click();
		Thread.sleep(1000); 
		d.findElement(By.id("NAV_ABOUT_US")).click();
		Thread.sleep(1000);
		
		WebElement ourCom=d.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/nav/ul/li[1]"));
		a.moveToElement(ourCom).build().perform();
		Thread.sleep(1000);
		WebElement offer=d.findElement(By.linkText("What we offer"));
		Thread.sleep(2000);
		offer.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(1000);
		
		d.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/div/a[2]/img")).click();
		Thread.sleep(5000);
		d.quit();
	}

}
