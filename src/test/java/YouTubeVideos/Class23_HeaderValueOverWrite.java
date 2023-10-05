package YouTubeVideos;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;

	//Using Config method - OverWrite and Merge option
	
public class Class23_HeaderValueOverWrite 
{
	//@Test
	public void test1()
	{
		
		RestAssured.given().log().all()
		.header("H1","H1_V1")
		.header("H1","H1_V1")
		.get();
		
		/* Headers:		H1=H1_V1
				H1=H1_V1
				Accept=*//*
		*/
	}
	
	//@Test
	public void OverWritetest()
	{
		//Header is overWritten
		RestAssured.given().log().all()
		.config(RestAssuredConfig.config().headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("H1")))
		.header("H1","H1_V1")
		.header("H1","H1_V1")
		.get();
		
		/*
		Headers:		H1=H1_V1
				Accept=*//*
		*/
	}
	
	@Test
	public void MultipleConfigChnage()
	{
		//In case 2 config is used - the last one will be effective - here Overwrite not happening for H2 as well
		RestAssured.given().log().all()
		.config(RestAssuredConfig.config().headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("H1","H2")))
		.config(RestAssuredConfig.config().headerConfig(HeaderConfig.headerConfig().mergeHeadersWithName("H1")))
		.header("H1","H1_V1")
		.header("H1","H1_V1")
		.header("H2","H2_V1")
		.header("H2","H2_V2")
		.get();
		
		/*
		 * Headers:		H1=H1_V1
				H1=H1_V1
				H2=H2_V1
				H2=H2_V2
				Accept=*//*
		*/
		
		
	}
}
