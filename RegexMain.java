package com.bridgelabz.junit;

import java.util.Scanner;

/**
 * Validate Password : As a User need to follow pre-defined Password rules. Rule
 * 4 : Has exactly 1 Special Character
 *
 * @author Shivaji Ghasti
 *
 */
public class RegexMain {

    public static void main(String[] args) {
        System.out.println("---------------- Welcome to User Registration Program -------------------");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        // Create object of ValidateUserRegistration class
        ValidateUserRegistration validate = new ValidateUserRegistration();

        // Method call to validate user First name
        validate.validateFirstName("Raj");
        validate.validateFirstName("raj");

        // Method call to validate user Last name
        validate.validateLastName("Patil");
        validate.validateLastName("patel");

        // Method call to validate Email id
        validate.validateEmail("abc.xyz@bl.co.in");
        validate.validateEmail("abc_10@yahoo");
        validate.validateEmail("abc@abc@gmail.com");

        // Method call to validate Mobile no
        validate.validateMobileNum("91 1234567890");
        validate.validateMobileNum("91 123456789");
        validate.validateMobileNum("911234567890");

        // Method call to validate Password
        validate.validatePassword("Password1");
        validate.validatePassword("password1");
        validate.validatePassword("Eight");
        validate.validatePassword("PASSWORD123");
        validate.validatePassword("Password@100");
    }
}
