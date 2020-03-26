package com.company;

import java.util.Scanner;

public class Company {

    Scanner input = new Scanner(System.in);

    private String name;
    private String type;
    private String NIP;
    private Address address;

    public Company() {
        this.address = new Address();
    }

    public Company(String name, String type, String NIP, Address address) {
        this.name = name;
        this.type = type;
        this.NIP = NIP;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String type) {
        this.NIP = NIP;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void inputCompany() {
        System.out.println("Podaj dane firmowe");
        System.out.println("Nazwa firmy: ");
        this.name = input.nextLine();
        System.out.println("Typ: ");
        this.type = input.nextLine();
        System.out.println("NIP: ");
        this.NIP = input.nextLine();
        System.out.println("Podaj dane adresowe firmy.");
        this.address.inputAddress();
    }

    public void showCompany() {
        System.out.println("Nazwa: " + this.name);
        System.out.println("Typ: " + this.type);
        System.out.println("NIP: " + this.NIP);
        this.address.showAddress();
    }
}
