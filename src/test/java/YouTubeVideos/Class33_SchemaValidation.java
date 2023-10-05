package YouTubeVideos;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Class33_SchemaValidation {

	//@Test
	public void test1()
	{
	
		String response = RestAssured
							.given()
								.basePath("https://restful-booker.herokuapp.com/booking")
								.contentType(ContentType.JSON)
								.body("{\r\n"
										+ "    \"firstname\" : \"Jim\",\r\n"
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
								.post()
							.then()
								.log().all()
								.extract().asString();
		
		System.out.println("Got the response");
		//MatcherAssert.assertThat(response, JsonSchemaValidator.matchesJsonSchema(System.getProperty("user.dir") + "\\jsonFiles\\Class33_Schema.json"));
								
								
	}
	
	@Test
	public void test2()
	{
		String response = RestAssured
			.given()
				.log().all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    \"firstname\" : \"Jim\",\r\n"
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
				.post()
			.then()
				.log().all().extract().asString();
		
		System.out.println("Response is - " + response);
		MatcherAssert.assertThat(response, JsonSchemaValidator.matchesJsonSchema(new File(System.getProperty("user.dir") + "\\jsonFiles\\Class33_Schema.json")));
			
		/*Output ---------
		 * 
		 * error: numeric instance is lower than the required minimum (minimum: 10000, found: 3698)
	    level: "error"
	    schema: {"loadingURI":"#","pointer":"/properties/bookingid"}
	    instance: {"pointer":"/bookingid"}
	    domain: "validation"
	    keyword: "minimum"
	    minimum: 10000
	    found: 3698
	    
	    	
		 */
		
	}
}
