package com.example.jsonsample2;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * This is the Quote class which has properties Market,Date and list of QuoteValues.
 * It has the getter and setter methods also for all the properties.
 * @author jeena
 * @version 1.0
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	private String market;
	@JsonProperty("date_applied")
	private Date date;
	@JsonProperty("values")
	private List<QuoteValues> values;
	
	
	public Quote() {
		
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public List<QuoteValues> getValues() {
		return values;
	}
	public void setValues(List<QuoteValues> values) {
		this.values = values;
	}
	public Quote(String market, Date date, List<QuoteValues> values) {
		super();
		this.market = market;
		this.date = date;
		this.values = values;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date string) {
		this.date = string;
	}
	@Override
	public String toString() {
		return "Quote [market=" + market + ", date=" + date + ", values=" + values + "]";
	}
	
	

}
