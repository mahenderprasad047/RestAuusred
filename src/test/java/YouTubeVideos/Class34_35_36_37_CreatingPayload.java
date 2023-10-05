package YouTubeVideos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class Class34_35_36_37_CreatingPayload {

	
	// Refer 'jsonFiles\Class34_35_36_37.json' file
	
	public static void main(String[] args) {
		
		//Index-0
		Map<String,Object> map1 = new LinkedHashMap<String, Object>();
		map1.put("id", "0001");
		map1.put("type", "donut");
		map1.put("name", "Cake");
		map1.put("ppu", 0.55);
		
		Map<String,String> better1_1 = new LinkedHashMap<String, String>();
		better1_1.put("id", "1001");
		better1_1.put("type", "Regular");
		
		Map<String,String> better1_2 = new LinkedHashMap<String, String>();
		better1_2.put("id", "1002");
		better1_2.put("type", "Chocolate");
		
		Map<String,String> better1_3 = new LinkedHashMap<String, String>();
		better1_3.put("id", "1003");
		better1_3.put("type", "Blueberry");
		
		List<Map<String,String>> batter1 = new ArrayList<Map<String,String>>();
		batter1.add(better1_3);
		batter1.add(better1_2);
		batter1.add(better1_3);
		
		Map<String,List<Map<String,String>>> battermap = new LinkedHashMap<String, List<Map<String,String>>>();
		battermap.put("batter", batter1);
		map1.put("batters", battermap);
		
		Map<String,String> topping1_1 = new LinkedHashMap<String, String>();
		topping1_1.put("id", "5001");
		topping1_1.put("type", "None");
		
		Map<String,String> topping1_2 = new LinkedHashMap<String, String>();
		topping1_2.put("id", "5002");
		topping1_2.put("type", "Glazed");
		
		List<Map<String,String>> lstTopping1 = new ArrayList<Map<String,String>>();
		lstTopping1.add(topping1_1);
		lstTopping1.add(topping1_2);
		map1.put("topping", lstTopping1);
		
		//2nd
		Map<String,Object> map2 = new LinkedHashMap<String, Object>();
		map2.put("id", "0002");
		map2.put("type", "donut");
		map2.put("name", "Raised");
		map2.put("ppu", 0.55);
		
		Map<String,String> mapBatter2_1 = new LinkedHashMap<String, String>();
		mapBatter2_1.put("id", "1001");
		mapBatter2_1.put("type", "Regular");
		
		List<Map<String,String>> lstBatter2 = new ArrayList<Map<String,String>>();
		lstBatter2.add(mapBatter2_1);
		
		Map<String,List<Map<String,String>>> mapBatters2 = new LinkedHashMap<String, List<Map<String,String>>>();
		mapBatters2.put("batter", lstBatter2);
		
		map2.put("batters", mapBatters2);
		
		List<Object> lstTopping2 = new ArrayList<Object>();
		lstTopping2.add(5001);lstTopping2.add("Mahender");lstTopping2.add(true);lstTopping2.add(10.5);
		
		map2.put("topping", lstTopping2);
		
		List<Object> lstFinalBody = new ArrayList<Object>();
		lstFinalBody.add(map1);lstFinalBody.add(map2);
		
		
		
		
		
		
		RestAssured.given().log().all().body(lstFinalBody).get();
	}
}
