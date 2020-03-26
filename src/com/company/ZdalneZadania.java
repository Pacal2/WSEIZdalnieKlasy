package com.company;

import java.util.Arrays;

public class ZdalneZadania {

    public String nameSurnamePrefix(String name, String surname, String prefix) {

        return prefix + " " + name + " " + surname + " ";
    }

    public String lowerOrUpperCase(int parameter, String text) {
        if (parameter == 0) {
            return text.toLowerCase();
        }
        else if (parameter == 1) {
            return text.toUpperCase();
        }
        else {
            return "Należy jak parametr wpisać 0 - małe litery, 1 - duże litery";
        }
    }

    public Boolean examChecker(int threshold, int taskOne, int taskTwo, int taskThree) {
        int pointSum = taskOne + taskTwo + taskThree;
        if (pointSum >= threshold) {
            return true;
        }
        else {
            return false;
        }

    }

    public int charAmountChecker(String text, char thisChar) {
        int charAmount = 0;
        thisChar = Character.toLowerCase(thisChar);
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == thisChar) {
                charAmount++;
            }
        }
        return charAmount;
    }

    public int tableAdder(int[] table) {
        int sum=0;
        for(int numbersFromTable : table) {
            sum += numbersFromTable;
        }
        return sum;
    }

    public int smallestOrLargestNumberInArray(int parameter, int[] table) {
        Arrays.sort(table);
        if (parameter == 0) {
            return table[0];
        }
        else if (parameter == 1) {
            return table[table.length - 1];
        } else {
            return 0;
        }
    }


}
