package Farm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;  
//import org.openqa.selenium.remote.DesiredCapabilities;  

public class Farm_Bureau {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Adani_software\\chromedriver-win32_125\\chromedriver.exe");
//	    DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
//	    capabilities.setCapability("marionette",true);  
//	    WebDriver driver= new FirefoxDriver(capabilities);  
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://axiomuat.tyger.in/onboard-backoffice");
//		driver.get("https://axiomuat.tyger.in/origination-app/Applications/Queue/Open");
//		driver.get("https://axiomuat.tyger.in/onboard-backoffice/FarmLoanApplicationStep/StepUpdateStakeHolder/294316?sid=563860");
		Thread.sleep(1000);

		//Login Page
		driver.findElement(By.xpath("//input[@id='_username']")).sendKeys(new String[]{"60013100@tyger.in"});		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(new String[] {"Admin@1234"});
////		driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[6]/div/div/input")).sendKeys(new String[] {"T"});
//		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
	
		driver.findElement(By.xpath("//button[@id=\"kt_aside_desktop_toggle\"]")).click();	
		
		//APPLICATION INFO
		driver.findElement(By.xpath("//span[text()='Farm Applications']")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"Name\"]")).sendKeys(new String[] {"Jayesh Shah"});
		driver.findElement(By.xpath("//input[@id=\"Mobile\"]")).sendKeys(new String[] {"7710899483"});
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(new String[] {"Test@gmail.com"});
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		
		//APPLICANT DETAILS  
        WebElement DROP8 = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
		Thread.sleep(500);
		Select s8=new Select(DROP8);
		s8.selectByVisibleText("PAN");
		driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"AYIPT6390G"});
		Thread.sleep(100);
        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click(); 
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
        Thread.sleep(2000);
        WebElement Drop9 = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
       	Thread.sleep(1000);
      	Select s9=new Select(Drop9);
      	s9.selectByVisibleText("Voter ID");
      	Thread.sleep(5000);
      	driver.findElement(By.id("AddressProof_Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
      	Thread.sleep(3000);  	 
      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
      	Thread.sleep(1000);
      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
      	Thread.sleep(1000);    	
      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
      	Thread.sleep(1000);    	
      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
    	Thread.sleep(1000);   	
    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
    	Thread.sleep(4000);				  
		driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"Narayan"});
		Thread.sleep(1000);
//		driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Vijay"});
//		Thread.sleep(1000);
		driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"Teli"});
		Thread.sleep(1000);
		driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Vijay"});
		Thread.sleep(1000);
		driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Vishnu"});
		Thread.sleep(1000);
 
		driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Sakpal"});
		Thread.sleep(1000);
		driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Shobhana"});
		Thread.sleep(1000);
		driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Vijay"});
		Thread.sleep(1000);
		driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Sakpal"});
		Thread.sleep(1000);
		driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"19-April-1992"});
		Thread.sleep(1000);
 
		
		WebElement DROP11 = driver.findElement(By.id("Customer_Gender"));
		Thread.sleep(1000);
		Select s11=new Select(DROP11);
		s11.selectByIndex(2);
 
		driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"At-Ambadi"});
		Thread.sleep(100);
		driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
		Thread.sleep(100);
        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
		Thread.sleep(1000);
 
		WebElement DROP12 = driver.findElement(By.name("CurrentAddress.District"));
		Thread.sleep(2000);
		Select s12=new Select(DROP12);
		s12.selectByVisibleText("AHMEDABAD");
		Thread.sleep(2000);
 
		WebElement DROP13 = driver.findElement(By.name("CurrentAddress.AddressLine3"));
		Thread.sleep(1000);
		Select s13=new Select(DROP13);
		s13.selectByVisibleText("Ahmadabad City");
		Thread.sleep(2000);
 
		WebElement DROP14 = driver.findElement(By.name("CurrentAddress.Village"));
		Thread.sleep(1000);
		Select s14=new Select(DROP14);
		s14.selectByVisibleText("Bhadaj");
		Thread.sleep(2000);
 
		driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
 
		WebElement DROP15 = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
		Thread.sleep(1000);
		Select s15=new Select(DROP15);
		s15.selectByVisibleText("Owned");
 
		driver.findElement(By.id("IsSameAsCurrentAddress")).click();
		Thread.sleep(2000);
 
		driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"9220771150"});
		Thread.sleep(1000);
		
		//Next stage
		driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		Thread.sleep(5000);	 
		
		
		//Co-applicant
		
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant1IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant1IDproof1=new Select(Coapplicant1IDproof);
				Coapplicant1IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"CVAPB3186M"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant1Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant1AddressproofID=new Select(Coapplicant1Addressproof);
		      	Coapplicant1AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"BoIVni"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"kumar"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant1Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant1GenderID=new Select(Coapplicant1Gender);
				Coapplicant1GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant1currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant1currentdistID=new Select(Coapplicant1currentdist);
				Coapplicant1currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant1currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant1currenttalukaID=new Select(Coapplicant1currenttaluka);
				Coapplicant1currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant1currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant1currentvillageID=new Select(Coapplicant1currentvillage);
				Coapplicant1currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant1Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant1ResidencetypeID=new Select(Coapplicant1Residencetype);
				Coapplicant1ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant2IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant2IDproof1=new Select(Coapplicant2IDproof);
				Coapplicant2IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"CNGPG4400D"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant2Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant2AddressproofID=new Select(Coapplicant2Addressproof);
		      	Coapplicant2AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"LAXMINARAYAN"});
				Thread.sleep(100);
//				driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
//				Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"GIRI"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant2Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant2GenderID=new Select(Coapplicant2Gender);
				Coapplicant2GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant2currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant2currentdistID=new Select(Coapplicant2currentdist);
				Coapplicant2currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant2currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant2currenttalukaID=new Select(Coapplicant2currenttaluka);
				Coapplicant2currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant2currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant2currentvillageID=new Select(Coapplicant2currentvillage);
				Coapplicant2currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant2Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant2ResidencetypeID=new Select(Coapplicant2Residencetype);
				Coapplicant2ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant3IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant3IDproof1=new Select(Coapplicant3IDproof);
				Coapplicant3IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"AIPPG7630M"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant3Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant3AddressproofID=new Select(Coapplicant3Addressproof);
		      	Coapplicant3AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"SRINIVASULU"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"GOLLA"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant3Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant3GenderID=new Select(Coapplicant3Gender);
				Coapplicant3GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant3currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant3currentdistID=new Select(Coapplicant3currentdist);
				Coapplicant3currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant3currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant3currenttalukaID=new Select(Coapplicant3currenttaluka);
				Coapplicant3currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant3currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant3currentvillageID=new Select(Coapplicant3currentvillage);
				Coapplicant3currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant3Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant3ResidencetypeID=new Select(Coapplicant3Residencetype);
				Coapplicant3ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant4IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant4IDproof1=new Select(Coapplicant4IDproof);
				Coapplicant4IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"FPJPM6402K"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant4Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant4AddressproofID=new Select(Coapplicant4Addressproof);
		      	Coapplicant4AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"VENKATA"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"DURGAPRASAD"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"MACHAVARAPU"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant4Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant4GenderID=new Select(Coapplicant4Gender);
				Coapplicant4GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant4currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant4currentdistID=new Select(Coapplicant4currentdist);
				Coapplicant4currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant4currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant4currenttalukaID=new Select(Coapplicant4currenttaluka);
				Coapplicant4currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant4currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant4currentvillageID=new Select(Coapplicant4currentvillage);
				Coapplicant4currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant4Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant4ResidencetypeID=new Select(Coapplicant4Residencetype);
				Coapplicant4ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant5IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant5IDproof1=new Select(Coapplicant5IDproof);
				Coapplicant5IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"ACGPV0877L"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant5Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant5AddressproofID=new Select(Coapplicant5Addressproof);
		      	Coapplicant5AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"DAYA"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"VALMIKI"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant5Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant5GenderID=new Select(Coapplicant5Gender);
				Coapplicant5GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant5currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant5currentdistID=new Select(Coapplicant5currentdist);
				Coapplicant5currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant5currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant5currenttalukaID=new Select(Coapplicant5currenttaluka);
				Coapplicant5currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant5currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant5currentvillageID=new Select(Coapplicant5currentvillage);
				Coapplicant5currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant5Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant5ResidencetypeID=new Select(Coapplicant5Residencetype);
				Coapplicant5ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant6IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant6IDproof1=new Select(Coapplicant6IDproof);
				Coapplicant6IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"BIEPN4943E"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant6Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant6AddressproofID=new Select(Coapplicant6Addressproof);
		      	Coapplicant6AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"NATBAJANIYA"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"CHAKABHAI"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant6Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant6GenderID=new Select(Coapplicant6Gender);
				Coapplicant6GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant6currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant6currentdistID=new Select(Coapplicant6currentdist);
				Coapplicant6currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant6currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant6currenttalukaID=new Select(Coapplicant6currenttaluka);
				Coapplicant6currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant6currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant6currentvillageID=new Select(Coapplicant6currentvillage);
				Coapplicant6currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant6Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant6ResidencetypeID=new Select(Coapplicant6Residencetype);
				Coapplicant6ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant7IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant7IDproof1=new Select(Coapplicant7IDproof);
				Coapplicant7IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"BKRPG0533N"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant7Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant7AddressproofID=new Select(Coapplicant7Addressproof);
		      	Coapplicant7AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"PERIKALA"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"MANIMALA"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant7Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant7GenderID=new Select(Coapplicant7Gender);
				Coapplicant7GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant7currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant7currentdistID=new Select(Coapplicant7currentdist);
				Coapplicant7currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant7currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant7currenttalukaID=new Select(Coapplicant7currenttaluka);
				Coapplicant7currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant7currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant7currentvillageID=new Select(Coapplicant7currentvillage);
				Coapplicant7currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant7Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant7ResidencetypeID=new Select(Coapplicant7Residencetype);
				Coapplicant7ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant8IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant8IDproof1=new Select(Coapplicant8IDproof);
				Coapplicant8IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"LUMPS2042F"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant8Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant8AddressproofID=new Select(Coapplicant8Addressproof);
		      	Coapplicant8AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"amin"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"shah"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant8Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant8GenderID=new Select(Coapplicant8Gender);
				Coapplicant8GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant8currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant8currentdistID=new Select(Coapplicant8currentdist);
				Coapplicant8currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant8currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant8currenttalukaID=new Select(Coapplicant8currenttaluka);
				Coapplicant8currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant8currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant8currentvillageID=new Select(Coapplicant8currentvillage);
				Coapplicant8currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant8Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant8ResidencetypeID=new Select(Coapplicant8Residencetype);
				Coapplicant8ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
		
		
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant9IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant9IDproof1=new Select(Coapplicant9IDproof);
				Coapplicant9IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"AYLPK9308A"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant9Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant9AddressproofID=new Select(Coapplicant9Addressproof);
		      	Coapplicant9AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"mukesh"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"kumar"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant9Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant9GenderID=new Select(Coapplicant9Gender);
				Coapplicant9GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant9currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant9currentdistID=new Select(Coapplicant9currentdist);
				Coapplicant9currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant9currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant9currenttalukaID=new Select(Coapplicant9currenttaluka);
				Coapplicant9currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant9currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant9currentvillageID=new Select(Coapplicant9currentvillage);
				Coapplicant9currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant9Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant9ResidencetypeID=new Select(Coapplicant9Residencetype);
				Coapplicant9ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant10IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant10IDproof1=new Select(Coapplicant10IDproof);
				Coapplicant10IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"CTVPC0667H"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant10Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant10AddressproofID=new Select(Coapplicant10Addressproof);
		      	Coapplicant10AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"CHANDRANNA"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"REPALLE"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant10Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant10GenderID=new Select(Coapplicant10Gender);
				Coapplicant10GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant10currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant10currentdistID=new Select(Coapplicant10currentdist);
				Coapplicant10currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant10currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant10currenttalukaID=new Select(Coapplicant10currenttaluka);
				Coapplicant10currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant10currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant10currentvillageID=new Select(Coapplicant10currentvillage);
				Coapplicant10currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant10Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant10ResidencetypeID=new Select(Coapplicant10Residencetype);
				Coapplicant10ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant11IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant11IDproof1=new Select(Coapplicant11IDproof);
				Coapplicant11IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"AHBPH8164L"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant11Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant11AddressproofID=new Select(Coapplicant11Addressproof);
		      	Coapplicant11AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"DHANRAJ"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"HADA"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant11Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant11GenderID=new Select(Coapplicant11Gender);
				Coapplicant11GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant11currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant11currentdistID=new Select(Coapplicant11currentdist);
				Coapplicant11currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant11currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant11currenttalukaID=new Select(Coapplicant11currenttaluka);
				Coapplicant11currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant11currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant11currentvillageID=new Select(Coapplicant11currentvillage);
				Coapplicant11currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant11Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant11ResidencetypeID=new Select(Coapplicant11Residencetype);
				Coapplicant11ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant12IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant12IDproof1=new Select(Coapplicant12IDproof);
				Coapplicant12IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"CVAPB3186M"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant12Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant12AddressproofID=new Select(Coapplicant12Addressproof);
		      	Coapplicant12AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"BoIVni"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"kumar"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant12Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant12GenderID=new Select(Coapplicant12Gender);
				Coapplicant12GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant12currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant12currentdistID=new Select(Coapplicant12currentdist);
				Coapplicant12currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant12currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant12currenttalukaID=new Select(Coapplicant12currenttaluka);
				Coapplicant12currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant12currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant12currentvillageID=new Select(Coapplicant12currentvillage);
				Coapplicant12currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant12Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant12ResidencetypeID=new Select(Coapplicant12Residencetype);
				Coapplicant12ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant13IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant13IDproof1=new Select(Coapplicant13IDproof);
				Coapplicant13IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"CPRPB4090M"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant13Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant13AddressproofID=new Select(Coapplicant13Addressproof);
		      	Coapplicant13AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"BARLA"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"BABU"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"YADAV"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant13Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant13GenderID=new Select(Coapplicant13Gender);
				Coapplicant13GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant13currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant13currentdistID=new Select(Coapplicant13currentdist);
				Coapplicant13currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant13currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant13currenttalukaID=new Select(Coapplicant13currenttaluka);
				Coapplicant13currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant13currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant13currentvillageID=new Select(Coapplicant13currentvillage);
				Coapplicant13currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant13Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant13ResidencetypeID=new Select(Coapplicant13Residencetype);
				Coapplicant13ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant14IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant14IDproof1=new Select(Coapplicant14IDproof);
				Coapplicant14IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"FPJPM6402K"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant14Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant14AddressproofID=new Select(Coapplicant14Addressproof);
		      	Coapplicant14AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"VENKATA"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"DURGAPRASAD"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"MACHAVARAPU"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant14Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant14GenderID=new Select(Coapplicant14Gender);
				Coapplicant14GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant14currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant14currentdistID=new Select(Coapplicant14currentdist);
				Coapplicant14currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant14currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant14currenttalukaID=new Select(Coapplicant14currenttaluka);
				Coapplicant14currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant14currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant14currentvillageID=new Select(Coapplicant14currentvillage);
				Coapplicant14currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant14Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant14ResidencetypeID=new Select(Coapplicant14Residencetype);
				Coapplicant14ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant15IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant15IDproof1=new Select(Coapplicant15IDproof);
				Coapplicant15IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"FDAPK4858L"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant15Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant15AddressproofID=new Select(Coapplicant15Addressproof);
		      	Coapplicant15AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"AYUB"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"KHAN"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant15Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant15GenderID=new Select(Coapplicant15Gender);
				Coapplicant15GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant15currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant15currentdistID=new Select(Coapplicant15currentdist);
				Coapplicant15currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant15currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant15currenttalukaID=new Select(Coapplicant15currenttaluka);
				Coapplicant15currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant15currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant15currentvillageID=new Select(Coapplicant15currentvillage);
				Coapplicant15currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant15Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant15ResidencetypeID=new Select(Coapplicant15Residencetype);
				Coapplicant15ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant16IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant16IDproof1=new Select(Coapplicant16IDproof);
				Coapplicant16IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"APOPP1070J"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant16Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant16AddressproofID=new Select(Coapplicant16Addressproof);
		      	Coapplicant16AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"pallpu"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"Rajender"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant16Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant16GenderID=new Select(Coapplicant16Gender);
				Coapplicant16GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant16currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant16currentdistID=new Select(Coapplicant16currentdist);
				Coapplicant16currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant16currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant16currenttalukaID=new Select(Coapplicant16currenttaluka);
				Coapplicant16currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant16currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant16currentvillageID=new Select(Coapplicant16currentvillage);
				Coapplicant16currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant16Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant16ResidencetypeID=new Select(Coapplicant16Residencetype);
				Coapplicant16ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant17IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant17IDproof1=new Select(Coapplicant17IDproof);
				Coapplicant17IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"ACUPV8794J"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant17Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant17AddressproofID=new Select(Coapplicant17Addressproof);
		      	Coapplicant17AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"shyam"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"vaishnav"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant17Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant17GenderID=new Select(Coapplicant17Gender);
				Coapplicant17GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant17currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant17currentdistID=new Select(Coapplicant17currentdist);
				Coapplicant17currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant17currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant17currenttalukaID=new Select(Coapplicant17currenttaluka);
				Coapplicant17currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant17currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant17currentvillageID=new Select(Coapplicant17currentvillage);
				Coapplicant17currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant17Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant17ResidencetypeID=new Select(Coapplicant17Residencetype);
				Coapplicant17ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant18IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant18IDproof1=new Select(Coapplicant18IDproof);
				Coapplicant18IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"CYYPD9934L"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant18Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant18AddressproofID=new Select(Coapplicant18Addressproof);
		      	Coapplicant18AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"DAMMAAIE"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"PRASHANTH"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant18Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant18GenderID=new Select(Coapplicant18Gender);
				Coapplicant18GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant18currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant18currentdistID=new Select(Coapplicant18currentdist);
				Coapplicant18currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant18currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant18currenttalukaID=new Select(Coapplicant18currenttaluka);
				Coapplicant18currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant18currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant18currentvillageID=new Select(Coapplicant18currentvillage);
				Coapplicant18currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant18Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant18ResidencetypeID=new Select(Coapplicant18Residencetype);
				Coapplicant18ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant19IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant19IDproof1=new Select(Coapplicant19IDproof);
				Coapplicant19IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"BBAPV8589D"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant19Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant19AddressproofID=new Select(Coapplicant19Addressproof);
		      	Coapplicant19AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"Vijay"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"kumar"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"Vishwakarma"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant19Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant19GenderID=new Select(Coapplicant19Gender);
				Coapplicant19GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant19currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant19currentdistID=new Select(Coapplicant19currentdist);
				Coapplicant19currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant19currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant19currenttalukaID=new Select(Coapplicant19currenttaluka);
				Coapplicant19currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant19currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant19currentvillageID=new Select(Coapplicant19currentvillage);
				Coapplicant19currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant19Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant19ResidencetypeID=new Select(Coapplicant19Residencetype);
				Coapplicant19ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant20IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant20IDproof1=new Select(Coapplicant20IDproof);
				Coapplicant20IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"AYGPJ1655C"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant20Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant20AddressproofID=new Select(Coapplicant20Addressproof);
		      	Coapplicant20AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"Jasavant"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"HARIJAN"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant20Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant20GenderID=new Select(Coapplicant20Gender);
				Coapplicant20GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant20currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant20currentdistID=new Select(Coapplicant20currentdist);
				Coapplicant20currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant20currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant20currenttalukaID=new Select(Coapplicant20currenttaluka);
				Coapplicant20currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant20currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant20currentvillageID=new Select(Coapplicant20currentvillage);
				Coapplicant20currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant20Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant20ResidencetypeID=new Select(Coapplicant20Residencetype);
				Coapplicant20ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement Coapplicant21IDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select Coapplicant21IDproof1=new Select(Coapplicant21IDproof);
				Coapplicant21IDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"CVAPB3186M"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(6000);
		        WebElement Coapplicant21Addressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select Coapplicant21AddressproofID=new Select(Coapplicant21Addressproof);
		      	Coapplicant21AddressproofID.selectByVisibleText("Voter ID");
		      	Thread.sleep(500);
		      	driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
		      	Thread.sleep(1000);  	 
		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
		      	Thread.sleep(1000);    	
		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		    	Thread.sleep(1000);   	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
		    	Thread.sleep(6000);				  

				driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"BoIVni"});
				Thread.sleep(100);
				//driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
				//Thread.sleep(100);
				driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"kumar"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Fatherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Fathermiddle"});
				Thread.sleep(100);
		 
				driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"Fatherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Motherfirst"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Mothermiddle"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Motherlast"});
				Thread.sleep(100);
				driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
		 
				WebElement Coapplicant21Gender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select Coapplicant21GenderID=new Select(Coapplicant21Gender);
				Coapplicant21GenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Coapplicant21currentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select Coapplicant21currentdistID=new Select(Coapplicant21currentdist);
				Coapplicant21currentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Coapplicant21currenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select Coapplicant21currenttalukaID=new Select(Coapplicant21currenttaluka);
				Coapplicant21currenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Coapplicant21currentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select Coapplicant21currentvillageID=new Select(Coapplicant21currentvillage);
				Coapplicant21currentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement Coapplicant21Residencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select Coapplicant21ResidencetypeID=new Select(Coapplicant21Residencetype);
				Coapplicant21ResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
				Thread.sleep(500);
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(5000);	

	}		  
	}
 
 
 