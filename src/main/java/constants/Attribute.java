package constants;

import org.checkerframework.framework.qual.FromByteCode;

public enum Attribute {
	//We will write below constant before creating all below methods
	//MAX_LENGTH is a Constant,Inside the parentheses,it represents the actual attribute
	
	
	MAX_LENGTH("maxlength"),
	INNER_HTML("innerHTML"),
	PLACEHOLDER("placeholder"),
	ID("id"),
	NAME("name"),
	CLASS("class");
	
	String attribute;
	//parameterized Constructor
	//Constructor inside Enum are always private type
	
	private Attribute(String attribute) {
		this.attribute = attribute;
		
	}
	//Create getter method by variable,no need of setter
	//why getter method here?
	//When Enum call the Constant,actually it call the getter method---Important Information
	
	public String getTheAttribute() {
		return attribute;
		}
	//override from Object class
	//as Enum inherited from object class too,it can override method of Object class
	//but we are not using it
	@Override 
	public String toString() {
		return attribute;
	}

	
	
	

}
