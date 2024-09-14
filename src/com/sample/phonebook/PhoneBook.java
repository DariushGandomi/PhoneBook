package com.sample.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        System.out.println("----------------------");
        System.out.println("Application started : ");
        System.out.println("----------------------");
        System.out.println("Hi, there are 3 menu items,");
        System.out.println("Choose one of them by typing 1 or 2 or 3");

        label:
        while(true){
            System.out.println("-----------------------------");
            System.out.println("1. Add  a contact ");
            System.out.println("2. Show all available contacts ");
            System.out.println("3. Exit the app ");
            String userInput = scanner.nextLine();

            switch (userInput){
                case "1":
                    System.out.println("Enter Contact's Name :");
                    String userName = scanner.nextLine();
                    System.out.println("Enter Contact's Number :");
                    String userNumber = scanner.nextLine();
                    contacts.add(new Contact(userName, userNumber));
                    System.out.println("-----------------------------");
                    System.out.println("Contact added successfully");
                    break;

                case "2":
                    if (contacts.isEmpty()){
                        System.out.println("-----------------------------");
                        System.out.println("No contacts Available !");
                    }
                    else {
                        for (Contact contact : contacts){
                            System.out.println(contact);
                        }
                    }
                    break;

                case "3":
                    System.out.println("-----------------------------");
                    System.out.println("The App closed successfully !");
                    System.out.println("-----------------------------");
                    break label;

                default:
                    System.out.println("-----------------------------");
                    System.out.println("Invalid input, please enter only 1 or 2 or 3");
                    break;
            }
        }scanner.close();
    }
}