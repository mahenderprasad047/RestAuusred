import io.restassured.RestAssured;

public class Class9_URI_Path_Parameters {

	//Example of Parametrization
	public static void main(String[] args) {
		RestAssured.given()
			.log().all().baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basePath}/{id}")
			.pathParam("basePath", "booking")
			.pathParam("id", 2)
		.when()
			.get()
		.then()
			.log().all()
			.statusCode(200);
		
		//Another way
	System.out.println("---------2nd Way---------");
		RestAssured.given()
		.log().all()
	.when()
		.get("https://restful-booker.herokuapp.com/{basePath}/{id}","booking",2)
	.then()
		.log().all()
		.statusCode(200);
		
		//Another way
	System.out.println("---------3rd Way---------");
		RestAssured.given()
		.log().all()
		.pathParam("id", 2)
	.when()
		.get("https://restful-booker.herokuapp.com/{basePath}/{id}","booking")
	.then()
		.log().all()
		.statusCode(200);
	}
}
