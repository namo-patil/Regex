package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]+[_+-.]?[0-9a-z]+?[@][0-9a-z]+[.][a-z]+([.][a-z]+)?[,]?";
    static boolean result;

    private static boolean patternChecker(String fieldPattern) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        result = matcher.matches();
        return result;
    }

    private static void validFirstName() {
        System.out.println("Enter First Name : ");
        patternChecker(NAME_PATTERN);
        if (result) {
            System.out.println("Valid");
        } else {
            System.out.println("Not-Valid");
            validFirstName();
        }
    }

    private static void validLastName() {
        System.out.println("Enter Last Name : ");
        patternChecker(NAME_PATTERN);
        if (result) {
            System.out.println("Valid");
        } else {
            System.out.println("Not-Valid");
            validLastName();
        }
    }

    private static void enterValidEmail() {
        System.out.println("Enter E-mail Id :");
        patternChecker(EMAIL_PATTERN);
        if (result) {
            System.out.println("Valid");
        } else {
            System.out.println("Not-Valid");
            enterValidEmail();
        }
    }

    public static void main(String[] args) {
        validFirstName();
        validLastName();
        enterValidEmail();
    }
}

