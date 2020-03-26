package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Address {

    Scanner input = new Scanner(System.in);

    private String city;
    private String street;
    private int appartmentNumber;
    private int houseNumber;
    private String postalCode;

    public Address() {

    }

    public Address(String city, String street, int appartmentNumber, int houseNumber, String postalCode) {
        this.city = city;
        this.street = street;
        this.appartmentNumber = appartmentNumber;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAppartmentNumber() {
        return appartmentNumber;
    }

    public void setAppartmentNumber(int appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void inputAddress() {
        System.out.println("Miasto: ");
        this.city = input.nextLine();
        System.out.println("Ulica: ");
        this.street = input.nextLine();
        System.out.println("Numer mieszkania: ");
        this.appartmentNumber = input.nextInt();
        System.out.println("Numer budynku: ");
        this.houseNumber = input.nextInt();
        input.nextLine();
        System.out.println("Kod pocztowy: ");
        this.postalCode = input.nextLine();

    }

    public void showAddress() {
        System.out.println("Adres: ");
        System.out.println(this.street + " " + appartmentNumber + "/" + houseNumber);
        System.out.println(this.city + " " + postalCode);
    }

}
