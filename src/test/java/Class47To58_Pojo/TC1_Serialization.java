package Class47To58_Pojo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TC1_Serialization 
{
	//Refer jsonFiles\Global.json
	@Test
	public void test1()
	{
		
		//Customer-1
		Customer cust1 = new Customer();
		cust1.setId(1);
		cust1.setName("Mahender");
		cust1.setMobNumber(8723411111L);
		
		Address cust1_Address1 = new Address();
		cust1_Address1.setCity("Jamshedpur");cust1_Address1.setPinCode(832404); cust1_Address1.setState("Jharkhand");
		
		Address cust1_Address2 = new Address();
		cust1_Address2.setCity("Bengaluru");cust1_Address2.setPinCode(560076); cust1_Address2.setState("Karnataka");
		
		Address cust1_Address3 = new Address();
		cust1_Address3.setCity("Newark");cust1_Address3.setPinCode(19713); cust1_Address3.setState("Delaware");
		
		List<Address> lstCust1_AllAddress = new ArrayList<Address>();
		lstCust1_AllAddress.add(cust1_Address1); lstCust1_AllAddress.add(cust1_Address2); lstCust1_AllAddress.add(cust1_Address3);
		cust1.setAddress(lstCust1_AllAddress);
		
		List<String> lstCust1_Countries = new ArrayList<String>();
		lstCust1_Countries.add("India"); lstCust1_Countries.add("USA");
		cust1.setCountry(lstCust1_Countries);
		
		cust1.setHasPrime(false);
		
		List<String> lstcust1_favPlace1 = new ArrayList<String>();
		lstcust1_favPlace1.add("Bengaluru");  lstcust1_favPlace1.add("Goa"); lstcust1_favPlace1.add("Jamshedpur"); lstcust1_favPlace1.add("Andaman");
		 
		
		FavPlace cust1_FavPlace1 = new FavPlace();
		cust1_FavPlace1.setFavPlace(lstcust1_favPlace1);
		
		List<String> lstcust1_favPlace2 = new ArrayList<String>();
		lstcust1_favPlace2.add("NewYork");  lstcust1_favPlace2.add("Virginia"); lstcust1_favPlace2.add("Glassgow");
		
		FavPlace cust1_FavPlace2 = new FavPlace();
		cust1_FavPlace2.setFavPlace(lstcust1_favPlace2);
		
		List<FavPlace> cust1_AllServices = new ArrayList<FavPlace>();
		cust1_AllServices.add(cust1_FavPlace1); cust1_AllServices.add(cust1_FavPlace2);
		
		cust1.setServices(cust1_AllServices);
		
		//Customer-2
		Customer cust2 = new Customer();
		cust2.setId(2);
		cust2.setName("Mukesh");
		cust2.setMobNumber(8723422222L);
		
		Address cust2_Address1 = new Address();
		cust2_Address1.setCity("Bhopal");cust2_Address1.setPinCode(666404); cust2_Address1.setState("MP");
		
		Address cust2_Address2 = new Address();
		cust2_Address2.setCity("Bengaluru");cust2_Address2.setPinCode(560076); cust2_Address2.setState("Karnataka");
		
		Address cust2_Address3 = new Address();
		cust2_Address3.setCity("London");cust2_Address3.setPinCode(23222); cust2_Address3.setState("Manchester");
		
		List<Address> lstCust2_AllAddress = new ArrayList<Address>();
		lstCust2_AllAddress.add(cust2_Address1); lstCust2_AllAddress.add(cust2_Address2); lstCust2_AllAddress.add(cust2_Address3);
		cust2.setAddress(lstCust2_AllAddress);
		
		List<String> lstCust2_Countries = new ArrayList<String>();
		lstCust2_Countries.add("India"); lstCust2_Countries.add("UK");
		cust2.setCountry(lstCust2_Countries);
		
		cust2.setHasPrime(false);
		
		List<String> lstcust2_favPlace1 = new ArrayList<String>();
		lstcust2_favPlace1.add("Bengaluru");  lstcust2_favPlace1.add("Kashmir"); lstcust2_favPlace1.add("Bhopal"); 
		 
		
		FavPlace cust2_FavPlace1 = new FavPlace();
		cust2_FavPlace1.setFavPlace(lstcust2_favPlace1);
		
		List<String> lstcust2_favPlace2 = new ArrayList<String>();
		lstcust2_favPlace2.add("Leeds");  lstcust2_favPlace2.add("Lords"); 
		
		FavPlace cust2_FavPlace2 = new FavPlace();
		cust2_FavPlace2.setFavPlace(lstcust2_favPlace2);
		
		List<FavPlace> cust2_AllServices = new ArrayList<FavPlace>();
		cust2_AllServices.add(cust2_FavPlace1); cust2_AllServices.add(cust2_FavPlace2);
		
		cust2.setServices(cust2_AllServices);
		
		//Customer-3
		Customer cust3 = new Customer();
		cust3.setId(3);
		cust3.setName("Amod");
		cust3.setMobNumber(8723433333L);
		
		Address cust3_Address1 = new Address();
		cust3_Address1.setCity("Bhubhneshwar");cust3_Address1.setPinCode(333433); cust3_Address1.setState("Orissa");
		
		Address cust3_Address2 = new Address();
		cust3_Address2.setCity("Bengaluru");cust3_Address2.setPinCode(560076); cust3_Address2.setState("Karnataka");
		
		Address cust3_Address3 = new Address();
		cust3_Address3.setCity("Berlin");cust3_Address3.setPinCode(33333); cust3_Address3.setState("Brandenburg");
		
		List<Address> lstCust3_AllAddress = new ArrayList<Address>();
		lstCust3_AllAddress.add(cust3_Address1); lstCust3_AllAddress.add(cust3_Address2); lstCust3_AllAddress.add(cust3_Address3);
		cust3.setAddress(lstCust3_AllAddress);
		
		List<String> lstCust3_Countries = new ArrayList<String>();
		lstCust3_Countries.add("India"); lstCust3_Countries.add("Germany");
		cust3.setCountry(lstCust3_Countries);
		
		cust3.setHasPrime(false);
		
		List<String> lstcust3_favPlace1 = new ArrayList<String>();
		lstcust3_favPlace1.add("Bengaluru");  lstcust3_favPlace1.add("Cuttack"); lstcust3_favPlace1.add("Darjeeling"); 
		 
		
		FavPlace cust3_FavPlace1 = new FavPlace();
		cust3_FavPlace1.setFavPlace(lstcust3_favPlace1);
		
		List<String> lstcust3_favPlace2 = new ArrayList<String>();
		lstcust3_favPlace2.add("Berlin"); 
		
		FavPlace cust3_FavPlace2 = new FavPlace();
		cust3_FavPlace2.setFavPlace(lstcust3_favPlace2);
		
		List<FavPlace> cust3_AllServices = new ArrayList<FavPlace>();
		cust3_AllServices.add(cust3_FavPlace1); cust3_AllServices.add(cust3_FavPlace2);
		
		cust3.setServices(cust3_AllServices);
		
		//Final
		List<Customer> lstCustomers = new ArrayList<Customer>();
		lstCustomers.add(cust1); lstCustomers.add(cust2); lstCustomers.add(cust3);
		
		
		RestAssured.given().log().all().body(lstCustomers).get();
		

		
		
		
		
		
	}
}
