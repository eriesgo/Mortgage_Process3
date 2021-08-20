package com.myspace.mortgage_app;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Property")
@org.kie.api.definition.type.Description("Property description")
public class Property implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Age of property")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("Address of property")
	private java.lang.String address;
	@org.kie.api.definition.type.Label("Locale")
	private java.lang.String locale;
	@org.kie.api.definition.type.Label("Sale Price")
	private java.lang.Integer saleprice;

	public Property() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getLocale() {
		return this.locale;
	}

	public void setLocale(java.lang.String locale) {
		this.locale = locale;
	}

	public java.lang.Integer getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(java.lang.Integer saleprice) {
		this.saleprice = saleprice;
	}

	public Property(java.lang.Integer age, java.lang.String address,
			java.lang.String locale, java.lang.Integer saleprice) {
		this.age = age;
		this.address = address;
		this.locale = locale;
		this.saleprice = saleprice;
	}

}