package api.Tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;

public class CovertingHashmaptoJSON {

	@Test
	public void covertjson() {
		
		HashMap obj=new HashMap();
		obj.put("name", "ankit");
		obj.put("id", "2345");
		System.out.println("hashmap "+obj);
      ObjectMapper objmapper=new ObjectMapper();
      try {
		String json=objmapper.writeValueAsString(obj);
		
		System.out.println(json);
	} catch (JsonProcessingException e) {
		e.printStackTrace();
	}
	}
	
}
