package YouTubeVideos;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class Class30_JsonResponseFilter {
	
	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir") + "\\jsonFiles\\Class30.json";
		System.out.println("Jason FIle path - "+ filePath);
		File jsonFile = new File(filePath);
		
		JsonPath jp = new JsonPath(jsonFile);
		
		System.out.println("All firstName - "+ jp.getString("FirstName"));
		
		//Get the firstname for the person whose age is lless than 20
		List<String> lst = jp.getList("findAll{it.Age <20 }.FirstName");
		System.out.println("firstname for the person whose age is lless than 20 - " + lst);
		
		//Find 'all' email - if firstname is 'Mahender' OR ends with 'Prasad'
		System.out.println(jp.getList("findAll{it.FirstName == 'Mahender' || it.LastName == 'Prasad'}.emailId"));
		
		//Find 'first' email - if firstname is 'Mahender' OR ends with 'Prasad'
		System.out.println(jp.get("find{it.FirstName == 'Mukesh' || it.LastName == 'Prasad'}.emailId"));
		
		String filePath1 = System.getProperty("user.dir") + "\\jsonFiles\\Class30_2.json";
		System.out.println("Jason FIle2 path - "+ filePath1);
		File jsonFile1 = new File(filePath1);
		JsonPath jp1 = new JsonPath(jsonFile1);
		
		//Find 'all' email - if firstname is 'Mahender' OR ends with 'Prasad' from Files
		System.out.println("From File2 " + jp1.getList("data.findAll{it.LastName == 'Prasad'}.emailId"));
		
		
	}

}
