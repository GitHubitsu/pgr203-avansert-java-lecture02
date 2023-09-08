package no.kristiania;

import java.util.Scanner;

public class RomanNumbers {

    public static void main(String[] args) {
        System.out.println("Which number do you want in Roman?");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d in roman notation is %s", number, toRoman(number));

    }

    public static String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        number = convertRomanDigits(number, result, 9, "IX");
        number = convertRomanDigits(number, result, 5, "V");
        number = convertRomanDigits(number, result, 4, "IV");

        for (int i = 0; i < number; i++) {
            result.append("I");
        }
        return result.toString();
    }

    public static int convertRomanDigits(int number, StringBuilder result, int value, String romanDigits) {
        if (number >= value) {
            result.append(romanDigits);
            number -= value;
        }
        return number;
    }

}
