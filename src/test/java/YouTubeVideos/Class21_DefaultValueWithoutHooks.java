package YouTubeVideos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	//Here "basepath" is overwritten
public class Class21_DefaultValueWithoutHooks 
{

	
	@Test
	public void test1()
	{
		System.out.println(RestAssured.given().basePath("auth").contentType("application/json") .body("{\r\n"
				+ "    \"username\" : \"admin\",\r\n"
				+ "    \"password\" : \"password123\"\r\n"
				+ "}").post().asPrettyString());
	}
}
