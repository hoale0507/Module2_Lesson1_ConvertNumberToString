package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 99");
        number = sc.nextInt();
        int tens = number / 10;
        int ones = number % 10;
        System.out.println(tens);
        String text = "";
        switch (tens) {
            case 0:
                break;
            case 1:
                switch (ones) {
                    case 0:
                        text += "ten";
                        break;
                    case 1:
                        text += "eleven";
                        break;
                    case 2:
                        text += "twelve";
                        break;
                    case 3:
                        text += "thirteen";
                        break;
                    case 4:
                        text += "fourteen";
                        break;
                    case 5:
                        text += "fifteen";
                        break;
                    case 6:
                        text += "sixteen";
                        break;
                    case 7:
                        text += "seventeen";
                        break;
                    case 8:
                        text += "eighteen";
                        break;
                    case 9:
                        text += "nineteen";
                        break;
                }
                break;
            case 2:
                text += "twenty";
                break;
            case 3:
                text += "thirty";
                break;
            case 4:
                text += "forty";
                break;
            case 5:
                text += "fifty";
                break;
            case 6:
                text += "sixty";
                break;
            case 7:
                text += "seventy";
                break;
            case 8:
                text += "eighty";
                break;
            case 9:
                text += "ninety";
                break;
        }
        if (tens != 1) {
            switch (ones) {
                case 0:
                    break;
                case 1:
                    text += "one";
                    break;
                case 2:
                    text += "two";
                    break;
                case 3:
                    text += "three";
                    break;
                case 4:
                    text += "four";
                    break;
                case 5:
                    text += "five";
                    break;
                case 6:
                    text += "six";
                    break;
                case 7:
                    text += "seven";
                    break;
                case 8:
                    text += "eight";
                    break;
                case 9:
                    text += "nine";
                    break;
            }
        }
        System.out.printf("%d is read as %s",number,text);
    }
}
