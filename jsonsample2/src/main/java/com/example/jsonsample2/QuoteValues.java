package com.example.jsonsample2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * This is the QuoteValues class which has properties tLabel and Value.
 * It has the getter and setter methods also for it.
 * @author jeena
 * @version 1.0
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteValues {
	
	@JsonProperty("tLabel")
	private String tlabel;
	private String value;
	
	public String getTlabel() {
		return tlabel;
	}
	public void setTlabel(String tlabel) {
		this.tlabel = tlabel;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public QuoteValues(String tlabel,  String value) {
		super();
		this.tlabel = tlabel;
		this.value = value;
	}
	public QuoteValues() {
		
	}
	@Override
	public String toString() {
		return "QuoteValues [tlabel=" + tlabel + ", value=" + value + "]";
	}

}
