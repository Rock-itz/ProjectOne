package com.company.Mayberry;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            String choice = "";
            Scanner input = new Scanner(System.in);


            while (!(choice.equals("0"))) {
                System.out.println("Please Choose an option");
                System.out.println("");
                System.out.println("(1) Add a task ");
                System.out.println("(2) Remove a task ");
                System.out.println("(3) Update a task ");
                System.out.println("(4) List all tasks ");
                System.out.println("(0) Exit ");

                System.out.println("Please Choose an option");
                choice = input.nextLine();

                switch (choice) {

                    case "1":
                        String task = addTask();
                        list.add(task);
                        break;
                    case "2":
                        System.out.println("Remove a task");

                        break;
                    case "3":
                        System.out.println("Update a task");
                        choice = input.nextLine();
                        break;
                    case "4":
                        listTask(list);
                        break;
                }

            }
            System.out.println("Ending");
        }


        static String addTask(){
            Scanner input = new Scanner(System.in);
            System.out.println("Add a task ");
            String choice = input.nextLine();
            return choice;

        }
        static void listTask(ArrayList<String> a){
            System.out.println("List all tasks");
            System.out.println(a.toString());

        }

        staiic void removeTask(){

            

    }







    }
