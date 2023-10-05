package YouTubeVideos;

import io.restassured.path.json.JsonPath;

class Class25_26_NestedJSOn {

	public static void main(String[] args) {
		
		String jsonFile = "\r\n"
				+ "{\r\n"
				+ "  \"firstname\" : \"Mahender\",\r\n"
				+ "  \"Lastname\" : \"Prasad\",\r\n"
				+ "  \"address\" : {\"Apartment\" : {\"block\" : \"D\",\r\n"
				+ "    \"flatNumber\" : 156\r\n"
				+ "  }\r\n"
				+ "    \r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "";
		
		JsonPath jp = new JsonPath(jsonFile);
		
		System.out.println("FlatNumber - "+ jp.get("address.Apartment.flatNumber"));
	}
}
