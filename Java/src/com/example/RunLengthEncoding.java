package com.example;

public class RunLengthEncoding {
	
	public String encode(String input) {
		//check for null in input
		if(input == null || input.length() == 0) {
			return "";
		}
		char[] inputChars = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		char prevChar =0;
		int counter =1;
		for(char c : inputChars) {
			if(c == prevChar)
				counter++;
			else 
				if( prevChar != 0  ) {
				sb.append(counter).append(prevChar);
				counter =1;
				}
			prevChar = c;
			
		}
		sb.append(counter).append(prevChar);
		return sb.toString();
	}

	public static void main(String[] args) {
		
		RunLengthEncoding rn = new RunLengthEncoding();
		String output =rn.encode("aaaabbcccc");
		System.out.println("Output String is  "+ output);
		
	}

}
