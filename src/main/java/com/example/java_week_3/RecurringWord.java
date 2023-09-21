package com.example.java_week_3;

import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Enter words. Type the same word twice to exit.");

        while (true) {
            System.out.print("Type a word: ");
            String word = scanner.next();

            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice.");
                break;
            }

            words.add(word);
        }

        scanner.close();
    }
}
