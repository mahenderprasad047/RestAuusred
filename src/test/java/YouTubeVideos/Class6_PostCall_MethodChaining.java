package YouTubeVideos;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

//Example of method chaining or Builder Pattern
public class Class6_PostCall_MethodChaining {

	public static void main(String[] args) {
		RequestSpecification spec = RestAssured.given()
				.log().all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
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
				.contentType(ContentType.JSON);
		
		//Fire the request
		Response resp = spec.post();
		
		//Verify the response
		ValidatableResponse responseToValid = resp.then().log().all();
		responseToValid.statusCode(200);
	}
}
