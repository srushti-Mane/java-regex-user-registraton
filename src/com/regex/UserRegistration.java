package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = scan.nextLine();
        System.out.println("Enter last name:  ");
        String lastName = scan.nextLine();
        Scanner mail = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String Email = mail.nextLine();
        System.out.println("Enter your Mobile Number:");
        String MobNo = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        System.out.println("Enter Email");
        String email = scan.nextLine();

        System.out.println("first name is : " + firstName);
        System.out.println("first name is : " + firstName(firstName));
        System.out.println("first name is : " + lastName);
        System.out.println("first name is : " + lastName(lastName));
        System.out.println("EmailID is : " + Email);
        System.out.println("EmailID is : " + Email(Email));
        System.out.println("mobile number is : " + MobNo);
        System.out.println("mobile number is : " + MobNo(MobNo));
        System.out.println("Password is " + password(password));
        System.out.println("Email is  " + email(email));
    }

    static boolean firstName(String firstName) {
        return firstName.matches("[A-Z]{1}[a-z]{3,}");
    }

    static boolean lastName(String lastName) {
        return lastName.matches("[A-Z]{1}[a-z]{3,}");
    }

    public static boolean Email(String Email) {
        return Email.matches("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
    }

    static boolean MobNo(String MobNo) {
        return MobNo.matches("^(91)\\s{1}[7-9]{1}[0-9]{9}$");
    }
    static boolean email(String validemail) {
        return validemail.matches ("^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.com){1,}(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.net){1}$");
    }

    public static boolean password(String password) {
        //String pattern = "[a-zA-Z0-9]{8,}$";
        //String pattern = "^[A-Z]{1}[a-zA-Z0-9]{7,}$";
        //String pattern = "^[A-Z]{1}+[a-zA-z1-9]{6,}[1-9]{1}$";
        String pattern = "(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}";
        if (password.matches(pattern)) {
            return true;
        }
        return false;
    }
}
