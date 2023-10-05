package YouTubeVideos;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

public class Class20_ResponseTime {

	public static void main(String[] args) {
		Response resp = RestAssured.get("https://restful-booker.herokuapp.com/booking/1");
		
		System.out.println("Reponse time in MS - "+ resp.time());
		System.out.println("Reponse time in Sec - "+ resp.timeIn(TimeUnit.SECONDS));
		System.out.println("Reponse time in MS - "+ resp.getTime());
		System.out.println("Reponse time in Sec - "+ resp.getTimeIn(TimeUnit.SECONDS));
		
		//Assertions
		ValidatableResponse result= resp.then();
		result.time(Matchers.lessThan(5000L));
		result.time(Matchers.greaterThan(1000L));
		//result.time(Matchers.both((Matchers.greaterThan(1000L)).and (Matchers.greaterThan(1000L)));
		
		result.time(Matchers.lessThan(5L),TimeUnit.SECONDS);	//time() method is overloaded
	}
}
