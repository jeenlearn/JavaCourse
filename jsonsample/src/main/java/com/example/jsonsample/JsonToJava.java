package com.example.jsonsample;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	 public static void main(String [] args) {
		 
		 URL url = JsonToJava.class.getClassLoader().getResource("Employee.txt");
		 File file = new File(url.getFile());
		 
		 ObjectMapper objectmapper = new ObjectMapper();
		 try {
			Employee employee = objectmapper.readValue(file, Employee.class);
			System.out.println(" Id : "+employee.getEmpId() +" Name : "+employee.getName()+ " Company : "+employee.getCmpName());
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}

/*
	
Quote quote = new Quote();
QuoteValues quoteValue = new QuoteValues();
	while (!jsonParser.isClosed()) {
		JsonToken jsonToken = jsonParser.nextToken();
		//System.out.println(jsonToken);
		if(JsonToken.FIELD_NAME.equals(jsonToken)) {
			String fieldName = jsonParser.getCurrentName();
			//System.out.println(fieldName);
			jsonToken = jsonParser.nextToken();
			
			if("market".equals(fieldName)) {
				quote.setMarket(jsonParser.getValueAsString());
				System.out.println("Market :"+quote.getMarket());
			}
			else if("date_applied".equals(fieldName)) {
				quote.setDate(jsonParser.getValueAsString());
				System.out.println("Date :"+quote.getDate());
			}
			else if("tLabel".equals(fieldName)) {
				quoteValue.setTlabel(jsonParser.getValueAsString());
				System.out.println("Label :"+jsonParser.getValueAsString());
			}
			else if("value".equals(fieldName)) {
				quoteValue.setValue(jsonParser.getValueAsString());
				System.out.println("Value :"+quoteValue.getValue());
			}
		}
*/