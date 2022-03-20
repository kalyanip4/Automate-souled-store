package Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Base_Test;

public class Functionality_Test extends Base_Test{

	@Test(priority = 1)
	public void clickingFromWomenOption()
	{
		driver.findElement(By.xpath("//div[@class='nav-link dropdown-toggle pointer' and contains(text(),'Women')]")).click();
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='submenu mb-2 subcategories-margin']//li"));
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i).getText().equalsIgnoreCase(" Women's T-Shirts "))
			{
				list1.get(i).click();
			}
		}
		
	}
	
	@Test(priority = 2)
	public void selectingFilter()
	{
		driver.findElement(By.xpath("(//div[@class='customcheckbox']//label[@class='d-flex align-items-center label-wrapper']//span[contains(text(),'Women T-Shirts')])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"listing-wrapper\"]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[1]/button")).click();
	}
}
