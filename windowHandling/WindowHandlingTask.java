package Hello;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingTask {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
        driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();

		String parentwindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles(); 
		List<String> newWindow = new ArrayList<String>(windowHandles);

		driver.switchTo().window(newWindow.get(1));
		driver.findElement(By.xpath("//a[text()='12618']")).click();
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> newWindow1 = new ArrayList<String>(windowHandles1);

		driver.switchTo().window(newWindow1.get(1));
		driver.findElement(By.xpath("//a[text()='12619']")).click();
		driver.switchTo().window(newWindow1.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
String title = driver.getTitle();
System.out.println(title);
	}	 
}
