package com.company;

import java.util.Scanner;

public class Person {


    private String name;
    private String surname;
    private int birthYear;
    private String nationality;
    private Company job;
    Address address;

    public Person() {
        this.address  = new Address();
        this.job = new Company();
    }

    public Person(String name, String surname, int birthYear, String nationality, Address address, Company job) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.nationality = nationality;
        this.address = address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Company getJob() {
        return job;
    }

    public void setJob(Company job) {
        this.job = job;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void inputPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dane osoby.");
        System.out.println("Imię: ");
        this.name = input.nextLine();
        System.out.println("Nazwisko: ");
        this.surname = input.nextLine();
        System.out.println("Rok urodzenia: ");
        this.birthYear = input.nextInt();
        input.nextLine();
        System.out.println("Narodowość: ");
        this.nationality = input.nextLine();
        System.out.println("Podaj dane adresowe osoby.");
        this.address.inputAddress();
        this.job.inputCompany();

    }

    public void showPerson() {
        System.out.println("Imię: " + this.name);
        System.out.println("Nazwisko: " + this.surname);
        System.out.println("Rok urodzenia: " + this.birthYear);
        System.out.println("Narodowość: " + this.nationality);
        this.address.showAddress();
        this.job.showCompany();
    }

}
