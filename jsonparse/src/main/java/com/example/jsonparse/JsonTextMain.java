package com.example.jsonparse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonTextMain {

	public static void main(String[] args) {
		String jsonSource = "{ \"title\":\"Json parser\"}";
		try {
			JsonNode node =Json.parse(jsonSource);
			System.out.println(node.get("title").asText());
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
	}

}
