package YouTubeVideos;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

	//Not storing the response in json - rather verifying after getting the response in same line of code 
			//Using Matchers class funtions - it works as Assertions in RestAssured
public class Class31_InlineAssertionWithMatchersFunc {

	@Test
	public void test1()
	{
		RestAssured
			.given()
				.baseUri("https://restful-booker.herokuapp.com/booking")
				.log().all()
			.when()
				.get()
			.then()
				.log().all()
				.body("bookingid", Matchers.hasItem(2))			//Pass
				.body("bookingid", Matchers.hasItems(2,222));		//Fail
		
	}
	
	//--------Another way - Without using Inline command
	@Test
	public void test2()
	{
		String response = RestAssured
			.given()
				.baseUri("https://restful-booker.herokuapp.com/booking")
				.log().all()
			.when()
				.get()
			.then()
				.extract()
				.asString();
		
		JsonPath jp = new JsonPath(response);
		List<Integer> lst = jp.getList("bookingid");
		System.out.println("List of Booking Ids - "+ lst);
		Assert.assertEquals(lst.contains(2), true);					//Pass
		Assert.assertEquals(lst.contains(9999), true,"Booking Id Not Found");		//Fail
		System.out.println("End of execution");
	}
}
