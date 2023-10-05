package YouTubeVideos;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

//given() method is an overloaded method but then() method is NOT
//RequestSpec and ResponseSpec both can be passed to given method if not other information is added later
		//it means RequestSpec should contain requestBody too
public class Class19__UsingRequestAndResposeSpec 
{

	@Test
	public void Test1()
	{
		RequestSpecification reqspec;
		ResponseSpecification resSpec;
		
		Map<String,Object> mapHeaders = new HashMap<String, Object>();
		mapHeaders.put("Content-Type", "application/json");
		mapHeaders.put("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=");
		
		reqspec = RestAssured.given();
		reqspec.baseUri("https://restful-booker.herokuapp.com/");
		reqspec.basePath("booking").headers(mapHeaders);
		
		//Works as Assert
		resSpec = RestAssured.expect();
		resSpec.statusCode(202);	//Expected is 200	//Making the script fail to see the Assert part
		resSpec.contentType(ContentType.JSON);
		resSpec.time(Matchers.lessThan(5000L));
		
		RestAssured
			.given(reqspec)	//given method is overloaded but then is not!
			//.spec(reqspec)
			.body("{\r\n"
					+ "    \"firstname\" : \"Mahender\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
		.when()
			.post()
		.then()
			.log().all()
			.spec(resSpec);
		
		
		
		 
		 
	}
}
