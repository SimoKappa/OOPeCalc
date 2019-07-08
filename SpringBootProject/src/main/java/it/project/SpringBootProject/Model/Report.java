package it.project.SpringBootProject.Model;

public class Report {
	private String country;
	private String refPeriod;
	private String item;
	private String code;
	private double value;
	private int extraction;
	private int nca;
	
	public Report (String countryString, String refPeriodString, String itemString, String codeString, double value, int extraction, int nca) {
		this.country = countryString;
		this.refPeriod = refPeriodString;
		this.item = itemString;
		this.code = codeString;
		this.value = value;
		this.extraction = extraction;
		this.nca = nca;
	}
	
	public String getCountry() {
		return country;
	}
	public String getRefPeriod() {
		return refPeriod;
	}
	public String getItem() {
		return item;
	}
	public String getCode() {
		return code;
	}
	public double getValue() {
		return value;
	}
	public int getExtraction() {
		return extraction;
	}
	public int getNca() {
		return nca;
	}
	
	public String toString() {
		return "Record [ country = " + this.country + ", refPeriod = " + this.refPeriod + ", item = " + this.item + "]";
	}
}