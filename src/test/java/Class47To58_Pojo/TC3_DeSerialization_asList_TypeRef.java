package Class47To58_Pojo;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TC3_DeSerialization_asList_TypeRef 
{

	//From Mockey : https://run.mocky.io/v3/5c46b2b9-8aee-464e-8a32-c395457a0748
	@Test
	public void Test1()
	{
	
		Response resp = RestAssured.get("https://run.mocky.io/v3/df6d35be-d1a8-4fde-9674-f566e3e9c97e");
		//System.out.println("Response in pretty format "+ resp.asPrettyString());
		
		List<Customer> lstCustomers = resp.as(new TypeRef<List<Customer>>() {});		//lstCustomers will have customer details in List format
		
		System.out.println("Number of Customers - " + lstCustomers.size());
		//System.out.println("Amod's Countries - " + lstCustomers.get(2).getCountry());
		
		//-------Mukesh 3rd address-state using Object
		//Address mukeshAddress = lstCustomers.get(1).getAddress().get(2);
		//System.out.println("State is -" + mukeshAddress.getState());
		
		
	}
}
