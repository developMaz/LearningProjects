package com.learning.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers;
    ArrayList<Integer> evenNumbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        return evenNumbers;
    }
}
