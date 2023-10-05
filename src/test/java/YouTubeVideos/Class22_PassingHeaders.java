package YouTubeVideos;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Header;

public class Class22_PassingHeaders {

	public static void main(String[] args) {
		
		Header header3 = new Header("H3","H3_V1");
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("H4", "H4_V1");
		map.put("H4", "H4_V1");	//Repeated same so it will be merged/Concatanated
		
		RestAssured.given().log().all().header("H1","H1_V1").header("H1","H1_V2")
		.header("H2","H2_V1","H2_V2","H2_V3")
		.header("H1","H1_V3").header(header3).headers(map).get();
		
		/*Output :
		Headers:		H1=H1_V1
				H1=H1_V2
				H2=H2_V1
				H2=H2_V2
				H2=H2_V3
				H1=H1_V3
				H3=H3_V1
				H4=H4_V1
				Accept=*//*
		*/
		
	}
}
