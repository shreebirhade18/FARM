package CV;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.Select;

public class NONLCVRefinance {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Adani_software\\chromedriver-win32_125\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://axiomuat.adanicapital.in/onboard/backoffice");
//		driver.get("https://axiomuat.adanicapital.in/onboard/backoffice/CVLoanApplicationStep/StepValidationResult/119248");
//		driver.get("https://axiomuat.adanicapital.in/app/Applications/Queue/Open");
		Thread.sleep(1000);
		
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
		
		
     	//APPLICATION INFO
				driver.findElement(By.xpath("//span[text()='CV Applications']")).click();
				driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"Name\"]")).sendKeys(new String[] {"Jayesh Mhatre"});
				driver.findElement(By.xpath("//input[@id=\"Mobile\"]")).sendKeys(new String[] {"8779323241"});
				driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(new String[] {"Test@gmail.com"});
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				WebElement Customertypedrop = driver.findElement(By.id("CustomerTypeID"));
				Thread.sleep(300);
				Select CustomertypedropID=new Select(Customertypedrop);
				CustomertypedropID.selectByVisibleText("Proprietorship");
				Thread.sleep(300);
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				
				
		        
				//APPLICANT DETAILS  

				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"WIQTP1602S"});
				Thread.sleep(100);
		        driver.findElement(By.xpath("//button[@class='btn btn-white']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click(); 
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
		        Thread.sleep(7000);
//		        WebElement Drop9 = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
//		       	Thread.sleep(3000);
//		      	Select s9=new Select(Drop9);
//		      	s9.selectByVisibleText("Voter ID");
//		      	Thread.sleep(2000);
//		      	driver.findElement(By.id("AddressProof_Number")).sendKeys(new String[] {"WCN3714425"});   	    
//		      	Thread.sleep(2000);  	 
//		      	driver.findElement(By.xpath("(//button[@class='btn btn-white'])[2]")).click();
//		      	Thread.sleep(1000);
//		      	driver.findElement(By.xpath("(//i[@class='fa fa-camera fa-2x text-primary'])[3]")).click();
//		      	Thread.sleep(1000);    	
//		      	driver.findElement(By.xpath("(//i[@class='fa fa-circle'])[2]")).click();
//		      	Thread.sleep(1000);    	
//		      	driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
//		    	Thread.sleep(1000);   	
//		    	driver.findElement(By.xpath("(//i[@class='fa fa-upload'])[2]")).click();
//		    	Thread.sleep(1000);
//		    	driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[5]")).click();
//		    	Thread.sleep(5000);				  

		       	driver.findElement(By.id("CompanyBasicDetail_NameOfEntity")).sendKeys(new String[] {"Adani002"});

		 
				
				WebElement DROP11 = driver.findElement(By.id("CompanyBasicDetail_ConstitutionID"));
				Thread.sleep(1000);
				Select s11=new Select(DROP11);
				s11.selectByVisibleText("Proprietor");
				Thread.sleep(100);
				driver.findElement(By.id("CompanyBasicDetail_DateOfRegistration")).sendKeys(new String[] {"18-Feb-1996"});
				Thread.sleep(100);
				driver.findElement(By.id("CompanyBasicDetail_RegistrationNo")).sendKeys(new String[] {"ADANI0001"});
				Thread.sleep(100);
				
				driver.findElement(By.name("CompanyBasicDetail.PhoneNo")).sendKeys(new String[] {"9226453779"});
				Thread.sleep(1000);
				driver.findElement(By.name("CompanyBasicDetail.EmailID")).sendKeys(new String[] {"Adani132@gmail.com"});
				Thread.sleep(1000);
				
				
				
		 
				driver.findElement(By.id("Address_AddressLine1")).sendKeys(new String[] {"At-Ambadi"});
				Thread.sleep(100);
				driver.findElement(By.id("Address_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("Address_Pincode")).sendKeys(new String[] {"504308"});
				Thread.sleep(1000);
		 
				WebElement DROP12 = driver.findElement(By.name("Address.District"));
				Thread.sleep(2000);
				Select s12=new Select(DROP12);
				s12.selectByVisibleText("ADILABAD");
				Thread.sleep(2000);
				
				WebElement DROP121 = driver.findElement(By.name("Address.AddressLine3"));
				Thread.sleep(2000);
				Select s121=new Select(DROP121);
				s121.selectByVisibleText("Adilabad");
				Thread.sleep(2000);
		 
				WebElement DROP13 = driver.findElement(By.name("Address.Village"));
				Thread.sleep(1000);
				Select s13=new Select(DROP13);
				s13.selectByVisibleText("Chinthaguda");
				Thread.sleep(2000);
		 
				driver.findElement(By.name("Address.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"9226453779"});
				Thread.sleep(1000);
				
				//NEXT STAGE
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(7000);
				
				
				//Co-applicant
				
				driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/a[1]/i")).click();
//				driver.findElement(By.xpath("btn btn-white text-primary")).click();

				
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
				Thread.sleep(6000);
				
				//Gurantor
				
				
				driver.findElement(By.xpath("//*[@id=\"vapp\"]/div[2]/div[2]/a[2]")).click();
				                                   

				
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);
				
		        WebElement GurantorIDproof = driver.findElement(By.xpath("//select[@name=\"IDProof.IdentificationTypeID\"]"));
				Thread.sleep(100);
				Select GurantorIDproof1=new Select(GurantorIDproof);
				GurantorIDproof1.selectByVisibleText("PAN");
				driver.findElement(By.name("PAN.Number")).sendKeys(new String[] {"TIQSP1602S"});
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
		        WebElement GurantorAddressproof1 = driver.findElement(By.xpath("//select[@name=\"AddressProof.IdentificationTypeID\"]"));
		       	Thread.sleep(1000);
		      	Select GurantorAddressproofID=new Select(GurantorAddressproof1);
		      	GurantorAddressproofID.selectByVisibleText("Voter ID");
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
		 
				WebElement GurantorGender = driver.findElement(By.id("Customer_Gender"));
				Thread.sleep(100);
				Select GurantorGenderID=new Select(GurantorGender);
				GurantorGenderID.selectByIndex(1);
		 
				driver.findElement(By.id("CurrentAddress_AddressLine1")).sendKeys(new String[] {"Rupa Renaissance"});
				Thread.sleep(100);
				driver.findElement(By.id("CurrentAddress_AddressLine2")).sendKeys(new String[] {"Post- Dighashi"});
				Thread.sleep(100);
		        driver.findElement(By.id("CurrentAddress_Pincode")).sendKeys(new String[] {"380060"});
				Thread.sleep(100);
		 
				WebElement Gurantorcurrentdist = driver.findElement(By.name("CurrentAddress.District"));
				Thread.sleep(500);
				Select GurantorcurrentdistID=new Select(Gurantorcurrentdist);
				GurantorcurrentdistID.selectByVisibleText("AHMEDABAD");
				Thread.sleep(500);
		 
				WebElement Gurantorcurrenttaluka = driver.findElement(By.name("CurrentAddress.AddressLine3"));
				Thread.sleep(500);
				Select GurantorcurrenttalukaID=new Select(Gurantorcurrenttaluka);
				GurantorcurrenttalukaID.selectByVisibleText("Ahmadabad City");
				Thread.sleep(500);
		 
				WebElement Gurantorcurrentvillage = driver.findElement(By.name("CurrentAddress.Village"));
				Thread.sleep(500);
				Select GurantorcurrentvillageID=new Select(Gurantorcurrentvillage);
				GurantorcurrentvillageID.selectByVisibleText("Bhadaj");
				Thread.sleep(500);
		 
				driver.findElement(By.name("CurrentAddress.Landmark")).sendKeys(new String[] {"Near BOB"});
		 
				WebElement GurantorResidencetype = driver.findElement(By.name("CurrentAddress.ResidenceTypeID"));
				Thread.sleep(500);
				Select GurantorResidencetypeID=new Select(GurantorResidencetype);
				GurantorResidencetypeID.selectByVisibleText("Owned");
		 
				driver.findElement(By.id("IsSameAsCurrentAddress")).click();
				Thread.sleep(500);
		 
				driver.findElement(By.name("Contact.Mobile")).sendKeys(new String[] {"8226453779"});
				Thread.sleep(500);
				
				
				//Next stage
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(6000);	
				
				
				//NEXT STAGE
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);		
				
				
				//Application details stage
				
//				WebElement DROP1 = driver.findElement(By.id("CustomerTypeID"));
//				Thread.sleep(300);
//				Select s1=new Select(DROP1);
//				s1.selectByVisibleText("Individual");
//				Thread.sleep(300);
				
				WebElement DROP2 = driver.findElement(By.name("ProductTypeID"));
				Thread.sleep(1000);
				Select s2=new Select(DROP2);
				s2.selectByVisibleText("LCV Refinance");
				Thread.sleep(3000);
				
				WebElement DROP3 = driver.findElement(By.name("SchemeTypeID"));
				Thread.sleep(300);
				Select s3=new Select(DROP3);
				s3.selectByValue("605");
				Thread.sleep(300);
				
				WebElement DROP4 = driver.findElement(By.name("PromotionalSchemeID"));
				Thread.sleep(300);
				Select s4=new Select(DROP4);
				s4.selectByValue("875");
				Thread.sleep(300);
				
				WebElement DROP5 = driver.findElement(By.id("LeadSourceID"));
				Thread.sleep(300);
				Select s5=new Select(DROP5);
				s5.selectByVisibleText("Self Sourcing");
				Thread.sleep(300);
				
				//NEXT PAGE
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				
				
	        //BASIC DETAILS
		   	    WebElement DROP16 = driver.findElement(By.name("CompanyAddressAdditional.OfficeTypeID"));
				Thread.sleep(1000);
				Select s16=new Select(DROP16);
				s16.selectByVisibleText("Owned");
				Thread.sleep(100);
		 
				driver.findElement(By.id("CompanyAddressAdditional_YearsInCurrentOffice")).sendKeys(new String[] {"10"});
				Thread.sleep(500);
				
				driver.findElement(By.id("CompanyAddressAdditional_DistanceFromBranch")).sendKeys(new String[] {"10"});
				Thread.sleep(500);
		 
				driver.findElement(By.id("IncomeDetails_TotalAnnualIncome")).sendKeys(new String[] {"1900000"});
				Thread.sleep(500);
				
				driver.findElement(By.id("IncomeDetails_TotalAnnualLiabilities")).sendKeys(new String[] {"500000"});
				Thread.sleep(500);
				
				//NEXT STAGE
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(6000);
				
				
				 //Basic detail Co-applicant
				  
				driver.findElement(By.xpath("//a[@id='basic-tab']")).click();	
				Thread.sleep(1000);	 
				driver.findElement(By.xpath("//i[@class='fa fa-pencil-alt mr-1']")).click();	
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
				Thread.sleep(1000);
				WebElement Coapplicantmarital = driver.findElement(By.name("CustomerAdditionalDetails.MaritalStatusID"));
				Thread.sleep(500);
				Select CoapplicantmaritalID=new Select(Coapplicantmarital);
				CoapplicantmaritalID.selectByVisibleText("Single");
				Thread.sleep(100);
					 
					 
				WebElement Coapplicantqualification = driver.findElement(By.name("CustomerAdditionalDetails.EducationalQualificationID"));
				Thread.sleep(500);
				Select CoapplicantqualificationID=new Select(Coapplicantqualification);
				CoapplicantqualificationID.selectByVisibleText("Graduate");
				Thread.sleep(100);
					 
				WebElement Coapplicantlanguage = driver.findElement(By.name("CustomerAdditionalDetails.CommunicationLanguageID"));
				Thread.sleep(500);
				Select CoapplicantlanguageID=new Select(Coapplicantlanguage);
				CoapplicantlanguageID.selectByVisibleText("Hindi");
				Thread.sleep(100);
					 
				driver.findElement(By.name("CustomerAdditionalDetails.NumberOfDependents")).sendKeys(new String[] {"2"});
				Thread.sleep(200);
					 
				driver.findElement(By.name("CustomerAdditionalDetails.NumberOfChildren")).sendKeys(new String[] {"2"});
				Thread.sleep(200);
					 
				WebElement Coapplicantcaste = driver.findElement(By.name("CustomerAdditionalDetails.CasteID"));
				Thread.sleep(100);
				Select CoapplicantcasteID=new Select(Coapplicantcaste);
				CoapplicantcasteID.selectByVisibleText("General");
				Thread.sleep(100);
					 
				WebElement Coapplicantreligion = driver.findElement(By.name("CustomerAdditionalDetails.ReligionID"));
				Thread.sleep(500);
				Select CoapplicanteligionID=new Select(Coapplicantreligion);
				CoapplicanteligionID.selectByVisibleText("Hindu");
				Thread.sleep(500);
							  
				WebElement Coapplicantrelation = driver.findElement(By.name("CustomerAdditionalDetails.RelationshipWithApplicant"));
				Thread.sleep(500);
				Select CoapplicantrelationID=new Select(Coapplicantrelation);
				CoapplicantrelationID.selectByVisibleText("Brother");
				Thread.sleep(500);
							  
							  
				WebElement Coapplicantaddresstab = driver.findElement(By.xpath("//A[@id='address-tab']"));
				Actions CoapplicantaddresstabID = new Actions(driver);
				CoapplicantaddresstabID.moveToElement(Coapplicantaddresstab);
				CoapplicantaddresstabID.click(Coapplicantaddresstab);
				CoapplicantaddresstabID.build().perform();
				driver.findElement(By.xpath("//input[@id='CurrentAddress_YearsInCurrentResidence']")).sendKeys("15");
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@id='CurrentAddress_DistanceFromBranch']")).sendKeys("20");
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@id='PermanentAddress_YearsInCurrentResidence']")).sendKeys("25");
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@id='PermanentAddress_DistanceFromBranch']")).sendKeys("30");
				Thread.sleep(500); 
				
				driver.findElement(By.id("chkOfficeAddressSameAsPermanent")).click();
//				Thread.sleep(2000);
				
				WebElement DROP211 = driver.findElement(By.name("OfficeAddress.OfficeTypeID"));
				Thread.sleep(1000);
				Select s211=new Select(DROP211);
				s211.selectByValue("466");
				Thread.sleep(3000);
			
				
				//INCOME TAB
				WebElement target21 = driver.findElement(By.xpath("//a[@id='income-tab']"));
				Actions s2221 = new Actions(driver);
				s2221.moveToElement(target21);
				s2221.click(target21);
				s2221.build().perform();
			    driver.findElement(By.xpath("//input[@id='IncomeDetails_TotalAnnualIncome']")).sendKeys("900000");
				Thread.sleep(3000);
			    driver.findElement(By.xpath("//input[@id='IncomeDetails_TotalAnnualLiabilities']")).sendKeys("200000");
				Thread.sleep(3000); 
				
				
				
							  
				WebElement Coapplicantcontacttab = driver.findElement(By.xpath("//a[@id='contact-tab']"));
				Actions CoapplicantcontacttabID = new Actions(driver);
				CoapplicantcontacttabID.moveToElement(Coapplicantcontacttab);
				CoapplicantcontacttabID.click(Coapplicantcontacttab);
				CoapplicantcontacttabID.build().perform();
							  
				WebElement CoapplicantMobileNumberType = driver.findElement(By.name("MobileNumberTypeID"));
				Thread.sleep(500);
				Select CoapplicantMobileNumberTypeID=new Select(CoapplicantMobileNumberType);
				CoapplicantMobileNumberTypeID.selectByValue("431");
				Thread.sleep(500);
							  
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(6000);
				
				 //Basic detail Gurantor
				  
				driver.findElement(By.xpath("//a[@id='basic-tab']")).click();	
				Thread.sleep(1000);	 
				driver.findElement(By.xpath("//i[@class='fa fa-pencil-alt mr-1']")).click();	
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//i[@class='fa fa-camera fa-2x text-primary']")).click();
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//i[@class='fa fa-circle']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//i[@class='fa fa-stop']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
				Thread.sleep(1000);
				WebElement Gurantormarital = driver.findElement(By.name("CustomerAdditionalDetails.MaritalStatusID"));
				Thread.sleep(500);
				Select GurantormaritalID=new Select(Gurantormarital);
				GurantormaritalID.selectByVisibleText("Single");
				Thread.sleep(100);
					 
					 
				WebElement Gurantorqualification = driver.findElement(By.name("CustomerAdditionalDetails.EducationalQualificationID"));
				Thread.sleep(500);
				Select GurantorqualificationID=new Select(Gurantorqualification);
				GurantorqualificationID.selectByVisibleText("Graduate");
				Thread.sleep(100);
					 
				WebElement Gurantorlanguage = driver.findElement(By.name("CustomerAdditionalDetails.CommunicationLanguageID"));
				Thread.sleep(500);
				Select GurantorlanguageID=new Select(Gurantorlanguage);
				GurantorlanguageID.selectByVisibleText("Hindi");
				Thread.sleep(100);
					 
				driver.findElement(By.name("CustomerAdditionalDetails.NumberOfDependents")).sendKeys(new String[] {"2"});
				Thread.sleep(200);
					 
				driver.findElement(By.name("CustomerAdditionalDetails.NumberOfChildren")).sendKeys(new String[] {"2"});
				Thread.sleep(200);
					 
				WebElement Gurantorcaste = driver.findElement(By.name("CustomerAdditionalDetails.CasteID"));
				Thread.sleep(100);
				Select GurantorcasteID=new Select(Gurantorcaste);
				GurantorcasteID.selectByVisibleText("General");
				Thread.sleep(100);
					 
				WebElement Gurantorreligion = driver.findElement(By.name("CustomerAdditionalDetails.ReligionID"));
				Thread.sleep(500);
				Select GurantorreligionID=new Select(Gurantorreligion);
				GurantorreligionID.selectByVisibleText("Hindu");
				Thread.sleep(500);
							  
				WebElement Gurantorrelation = driver.findElement(By.name("CustomerAdditionalDetails.RelationshipWithApplicant"));
				Thread.sleep(500);
				Select GurantorrelationID=new Select(Gurantorrelation);
				GurantorrelationID.selectByVisibleText("Brother");
				Thread.sleep(500);
							  
							  
				WebElement Gurantoraddresstab = driver.findElement(By.xpath("//A[@id='address-tab']"));
				Actions GurantoraddresstabID = new Actions(driver);
				GurantoraddresstabID.moveToElement(Gurantoraddresstab);
				GurantoraddresstabID.click(Gurantoraddresstab);
				GurantoraddresstabID.build().perform();
				driver.findElement(By.xpath("//input[@id='CurrentAddress_YearsInCurrentResidence']")).sendKeys("15");
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@id='CurrentAddress_DistanceFromBranch']")).sendKeys("20");
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@id='PermanentAddress_YearsInCurrentResidence']")).sendKeys("25");
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@id='PermanentAddress_DistanceFromBranch']")).sendKeys("30");
				Thread.sleep(500); 
				
				driver.findElement(By.id("chkOfficeAddressSameAsPermanent")).click();
//				Thread.sleep(2000);
				
				WebElement DROP2111 = driver.findElement(By.name("OfficeAddress.OfficeTypeID"));
				Thread.sleep(1000);
				Select s2111=new Select(DROP2111);
				s2111.selectByValue("466");
				Thread.sleep(3000);
			
				
				//INCOME TAB
				WebElement target211 = driver.findElement(By.xpath("//a[@id='income-tab']"));
				Actions s22211 = new Actions(driver);
				s22211.moveToElement(target211);
				s22211.click(target211);
				s22211.build().perform();
			    driver.findElement(By.xpath("//input[@id='IncomeDetails_TotalAnnualIncome']")).sendKeys("900000");
				Thread.sleep(3000);
			    driver.findElement(By.xpath("//input[@id='IncomeDetails_TotalAnnualLiabilities']")).sendKeys("200000");
				Thread.sleep(3000); 
				
				
				
							  
				WebElement Gurantorcontacttab = driver.findElement(By.xpath("//a[@id='contact-tab']"));
				Actions GurantorcontacttabID = new Actions(driver);
				GurantorcontacttabID.moveToElement(Gurantorcontacttab);
				GurantorcontacttabID.click(Gurantorcontacttab);
				GurantorcontacttabID.build().perform();
							  
				WebElement GurantorMobileNumberType = driver.findElement(By.name("MobileNumberTypeID"));
				Thread.sleep(500);
				Select GurantorMobileNumberTypeID=new Select(GurantorMobileNumberType);
				GurantorMobileNumberTypeID.selectByValue("431");
				Thread.sleep(500);
							  
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(6000);
				
				//NEXT PAGE
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(2000);	
		
				//ASSET DETAILS
		        driver.findElement(By.id("VehicleRegistrationNumber")).sendKeys(new String[] {"MH46AJ0001"});
	            WebElement Manufacturer = driver.findElement(By.xpath("//select[@name=\"ManufacturerID\"]"));
				Select ManufacturerID = new Select(Manufacturer);
				ManufacturerID.selectByValue("MANUFACTURER_TATA_MOTORS_LTD");
				WebElement Module = driver.findElement(By.xpath("//select[@name=\"ModelID\"]"));
				Select ModelID = new Select(Module);
				ModelID.selectByValue("MODEL_Tata_407");
				WebElement Variant = driver.findElement(By.xpath("//select[@name=\"VariantID\"]"));
				Select VariantID = new Select(Variant);
				VariantID.selectByValue("LPT 407");
				driver.findElement(By.id("ManufactureDate")).sendKeys(new String[] {"May-2022"});
				Thread.sleep(100);
				driver.findElement(By.id("NumberOfPastOwner")).sendKeys(new String[] {"1"});
				Thread.sleep(100);
				driver.findElement(By.id("EngineNo")).sendKeys(new String[] {"Engine323232"});
				Thread.sleep(100);
				driver.findElement(By.id("ChassisNo")).sendKeys(new String[] {"Chassis323232"});
				Thread.sleep(100);
				
				WebElement DROP23 = driver.findElement(By.name("RepoAssetID"));
				Thread.sleep(2000);
				Select s23=new Select(DROP23);
				s23.selectByVisibleText("Yes");
				Thread.sleep(2000);
				
				WebElement DROP24 = driver.findElement(By.name("TypeOfVehicleID"));
				Thread.sleep(2000);
				Select s24=new Select(DROP24);
				s24.selectByVisibleText("Goods");
				Thread.sleep(2000);
				driver.findElement(By.id("LoanAmount")).sendKeys(new String[] {"600000"});
				Thread.sleep(100);
				
				//NEXT PAGE
				 driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				

				 //LOAN DETAILS
				 WebElement FrequencyOfPayment1 = driver.findElement(By.xpath("//select[@name=\"FrequencyOfPayment\"]"));
				 Select FrequencyOfPayment = new Select(FrequencyOfPayment1);
				 FrequencyOfPayment.selectByValue("542");
				 driver.findElement(By.xpath("//input[@id=\"Tenure\"]")).sendKeys(new String[] {"45"});
				 driver.findElement(By.xpath("//input[@id=\"ROI\"]")).sendKeys(new String[] {"25"});
				 driver.findElement(By.xpath("//button[@class='btn btn-danger mr-2']")).click();
				 driver.findElement(By.id("FirstInstallmentDate")).sendKeys(new String[] {"05-July-2024"});
				 driver.findElement(By.xpath("//button[@class='btn btn-danger mr-2']")).click();
				 Thread.sleep(6000);
			     //NEXT PAGE
				 driver.findElement(By.xpath("//i[@class=\"adani-icon adani-icon-arrow-white ml-2 text-white\"]")).click();
					Thread.sleep(3000);

				 //CHARGES
				    driver.findElement(By.xpath("//input[@id='ProcessingFee_ChargedAmount']")).sendKeys(new String[] {"30000"});
					Thread.sleep(300);
					driver.findElement(By.xpath("//input[@id='StampDuty_ChargedAmount']")).sendKeys(new String[] {"3000"});
					Thread.sleep(300);
		 
					driver.findElement(By.xpath("//input[@id='DocumentationCharges_ChargedAmount']")).sendKeys(new String[] {"3000"});
					Thread.sleep(300);
					 WebElement DROP29 = driver.findElement(By.name("KLIApplicant"));
					  Thread.sleep(300);
					  Select s29=new Select(DROP29);
					  s29.selectByVisibleText("Co-Applicant_1");
					  Thread.sleep(3000);
					  WebElement DROP25 = driver.findElement(By.name("InsuranceCompanyName"));
					  Thread.sleep(300);
					  Select s25=new Select(DROP25);
					  s25.selectByVisibleText("SBI");
					  Thread.sleep(10000);
					  driver.findElement(By.xpath("//input[@id='CreditLifeInsurance_ChargedAmount']")).sendKeys(new String[] {"3000"});
					  Thread.sleep(300);
					  driver.findElement(By.xpath("//input[@id='Subvention_ChargedAmount']")).sendKeys(new String[] {"100"});
					  Thread.sleep(300);
					  driver.findElement(By.xpath("//input[@id='OutsideVehicleInsurance_ChargedAmount']")).sendKeys(new String[] {"500"});
					  Thread.sleep(300);
					  driver.findElement(By.xpath("//input[@id='InhouseVehicleInsurance_ChargedAmount']")).sendKeys(new String[] {"600"});
					  Thread.sleep(300);
					  WebElement DROP26 = driver.findElement(By.name("HospiApplicant"));
					  Thread.sleep(300);
					  Select s26=new Select(DROP26);
					  s26.selectByVisibleText("Co-Applicant_1");
					  Thread.sleep(3000);;
					  WebElement DROP27 = driver.findElement(By.name("HospiCashAmount"));
					  Thread.sleep(300);
					  Select s27=new Select(DROP27);
					  s27.selectByVisibleText("0");
					  Thread.sleep(3000);

				      driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				     Thread.sleep(8000);
				     
				     driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
					 Thread.sleep(5000);
				     
				     
				
				//Bank Page
				WebElement DROP28 = driver.findElement(By.name("MandateDetails.RegisterMandateName"));
				  Thread.sleep(300);
				  Select s28=new Select(DROP28);
				  s28.selectByVisibleText("No");
				  Thread.sleep(3000);
				  
				//NEXT PAGE
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();

				//UPLOAD DOCUMENTS
				
				driver.findElement(By.xpath("//a[@id='tab-0']")).click();
		        driver.findElement(By.xpath("//button[@class='btn btn-outline-white']")).click();
		        driver.findElement(By.xpath("//button[@class='list-group-item list-group-item-action text-dark']")).click();
		        driver.findElement(By.xpath("//i[@class='fa fa-image fa-2x text-primary']")).click();
		        Thread.sleep(1000);
		        
		        
				Robot robot2=new Robot();
				StringSelection filepath2= new StringSelection("D:\\eclipse-workspace\\Upload-Document\\Statement.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath2,null);
				robot2.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(100);
				robot2.keyPress(KeyEvent.VK_V);
				Thread.sleep(100);
				robot2.keyRelease(KeyEvent.VK_V);
				robot2.keyPress(KeyEvent.VK_CONTROL);
				robot2.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.navigate().refresh();
				
				
				//NEXT PAGE
				driver.findElement(By.xpath("//*[@id=\"reviewForm\"]/div/button")).click();
				Thread.sleep(2000);	 
				
				
				//REVIEW SUBMIT
				
				
				WebElement RcLimit1 = driver.findElement(By.xpath("//select[@name=\"RcLimit\"]"));
				Select RcLimit = new Select(RcLimit1);
				RcLimit.selectByVisibleText("No");
				Thread.sleep(2000);
				WebElement LoanApplicationType11 = driver.findElement(By.xpath("//select[@name=\"LoanApplicationType\"]"));
				Select LoanApplicationType = new Select(LoanApplicationType11);
				LoanApplicationType.selectByValue("LOAN_APPLICATION_PRINTED");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='badge badge-warning']")).click();
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//textarea[@id=\"Remarks\"]")).sendKeys(new String[] {"Onboard Test Done"});
				Thread.sleep(5000);
				
				//NEXT PAGE
				driver.findElement(By.xpath("//button[@class='btn text-white float-right mr-2']")).click();
				Thread.sleep(60000);
				
				
				//Toogle to lending
				  driver.findElement(By.xpath("//button[@id=\"kt_aside_desktop_toggle\"]")).click();

					//Application Info

				  driver.findElement(By.xpath("//span[text()='Field Investigations']")).click();
				  Thread.sleep(30000);
				
				
				
				//Open Queue
				  
				  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
		   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
		   		Thread.sleep(4000);
		   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
		   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
					
					
					//my work
					driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
					Thread.sleep(4000);
					driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					
					//VI Stage
					
					WebElement RMAvehicle = driver.findElement(By.xpath("//select[@name=\"RMAVehicle\"]"));
					Select RMAvehicleID = new Select(RMAvehicle);
					RMAvehicleID.selectByValue("RMA_VEHICLE_INTRA_STATE");
					
					WebElement Fronttyre = driver.findElement(By.xpath("//select[@name=\"FrontTyres\"]"));
					Select FronttyreID = new Select(Fronttyre);
					FronttyreID.selectByValue("GOOD_CONDITION");
					
					WebElement Reartyre = driver.findElement(By.xpath("//select[@name=\"RearTyres\"]"));
					Select ReartyreID = new Select(Reartyre);
					ReartyreID.selectByValue("GOOD_CONDITION");
					
					WebElement EngineCondition = driver.findElement(By.xpath("//select[@name=\"EngineCondition\"]"));
					Select EngineConditionID = new Select(EngineCondition);
					EngineConditionID.selectByValue("GOOD_CONDITION");
					
					WebElement ChasisCondition = driver.findElement(By.xpath("//select[@name=\"ChasisCondition\"]"));
					Select ChasisConditionID = new Select(ChasisCondition);
					ChasisConditionID.selectByValue("GOOD_CONDITION");
					
					WebElement Paint = driver.findElement(By.xpath("//select[@name=\"Paint\"]"));
					Select PaintID = new Select(Paint);
					PaintID.selectByValue("ORIGINAL_PAINT");
					
					WebElement ColorCondition = driver.findElement(By.xpath("//select[@name=\"ColorCondition\"]"));
					Select ColorConditionID = new Select(ColorCondition);
					ColorConditionID.selectByValue("GOOD_CONDITION");
					
					//Result
					WebElement VIresult = driver.findElement(By.xpath("(//span[@class='nav-text'])[2]"));
					Actions VIresultID = new Actions (driver);
					VIresultID.moveToElement(VIresult);
					VIresultID.click(VIresult);
					VIresultID.build().perform();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("VT DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.name("submit")).click();
					Thread.sleep(6000);
					
					//Next stage FI
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
						//Applicant
						
						driver.findElement(By.xpath("//input[@id=\"Applicant_MobileNumber\"]")).sendKeys(new String[] {"8776545362"});
						
						
						WebElement Personmet = driver.findElement(By.xpath("//select[@name=\"Applicant.PersonMet\"]"));
						Select PersonmetID = new Select(Personmet);
						PersonmetID.selectByValue("SELF_FAMILY");
						
						
						driver.findElement(By.xpath("//input[@id=\"Applicant_Address_LineOne\"]")).sendKeys(new String[] {"Jui Nagar"});
						
						driver.findElement(By.xpath("//*[@id=\"select2-Applicant_Address_PincodeId-container\"]")).click();
						Thread.sleep(1000);
						driver.findElement(By.xpath("//*[@id=\"kt_body\"]/span/span/span[1]/input")).sendKeys(new String[] {"504308"});
						Thread.sleep(1000);
						driver.findElement(By.xpath("//*[@id=\"select2-Applicant_Address_PincodeId-results\"]/li")).click();
						
						driver.findElement(By.xpath("//input[@id=\"Applicant_Address_MonthsAtAddress\"]")).sendKeys(new String[] {"10"});
						driver.findElement(By.xpath("//input[@id=\"Applicant_DistanceKmsFromBranch\"]")).sendKeys(new String[] {"10"});
						
						
						
						
						WebElement ResidenceClass = driver.findElement(By.xpath("//select[@name=\"Applicant.ResidenceClass\"]"));
						Select ResidenceClassID = new Select(ResidenceClass);
						ResidenceClassID.selectByValue("MIDDLE_RESIDENCE_CLASS");
						
						WebElement Applicant_AccomodationType = driver.findElement(By.xpath("//select[@name=\"Applicant.AccomodationType\"]"));
						Select Applicant_AccomodationTypeID = new Select(Applicant_AccomodationType);
						Applicant_AccomodationTypeID.selectByValue("PUCCA_ACCOMODATION");
						
						driver.findElement(By.xpath("//input[@id=\"Applicant_AreaSqFt\"]")).clear();
						driver.findElement(By.xpath("//input[@id=\"Applicant_AreaSqFt\"]")).sendKeys(new String[] {"3000"});
						
						WebElement NegativeArea = driver.findElement(By.xpath("//select[@name=\"Applicant.NegativeArea\"]"));
						Select NegativeAreaID = new Select(NegativeArea);
						NegativeAreaID.selectByValue("BOOLEAN_NO");
						
						driver.findElement(By.xpath("//input[@id=\"Applicant_NeighborName\"]")).sendKeys(new String[] {"Raju"});
						
						WebElement NeighborCheck = driver.findElement(By.xpath("//select[@name=\"Applicant.NeighborCheck\"]"));
						Select NeighborCheckID = new Select(NeighborCheck);
						NeighborCheckID.selectByValue("POSITIVE_RESULT");
						
						driver.findElement(By.xpath("//input[@id=\"Applicant_YearsInBusiness\"]")).sendKeys(new String[] {"22"});
						
						WebElement Negativeprofile = driver.findElement(By.xpath("//select[@name=\"Applicant.NegativeProfile\"]"));
						Select NegativeprofileID = new Select(Negativeprofile);
						NegativeprofileID.selectByValue("BOOLEAN_NO");
						
						WebElement Commerciallicense = driver.findElement(By.xpath("//select[@name=\"HasCommercialLicense\"]"));
						Select CommerciallicenseID = new Select(Commerciallicense);
						CommerciallicenseID.selectByValue("BOOLEAN_YES");
						
						WebElement Priorexperience = driver.findElement(By.xpath("//select[@name=\"ExperienceManagingVehicle\"]"));
						Select PriorexperienceID = new Select(Priorexperience);
						PriorexperienceID.selectByValue("BOOLEAN_YES");
						
						driver.findElement(By.xpath("//input[@id=\"CommercialVehicleUsage\"]")).sendKeys(new String[] {"Transportation"});
						driver.findElement(By.xpath("//input[@id=\"MarginMoneySource\"]")).sendKeys(new String[] {"Savings"});
						driver.findElement(By.xpath("//input[@id=\"VehicleProviderName\"]")).sendKeys(new String[] {"MAHESHWARA INTERNATIONAL TRACTORS"});
						
						driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("VT DONE");
						Thread.sleep(1000);
					
					//Asset		
					
					WebElement FIasset = driver.findElement(By.xpath("(//span[@class='nav-text'])[2]"));
					Actions FIassetID = new Actions (driver);
					FIassetID.moveToElement(FIasset);
					FIassetID.click(FIasset);
					FIassetID.build().perform();
					Thread.sleep(1000);
					
					WebElement Asset_type = driver.findElement(By.xpath("//select[@name=\"MiscAssetType\"]"));
					Select Asset_typeID = new Select(Asset_type);
					Asset_typeID.selectByValue("FIXED_HOUSE_ASSET_TYPE");
					
					WebElement Asset_ownership = driver.findElement(By.xpath("//select[@name=\"MiscAssetOwnership\"]"));
					Select Asset_ownershipID = new Select(Asset_ownership);
					Asset_ownershipID.selectByValue("MISC_ASSET_OWNER_PRIMARY_APPLICANT");
					
					WebElement Owner_relationship = driver.findElement(By.xpath("//select[@name=\"MiscAssetOwnerRelation\"]"));
					Select Owner_relationshipID = new Select(Owner_relationship);
					Owner_relationshipID.selectByValue("SELF_APPLICANT_RELATION");
					
					WebElement Parentproperty = driver.findElement(By.xpath("//select[@name=\"Ispropertyindeceasedparentname\"]"));
					Select ParentpropertyID = new Select(Parentproperty);
					ParentpropertyID.selectByValue("BOOLEAN_NO");
					
					WebElement Deathcertificate = driver.findElement(By.xpath("//select[@name=\"DeathCertificate\"]"));
					Select DeathcertificateID = new Select(Deathcertificate);
					DeathcertificateID.selectByValue("BOOLEAN_NO");
					Thread.sleep(5000);
					
					JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		            jsExecutor.executeScript("window.scrollBy(0,1000)");
		            Thread.sleep(2000);
					
					WebElement FIviability = driver.findElement(By.xpath("(//span[@class='nav-text'])[4]"));
					Actions FIviabilityID = new Actions (driver);
					FIviabilityID.moveToElement(FIviability);
					FIviabilityID.click(FIviability);
					FIviabilityID.build().perform();
					Thread.sleep(3000);
					
					WebElement FIbusiness = driver.findElement(By.xpath("(//span[@class='nav-text'])[3]"));
					Actions FIbusinessID = new Actions (driver);
					FIbusinessID.moveToElement(FIbusiness);
					FIbusinessID.click(FIbusiness);
					FIbusinessID.build().perform();
					Thread.sleep(3000);
					
					
					
					WebElement FIbanking = driver.findElement(By.xpath("(//span[@class='nav-text'])[5]"));
					Actions FIbankingID = new Actions (driver);
					FIbankingID.moveToElement(FIbanking);
					FIbankingID.click(FIbanking);
					FIbankingID.build().perform();
					Thread.sleep(3000);
					
		
					//Co_applicant tab
	        		
					WebElement FICoapplicant = driver.findElement(By.xpath("(//span[@class='nav-text'])[6]"));
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
					
					//Gurantor_Tab
					
					WebElement Gurantortab = driver.findElement(By.xpath("(//span[@class='nav-text'])[7]"));
					Actions Gurantortabr1 = new Actions (driver);
					Gurantortabr1.moveToElement(Gurantortab);
					Gurantortabr1.click(Gurantortab);
					Gurantortabr1.build().perform();
					Thread.sleep(1000);
					
					
					WebElement Goapppersonmet = driver.findElement(By.name("Guarantors[0].PersonMet"));
					Thread.sleep(300);
					Select GoapppersonmetID=new Select(Goapppersonmet);
					GoapppersonmetID.selectByVisibleText("Self");
					Thread.sleep(1000);
							        		
					driver.findElement(By.xpath("//input[@id='Guarantors_0__AreaSqFt']")).clear();
					driver.findElement(By.xpath("//input[@id='Guarantors_0__AreaSqFt']")).sendKeys("900");
					Thread.sleep(2000);
							        		
					WebElement Goapplicantcheck = driver.findElement(By.name("Guarantors[0].NeighborCheck"));
					Thread.sleep(300);
					Select GoapplicantcheckID=new Select(Goapplicantcheck);
					GoapplicantcheckID.selectByVisibleText("Positive");
							        		
							        		
					WebElement Goappppresidenceclass = driver.findElement(By.name("Guarantors[0].ResidenceClass"));
					Thread.sleep(300);
					Select GoappppresidenceclassID=new Select(Goappppresidenceclass);
					GoappppresidenceclassID.selectByVisibleText("Upper");
					Thread.sleep(1000);
							        		
					WebElement GoappAccomodation = driver.findElement(By.id("Guarantors_0__AccomodationType"));
					Thread.sleep(300);
					Select GoappAccomodationID=new Select(GoappAccomodation);
					GoappAccomodationID.selectByVisibleText("Pucca");
					Thread.sleep(1000);
							        		
							        		
					WebElement Goapplicantnegative = driver.findElement(By.name("Guarantors[0].NegativeArea"));
					Thread.sleep(300);
					Select GoapplicantnegativeID=new Select(Goapplicantnegative);
					GoapplicantnegativeID.selectByVisibleText("No");
					Thread.sleep(1000);
							        		
							        		
					driver.findElement(By.xpath("//input[@id='Guarantors_0__NeighborName']")).sendKeys("Chinmay Surve");
					Thread.sleep(2000);
							        		
							        		
					WebElement Goapplicantnegativecheck = driver.findElement(By.name("Guarantors[0].NegativeProfile"));
					Thread.sleep(300);
					Select GoapplicantnegativecheckID=new Select(Goapplicantnegativecheck);
					GoapplicantnegativecheckID.selectByVisibleText("No");
					Thread.sleep(1000);
		
					
					
					//FIResult
					WebElement FIresultfinal = driver.findElement(By.xpath("(//span[@class='nav-text'])[8]"));
					Actions FIresultfinalr1 = new Actions (driver);
					FIresultfinalr1.moveToElement(FIresultfinal);
					FIresultfinalr1.click(FIresultfinal);
					FIresultfinalr1.build().perform();
					Thread.sleep(1000);
					
					//Calculate deviation
					driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary'])")).click();
					Thread.sleep(5000);
					
					
					//Remarks
					driver.findElement(By.xpath("(//textarea[@id='recommendation_edit'])[4]")).sendKeys("VT DONE");
					Thread.sleep(1000);
					
		
					
					WebElement FIfeedback = driver.findElement(By.xpath("//*[@id=\"Feedback\"]"));
					Select FIfeedbackID = new Select(FIfeedback);
					FIfeedbackID.selectByValue("POSITIVE_RESULT");
					Thread.sleep(2000);
					
					//Location
					driver.findElement(By.xpath("//*[@id=\"fi_result_tab\"]/div[2]/div[3]/div/button")).click();
					Thread.sleep(5000);
					
		
					driver.findElement(By.xpath("//*[@id=\"fi_result_tab\"]/div[2]/div[5]/div/div/button")).click();
					Thread.sleep(4000);
					
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
				
					
					//TVR stage
					WebElement RCU = driver.findElement(By.xpath("//*[@id=\"RCUVisitReportStatus\"]"));
					Select RCUID = new Select(RCU);
					RCUID.selectByValue("POSITIVE_RESULT");
					
					WebElement mobileusage = driver.findElement(By.xpath("//select[@name=\"MobileUsage\"]"));
					Select mobileusageID = new Select(mobileusage);
					mobileusageID.selectByValue("MOBILE_USAGE_GT_1_YR");
					
					WebElement AnyOtherAsset = driver.findElement(By.xpath("//select[@name=\"AnyOtherAsset\"]"));
					Select AnyOtherAssetID = new Select(AnyOtherAsset);
					AnyOtherAssetID.selectByValue("MOVABLE_NA_ASSET_TYPE");
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("TVR DONE");
					
					driver.findElement(By.xpath("//*[@id=\"product-rules-app\"]/div[7]/div[3]/div/div/button")).click();
					Thread.sleep(4000);
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					
					//Credit stage
					driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();
					Thread.sleep(8000);
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("Credit DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
					driver.findElement(By.xpath("(//button[@class='dropdown-item'])[5]")).click();
					Thread.sleep(8000);
					
					//Open Queue
					  
					driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					//CreditL4
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("CreditL4 DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//button[@class='btn btn-success font-weight-bold']")).click();
					Thread.sleep(4000);
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					//Valuation
					driver.findElement(By.xpath("//*[@id=\"RegisteredVehicleOwnerAddress_LineOne\"]")).sendKeys("Andheri");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"select2-RegisteredVehicleOwnerAddress_PincodeId-container\"]")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"kt_body\"]/span/span/span[1]/input")).sendKeys("504308");
					Thread.sleep(1000);
					
					
					driver.findElement(By.xpath("//*[@id=\"select2-RegisteredVehicleOwnerAddress_PincodeId-results\"]/li/div")).click();
					Thread.sleep(1000);
					
					
					WebElement Accidenthistory = driver.findElement(By.xpath("//select[@name=\"AccidentHistory\"]"));
					Select AccidenthistoryID = new Select(Accidenthistory);
					AccidenthistoryID.selectByValue("BOOLEAN_NO");
					
					driver.findElement(By.xpath("//*[@id=\"VehicleMarketValue\"]")).clear();
					driver.findElement(By.xpath("//*[@id=\"VehicleMarketValue\"]")).sendKeys("1200000");
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("Valuation DONE");
					Thread.sleep(400);
					//Forward
					driver.findElement(By.xpath("//*[@id=\"product-rules-app\"]/div[3]/div/div/button")).click();
					Thread.sleep(6000);
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					
					//Credit Final
					driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();
					Thread.sleep(8000);
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("Credit DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
					driver.findElement(By.xpath("(//button[@class='dropdown-item'])[5]")).click();
					Thread.sleep(4000);
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					
					//CreditFinalL4
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("CreditL4 DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//button[@class='btn btn-success font-weight-bold']")).click();
					Thread.sleep(4000);
					
					//Sanction stage
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					driver.findElement(By.xpath("//button[@class='btn btn-primary font-weight-bold']")).click();
					Thread.sleep(2000);
					
					
					//PSD Stage
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					driver.findElement(By.xpath("//*[@id=\"application-form-doc\"]")).click();
			        Thread.sleep(1000);
			        
			        //Upload loan document
					Robot robot21=new Robot();
					StringSelection filepath21= new StringSelection("D:\\eclipse-workspace\\Upload-Document\\Statement.Pdf");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath21,null);
					robot21.keyPress(KeyEvent.VK_CONTROL);
					Thread.sleep(100);
					robot21.keyPress(KeyEvent.VK_V);
					Thread.sleep(100);
					robot21.keyRelease(KeyEvent.VK_V);
					robot21.keyPress(KeyEvent.VK_CONTROL);
					robot21.keyPress(KeyEvent.VK_ENTER);
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
					Thread.sleep(1000);
					
					//Insurance Nominee Details
					driver.findElement(By.xpath("//*[@id=\"Insurance_FirstName\"]")).sendKeys("Akash");
					driver.findElement(By.id("Insurance_DateOfBirth")).sendKeys(new String[] {"18-Feb-1996"});
					Thread.sleep(100);
					driver.findElement(By.xpath("//*[@id=\"Insurance_MobileContact\"]")).sendKeys("9884645373");
					
					//Applicant Bank Account
					
					driver.findElement(By.xpath("//*[@id=\"ApplicantBankAccount_AccountNo\"]")).sendKeys("426534352237663");
					driver.findElement(By.xpath("//*[@id=\"ApplicantBankAccount_AccountName\"]")).sendKeys("Jay");
					driver.findElement(By.xpath("//*[@id=\"vs1__combobox\"]/div[1]/input")).sendKeys("HDFC0002503");
					Thread.sleep(1000);
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
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs2__listbox\"]")).click();
					
					WebElement Accounttype = driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[3]/div[1]/select"));
					Select AccounttypeID = new Select(Accounttype);
					AccounttypeID.selectByValue("184");
					
					
					//IFSC code
					driver.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/input")).sendKeys("HDFC0002503");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs2__listbox\"]")).click();
					
					//Disbursal Amount
					
					driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[1]/div[4]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"disbursement-configuration-app\"]/div[3]/div[2]/div[1]/div[4]/input")).sendKeys("600000");
					
					
					//Charges
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Processing");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Stamp");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Documentation");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Life");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Subvention");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Inhouse");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Outside");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Hospi");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).sendKeys("Valuation");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
					
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
					Thread.sleep(1000);
				
					driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[5]/div[1]/table/thead/tr[2]/th[1]")).click();
					Thread.sleep(1000);
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
			        Actions action5 = new Actions(driver);
			        action5.sendKeys(Keys.ENTER).build().perform();
					
					driver.findElement(By.xpath("//*[@id=\"document_6\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_6__ReceivedDate")).click();
			        Actions action6 = new Actions(driver);
			        action6.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_7\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_7__ReceivedDate")).click();
			        Actions action7 = new Actions(driver);
			        action7.sendKeys(Keys.ENTER).build().perform();
					
					
					driver.findElement(By.xpath("//*[@id=\"document_8\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_8__ReceivedDate")).click();
			        Actions action8 = new Actions(driver);
			        action8.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_9\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_9__ReceivedDate")).click();
			        Actions action9 = new Actions(driver);
			        action9.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_10\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_10__ReceivedDate")).click();
			        Actions action10 = new Actions(driver);
			        action10.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_11\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_11__ReceivedDate")).click();
			        Actions action11 = new Actions(driver);
			        action11.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_12\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_12__ReceivedDate")).click();
			        Actions action12 = new Actions(driver);
			        action12.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_13\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_13__ReceivedDate")).click();
			        Actions action13 = new Actions(driver);
			        action13.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_14\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_14__ReceivedDate")).click();
			        Actions action14 = new Actions(driver);
			        action14.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"document_15\"]")).sendKeys("12322");
					driver.findElement(By.id("DocumentNumberDetails_15__ReceivedDate")).click();
			        Actions action15 = new Actions(driver);
			        action15.sendKeys(Keys.ENTER).build().perform();
			        
					driver.findElement(By.xpath("//*[@id=\"DocumentNumberDetails_16__IsDeffered\"]")).click();
					driver.findElement(By.id("DocumentNumberDetails_16__DefferedDate")).click();
			        Actions action16 = new Actions(driver);
			        action16.sendKeys(Keys.ENTER).build().perform();
					
					
			        driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("PSD DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"AssessmentForm\"]/div/div[3]/div/div/button")).click();
					Thread.sleep(6000);
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
					
					//DIM
					
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("DIM DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"AssessmentForm\"]/div/div[3]/div/div/button")).click();
					Thread.sleep(6000);
					
					//Open Queue
					  
					  driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")).click();
			   		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
			   		Thread.sleep(4000);
			   		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).click();
			   		driver.findElement(By.xpath("//*[@id=\"ApplicationSelectionForm\"]/button")).click();
						
						
						//my work
						driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(new String[]{"Adani002"});
						Thread.sleep(4000);
						driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[11]/div/a/i")).click();
						
					//DIC
					driver.findElement(By.xpath("//textarea[@id='recommendation_edit']")).sendKeys("DIM DONE");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"AssessmentForm\"]/div/div[3]/div/div/button")).click();

	}
	
}

