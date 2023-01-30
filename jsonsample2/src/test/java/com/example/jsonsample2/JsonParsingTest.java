package com.example.jsonsample2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsingTest {

	@Test
	public void testParse() {
		ObjectMapper defaultObjectMapper = new ObjectMapper();
		URL url = JsonParsing.class.getClassLoader().getResource("app_data.json");
		 File file = new File(url.getFile());
		try {
			
			assertNotNull("Object mapper not avaialble", defaultObjectMapper);
			QuoteResponse data = defaultObjectMapper.readValue(file, QuoteResponse.class);
			
			assertFalse("Data is not available", data.getQuote().isEmpty());
			for(Quote q : data.getQuote()) {
				System.out.println("Market :  "+ q.getMarket());
				System.out.println( "Date :  "+q.getDate());
				assertFalse("Data is not available", q.getValues().isEmpty());
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
