package com.hemasreepractise.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String country;
	private String city;
	private String place;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	private LinkedHashMap<String,String> cityOptions;
	private LinkedHashMap<String,String> favoriteLanguageOptions;
	
	public LinkedHashMap<String, String> getCityOptions() {
		return cityOptions;
	}

	public Student() {
		// set the cityoptions
		cityOptions=new LinkedHashMap<String, String>();
		cityOptions.put("HYD", "Hyderabad");
		cityOptions.put("DEL", "Delhi");
		cityOptions.put("BGL", "Banglore");
		cityOptions.put("BOM", "Mumbai");
		
		// set the language options
		favoriteLanguageOptions=new LinkedHashMap<String, String>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Angular", "Angular");
		favoriteLanguageOptions.put("Python", "Python");
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
