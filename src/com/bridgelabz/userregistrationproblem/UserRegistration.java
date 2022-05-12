package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);
    static Pattern pattern;
    static Matcher matcher;
    //static String testString;

    private static void validFirstName() {
        pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        System.out.println("Enter First Name : ");
        String firstName = scanner.nextLine();
        matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not-Valid");
        }
    }

    private static void validLastName() {
        pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        System.out.println("Enter Last Name : ");
        String lastName = scanner.nextLine();
        matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not-Valid");
        }
    }

    public static void main(String[] args) {
        validFirstName();
        validLastName();
    }
}

