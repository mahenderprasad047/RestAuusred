package YouTubeVideos;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Class38_39_40_41_ResponseDesrialization {
	
	// URL to mock a response : https://designer.mocky.io/design
	//Refer "jsonFiles\Class38_39_40_41.json" for reference
	
	@Test
	public void Test1()
	{
		//	https://run.mocky.io/v3/cb1cb314-2d65-4493-83b2-816f744bc8cc -  Return is Map
		//	https://run.mocky.io/v3/42eb1d50-bae3-4d53-bdb2-d9f2529655e5 - Return is List
		
		System.out.println("--------Inside Test1-----");
		Response resp = RestAssured.get("https://run.mocky.io/v3/cb1cb314-2d65-4493-83b2-816f744bc8cc");
		Object respAsObject = resp.as(Object.class);
		
		if(respAsObject instanceof Map)
		{
			Map respAsMap = resp.as(Map.class);
			System.out.println("Keys are - " + respAsMap.keySet());
			System.out.println("Values are - " + respAsMap.values());
		}
		else if(respAsObject instanceof List)
		{
			List respAsList = resp.as(List.class);
			System.out.println("List Size - " + respAsList.size());
			System.out.println("1st item of list - " + respAsList.get(0));
		}
	}
	
	@Test
	public void Test2()
	{
		//	https://run.mocky.io/v3/cb1cb314-2d65-4493-83b2-816f744bc8cc -  Return is Map
		//	https://run.mocky.io/v3/42eb1d50-bae3-4d53-bdb2-d9f2529655e5 - Return is List
		System.out.println("--------Inside Test2-----");
		Response resp = RestAssured.get("https://run.mocky.io/v3/42eb1d50-bae3-4d53-bdb2-d9f2529655e5");
		Object respAsObject = resp.as(Object.class);
		
		if(respAsObject instanceof Map)
		{
			Map respAsMap = resp.as(Map.class);
			System.out.println("Keys are - " + respAsMap.keySet());
			System.out.println("Values are - " + respAsMap.values());
		}
		else if(respAsObject instanceof List)
		{
			List respAsList = resp.as(List.class);
			System.out.println("List Size - " + respAsList.size());
			System.out.println("1st item of list - " + respAsList.get(0));
		}
	}

}

			/*
			 * --------Inside Test1-----
		Keys are - [FirstName, Age, State]
		Values are - [Mahender, 32, KA]
		--------Inside Test2-----
		List Size - 2
		1st item of list - {FirstName=Mahender, Age=32, State=KA}
		
		*/
