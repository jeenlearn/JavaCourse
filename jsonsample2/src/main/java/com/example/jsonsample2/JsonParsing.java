package com.example.jsonsample2;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * This is the Json parsing class where the parsing takes place.
 * It has a method getDefaultObjectMapper which returns an ObjectMapper 
 * another method parse which takes the file and display the parsed output.
 * @author jeena
 * @version 1.0
 *
 */

public class JsonParsing {
	
	 private static ObjectMapper objectMapper = getDefaultObjectMapper();
	
	 private static ObjectMapper getDefaultObjectMapper() {
			
		 	ObjectMapper defaultObjectMapper = new ObjectMapper();
			defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return defaultObjectMapper;
	}
	 
	 public static void parse(File file) {
		 
		 try {
			  	QuoteResponse data = objectMapper.readValue(file, QuoteResponse.class);
			 		
			 		for(Quote q : data.getQuote()) {
						System.out.println("Market :  "+ q.getMarket());
						System.out.println( "Date :  "+q.getDate());
						for(QuoteValues v :q.getValues()) {
							System.out.println(v.getTlabel()+" : "+v.getValue());
							
						}
					}
					
				
			} catch (StreamReadException e) {
				e.printStackTrace();
			} catch (DatabindException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
	 }
	 
	
	 
}



