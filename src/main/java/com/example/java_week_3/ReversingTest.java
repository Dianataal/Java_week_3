package com.example.java_week_3;

import java.util.Scanner;

public class ReversingTest {
    public static String reverse(String text) {
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = scanner.nextLine();

        String reversedText = reverse(text);

        System.out.println("In reverse order: " + reversedText);

        scanner.close();
    }
}
