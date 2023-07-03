package day11;

import day06.fibonacciSeries;

public class convertToInteger {

    public void convertstoint(String str) {

        try {
            int readNumber = Integer.parseInt(str);
            System.out.println("The given string is converted to int as "+readNumber);
        } catch (Exception e) {
            System.out.println("User input was not a number.");
        }


    }

    public static void main(String args[]) {
        convertToInteger obj = new convertToInteger();
        obj.convertstoint("23");
        obj.convertstoint("45.67");
        obj.convertstoint("test");
        obj.convertstoint("123f");


    }

    }
