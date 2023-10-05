package YouTubeVideos;
import io.restassured.RestAssured;

public class Class8_GetRequest_InBDD {

	public static void main(String[] args) {
		 
		//Given
		RestAssured
		.given()
			.log().all()
			.baseUri("https://restful-booker.herokuapp.com/").basePath("booking/{id}")
			.pathParam("id", 901)
		//When
		.when()
			.get()
		//Then
		.then()
			.log().all().statusCode(404);	//Should be 200 if records available
		
	}
}
