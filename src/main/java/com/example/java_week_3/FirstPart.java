package com.example.java_week_3;

import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(scanner.nextLine());

        // Ensure that the length is within the bounds of the word
        if (length > word.length()) {
            length = word.length();
        }

        String result = word.substring(0, length);

        System.out.println("Result: " + result);

        scanner.close();
    }
}

