package org.example;
import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Options.CheckBalance;
import static org.example.Options.WithdrawMoney;

public class AccountManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Options> data = new ArrayList<>(); //Options is the name of the class

        while (true) {
            System.out.println("\n ******* Bank Management System ***********");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check balance");
            System.out.println("5. Display Acoount Details");
            System.out.println("0. EXIT");
            int choice;
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting! BYE...");
                    sc.close();
                    return;
                }
                case 1 -> Options.CreateAccount(data,"Raj Kumar","234567890", 1000,1234);
                case 2 -> Options.DepositMoney(data,"Raj Kumar",200);
                case 3 -> WithdrawMoney(data,"Raj Kumar",1234,500);
                case 5 -> Options.DisplayDetails(data);
                case 4 -> CheckBalance(data,"Raj Kumar",1234);
            }
        }

    }
}

