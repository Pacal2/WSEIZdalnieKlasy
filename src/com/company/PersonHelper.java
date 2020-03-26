package com.company;

import java.util.ArrayList;

public class PersonHelper {

    public Person createPerson() {
        Person newPerson = new Person();
        newPerson.inputPerson();
        return newPerson;
    }

    public ArrayList<Person> createListOfPeople(int number) {
        ArrayList<Person> listOfPersons = new ArrayList<>();
        for (int i=0; i < number; i ++) {
            int personNumber = 1 + i;
            System.out.println("Osoba numer " + personNumber);
            listOfPersons.add(createPerson());
            System.out.println("***********************");
        }
        return listOfPersons;
    }

    public void showListOfPeople(ArrayList<Person> listOfPersons) {
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("Lista osób: ");
        int personNumber = 0;
        for (Person person : listOfPersons) {
            personNumber += 1;
            System.out.println("Osoba numer " + personNumber);
            person.showPerson();
            System.out.println("***********************");
        }
    }

}
