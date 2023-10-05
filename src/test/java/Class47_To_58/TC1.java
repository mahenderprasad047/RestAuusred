package Class47_To_58;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TC1 
{
	@Test
	public void test1()
	{
		CustomerDetails cust1 = new CustomerDetails();
		cust1.setId(1);
		cust1.setName("Mahender");
		cust1.setMobNumber(8723411111L);
		
		Address cust1_Address1 = new Address();
		cust1_Address1.setCity("Jamshedpur"); cust1_Address1.setPinCode(832404);cust1_Address1.setState("Jharkhand");
		
		Address cust1_Address2 = new Address();
		cust1_Address2.setCity("Bengaluru"); cust1_Address2.setPinCode(560076);cust1_Address2.setState("Karnataka");
		
		Address cust1_Address3 = new Address();
		cust1_Address1.setCity("Newark"); cust1_Address1.setPinCode(19713);cust1_Address1.setState("Delaware");
		
		List<Address> lstAddress1 = new ArrayList<>();
		lstAddress1.add(cust1_Address1); lstAddress1.add(cust1_Address2); lstAddress1.add(cust1_Address3);
		
		cust1.setAddress(lstAddress1);
		
		List<String> lstCountry = new ArrayList<String>();
		lstCountry.add("India"); lstCountry.add("USA");
		
		cust1.setCountry(lstCountry);
		cust1.setHasPrime(false);
		
		List<String> lstCust1_Fav1 = new ArrayList<String>();
		lstCust1_Fav1.add("Bengaluru");lstCust1_Fav1.add("Goa");lstCust1_Fav1.add("Jamshedpur");lstCust1_Fav1.add("Andaman");
		
		List<String> lstCust1_Fav2 = new ArrayList<String>();
		lstCust1_Fav2.add("NewYork");lstCust1_Fav2.add("Virginia");lstCust1_Fav2.add("Glassgow");
		
		List<List<String>> lstServices = new ArrayList<List<String>>();
		lstServices.add(lstCust1_Fav1);lstServices.add(lstCust1_Fav2);
		cust1.setServices(lstServices);
		
		
		//For Customer-2
		CustomerDetails cust2 = new CustomerDetails();
		cust2.setId(2);
		cust2.setName("Mukesh");
		cust2.setMobNumber(8723422222L);
		
		Address cust2_Address1 = new Address();
		cust2_Address1.setCity("Bhopal"); cust2_Address1.setPinCode(666404);cust2_Address1.setState("MP");
		
		Address cust2_Address2 = new Address();
		cust2_Address2.setCity("Bengaluru"); cust2_Address2.setPinCode(560076);cust2_Address2.setState("Karnataka");
		
		Address cust2_Address3 = new Address();
		cust2_Address3.setCity("London"); cust2_Address3.setPinCode(23222);cust2_Address3.setState("Manchester");
		
		List<Address> Cust2_lstAddress1 = new ArrayList<>();	//
		Cust2_lstAddress1.add(cust2_Address1); Cust2_lstAddress1.add(cust2_Address2); Cust2_lstAddress1.add(cust2_Address3);
		
		cust2.setAddress(Cust2_lstAddress1);
		
		List<String> Cust2_lstCountry = new ArrayList<String>();
		Cust2_lstCountry.add("India"); Cust2_lstCountry.add("UK");
		
		cust2.setCountry(Cust2_lstCountry);
		cust2.setHasPrime(true);
		
		List<String> lstCust2_Fav1 = new ArrayList<String>();
		lstCust2_Fav1.add("Bengaluru");lstCust2_Fav1.add("Kashmir");lstCust2_Fav1.add("Bhopal");
		
		List<String> lstCust2_Fav2 = new ArrayList<String>();
		lstCust2_Fav2.add("Leeds");lstCust2_Fav2.add("Lords");
		
		List<List<String>> lstCust2_Services = new ArrayList<List<String>>();
		lstCust2_Services.add(lstCust2_Fav1);lstCust2_Services.add(lstCust2_Fav2);
		cust2.setServices(lstCust2_Services);
		
		RestAssured.given().log().all().body(cust2).get();
		
		
		
		
		
		
		
		
		
	}
	
}
