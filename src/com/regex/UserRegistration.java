package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserRegistration {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your first name :");
            String firstName = scan.nextLine();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your last name :");
            String lastName = sc.nextLine();
            Scanner mail = new Scanner(System.in);
            System.out.println("Enter your email : ");
            String Email = mail.nextLine();
            System.out.println("Enter your Mobile Number:");
            String MobNo = scan.nextLine();


            System.out.println("first name is : " +firstName);
            System.out.println("first name is valid: " + firstName(firstName));
            System.out.println("last name is : " + lastName);
            System.out.println("last name is : " + lastName(lastName));
            System.out.println("EmailID is : " + Email);
            System.out.println("EmailID is : " + Email(Email));
            System.out.println("mobile number is : " + MobNo);
            System.out.println("mobile number is : " + MobNo(MobNo));

        }
        private static boolean firstName(String firstName) {
            return firstName.matches("[A-Z]{1}[a-z]{3,}"); //UC1
        }
    private static boolean lastName(String lastName) {

        return lastName.matches("[A-Z]{1}[a-z]{3}"); //UC2
    }
    public static boolean Email(String Email) {
        return Email.matches("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?"); //UC3
    }
    private static boolean MobNo(String MobNo) {
        return MobNo.matches("^(91)\\s{1}[7-9]{1}[0-9]{9}$");
    }
}
