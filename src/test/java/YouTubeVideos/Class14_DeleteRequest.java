package YouTubeVideos;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

	//Status code is "201" if successfully deleted or "405" if the resource is not found to delete
public class Class14_DeleteRequest {

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
			.when()
				.delete()
			.then()
				.log().all()
				.statusCode(201);
		
		System.out.println("-------Get the details of deleted resource------");
		System.out.println(RestAssured.get("https://restful-booker.herokuapp.com/booking/1").asPrettyString());
			
	}
}
