package day08;

import java.util.Scanner;
public class vowels {

    public int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String givenstring = scanner.nextLine();
            vowels obj=new vowels();
            int vowelCount = obj.countVowels(givenstring);
            System.out.println("Number of vowels in the given string is : " + vowelCount);
        }

    }
