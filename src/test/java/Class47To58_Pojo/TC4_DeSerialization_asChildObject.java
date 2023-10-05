package Class47To58_Pojo;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TC4_DeSerialization_asChildObject 
{
	@Test
	public void Test1()
	{
	
		Response resp = RestAssured.get("https://run.mocky.io/v3/df6d35be-d1a8-4fde-9674-f566e3e9c97e");
		System.out.println("---------Response in pretty format------------ "+ resp.asPrettyString());
		
		JsonPath json = resp.jsonPath();
		Address add = json.getObject("Address[0]", Address.class);
		System.out.println("Mukesh >> 3rd Address >> State is - " + add.getState());


		
		
	}
}
