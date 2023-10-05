package YouTubeVideos;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
	
	//TO update partially
public class Class13_PatchRequest {

	public static void main(String[] args) {
		Map<String, Object> mapHeader = new HashMap<String, Object>();
		mapHeader.put("Content-Type", "application/json");
		mapHeader.put("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=");
		
		RestAssured
			.given()
				.log().all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/2")
				.headers(mapHeader)
				.body("{\r\n"
						+ "    \"firstname\" : \"Mahender\",\r\n"
						+ "    \"lastname\" : \"Prasad\"\r\n"
						+ "}")
			.when()
				.patch()
			.then()
				.log().all()
				.statusCode(200);
		
		System.out.println("-------Getting Updated Details------");
		System.out.println(RestAssured.get("https://restful-booker.herokuapp.com/booking/1").asPrettyString());
		
	}
}
