//update

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
                        String list1 = removeTask();
                        list.remove(list1);

                        break;
                    case "3":
                        int item = updateTask();
                        String changedItem = input.nextLine();
                        list.set(item, changedItem);
                        break;
                    case "4":
                        System.out.println("list:");
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


        static String removeTask(){
        System.out.println("Remove tasks");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            return choice;

    }
        static int updateTask(){
            System.out.println("Update tasks");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            return choice;

        }






    }
