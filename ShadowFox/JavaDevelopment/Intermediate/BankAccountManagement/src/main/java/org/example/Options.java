package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.SortedMap;

public class Options {
    String name;
    String phoneNum;
    int amount;
    int pin;

    public Options(String name, String phoneNum, int amount, int pin) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.amount = amount;
        this.pin = pin;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return amount;
    }



    //creating new account
    public static void CreateAccount(ArrayList<Options> data, String name, String phoneNum, int amount
            , int pin) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("\n****** Creating your account ******");
//        System.out.print("Enter Account Holder name: ");
//        String name = sc.nextLine();
//        System.out.print("Enter Holder's Phone number: ");
//        String phoneNum = sc.nextLine();
//
//        System.out.print("Enter Amount to Deposit... {minimum 0}: ");
//        int amount = sc.nextInt();
//
//        System.out.println("Create your pin (4 letters)");
//        int pin = sc.nextInt();

        // Store the new account in the ArrayList
        data.add(new Options(name, phoneNum, amount, pin));
        System.out.println("Your account has been created successfully! ");
    }


    //Display Details
    public static void DisplayDetails(ArrayList<Options> data) {
        for (Options acc : data) {
            System.out.print("Name " + acc.name);
            System.out.print("  |  ");
            System.out.print("Phone Number " + acc.phoneNum);
            System.out.print("  |  ");
            System.out.println("Total amount " + acc.amount);
        }
    }

    //  Deposit Money
    public static void DepositMoney(ArrayList<Options> data, String name, int Addingamount) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Account Holder Name: ");
//        String name = sc.nextLine();

        boolean found = false;
        for (Options acc : data) {
            if (acc.name.equalsIgnoreCase(name)) {  // check the name is present ignoring its case
                found = true;
                break;  // Stop searching once found
            }

        }
        if (!found) {
            System.out.println("Account not Found. Check the credentials");
            return; //if not found, exit the method
        }

//        System.out.print("Enter Amount to Deposit ");
//        int deposit = sc.nextInt();

        for (Options acc : data) {
            if (acc.name.equalsIgnoreCase(name)) {
//                acc.amount += deposit;
                acc.amount += Addingamount;   //updated to parameter for test case
                System.out.println("Amount Added Successfully! ");
                System.out.println("Updated Balance " + acc.amount);
                break;
            }
        }

    }

    //withdraw amount from the user account balance
    public static void WithdrawMoney(ArrayList<Options> data, String name, int pin, int withDrawAmount) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//
//        System.out.println("Enter your pin");
//        int pin = sc.nextInt();

        boolean found = false;
        for (Options acc : data) {
            if (acc.name.equalsIgnoreCase(name) && acc.pin == pin) {  // check name and  pin both is present or not!
                found = true;
                break;  // Stop searching once found
            }
        }

        if (!found) {
            System.out.println("Not found...");
            return;
        }

//        System.out.print("Enter Amountt to withdraw ");
//        int withdraqAmt = sc.nextInt();
        for (Options acc : data) {
            if (acc.name.equalsIgnoreCase(name) && acc.pin == pin) {  // check name and  pin both is present or not!
                if (withDrawAmount > acc.amount) {
                    System.out.println("Your Account balance is insufficient ");
                    return;
                }

                int originalAmount = acc.amount;
                acc.amount -= withDrawAmount;
                System.out.println("Withdraw Amount is " + withDrawAmount);
                System.out.println("Remaining amount in your account " + (originalAmount - withDrawAmount));
                break;  // Stop searching once found
            }
        }
    }

    //check Balance
    public static void CheckBalance(ArrayList<Options> data, String name, int pin) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name ");
//        String name = sc.nextLine();
//        System.out.print("Enter your pin ");
//        int pin = sc.nextInt();

        for (Options acc : data) {
            if (acc.name.equalsIgnoreCase(name) && acc.pin == pin) {
                System.out.println("your account balance is " + acc.amount);
            }
        }
    }
}