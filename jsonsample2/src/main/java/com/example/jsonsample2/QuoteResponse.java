package com.example.jsonsample2;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * This is the QuoteResponse class which has a list of Quotes.
 * It has the getter and setter methods also for it.
 * @author jeena
 * @version 1.0
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponse {
	

	@JsonProperty("quote")
	private List<Quote> quote;
	
	public List<Quote> getQuote() {
		return quote;
	}

	public void setQuote(List<Quote> quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "QuoteResponse [quote=" + quote + "]";
	}
}
