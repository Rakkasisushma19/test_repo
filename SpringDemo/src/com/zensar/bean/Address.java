package com.zensar.bean;

public class Address {
	private String doorNumber;
	private String streetName;
	private String city;
	private String ciuntry;
	private String pincode;
	public Address(String doorNumber, String streetName, String city, String ciuntry, String pincode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.city = city;
		this.ciuntry = ciuntry;
		this.pincode = pincode;
	}
	
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCiuntry() {
		return ciuntry;
	}
	public void setCiuntry(String ciuntry) {
		this.ciuntry = ciuntry;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", city=" + city + ", ciuntry="
				+ ciuntry + ", pincode=" + pincode + "]";
	}


	
}
