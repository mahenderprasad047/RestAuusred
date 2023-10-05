package YouTubeVideos;

import io.restassured.RestAssured;

public class Class16_ExtractReponseBody {
	
	public static void main(String[] args) {
		
		//Using Extract-asString method
		String NormalFormat = RestAssured
			.given()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/1")
			.when()
				.get()
			.then()
				.extract().body().asString();
		System.out.println("NormalFormat - "+ NormalFormat);
		System.out.println("------------------------------");
		
		//Using Extract-asString method
		String prettyFormat = RestAssured
		.given()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/1")
		.when()
			.get()
		.then()
			.extract()
			.asPrettyString();
		System.out.println("prettyFormat - "+ prettyFormat);
		System.out.println("------------------------------");
	}

}
