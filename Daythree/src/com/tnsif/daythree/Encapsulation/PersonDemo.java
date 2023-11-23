package com.tnsif.daythree.Encapsulation;

import java.util.Scanner;

public class Person {
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

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

    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }
}

class TaxCalculation {
    public void calculateTax(Person person) {
        // Example: Tax is 15% of the income
        double taxRate = 0.15;
        int income = person.getIncome();

        // Simple tax calculation logic
        int tax = (int) (income * taxRate);

        // Set the calculated tax to the Person object
        person.setTax(tax);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Scanner object to accept user inputs
        Scanner ob = new Scanner(System.in);

        String name;
        System.out.println("Enter Person Name:");
        name = ob.next();

        System.out.println("Enter age:");
        int age = ob.nextInt();

        System.out.println("Enter gender:");
        String gender = ob.next();

        System.out.println("Enter the taxable income:");
        int income = ob.nextInt();

        // Person object and initialize values using setter
        Person obj = new Person();
        obj.setName(name);
        obj.setAge(age);
        obj.setGender(gender);
        obj.setIncome(income);

        // Display person details using toString() method
        System.out.println(obj);

        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(obj); // Tax calculation
        System.out.println("After calculating tax:");
        System.out.println(obj);

        ob.close();
    }
}
