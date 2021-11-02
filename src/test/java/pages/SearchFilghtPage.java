package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFilghtPage
{
	WebDriver driver;
	//WebDriverWait wait;

	By radio_round_trip=By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[2]/div[1]//*[name()='svg']//*[name()='circle' and contains(@cx,'9')]");	

	By From_action_btn=By.xpath("//div[contains(text(),'From')]");
	By From_location_btn=By.xpath("//div[starts-with(text(),'Delhi')]");
	By desti_To_btn=By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']/div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div[3]/div[1]/div[2]/input[1]");

	By desti_loc_btn=By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'][contains(text(),'Agartala')]");
	By departure_dt_select=By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']");
	By return_dt_select=By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n r-19h5ruw r-136ojw6']/div[@style='flex: 1 1 0%;']/div[@class='css-1dbjc4n r-1niwhzg r-z2wwpe r-17b9qp5 r-1g94qm0 r-h3f8nf r-u8s1d r-u3yave r-8fdsdq']/div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-rs99b7 r-6koalj r-eqz5dr r-1pi2tsx r-pm9dpa r-1knelpx r-13qz1uu']/div[@class='css-1dbjc4n r-1euycsn']/div[@class='css-1dbjc4n r-150rngu r-18u37iz r-16y2uox r-1wbh5a2 r-lltvgl r-buy8e9 r-1sncvnh']/div[@class='css-1dbjc4n r-18u37iz']/div[3]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]");
	By passenger_btn=By.xpath("//*[contains(text(),'Passengers')]");
	By adultsel_btn=By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div[@class='css-1dbjc4n']/div/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-u8s1d r-13qz1uu r-8fdsdq']/div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']/div[1]/div[2]/div[3]/*[1]");


	By currency_btn=By.xpath("//*[contains(text(),'Currency')]");
	By gbp_currency_select=By.xpath("//*[starts-with(text(),'GBP')]");
	By stud_radio_btn=By.xpath("//*[contains(text(),'Students')]");
	By search_flight_btn=By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-1w50u8q.r-ah5dr5.r-1otgn73");


	public SearchFilghtPage(WebDriver driver)
	{
		this.driver=driver;
	}

	/*public void clickroundtrip()
	{
		driver.findElement(radio_round_trip).click();
	}*/

	public void clickfromaction()
	{
		driver.findElement(From_action_btn).click();
	}

	public void selectfromloc()
	{
		driver.findElement(From_location_btn).click();
	}

	public void clickdestto()
	{
		driver.findElement(desti_To_btn).click();
	}


	public void destitoloc()
	{
		driver.findElement(desti_loc_btn).click();
	}

	public void departdt()
	{
		driver.findElement(departure_dt_select).click();
	}

	public void returndt()
	{
		driver.findElement(return_dt_select).click();
	}
	public void clickcurrencybtn()
	{
		driver.findElement(currency_btn).click();
	}

	public void gbpcurrencysel()
	{
		driver.findElement(gbp_currency_select).click();
	}

	public void studbtn()
	{
		driver.findElement(stud_radio_btn).click();
	}

	public void searchflightbtn()
	{
		driver.findElement(search_flight_btn).click();
	}

	public void explicitWaitRadiobutton() throws Exception
	{
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(radio_round_trip)).click();

	}
















}
