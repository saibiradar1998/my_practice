package com.RedBus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
;

public class HomePage {
	
	@Test/*(dataProvider="Browserlaunch")*/
	/*public void test1(Object src,Object desti,Object Date) throws InterruptedException {*/
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainath\\workspace\\Slenium March22\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("//*[@id=\"src\"]"));
		source.sendKeys("Bidar");
		act.moveToElement(source).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Bidar");
		act.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Bangalore");
		String date=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
		
		/*while(true){
			if(date.equals(Date))
			 break;
		 else
	driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();*/
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
	}	
	
	/*@DataProvider
	public Object[]
		Browserlaunch() throws InterruptedException, IOException {
	
	CSVReader read=new CSVReader(new FileReader("D:\\project\\RedBus\\test data\\test.csv"));
	Object[] a=read.readNext();
	Object[][] b=new Object[4][2];
	
	System.out.println(a.length);
	String x=a[2].toString();
	Object[] Zx=x.split("-");
	System.out.println(Zx.length);
	return Zx;*/
	

}
