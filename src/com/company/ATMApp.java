package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMApp {

    public static void main(String[] args) {
        // ATM App
        ArrayList<Account> cash = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        cash.add(new Account("254687975", "Tim Holk", 3452.78, "9078"));
        cash.add(new Account("546789321", "Brett Rivers", 5678.90, "7869"));
        cash.add(new Account("345876098", "Simone Rogers", 67790.90, "9876"));

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter PIN number");
            String PIN = input.nextLine();

            System.out.println("Enter Account number");
            String accountNumber = input.nextLine();

                for (Account entry : cash) {
                    double deposit = 0, withdrawal = 0, value = 0;
                    double remainder = 0;
                    if (entry.getPIN().equalsIgnoreCase(PIN) && entry.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                        System.out.println("Do you want to make a deposit, withdrawal or check balance?");
                        String answer = input.nextLine();

                        if (answer.equalsIgnoreCase("check balance")) {
                            System.out.println("Current balance: " + entry.getBalance());
                        } else if (answer.equalsIgnoreCase("deposit")) {
                            System.out.println("Enter deposit amount");
                            deposit = input.nextDouble();
                            value = deposit + entry.getBalance();
                            System.out.println("You now have " + value);
                        } else if (answer.equalsIgnoreCase("withdrawal")) {
                            System.out.println("Enter withdrawal amount");
                            withdrawal = input.nextDouble();
                            remainder = entry.getBalance() - withdrawal;
                            System.out.println("You now have: " + remainder);
                        }
                        System.out.println();
                        System.out.println("Username " + entry.getUserName() + "\nAccount Number " + entry.getAccountNumber() +
                                "\nBeginning Balance " + entry.getBalance() + "\nDeposit Amount: " +
                                deposit + "\nWithdrawal Amount: " + withdrawal + " " + "\nEnding balance " + "\ndeposited value " + value + "\nRemainder: " + remainder + " ");
                        return;
                    }
                }
            }


            System.out.println("You have been locked out");

            System.out.println("Would you like to add your account details to the list?");
            String reply = input.nextLine();

            if (reply.equalsIgnoreCase("Yes") || reply.equalsIgnoreCase("Y")){
                System.out.println();
            } else {
                System.out.println("Thanks for playing!");
            }
                    String mylist = " ";
                    do {
                        System.out.println("Enter your username");
                        String username = input.nextLine();

                        System.out.println("Enter your account number");
                        String accountnumber = input.nextLine();

                        System.out.println("Enter your balance");
                        double Balance = input.nextDouble();

                        System.out.println("Enter your PIN");
                        String PINreal = input.next();

                        cash.add(new Account(accountnumber, username, Balance, PINreal));

                        System.out.println("Would you like to enter again? Y(yes) or N(no)");
                        mylist = input.next();
                        input.nextLine();

                    } while (!mylist.equalsIgnoreCase("no") || !mylist.equalsIgnoreCase("N"));

                    for (Account c : cash) {
                        System.out.println("\nAcct Number " + c.getAccountNumber() + "\nUserName " + c.getUserName() + "\nBalance " + c.getBalance() + "\nPIN " + c.getPIN());
                    }

    }

    }


