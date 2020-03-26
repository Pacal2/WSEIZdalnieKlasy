package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Zwracanie danych przez metody
        ZdalneZadania zadania = new ZdalneZadania();
        // Zadanie I
        System.out.println(zadania.nameSurnamePrefix("Jan", "Kowalski", "Szanowny"));
        // Zadanie II
        System.out.println(zadania.lowerOrUpperCase(1, "Ten tekst ma być napisany wielkimi literami."));
        // Zadanie III
        System.out.println(zadania.examChecker(50, 10, 10, 10));
        // Zadanie IV
        System.out.println(zadania.charAmountChecker("Alabama", 'A'));
        // Zadanie V
        int[] numbersToAdd = {3, 4, 5};
        System.out.println(zadania.tableAdder(numbersToAdd));
        // Zadanie VI
        System.out.println(zadania.smallestOrLargestNumberInArray(1, numbersToAdd));

        // Tablice i listy jako pola klasy
        double[] grades = {};
        List<String> subjects = new LinkedList<>();
        Student student = new Student("Han", "Solo");
        // Zadanie I
        student.addSubjects("Biologia");
        student.addSubjects("Chemia");
        student.addSubjects("Matematyka");
        // Zadanie II
        student.initializeTable();
        // Zadanie III
        student.addMarks();
        // Zadanie IV
        student.showSubjectsAndMarks();

        // Obiekty jako pola klasy i metody typu obiektowego
        // Wynik wszystkich zadań:
        PersonHelper personHelper = new PersonHelper();
        ArrayList<Person> peopleList = personHelper.createListOfPeople(2);
        personHelper.showListOfPeople(peopleList);


    }
}
