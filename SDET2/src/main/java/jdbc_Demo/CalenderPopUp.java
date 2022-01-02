package jdbc_Demo;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderPopUp {

	@Test//(dataProvider = "getVAlues")
	public void testCity1() throws InterruptedException {

		//System.out.println(src + "   " + dest);

		Date d1 = new Date();
		String todaysDate = d1.toString();
		String[] arr = todaysDate.split(" ");
		
		String day=arr[0];
		String month = arr[1];
		String date=arr[2];
		String year = arr[5];
		
		String currentdate=day+" "+month+" "+date+" "+year;

		System.out.println(currentdate);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("fromCity")).click();

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='HYD']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("BOM");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='BOM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@aria-label='"+currentdate+"']")).click();

	}
//	@DataProvider
//	public Object getVAlues() throws EncryptedDocumentException, IOException {
//
//		excelfileutile excel = new excelfileutile();
//
//		
//		
//		int lastrow=excel.getLastRow("Sheet3");
//
//		Object arr [][]= new Object[lastrow+1][2];
//
//		for (int i = 0; i <= lastrow; i++) 
//		{
//			arr[i][0]=excel.readDataExcel("Sheet3", i, 0);
//			arr[i][1]=excel.readDataExcel("Sheet3", i, 1);
//			
//		}
//		return arr;

}
