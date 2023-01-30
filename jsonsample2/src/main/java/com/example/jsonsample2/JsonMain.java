package com.example.jsonsample2;

import java.io.File;
import java.net.URL;
/**
 * This is the main class where the parsing program starts.
 * It calls the parse method.
 * @author jeena
 * @version 1.0
 *
 */

public class JsonMain {

	public static void main(String[] args) {
		
		 URL url = JsonParsing.class.getClassLoader().getResource("app_data.json");
		 File file = new File(url.getFile());
		 JsonParsing.parse(file);

	}

}
