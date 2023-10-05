package YouTubeVideos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	//Check testng.xml file for more information
	//in case some values of requestSpecification is not mentioned then it will take the default values
		//which are stored in RestAssured class in "Public Static final" format
public class Class21_DefaultValueWithHooks 
{

	@BeforeTest
	public void test()
	{
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		RestAssured.basePath = "booking/1";
		RequestSpecification spec = RestAssured.given().log().all();
	}
	@Test
	public void test1()
	{
		System.out.println(RestAssured.get().asPrettyString());
	}
}
