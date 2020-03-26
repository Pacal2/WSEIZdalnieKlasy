package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Zwracanie danych przez metody
        Returns returns = new Returns();
        // Zadanie I
        System.out.println(returns.nameSurnamePrefix("Jan", "Kowalski", "Szanowny"));
        // Zadanie II
        System.out.println(returns.lowerOrUpperCase(1, "Ten tekst ma być napisany wielkimi literami."));
        // Zadanie III
        System.out.println(returns.examChecker(50, 10, 10, 10));
        // Zadanie IV
        System.out.println(returns.charAmountChecker("Alabama", 'A'));
        // Zadanie V
        int[] numbersToAdd = {3, 4, 5};
        System.out.println(returns.tableAdder(numbersToAdd));
        // Zadanie VI
        System.out.println(returns.smallestOrLargestNumberInArray(1, numbersToAdd));

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
