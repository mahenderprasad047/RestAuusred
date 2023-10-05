package YouTubeVideos;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class Class28_GettingValueFromComplexJson {

	public static void main(String[] args) {
		String jsonFile = "[\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"Mahender\",\r\n"
				+ "    \"Lastname\": \"Prasad\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"Apartment\": {\r\n"
				+ "        \"block\": \"D\",\r\n"
				+ "        \"flatNumber\": 156\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"Mukesh\",\r\n"
				+ "    \"Lastname\": \"Otwani\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"Apartment\": {\r\n"
				+ "        \"block\": \"C\",\r\n"
				+ "        \"flatNumber\": 333\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"Atharv\",\r\n"
				+ "    \"Lastname\": \"Gupta\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"Apartment\": {\r\n"
				+ "        \"block\": \"A\",\r\n"
				+ "        \"flatNumber\": 111\r\n"
				+ "      }\r\n"
				+ "    },\r\n"
				+ "    \"Age\" : 3\r\n"
				+ "  },\r\n"
				+ "  \"Hello\",\r\n"
				+ "  123,\r\n"
				+ "  true\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(jsonFile);
		System.out.println("Size of the Json File - " + jp.getList("$").size());
		System.out.println(jp.get("[0]"));
		System.out.println(jp.get("[4]"));
		System.out.println("Flat Number of mahender - "+jp.getString("[0].address.Apartment.flatNumber"));
		
		String jsonFile1 = "[\r\n"
				+ "  [1,\r\n"
				+ "  2,\r\n"
				+ "  3],\r\n"
				+ "  \r\n"
				+ "  [10,\r\n"
				+ "  20,\r\n"
				+ "  30],\r\n"
				+ "  \r\n"
				+ "  [100,\r\n"
				+ "  200,\r\n"
				+ "  300]\r\n"
				+ "]";
		
		JsonPath jp1 = new JsonPath(jsonFile1);
		System.out.println("Size of the Json File - " + jp1.getList("$").size());	//Size of parent jason
		System.out.println("0,1 - " + jp1.get("[0][1]"));
		System.out.println("2,2 - "+ jp1.get("[2][2]"));
	
		List<String> lst = (List<String>) jp1.getList("$").get(0);
		System.out.println("Size of the child array jason - " + lst.size());	//Size of the child array jason
		
	}
}
