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

public class Farm_Preowned {

	public static void main(String[] args) throws InterruptedException, AWTException {

		
		System.setProperty("webdriver.chrome.driver","D:\\Adani_software\\chromedriver-win32_125\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://axiomuat.adanicapital.in/onboard/backoffice");
//		driver.get("https://axiomuat.adanicapital.in/onboard/backoffice/FarmLoanApplicationStep/StepValidation/119197");
		Thread.sleep(500);
		
		
		//Login Page
		driver.findElement(By.xpath("//input[@id='_username']")).sendKeys(new String[]{"Chinmay@adani.com"});		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(new String[] {"Admin@123"});
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[6]/div/div/input")).sendKeys(new String[] {"T"});
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[3]/div/button")).click();
		Thread.sleep(3000);
		
		//Re Login Page
				driver.findElement(By.xpath("//input[@id='_username']")).sendKeys(new String[]{"Chinmay@adani.com"});		
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(new String[] {"Admin@123"});
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[6]/div/div/input")).sendKeys(new String[] {"T"});
				
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
				Thread.sleep(5000);

		
		driver.findElement(By.xpath("//button[@id=\"kt_aside_desktop_toggle\"]")).click();	
	
		
		//Application Info
		
		
		driver.findElement(By.xpath("//span[text()='Farm Applications']")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"Name\"]")).sendKeys(new String[] {"Chinmay surve"});
		driver.findElement(By.xpath("//input[@id=\"Mobile\"]")).sendKeys(new String[] {"7020771150"});
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(new String[] {"Test@gmail.com"});
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		//APPLICANT DETAILS
		
	     WebElement DROP66 = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
		Thread.sleep(500);
		Select s66=new Select(DROP66);
		s66.selectByVisibleText("PAN");
		driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"BIQPN1602Q"});
		Thread.sleep(100);
			 
	    driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
	       
	    driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
	       
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
	       		 
	    WebElement Drop67 = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
	    Thread.sleep(3000);
	    Select s67=new Select(Drop67);
	      		 
	    s67.selectByVisibleText("Voter ID");
	    Thread.sleep(3000);
	      	
	    driver.findElement(By.name("AddressProof.Number")).sendKeys(new String[] {"BIQPN1602Q"});   	    
	    Thread.sleep(3000);  	 
	    driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
	    Thread.sleep(3000);    	
	    driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
	    Thread.sleep(3000);    	
	    driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	    Thread.sleep(3000);   	
	    driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
	    Thread.sleep(3000);
	    	
	    driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
	    Thread.sleep(4000);				  
	    	
	    	
			driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"Anmol"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"NAYAR"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_FatherFName")).sendKeys(new String[] {"Avinash"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_FatherMName")).sendKeys(new String[] {"Kashinath"});
			Thread.sleep(100);

			driver.findElement(By.id("Customer_FatherLName")).sendKeys(new String[] {"NAYAR"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_MotherFName")).sendKeys(new String[] {"Rekha"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_MotherMName")).sendKeys(new String[] {"Vitthal"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_MotherLName")).sendKeys(new String[] {"Borse"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
			Thread.sleep(100);

			WebElement DROP11 = driver.findElement(By.id("Customer_Gender"));
			Thread.sleep(3000);
			Select s11=new Select(DROP11);
			s11.selectByIndex(1);

			driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"At-Ambadi"});
			Thread.sleep(100);
			driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
			Thread.sleep(100);
	        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"412404"});
			Thread.sleep(3000);

			WebElement DROP12 = driver.findElement(By.name("CurrentAddress.District"));
			Thread.sleep(4000);
			Select s12=new Select(DROP12);
			s12.selectByVisibleText("PUNE");
			Thread.sleep(4000);

			WebElement DROP13 = driver.findElement(By.name("CurrentAddress.AddressLine3"));
			Thread.sleep(3000);
			Select s13=new Select(DROP13);
			s13.selectByVisibleText("Khed");
			Thread.sleep(4000);

			WebElement DROP14 = driver.findElement(By.name("CurrentAddress.Village"));
			Thread.sleep(3000);
			Select s14=new Select(DROP14);
			s14.selectByVisibleText("Devoshi");
			Thread.sleep(4000);

			driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});

			WebElement DROP15 = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
			Thread.sleep(3000);
			Select s15=new Select(DROP15);
			s15.selectByVisibleText("Owned");

			driver.findElement(By.id("IsSameAsCurrentAddress")).click();
			Thread.sleep(4000);

			driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
			Thread.sleep(5000);	 
			

			//CO APPLICANT
			driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]")).click();

			
			driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
			Thread.sleep(2000);
			
	        WebElement CoapplicantIDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
			Thread.sleep(100);
			Select CoapplicantIDproof1=new Select(CoapplicantIDproof);
			CoapplicantIDproof1.selectByVisibleText("PAN");
			driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"BIQPN1602Q"});
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
	        WebElement CoapplicantAddressproof = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
	       	Thread.sleep(1000);
	      	Select CoapplicantAddressproofID=new Select(CoapplicantAddressproof);
	      	CoapplicantAddressproofID.selectByVisibleText("Voter ID");
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

			driver.findElement(By.name("Customer.FirstName")).sendKeys(new String[] {"Jayesh"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_MiddleName")).sendKeys(new String[] {"Avinash"});
			Thread.sleep(100);
			driver.findElement(By.id("Customer_LastName")).sendKeys(new String[] {"Patill"});
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
	 
			WebElement CoapplicantGender = driver.findElement(By.id("Customer_Gender"));
			Thread.sleep(100);
			Select CoapplicantGenderID=new Select(CoapplicantGender);
			CoapplicantGenderID.selectByIndex(1);
	 
			driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
			Thread.sleep(100);
			driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
			Thread.sleep(100);
	        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
			Thread.sleep(100);
	 
			WebElement Coapplicantcurrentdist = driver.findElement(By.name("CurrentAddress.District"));
			Thread.sleep(500);
			Select CoapplicantcurrentdistID=new Select(Coapplicantcurrentdist);
			CoapplicantcurrentdistID.selectByVisibleText("AHMEDABAD");
			Thread.sleep(500);
	 
			WebElement Coapplicantcurrenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
			Thread.sleep(500);
			Select CoapplicantcurrenttalukaID=new Select(Coapplicantcurrenttaluka);
			CoapplicantcurrenttalukaID.selectByVisibleText("Ahmadabad City");
			Thread.sleep(500);
	 
			WebElement Coapplicantcurrentvillage = driver.findElement(By.name("CurrentAddress.Village"));
			Thread.sleep(500);
			Select CoapplicantcurrentvillageID=new Select(Coapplicantcurrentvillage);
			CoapplicantcurrentvillageID.selectByVisibleText("Bhadaj");
			Thread.sleep(500);
	 
			driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
	 
			WebElement CoapplicantResidencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
			Thread.sleep(500);
			Select CoapplicantResidencetypeID=new Select(CoapplicantResidencetype);
			CoapplicantResidencetypeID.selectByVisibleText("Owned");
	 
			driver.findElement(By.id("IsSameAsCurrentAddress")).click();
			Thread.sleep(500);
	 
			driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"7020771150"});
			Thread.sleep(500);
			
			//Next stage
			driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
			Thread.sleep(5000);	 
			driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
			Thread.sleep(2000);

		
		WebElement DROP1 = driver.findElement(By.id("VehicleTypeID"));
		Thread.sleep(100);
		Select s1=new Select(DROP1);
		s1.selectByIndex(3);
		Thread.sleep(100);

		WebElement DROP2 = driver.findElement(By.id("CustomerTypeID"));
		Thread.sleep(100);
		Select s2=new Select(DROP2);
		s2.selectByIndex(1);
		Thread.sleep(100);

		WebElement DROP3 = driver.findElement(By.id("CustomerProfessionID"));
		Thread.sleep(100);
		Select s3=new Select(DROP3);
		s3.selectByIndex(2);

		WebElement DROP5 = driver.findElement(By.name("ProductTypeID"));
		Thread.sleep(100);
		Select s5=new Select(DROP5);
		s5.selectByVisibleText("Pre Owned");

		WebElement DROP6 = driver.findElement(By.name("SchemeTypeID"));
		Thread.sleep(100);
		Select s6=new Select(DROP6);
		s6.selectByIndex(1);

		WebElement DROP8 = driver.findElement(By.id("PromotionalSchemeID"));
		Thread.sleep(100);
		Select s8=new Select(DROP8);
		s8.selectByIndex(2);

		WebElement DROP9 = driver.findElement(By.name("LeadSourceID"));
		Thread.sleep(100);
		Select s9=new Select(DROP9);
		s9.selectByIndex(1);
        Thread.sleep(100);

		driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		
		//BASIC DETAILS
		
		driver.findElement(By.xpath("//a[@id='basic-tab']")).click();	
		Thread.sleep(4000);	 
		driver.findElement(By.xpath("//i[@class='fa fa-pencil-alt mr-1']")).click();	
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		Thread.sleep(4000);
		 
		driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
   	    Thread.sleep(4000);
   	
   	    WebElement DROP16 = driver.findElement(By.name("CustomerAdditionalDetails.MaritalStatusID"));
		Thread.sleep(3000);
		Select s16=new Select(DROP16);
		s16.selectByVisibleText("Single");
		Thread.sleep(100);

		driver.findElement(By.id("CustomerAdditionalDetails_RelativeName")).sendKeys(new String[] {"Bhavesh"});
		Thread.sleep(500);

		WebElement DROP17 = driver.findElement(By.name("CustomerAdditionalDetails.EducationalQualificationID"));
		Thread.sleep(3000);
		Select s17=new Select(DROP17);
		s17.selectByVisibleText("Graduate");
		Thread.sleep(100);

		WebElement DROP18 = driver.findElement(By.name("CustomerAdditionalDetails.CommunicationLanguageID"));
		Thread.sleep(3000);
		Select s18=new Select(DROP18);
		s18.selectByVisibleText("Hindi");
		Thread.sleep(100);

		driver.findElement(By.name("CustomerAdditionalDetails.NumberOfDependents")).sendKeys(new String[] {"2"});
		Thread.sleep(200);

		driver.findElement(By.name("CustomerAdditionalDetails.NumberOfChildren")).sendKeys(new String[] {"2"});
		Thread.sleep(200);

		WebElement DROP19 = driver.findElement(By.name("CustomerAdditionalDetails.CasteID"));
		Thread.sleep(3000);
		Select s19=new Select(DROP19);
		s19.selectByVisibleText("General");
		Thread.sleep(100);

		WebElement DROP20 = driver.findElement(By.name("CustomerAdditionalDetails.ReligionID"));
		Thread.sleep(3000);
		Select s20=new Select(DROP20);
		s20.selectByVisibleText("Hindu");
		Thread.sleep(4000);
		  
		//ADDRESS TAB
		WebElement target = driver.findElement(By.xpath("//A[@id='address-tab']"));
		Actions s = new Actions(driver);
		s.moveToElement(target);
		s.click(target);
		s.build().perform();
		  
		driver.findElement(By.xpath("//input[@id='CurrentAddress_YearsInCurrentResidence']")).sendKeys("15");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='CurrentAddress_DistanceFromBranch']")).sendKeys("20");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='PermanentAddress_YearsInCurrentResidence']")).sendKeys("25");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='PermanentAddress_DistanceFromBranch']")).sendKeys("30");
		Thread.sleep(3000);
		
		//INCOME TAB
		WebElement target2 = driver.findElement(By.xpath("//a[@id='income-tab']"));
		Actions s222 = new Actions(driver);
		s222.moveToElement(target2);
		s222.click(target2);
		s222.build().perform();
		
		driver.findElement(By.xpath("//input[@id='ReferenceDetails1_Name']")).sendKeys("Akshay NAYAR");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ReferenceDetails1_Contact']")).sendKeys("7020771150");
		Thread.sleep(3000);	 
		driver.findElement(By.xpath("//input[@id='ReferenceDetails2_Name']")).sendKeys("Vikram NAYAR");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@id='ReferenceDetails2_Contact']")).sendKeys("8787898789");
		Thread.sleep(3000);
		
		
		//CONTACT TAB
		WebElement target1 = driver.findElement(By.xpath("//a[@id='contact-tab']"));
		Actions s111 = new Actions(driver);
		s111.moveToElement(target1);
		s111.click(target1);
		s111.build().perform();
		  
		WebElement DROP21 = driver.findElement(By.name("MobileNumberTypeID"));
		Thread.sleep(3000);
		Select s21=new Select(DROP21);
		s21.selectByValue("431");
		Thread.sleep(3000);
			  
		driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		Thread.sleep(6000);
		
		
		//Basic details co applicant
		
		driver.findElement(By.xpath("//a[@id='basic-tab']")).click();	
		Thread.sleep(4000);	 
		driver.findElement(By.xpath("//i[@class='fa fa-pencil-alt mr-1']")).click();	
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		Thread.sleep(4000);
		 
		driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
   	    Thread.sleep(4000);
   	
   	    WebElement DROP161 = driver.findElement(By.name("CustomerAdditionalDetails.MaritalStatusID"));
		Thread.sleep(3000);
		Select s161=new Select(DROP161);
		s161.selectByVisibleText("Single");
		Thread.sleep(100);

		driver.findElement(By.id("CustomerAdditionalDetails_RelativeName")).sendKeys(new String[] {"Bhavesh"});
		Thread.sleep(500);

		WebElement DROP171 = driver.findElement(By.name("CustomerAdditionalDetails.EducationalQualificationID"));
		Thread.sleep(3000);
		Select s171=new Select(DROP171);
		s171.selectByVisibleText("Graduate");
		Thread.sleep(100);

		WebElement DROP181 = driver.findElement(By.name("CustomerAdditionalDetails.CommunicationLanguageID"));
		Thread.sleep(3000);
		Select s181=new Select(DROP181);
		s181.selectByVisibleText("Hindi");
		Thread.sleep(100);

		driver.findElement(By.name("CustomerAdditionalDetails.NumberOfDependents")).sendKeys(new String[] {"2"});
		Thread.sleep(200);

		driver.findElement(By.name("CustomerAdditionalDetails.NumberOfChildren")).sendKeys(new String[] {"2"});
		Thread.sleep(200);

		WebElement DROP191 = driver.findElement(By.name("CustomerAdditionalDetails.CasteID"));
		Thread.sleep(3000);
		Select s191=new Select(DROP191);
		s191.selectByVisibleText("General");
		Thread.sleep(100);

		WebElement DROP201 = driver.findElement(By.name("CustomerAdditionalDetails.ReligionID"));
		Thread.sleep(3000);
		Select s201=new Select(DROP201);
		s201.selectByVisibleText("Hindu");
		Thread.sleep(4000);
		
		WebElement DROP202 = driver.findElement(By.name("CustomerAdditionalDetails.RelationshipWithApplicant"));
		Thread.sleep(3000);
		Select s202=new Select(DROP202);
		s202.selectByVisibleText("Brother");
		Thread.sleep(4000);
		  
		//ADDRESS TAB
		WebElement target109 = driver.findElement(By.xpath("//A[@id='address-tab']"));
		Actions s109 = new Actions(driver);
		s109.moveToElement(target109);
		s109.click(target109);
		s109.build().perform();
		  
		driver.findElement(By.xpath("//input[@id='CurrentAddress_YearsInCurrentResidence']")).sendKeys("15");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='CurrentAddress_DistanceFromBranch']")).sendKeys("20");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='PermanentAddress_YearsInCurrentResidence']")).sendKeys("25");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='PermanentAddress_DistanceFromBranch']")).sendKeys("30");
		Thread.sleep(3000);
		
		
		//CONTACT TAB
		WebElement target181 = driver.findElement(By.xpath("//a[@id='contact-tab']"));
		Actions s1811 = new Actions(driver);
		s1811.moveToElement(target181);
		s1811.click(target181);
		s1811.build().perform();
		  
		WebElement DROP212 = driver.findElement(By.name("MobileNumberTypeID"));
		Thread.sleep(3000);
		Select s212=new Select(DROP212);
		s212.selectByValue("431");
		Thread.sleep(3000);
			  
		driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		Thread.sleep(5000);
			  
		driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		Thread.sleep(3000);
			  
		
		//Asset Details
		  
		  driver.findElement(By.xpath("//input[@id='VehicleRegistrationNumber']")).sendKeys("MH043123");
		  Thread.sleep(3000);
		  
		  WebElement Manufacturer = driver.findElement(By.xpath("//select[@name=\"ManufacturerID\"]"));
		  Select ManufacturerID = new Select(Manufacturer);
		  ManufacturerID.selectByValue("MANUFACTURER_ESCORTS");
		  
		  WebElement Module = driver.findElement(By.xpath("//select[@name=\"ModelID\"]"));
		  Select ModelID = new Select(Module);
		  ModelID.selectByValue("MODEL_Escorts_FT50");
		  
		  WebElement Variant = driver.findElement(By.xpath("//select[@name=\"VariantID\"]"));
		  Select VariantID = new Select(Variant);
		  VariantID.selectByValue("50Powermaxx");
		  
		  WebElement Purpose = driver.findElement(By.xpath("//select[@name=\"PurposeID\"]"));
		  Select PurposeID = new Select(Purpose);
		  PurposeID.selectByValue("446");
		  
			  driver.findElement(By.id("ManufactureDate")).sendKeys(new String[] {"May-2022"});
			  Actions action = new Actions(driver);
		        action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(100); 
			   
		  driver.findElement(By.xpath("//input[@id='NumberOfPastOwner']")).sendKeys("2");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='EngineNo']")).sendKeys("2746GG");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='ChassisNo']")).sendKeys("276G");
		  Thread.sleep(3000);
		  
  
		  //Asset valuation
		  driver.findElement(By.xpath("//input[@id='AssetValuation_VintageOfAsset']")).sendKeys("33");
		  Thread.sleep(3000);
		  
		  WebElement DROP23 = driver.findElement(By.name("AssetValuation.ApplicationUsage"));
		  Thread.sleep(3000);
		  Select s23=new Select(DROP23);
		  s23.selectByVisibleText("Agriculture");
		  Thread.sleep(100);
		  
		  driver.findElement(By.xpath("//*[@id=\"LoanAmount\"]")).sendKeys("3300");
		  Thread.sleep(3000);
		  
		  
		  
		  //Detail Inspection
		  WebElement target6 = driver.findElement(By.xpath("//a[@id='contact-tab']"));
		  Actions s100 = new Actions(driver);
		  s100.moveToElement(target6);
		  s100.click(target6);
		  s100.build().perform();
		  
		  driver.findElement(By.xpath("//input[@id='AssetValuation_NameOfValuator']")).sendKeys("chinmayanand swami");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='AssetValuation_PlaceOfInspection']")).sendKeys("katraj");
		  Thread.sleep(3000);

			driver.findElement(By.id("AssetValuation_InspectionDate")).click();
	        Actions action15 = new Actions(driver);
	        action15.sendKeys(Keys.ENTER).build().perform();	
		  

		  driver.findElement(By.xpath("//input[@id='AssetValuation_InspectionTime']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='AssetValuation_MobileNumber']")).sendKeys("8374645787");
		  Thread.sleep(3000);
		  WebElement DROP24 = driver.findElement(By.name("AssetValuation.AddressType"));
		  Thread.sleep(3000);
		  Select s24=new Select(DROP24);
		  s24.selectByVisibleText("Dealer");
		  Thread.sleep(100);
		  
		  driver.findElement(By.xpath("//textarea[@id='AssetValuation_Address']")).sendKeys("At ambadi post dighashi");
		  Thread.sleep(3000);
		  
		  WebElement DROP25 = driver.findElement(By.name("AssetValuation.HpaStatus"));
		  Thread.sleep(3000);
		  Select s25=new Select(DROP25);
		  s25.selectByVisibleText("No");
		  Thread.sleep(100);
		  
		  driver.findElement(By.xpath("//input[@id='AssetValuation_InspectionLocation']")).sendKeys("Thane");
		  Thread.sleep(3000);
		  

		  driver.findElement(By.xpath("//textarea[@id='AssetValuation_ValuationAddress']")).sendKeys("At ambadi post dighashi");
		  Thread.sleep(3000);
		  
		  WebElement DROP26 = driver.findElement(By.name("AssetValuation.InsuranceValid"));
		  Thread.sleep(3000);
		  Select s26=new Select(DROP26);
		  s26.selectByVisibleText("No");
		  Thread.sleep(100);
		  
		  driver.findElement(By.xpath("//*[@id=\"vapp\"]/form/div[1]/div[26]/div[4]/div/div/button")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//i[@class='fa fa-plus text-primary cursor-pointer']")).click();
		  
		  WebElement Cropcode = driver.findElement(By.xpath("//select[@name=\"CropDetails[0].CropCode\"]"));
			Select Cropcode1 = new Select(Cropcode);
			Cropcode1.selectByValue("CROP_Potato");
			
			
			WebElement Season = driver.findElement(By.xpath("//select[@name=\"CropDetails[0].SeasonCode\"]"));
			Select Season1 = new Select(Season);
			Season1.selectByValue("SEASON_RABI");
			
	    	Thread.sleep(6000);
			
			WebElement Cropacr = driver.findElement(By.xpath("//input[@name='CropDetails[0].AreaCultivated']"));		
			Cropacr.sendKeys(new String[] {"12"});
		  
		  driver.findElement(By.xpath("//input[@name='OtherIncome']")).sendKeys("1400000");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@name='OtherExpense']")).sendKeys("1300000");
		  Thread.sleep(3000);

		  driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();	
		  Thread.sleep(3000);
		

		//Loan Details
		  WebElement FrequencyOfPayment1 = driver.findElement(By.xpath("//select[@name=\"FrequencyOfPayment\"]"));
		  Select FrequencyOfPayment = new Select(FrequencyOfPayment1);
		  FrequencyOfPayment.selectByValue("449");
		  driver.findElement(By.xpath("//input[@id=\"Tenure\"]")).clear();
		  driver.findElement(By.xpath("//input[@id=\"Tenure\"]")).sendKeys(new String[] {"45"});
		  driver.findElement(By.xpath("//input[@id=\"ROI\"]")).sendKeys(new String[] {"21"});
		  driver.findElement(By.id("FirstInstallmentDate")).sendKeys(new String[] {"05-Jul-2024"});
		  driver.findElement(By.xpath("//button[@class='btn btn-danger mr-2']")).click();
		  Thread.sleep(200);
		  driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		  
		//Charges
		  
		  driver.findElement(By.xpath("//input[@id='ProcessingFee_ChargedAmount']")).clear();
		  driver.findElement(By.xpath("//input[@id='ProcessingFee_ChargedAmount']")).sendKeys(new String[] {"30000"});
		  Thread.sleep(300);
		  
		  driver.findElement(By.xpath("//input[@id='StampDuty_ChargedAmount']")).clear();
		  driver.findElement(By.xpath("//input[@id='StampDuty_ChargedAmount']")).sendKeys(new String[] {"3000"});
		  Thread.sleep(300);
		  
		  driver.findElement(By.xpath("//input[@id='DocumentationCharges_ChargedAmount']")).clear();
		  driver.findElement(By.xpath("//input[@id='DocumentationCharges_ChargedAmount']")).sendKeys(new String[] {"3000"});
		  Thread.sleep(300);
			
		  
		  WebElement DROP29 = driver.findElement(By.name("KLIApplicant"));
		  Thread.sleep(300);
		  Select s29=new Select(DROP29);
		  s29.selectByVisibleText("Applicant");
		  Thread.sleep(3000);
		  WebElement DROP251 = driver.findElement(By.name("InsuranceCompanyName"));
		  Thread.sleep(300);
		  Select s251=new Select(DROP251);
		  s251.selectByVisibleText("HDFC");
		  Thread.sleep(100);
		  
		  driver.findElement(By.xpath("//input[@id='Subvention_ChargedAmount']")).clear();
		  driver.findElement(By.xpath("//input[@id='Subvention_ChargedAmount']")).sendKeys(new String[] {"100"});
		  Thread.sleep(300);
		  
		  driver.findElement(By.xpath("//input[@id='Subvention_ChargedAmount']")).clear();
		  driver.findElement(By.xpath("//input[@id='Subvention_ChargedAmount']")).sendKeys(new String[] {"100"});
		  Thread.sleep(300);
		  
		  driver.findElement(By.xpath("//input[@id='OutsideVehicleInsurance_ChargedAmount']")).clear();
		  driver.findElement(By.xpath("//input[@id='OutsideVehicleInsurance_ChargedAmount']")).sendKeys(new String[] {"500"});
		  Thread.sleep(300);
		  
		  driver.findElement(By.xpath("//input[@id='InhouseVehicleInsurance_ChargedAmount']")).clear();
		  driver.findElement(By.xpath("//input[@id='InhouseVehicleInsurance_ChargedAmount']")).sendKeys(new String[] {"600"});
		  Thread.sleep(300);
		  
		  WebElement DROP261 = driver.findElement(By.name("HospiApplicant"));
		  Thread.sleep(300);
		  Select s261=new Select(DROP261);
		  s261.selectByVisibleText("Applicant");
		  Thread.sleep(3000);;
		  WebElement DROP27 = driver.findElement(By.name("HospiCashAmount"));
		  Thread.sleep(300);
		  Select s27=new Select(DROP27);
		  s27.selectByVisibleText("25000");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		  Thread.sleep(5000);

			  
			  //Next stage
			  driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
			  
			  //INSTALLMENT DETAILS
			  driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
			  
			  //BANK DETAILS
			  
			  WebElement DROP61 = driver.findElement(By.name("MandateDetails.RegisterMandateName"));
			  Thread.sleep(300);
			  Select s61=new Select(DROP61);
			  s61.selectByVisibleText("No");
			  Thread.sleep(3000);
			  
			  driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
		 
		  
		//FRONTTTTTTTTTT
			
			
		  driver.findElement(By.xpath("(//div[@class='img-upload-content max-w-250px'])[1]")).click();  
		  driver.findElement(By.xpath("(//button[@class='list-group-item list-group-item-action text-dark'])[1]")).click();
	      driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();


	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div/div/div/div/div[2]/div/div/div/div/button/i")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
	       
	        
	        //BACKKKKKKKKK
	        
	        driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[2]/div/div/div/div[1]/div[2]/div/div/button")).click();  
			  driver.findElement(By.xpath("(//button[@class='list-group-item list-group-item-action text-dark'])[2]")).click();
		      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[2]/div/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/div")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		      Thread.sleep(4000);
		      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		      Thread.sleep(4000);
		      driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
		      Thread.sleep(4000);
		      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[2]")).click();
		      
		      
		      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[2]/div/div/div/div[2]/div/div/div/div/button")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[2]/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
		        

		      //Chassissss
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[3]/div/div/div/div[1]/div[2]/div/div/button")).click();  
		  driver.findElement(By.xpath("(//button[@class='list-group-item list-group-item-action text-dark'])[3]")).click();
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[3]/div/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/div")).click();
		  Thread.sleep(3000);
		 
		  

		  driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[6]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[3]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[3]/div/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[2]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[3]/div/div/div/div[2]/div/div/div/div/button/i")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[3]/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
	        

	      
	      //Righttttttttttt4
	     
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/button")).click();  
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[4]/div/div/div/div[2]/div/div/div/div/button/i")).click();
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[4]/div/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/div/i")).click();
		  Thread.sleep(3000);
		 
		  

		  driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[8]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[4]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[2]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[4]/div/div/div/div[2]/div/div/div/div/button/i")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[4]/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
	      
	      
	      
	      
	      //Lefttttttttttt5
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[5]/div/div/div/div[1]/div[2]/div/div/button")).click();  
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[5]/div/div/div/div[2]/div/div/div/div/button/i")).click();
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[5]/div/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/div/i")).click();
		  Thread.sleep(3000);
		 
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[10]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[5]")).click();
	      Thread.sleep(4000);
		  
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[5]/div/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[2]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[5]/div/div/div/div[2]/div/div/div/div/button")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[5]/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
	      
	      
		 //HMR
	      
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[6]/div/div/div/div[1]/div[2]/div/div/button")).click();  
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[6]/div/div/div/div[2]/div/div/div/div/button/i")).click();
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[6]/div/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/div/i")).click();
		  Thread.sleep(3000);
		 
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[12]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[6]")).click();
	      Thread.sleep(4000);
		  
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[6]/div/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[2]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[6]/div/div/div/div[2]/div/div/div/div/button")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[6]/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
	      
		
		//WD owner
	      
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[7]/div/div/div/div[1]/div[2]/div/div/button")).click();  
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[7]/div/div/div/div[2]/div/div/div")).click();
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[7]/div/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/div")).click();
		  Thread.sleep(3000);
		 
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[14]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[7]")).click();
	      Thread.sleep(4000);
		  
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[7]/div/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[2]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[7]/div/div/div/div[2]/div/div/div/div/button")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[7]/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
	      
		
		//Tires
	      
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[8]/div/div/div/div[1]/div[2]/div/div/button")).click();  
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[8]/div/div/div/div[2]/div/div/div/div/button/i")).click();
		  driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[8]/div/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/div")).click();
		  Thread.sleep(3000);
		 
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[16]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[8]")).click();
	      Thread.sleep(4000);
		  
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[8]/div/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[2]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[8]/div/div/div/div[2]/div/div/div/div/button")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"documentTab0\"]/div/div[8]/div/div/div/div[3]/div[1]/div/div/div/button/span")).click();
	      

	      driver.findElement(By.xpath("//button[@class='btn text-white float-right']")).click();
	      Thread.sleep(3000);
	      
		 
		  
	    //REVIEW SUBMIT
		 driver.findElement(By.xpath("//*[@id=\"vapp\"]/form/div[6]/div/div/span/button")).click();
		 Thread.sleep(10000);
		  WebElement RcLimit1 = driver.findElement(By.xpath("//select[@name=\"RcLimit\"]"));
		  Select RcLimit = new Select(RcLimit1);
		  RcLimit.selectByValue("BOOLEAN_NO");
		  WebElement LoanApplicationType11 = driver.findElement(By.xpath("//select[@name=\"LoanApplicationType\"]"));
		  Select LoanApplicationType = new Select(LoanApplicationType11);
		  LoanApplicationType.selectByValue("LOAN_APPLICATION_PRINTED");
		  driver.findElement(By.xpath("//textarea[@id=\"Remarks\"]")).sendKeys(new String[] {"Test"});
		  Thread.sleep(10000);
		  
		  driver.findElement(By.xpath("//*[@id=\"vapp\"]/form/div[8]/button")).click();
		  Thread.sleep(10000);
	
	//Toogle to lending
	  driver.findElement(By.xpath("//button[@id=\"kt_aside_desktop_toggle\"]")).click();

		//Application Info

	  driver.findElement(By.xpath("//span[text()='Field Investigations']")).click();
	  Thread.sleep(30000);
		
		//Lending		  
		  
		  
		//Open Queue
	  
	  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
    
		
		 driver.findElement(By.xpath("//input[@id='HMR']")).sendKeys("40000");
			
			
			driver.findElement(By.xpath("(//div[@id='vehicle-photos-doc'])[1]")).click();
			Thread.sleep(100);
			Robot robot=new Robot();
			StringSelection filepath= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath,null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			
			
			driver.findElement(By.xpath("(//div[@id='vehicle-photos-doc'])[2]")).click();
			Thread.sleep(100);
			Robot robot1=new Robot();
			StringSelection filepath1= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath1,null);
			robot1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			
			
			driver.findElement(By.xpath("(//div[@id='vehicle-photos-doc'])[3]")).click();
			Thread.sleep(100);
			Robot robot2=new Robot();
			StringSelection filepath234= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");StringSelection filepath2= new StringSelection("\"D:\\sal.jpg\"");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath234,null);
			robot2.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			
			
			driver.findElement(By.xpath("(//div[@id='vehicle-photos-doc'])[4]")).click();
			Thread.sleep(100);
			Robot robot3=new Robot();
			StringSelection filepath3= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath3,null);
			robot3.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			
			driver.findElement(By.xpath("(//div[@id='vehicle-photos-doc'])[5]")).click();
			Thread.sleep(100);
			Robot robot4=new Robot();
			StringSelection filepath4= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath4,null);
			robot4.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			
			
			driver.findElement(By.xpath("(//div[@id='vehicle-photos-doc'])[6]")).click();
			Thread.sleep(100);
			Robot robot5=new Robot();
			StringSelection filepath5= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath5,null);
			robot5.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			
			driver.findElement(By.xpath("(//div[@id='vehicle-photos-doc'])[7]")).click();
			Thread.sleep(100);
			Robot robot6=new Robot();
			StringSelection filepath6= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath6,null);
			robot6.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			
			
			WebElement DROP121 = driver.findElement(By.name("FrontTyres"));
			Thread.sleep(500);
			Select s121=new Select(DROP121);
			s121.selectByVisibleText("Good");
			Thread.sleep(500);
			
			WebElement DROP131 = driver.findElement(By.name("RearTyres"));
			Thread.sleep(500);
			Select s131=new Select(DROP131);
			s131.selectByVisibleText("Good");
			Thread.sleep(500);
			
			WebElement DROP141 = driver.findElement(By.name("EngineCondition"));
			Thread.sleep(500);
			Select s141=new Select(DROP141);
			s141.selectByVisibleText("Good");
			Thread.sleep(500);
			
			
			WebElement DROP151 = driver.findElement(By.name("ChasisCondition"));
			Thread.sleep(500);
			Select s151=new Select(DROP151);
			s151.selectByVisibleText("Good");
			Thread.sleep(500);
			
			WebElement DROP1611 = driver.findElement(By.name("Paint"));
			Thread.sleep(500);
			Select s1611=new Select(DROP1611);
			s1611.selectByVisibleText("Original");
			Thread.sleep(500);
			
			WebElement DROP1711 = driver.findElement(By.name("ColorCondition"));
			Thread.sleep(500);
			Select s1711=new Select(DROP1711);
			s1711.selectByVisibleText("Good");
			Thread.sleep(500);
			
			 driver.findElement(By.xpath("//input[@id='RegisteredOwnerName']")).sendKeys("Suyog Nibre");
			
			WebElement DROP1811 = driver.findElement(By.name("HasInsuranceEndorsement"));
			Thread.sleep(500);
			Select s18111=new Select(DROP1811);
			s18111.selectByVisibleText("No");
			Thread.sleep(500);
				
				
 			WebElement DROP1911= driver.findElement(By.name("HasTaxCertificate"));
			Thread.sleep(500);
			Select s1911=new Select(DROP1911);
			s1911.selectByVisibleText("No");
			Thread.sleep(500);
						
			WebElement DROP2011= driver.findElement(By.name("HasEndorsement"));
			Thread.sleep(500);
			Select s2011=new Select(DROP2011);
			s2011.selectByVisibleText("No");
			Thread.sleep(500);
					
			WebElement DROP211= driver.findElement(By.name("HasPermit"));
			Thread.sleep(500);
			Select s211=new Select(DROP211);
			s211.selectByVisibleText("No");
			Thread.sleep(500);
			
			WebElement target21 = driver.findElement(By.xpath("(//span[@class='nav-text'])[2]"));
			  Actions s2221 = new Actions(driver);
			  s2221.moveToElement(target21);
			  s2221.click(target21);
			  s2221.build().perform();
			  Thread.sleep(3000);
			  
			  
			  WebElement target3 = driver.findElement(By.xpath("(//span[@class='nav-text'])[3]"));
			  Actions s661 = new Actions(driver);
			  s661.moveToElement(target3);
			  s661.click(target3);
			  s661.build().perform();
			  
			  
			  driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("VI DONE GTG");
			  Thread.sleep(3000);
			  
			
     		driver.findElement(By.xpath("//button[@class='btn btn-primary font-weight-bold']")).click();
     		Thread.sleep(4000);

	
	
	
	//FI Stage
		//Open Queue
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
		
		
		WebElement Apppersonmet = driver.findElement(By.name("Applicant.PersonMet"));
		Thread.sleep(300);
		Select ApppersonmetID=new Select(Apppersonmet);
		ApppersonmetID.selectByVisibleText("Self");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='Applicant_Address_RentPerMonth']")).sendKeys("11000");
		Thread.sleep(1000);
		
		WebElement Appresidenceclass = driver.findElement(By.name("Applicant.ResidenceClass"));
		Thread.sleep(300);
		Select AppresidenceclassID=new Select(Appresidenceclass);
		AppresidenceclassID.selectByVisibleText("Upper");
		Thread.sleep(1000);
		
		WebElement AppAccomodation = driver.findElement(By.id("Applicant_AccomodationType"));
		Thread.sleep(300);
		Select AppAccomodationID=new Select(AppAccomodation);
		AppAccomodationID.selectByVisibleText("Pucca");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='Applicant_AreaSqFt']")).clear();
	    driver.findElement(By.xpath("//input[@id='Applicant_AreaSqFt']")).sendKeys("900");
		Thread.sleep(2000);
		
		WebElement Appnegativearea = driver.findElement(By.name("Applicant.NegativeArea"));
		Thread.sleep(300);
	    Select AppnegativeareaID=new Select(Appnegativearea);
	    AppnegativeareaID.selectByVisibleText("No");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Applicant_NeighborName']")).sendKeys("Chinmay Surve");
		Thread.sleep(2000);
		
		WebElement Applicantcheck = driver.findElement(By.name("Applicant.NeighborCheck"));
		Thread.sleep(300);
		Select ApplicantcheckID=new Select(Applicantcheck);
		ApplicantcheckID.selectByVisibleText("Positive");

		driver.findElement(By.xpath("//input[@id='Applicant_YearsInBusiness']")).clear();
		driver.findElement(By.xpath("//input[@id='Applicant_YearsInBusiness']")).sendKeys("5");
	    Thread.sleep(1000);
	    
		WebElement Applicantnegative = driver.findElement(By.name("Applicant.NegativeProfile"));
		Thread.sleep(300);
		Select ApplicantnegativeID=new Select(Applicantnegative);
		ApplicantnegativeID.selectByVisibleText("No");
		Thread.sleep(1000);

        //Asset tab
		WebElement target89 = driver.findElement(By.xpath("(//span[@class='nav-text'])[2]"));
		Actions s89 = new Actions(driver);
		s89.moveToElement(target89);
		s89.click(target89);
	    s89.build().perform();
	    
	    WebElement Applicantasset1 = driver.findElement(By.name("MiscAssetType"));
		Thread.sleep(300);
		Select Applicantasset1ID=new Select(Applicantasset1);
		Applicantasset1ID.selectByVisibleText("Bank");
		Thread.sleep(1000);
		
		WebElement Applicantasset2 = driver.findElement(By.name("MiscAssetOwnership"));
		Thread.sleep(300);
	    Select Applicantasset2ID=new Select(Applicantasset2);
	    Applicantasset2ID.selectByVisibleText("Business");
		Thread.sleep(1000);
		
		WebElement Applicantasset3 = driver.findElement(By.name("MiscAssetOwnerRelation"));
		Thread.sleep(300);
		Select Applicantasset3ID=new Select(Applicantasset3);
		Applicantasset3ID.selectByVisibleText("Self");
		Thread.sleep(1000);
		
		//Co_applicant tab
		
		WebElement FICoapplicant = driver.findElement(By.xpath("(//span[@class='nav-text'])[5]"));
		Actions FICoapplicanttab = new Actions(driver);
		FICoapplicanttab.moveToElement(FICoapplicant);
		FICoapplicanttab.click(FICoapplicant);
		FICoapplicanttab.build().perform();
		
		
		
		WebElement coapppersonmet = driver.findElement(By.name("CoApplicants[0].PersonMet"));
		Thread.sleep(300);
		Select coapppersonmetID=new Select(coapppersonmet);
		coapppersonmetID.selectByVisibleText("Self");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='CoApplicants_0__AreaSqFt']")).clear();
	    driver.findElement(By.xpath("//input[@id='CoApplicants_0__AreaSqFt']")).sendKeys("900");
		Thread.sleep(2000);
		
		WebElement Coapplicantcheck = driver.findElement(By.name("CoApplicants[0].NeighborCheck"));
		Thread.sleep(300);
		Select CoapplicantcheckID=new Select(Coapplicantcheck);
		CoapplicantcheckID.selectByVisibleText("Positive");
		
		
		WebElement Coappppresidenceclass = driver.findElement(By.name("CoApplicants[0].ResidenceClass"));
		Thread.sleep(300);
		Select CoappppresidenceclassID=new Select(Coappppresidenceclass);
		CoappppresidenceclassID.selectByVisibleText("Upper");
		Thread.sleep(1000);
		
		WebElement CoappAccomodation = driver.findElement(By.id("CoApplicants_0__AccomodationType"));
		Thread.sleep(300);
		Select CoappAccomodationID=new Select(CoappAccomodation);
		CoappAccomodationID.selectByVisibleText("Pucca");
		Thread.sleep(1000);
		
		
		WebElement Coapplicantnegative = driver.findElement(By.name("CoApplicants[0].NegativeArea"));
		Thread.sleep(300);
		Select CoapplicantnegativeID=new Select(Coapplicantnegative);
		CoapplicantnegativeID.selectByVisibleText("No");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@id='CoApplicants_0__NeighborName']")).sendKeys("Chinmay Surve");
		Thread.sleep(2000);
		
		
		WebElement Coapplicantnegativecheck = driver.findElement(By.name("CoApplicants[0].NegativeProfile"));
		Thread.sleep(300);
		Select CoapplicantnegativecheckID=new Select(Coapplicantnegativecheck);
		CoapplicantnegativecheckID.selectByVisibleText("No");
		Thread.sleep(1000);

		//Result tab
		WebElement FIresult = driver.findElement(By.xpath("(//span[@class='nav-text'])[8]"));
		Actions FIresulttab = new Actions(driver);
		FIresulttab.moveToElement(FIresult);
		FIresulttab.click(FIresult);
		FIresulttab.build().perform();
		WebElement FIFeedback = driver.findElement(By.name("Feedback"));
		Thread.sleep(300);
		Select FIFeedbackID=new Select(FIFeedback);
		FIFeedbackID.selectByVisibleText("Positive");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("Done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary font-weight-bold mr-2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"fi_result_tab\"]/div[3]/div[5]/div/div/button")).click();
		Thread.sleep(5000);


	//TVR Stage
	
	//Open Queue
	driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();


	WebElement RCUvisit = driver.findElement(By.name("RCUVisitReportStatus"));
	Thread.sleep(300);
	Select RCUvisitID=new Select(RCUvisit);
	RCUvisitID.selectByVisibleText("Positive");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@id='NoOfDependents'])[1]")).clear();
	driver.findElement(By.xpath("(//input[@id='NoOfDependents'])[1]")).sendKeys("2");
	Thread.sleep(5000);
	
	WebElement ExhchangeOfOldTractor = driver.findElement(By.name("ExhchangeOfOldTractor"));
    Thread.sleep(300);
	Select ExhchangeOfOldTractorID=new Select(ExhchangeOfOldTractor);
	ExhchangeOfOldTractorID.selectByVisibleText("No");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='MarginAmountToDealer']")).clear();
	driver.findElement(By.xpath("//input[@id='MarginAmountToDealer']")).sendKeys("40000");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='ExchangeConsiderationReceived']")).clear();
	driver.findElement(By.xpath("//input[@id='ExchangeConsiderationReceived']")).sendKeys("30000");
	Thread.sleep(3000);
	WebElement UsageOfAsset = driver.findElement(By.name("UsageOfAsset"));
	Thread.sleep(300);
	Select UsageOfAssetID=new Select(UsageOfAsset);
	UsageOfAssetID.selectByVisibleText("Hire");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='DiscountOffered']")).clear();
	driver.findElement(By.xpath("//input[@id='DiscountOffered']")).sendKeys("30000");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='DocumentationChargesToDealer']")).clear();
	driver.findElement(By.xpath("//input[@id='DocumentationChargesToDealer']")).sendKeys("30000");
	Thread.sleep(3000);
	WebElement ActualUserOfAsset = driver.findElement(By.name("ActualUserOfAsset"));
    Thread.sleep(300);
	Select ActualUserOfAssetID=new Select(ActualUserOfAsset);
	ActualUserOfAssetID.selectByVisibleText("Other");
	Thread.sleep(3000);
	
	WebElement AssetValue = driver.findElement(By.name("AssetValue"));
	Thread.sleep(300);
	Select AssetValueID=new Select(AssetValue);
	AssetValueID.selectByVisibleText("Land");
    Thread.sleep(3000);
    
    WebElement Assetownership = driver.findElement(By.name("AssetOwnership"));
	Thread.sleep(300);
	Select AssetownershipID=new Select(Assetownership);
	AssetownershipID.selectByVisibleText("Self");
    Thread.sleep(3000);
    
	WebElement AnyOtherAsset = driver.findElement(By.name("AnyOtherAsset"));
	Thread.sleep(300);
	Select AnyOtherAssetID=new Select(AnyOtherAsset);
	AnyOtherAssetID.selectByVisibleText("Two-Wheeler");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='DebtsOnAssets']")).clear();
	driver.findElement(By.xpath("//input[@id='DebtsOnAssets']")).sendKeys("400000");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='NetWorthOfCustomer']")).clear();
	driver.findElement(By.xpath("//input[@id='NetWorthOfCustomer']")).sendKeys("3000000");
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("TVR DONE");
    Thread.sleep(3000);
    
	driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();
	Thread.sleep(8000);

    driver.findElement(By.xpath("//*[@id=\"product-rules-app\"]/div[9]/div[3]/div/div/button")).click();
    Thread.sleep(5000);
    
    //Credit stage
    
  //Open Queue
    driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();
	Thread.sleep(8000);
	
	driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("Credit DONE");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
	driver.findElement(By.xpath("(//button[@class='dropdown-item'])[5]")).click();
	Thread.sleep(5000);
	//CreditL4
	
	 //Open Queue
	driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
	
	
	driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("CreditL4 DONE");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-success font-weight-bold']")).click();
	Thread.sleep(5000);
    
	//Sanction stage
	
	 //Open Queue
	driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary font-weight-bold']")).click();
		Thread.sleep(5000);
		
		
		//PSD stage
	
	   //Open Queue
	    driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
	
	
	//my work
	driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
	
	//PSD Stage
	
	driver.findElement(By.xpath("//*[@id=\"application-form-doc\"]")).click();
   Thread.sleep(3000);
   
   //Upload loan document
	Robot robot9=new Robot();
	StringSelection filepath211= new StringSelection("C:\\Users\\Chinmay.surve\\eclipse-workspace\\Upload-Document\\Images.JPG");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath211,null);
	robot9.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(100);
	robot9.keyPress(KeyEvent.VK_V);
	Thread.sleep(100);
	robot9.keyRelease(KeyEvent.VK_V);
	robot9.keyPress(KeyEvent.VK_CONTROL);
	robot9.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(100);
	
	//Loan agreement type
	WebElement agreementtype = driver.findElement(By.xpath("//select[@name=\"LoanAgreementType\"]"));
	Select agreementtypetID = new Select(agreementtype);
	agreementtypetID.selectByValue("LOAN_AGREEMENT_PRINTED");
	
	//Insurance & Disbursement
	WebElement PSD2page = driver.findElement(By.xpath("(//span[@class='nav-text'])[2]"));
	Actions PSD2pageID = new Actions (driver);
	PSD2pageID.moveToElement(PSD2page);
	PSD2pageID.click(PSD2page);
	PSD2pageID.build().perform();
	Thread.sleep(3000);
	
	
	//Insurance Nominee Details
	driver.findElement(By.xpath("//*[@id=\"Insurance_FirstName\"]")).sendKeys("Akash");
	driver.findElement(By.id("Insurance_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
	Thread.sleep(100);
	driver.findElement(By.xpath("//*[@id=\"Insurance_MobileContact\"]")).sendKeys("9884645373");
	
	//Applicant Bank Account
	
	driver.findElement(By.xpath("//*[@id=\"ApplicantBankAccount_AccountNo\"]")).sendKeys("426534352237663");
	driver.findElement(By.xpath("//*[@id=\"ApplicantBankAccount_AccountName\"]")).sendKeys("Jay");
	driver.findElement(By.xpath("//*[@id=\"vs1__combobox\"]/div[1]/input")).sendKeys("HDFC0002503");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs1__listbox\"]")).click();	
	
	//Repayment_Mode
	WebElement Repaymentmode = driver.findElement(By.xpath("//select[@id=\"RepaymentModeGroups\"]"));
	Select RepaymentmodeID = new Select(Repaymentmode);
	RepaymentmodeID.selectByValue("NACH_PDC_SPDC");
	
	driver.findElement(By.id("UMRN")).sendKeys("C12345678945353526354");
	driver.findElement(By.id("PDCCount")).sendKeys("12");
	driver.findElement(By.id("SPDCCount")).sendKeys("3");
	driver.findElement(By.id("PDCChequeFrom")).sendKeys("343743");
	driver.findElement(By.id("SPDCChequeFrom")).sendKeys("443743");
	
	//Disbursement details
	
	driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[1]/div[1]/input")).sendKeys("434334352237663");
	driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[2]/div[1]/input")).sendKeys("Jay");
	driver.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/input")).sendKeys("HDFC0002503");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs2__listbox\"]")).click();
	
	WebElement Accounttype = driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[3]/div[1]/select"));
	Select AccounttypeID = new Select(Accounttype);
	AccounttypeID.selectByValue("184");
	
	
	//IFSC code
	driver.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/input")).sendKeys("HDFC0002503");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs2__listbox\"]")).click();
	
	//Disbursal Amount
	
	driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[1]/div[4]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[1]/div[4]/input")).sendKeys("3300");
	
	
	//Charges
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Processing");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Stamp");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Documentation");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Life");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Subvention");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Inhouse");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Outside");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Valuation");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Hospi");
	Actions action151 = new Actions(driver);
   action151.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(4000);
	
	
	
	WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[3]/div[4]/select"));
	Select paymentmodeID = new Select(paymentmode);
	paymentmodeID.selectByValue("2041");
	
	driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[3]/div/div/div/button")).click();	
	
	//Payment Hold
	
	WebElement paymenthold = driver.findElement(By.xpath("//*[@id=\"PaymentHold\"]"));
	Select paymentholdID = new Select(paymenthold);
	paymentholdID.selectByValue("BOOLEAN_NO");
	
	
	//Document Details
	
	driver.findElement(By.xpath("//*[@id=\"document_0\"]")).sendKeys("12322");
	
	driver.findElement(By.id("DocumentNumberDetails_0__ReceivedDate")).click();
   Actions action0 = new Actions(driver);
   action0.sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.xpath("//*[@id=\"policyStartDate\"]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[5]/div[1]/table/thead/tr[2]/th[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[5]/div[1]/table/tbody/tr[1]/td[2]")).click();
	
	driver.findElement(By.id("DocumentNumberDetails_2__ReceivedDate")).click();
   Actions action2 = new Actions(driver);
   action2.sendKeys(Keys.ENTER).build().perform();
	
	WebElement Policyenddate = driver.findElement(By.xpath("//*[@id=\"PolicyEndDate\"]"));
	Select PolicyenddateID = new Select(Policyenddate);
	PolicyenddateID.selectByValue("2029-04-28");
	
	driver.findElement(By.id("DocumentNumberDetails_1__ReceivedDate")).click();
   Actions action1 = new Actions(driver);
   action1.sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.xpath("//*[@id=\"document_3\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_3__ReceivedDate")).click();
   Actions action3 = new Actions(driver);
   action3.sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.xpath("//*[@id=\"document_4\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_4__ReceivedDate")).click();
   Actions action4 = new Actions(driver);
   action4.sendKeys(Keys.ENTER).build().perform();
	
driver.findElement(By.xpath("//*[@id=\"document_5\"]")).sendKeys("12322");
driver.findElement(By.id("DocumentNumberDetails_5__ReceivedDate")).click();
Actions action7 = new Actions(driver);
action7.sendKeys(Keys.ENTER).build().perform();
   
	
	driver.findElement(By.xpath("//*[@id=\"document_6\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_6__ReceivedDate")).click();
   Actions action71 = new Actions(driver);
   action71.sendKeys(Keys.ENTER).build().perform();
   
	driver.findElement(By.xpath("//*[@id=\"document_7\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_7__ReceivedDate")).click();
   Actions action8 = new Actions(driver);
   action8.sendKeys(Keys.ENTER).build().perform();
	
	
	driver.findElement(By.xpath("//*[@id=\"document_8\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_8__ReceivedDate")).click();
   Actions action9 = new Actions(driver);
   action9.sendKeys(Keys.ENTER).build().perform();
   
	driver.findElement(By.xpath("//*[@id=\"document_9\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_9__ReceivedDate")).click();
   Actions action10 = new Actions(driver);
   action10.sendKeys(Keys.ENTER).build().perform();
   
	driver.findElement(By.xpath("//*[@id=\"document_10\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_10__ReceivedDate")).click();
   Actions action11 = new Actions(driver);
   action11.sendKeys(Keys.ENTER).build().perform();
   
	driver.findElement(By.xpath("//*[@id=\"document_11\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_11__ReceivedDate")).click();
   Actions action12 = new Actions(driver);
   action12.sendKeys(Keys.ENTER).build().perform();
   
	driver.findElement(By.xpath("//*[@id=\"document_12\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_12__ReceivedDate")).click();
   Actions action13 = new Actions(driver);
   action13.sendKeys(Keys.ENTER).build().perform();
   
	driver.findElement(By.xpath("//*[@id=\"document_13\"]")).sendKeys("12322");
	driver.findElement(By.id("DocumentNumberDetails_13__ReceivedDate")).click();
   Actions action14 = new Actions(driver);
   action14.sendKeys(Keys.ENTER).build().perform();
   
   Thread.sleep(5000);
   
//	driver.findElement(By.xpath("//*[@id=\"document_14\"]")).sendKeys("12322");
//	driver.findElement(By.id("DocumentNumberDetails_14__ReceivedDate")).click();
//   Actions action20 = new Actions(driver);
//   action20.sendKeys(Keys.ENTER).build().perform();
//   
//	driver.findElement(By.xpath("//*[@id=\"document_15\"]")).sendKeys("12322");
//	driver.findElement(By.id("DocumentNumberDetails_15__ReceivedDate")).click();
//   Actions action16 = new Actions(driver);
//   action16.sendKeys(Keys.ENTER).build().perform();
   
   driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("PSD DONE");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"AssessmentForm\"]/div/div[3]/div/div/button")).click();
	Thread.sleep(5000);
   
	//DIM stage
	//Open Queue
	driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
		
		
		driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("DIM DONE");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"AssessmentForm\"]/div/div[3]/div/div/button")).click();
	Thread.sleep(5000);
	
	//DIC Stage
	//Open Queue
	driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
		
		
		//my work
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"NAYAR"});
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
		
		
	driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("DIM DONE");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"AssessmentForm\"]/div/div[3]/div/div/button")).click();


}

}
	  	  	  		    
