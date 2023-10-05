package YouTubeVideos;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

//For Update 
public class Class11_PutRequest {

	public static void main(String[] args) {
		Map<String,Object> mapHeaders = new HashMap<String, Object>();
		mapHeaders.put("Content-Type", "application/json");
		mapHeaders.put("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=");
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/1")
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
			.headers(mapHeaders)
		.when()
			.put()
		.then()
			.log()
			.all()
			.statusCode(200);
		
		//Getting the value after update
		System.out.println("----------Response after updatetion---------");
		System.out.println(RestAssured.get("https://restful-booker.herokuapp.com/booking/1").asPrettyString());
			
	}
}
