package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserRegistration {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your first name :");
            String firstName = scan.nextLine();

            System.out.println("first name is : " +firstName);
            System.out.println("first name is valid: " + firstName(firstName));
        }
        private static boolean firstName(String firstName) {
            return firstName.matches("[A-Z]{1}[a-z]{3,}"); //UC1
        }
}
