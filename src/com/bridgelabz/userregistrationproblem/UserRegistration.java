package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]+[_+-.]?[0-9a-z]+?[@][0-9a-z]+[.][a-z]+([.][a-z]+)?[,]?";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{2}\s[789][0-9]{9}";
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

    private static void mobileNumberWithCountryCode() {
        System.out.println("Enter Country Code and Mobile Number : ");
        patternChecker(MOBILE_NUMBER_PATTERN);
        if (result) {
            System.out.println("Valid");
        } else {
            System.out.println("Not-Valid");
            mobileNumberWithCountryCode();
        }
    }

    public static void main(String[] args) {
        validFirstName();
        validLastName();
        enterValidEmail();
        mobileNumberWithCountryCode();
    }
}

