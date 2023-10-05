package YouTubeVideos;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

//Here "RequestSpecification" and "Response" both are interfaces
public class Class5_PostCall {

	public static void main(String[] args) 
	{
		//Details about the request
		RequestSpecification spec = RestAssured.given();
		spec = spec.log().all();
		spec.baseUri("https://restful-booker.herokuapp.com/");
		spec.basePath("booking");
		spec.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}");
		spec.contentType(ContentType.JSON);
		
		//Fire the request
		Response resp = spec.post();
		
		//Verify the response
		ValidatableResponse responseToValid = resp.then().log().all();
		responseToValid.statusCode(200);
		System.out.println("-----Response--------");
		System.out.println(resp.asPrettyString());
		Assert.assertEquals(resp.getStatusCode(), 200);
		
		System.out.println("-------From Response Json------");
		JsonPath json = resp.jsonPath();
		System.out.println("Booking ID - "+ json.get("bookingid"));
		System.out.println("CheckOut date - "+ json.get("bookingdates.checkout"));
		
		

	}

}
