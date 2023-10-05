package YouTubeVideos;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Class18_HooksForReponseSpecification 
{
	RequestSpecification spec;
	Object bookingID ;
	Response resp;
	
	@BeforeClass
	public void SetupRequestSpecification()
	{
		Map<String,Object> mapHeaders = new HashMap<String, Object>();
		mapHeaders.put("Content-Type", "application/json");
		mapHeaders.put("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=");
		
		 spec = RestAssured
				 	.given()
				 	.baseUri("https://restful-booker.herokuapp.com/")
					.basePath("booking").headers(mapHeaders);
	}
	
	@AfterMethod
	public void VerifyResponseSpecification()
	{
		//Getting the value after update
		System.out.println("----------Response after updatetion---------");
		bookingID = resp.jsonPath().get("bookingid");
		System.out.println("bookingID - "+ bookingID);
		System.out.println(RestAssured.get("https://restful-booker.herokuapp.com/booking/"+ bookingID).asPrettyString());
		
		//ResponseSpecification responseSpec = RestAssured.expect();
		//responseSpec.statusCode(200);
		//responseSpec.time(Matchers.lessThan(5000L));
	}
	
	@Test
	public void Test1()
	{
		//Using direct spec object
		resp =  spec
			.body("{\r\n"
					+ "    \"firstname\" : \"Mahender\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
		.when()
			.post();
		
	}
	
	@Test
	public void Test2()
	{
		//Using ResAssured Spec() method
		Response resp =  RestAssured
		.given()
			.spec(spec)
			.body("{\r\n"
					+ "    \"firstname\" : \"Mukesh\",\r\n"
					+ "    \"lastname\" : \"Otwani\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
		.when()
			.post();
		
	}
	
}
