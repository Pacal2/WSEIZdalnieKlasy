package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Student {

    Scanner input = new Scanner(System.in);

    String name;
    String surname;
    double[] grades;
    List<String> subjects = new LinkedList<>();

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addSubjects(String subject) {
        subjects.add(subject);
    }

    public void initializeTable() {
        int numberOfSubjects = subjects.size();
        this.grades = new double[numberOfSubjects];
    }

    public void addMarks() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Wprowadź ocenę dla przedmiotu " + subjects.get(i) + ": ");
            grades[i] = input.nextDouble();
        }
    }

    public void showSubjectsAndMarks() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Ocena z " + subjects.get(i) + " to " + grades[i] + ".");
        }
    }


}
