package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static void validFirstName() {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        System.out.println("Enter First Name : ");
        String testString = scanner.nextLine();
        Matcher matcher = pattern.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not-Valid");
        }
    }

    public static void main(String[] args) {
        validFirstName();
    }
}

