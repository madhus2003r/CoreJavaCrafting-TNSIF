package com.tnsif.daythree.Encapsulation;

public class Person {
	
	 public static void main(String[] args) {
	        // Creating an instance of the Person class
	        Person person = new Person();

	        // Setting values using setters
	        person.setName("John");
	        person.setIncome(50000);
	        person.setGender("Male");
	        person.setAge(30);
	        person.setTax(1000);
	        System.out.println(person);
	 }
    // Data Members
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    // Object class method to return string representation of person object
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
                + "]";
    }
}

