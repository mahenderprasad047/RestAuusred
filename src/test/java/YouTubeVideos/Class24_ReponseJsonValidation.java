package YouTubeVideos;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Class24_ReponseJsonValidation {

	public static void main(String[] args) {
		
		String json = "{\r\n"
				+ "  \"firstname\" : \"Mahender\",\r\n"
				+ "  \"Lastname\" : \"Prasad\"\r\n"
				+ "}";
		
		JsonPath jsonpath = new JsonPath(json);
		
		System.out.println(jsonpath.get());
		System.out.println(jsonpath.get("$"));
		System.out.println(jsonpath.getString("$"));
		
		/* ---Output----
		 {firstname=Mahender, Lastname=Prasad}
		{firstname=Mahender, Lastname=Prasad}
		[firstname:Mahender, Lastname:Prasad]
		*/
		
	}
}
