package com.example.java_week_3;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter words (type a 'stop' to finish):");

        while (true) {
            String word = scanner.next();
            if (word.equals("stop")) {
                break;
            }
            words.add(word);
        }

        System.out.println("List of entered words:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
