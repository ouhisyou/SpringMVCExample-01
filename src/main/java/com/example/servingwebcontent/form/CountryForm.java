package com.example.servingwebcontent.form;

import lombok.Data;

@Data
public class CountryForm {
	
	private String cd;
	
	private String name;
	
	public CountryForm() {
		this.cd = "";
		this.name = "";
	}
	
	public CountryForm(String cd, String name){
		this.cd = cd;
		this.name = name;
	}
}