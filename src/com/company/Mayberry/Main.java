package com.company.Mayberry;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            String choice = null;
            Scanner input = new Scanner(System.in);
            System.out.println("Please Choose an option");
            System.out.println("");
            System.out.println("(1) Add a task ");
            System.out.println("(2) Remove a task ");
            System.out.println("(3) Update a task ");
            System.out.println("(4) List all tasks ");
            System.out.println("(0) Exit ");
            choice = input.nextLine();
            do {

                System.out.println("Please Choose an option");
                System.out.println("");
                System.out.println("(1) Add a task ");
                System.out.println("(2) Remove a task ");
                System.out.println("(3) Update a task ");
                System.out.println("(4) List all tasks ");
                System.out.println("(0) Exit ");

                switch (choice) {

                    case "1":
                    addTask();

                        break;
                    case "2":
                        System.out.println("Remove a task");
                        choice = input.nextLine();
                        break;
                    case "3":
                        System.out.println("Update a task");
                        choice = input.nextLine();
                        break;
                    case "4":

                        break;
                }
            }
            while ( Integer.parseInt(choice) > 0);

            System.out.println("Exit");
        }
        static void addTask(){
            Scanner input = new Scanner(System.in);
            System.out.println("Add a task ");
            String choice = input.nextLine();


        }
        static void addList(){
            System.out.println("List all tasks");
            choice = input.nextLine();

        }






    }
