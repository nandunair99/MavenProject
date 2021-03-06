package com.mycompany.app;

import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {

	public static void main(String args[])
	{
		ObjectMapper mapper=new ObjectMapper();

		try {
			String json="{\r\n"
					+ "\"employees\":[\"John\", \"Anna\", \"Peter\"]\r\n"
					+ "}";
			Map<String,ArrayList<String>> map=mapper.readValue(json,new TypeReference<Map<String,ArrayList<String>>>(){});
			System.out.println(map.get("employees"));
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
