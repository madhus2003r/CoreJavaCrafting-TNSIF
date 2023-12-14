package com.tns.dayfive.multilevelinheritance;

public class MultilevelInherDemo {

	public static void main(String[] args) {


		City city = new City();
		city.setCityName("Bangalore");
		city.setArea(567.9f);
		city.setStateName("karnataka");
		city.setLanguage("kannada");
		city.setCountryName("India");
		city.setCapital("Delhi");
		
		System.out.println(city);
	}

}
