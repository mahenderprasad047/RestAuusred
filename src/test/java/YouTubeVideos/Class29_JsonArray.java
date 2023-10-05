package YouTubeVideos;

import io.restassured.path.json.JsonPath;

public class Class29_JsonArray {

	public static void main(String[] args) {
		
		String jsonFile = "[\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"Mahender\",\r\n"
				+ "    \"lastname\": \"Prasad\",\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"Jamshedpur\",\r\n"
				+ "        \"state\": \"Jharkhand\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"Bengaluru\",\r\n"
				+ "        \"state\": \"Karnataka\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city1\": \"Kolkata\",\r\n"
				+ "        \"state1\": \"WB\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"Mukesh\",\r\n"
				+ "    \"lastname\": \"Otwani\",\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"Bhopal\",\r\n"
				+ "        \"state\": \"Uttrakhand\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"Bengaluru\",\r\n"
				+ "        \"state\": \"Karnataka\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(jsonFile);
		System.out.println("First City where Mahender lives - "+jp.get("[0].address[0].city"));
		System.out.println("City where Mukesh lives - "+jp.get("[1].address.city"));
		System.out.println("All City in json - "+jp.getList("address.city"));	//to get all the cities
		
		
		
		
		
	}
}

/*
[
{
  "firstname": "Mahender",
  "lastname": "Prasad",
  "address": [
    {
      "city": "Jamshedpur",
      "state": "Jharkhand"
    },
    {
      "city": "Bengaluru",
      "state": "Karnataka"
    },
    {
      "city1": "Kolkata",
      "state1": "WB"
    }
  ]
},
{
  "firstname": "Mukesh",
  "lastname": "Otwani",
  "address": [
    {
      "city": "Bhopal",
      "state": "Uttrakhand"
    },
    {
      "city": "Bengaluru",
      "state": "Karnataka"
    }
  ]
}
]
*/