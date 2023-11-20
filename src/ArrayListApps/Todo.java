package ArrayListApps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Todo {

    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Todo list application:");
            System.out.println("1. Add your task");
            System.out.println("2. Edit task");
            System.out.println("3. Remove your task");
            System.out.println("4. List your tasks");
            System.out.println("5. Clear your tasks");
            System.out.println("6. Exit");

            System.out.println();
            System.out.println("Enter your choice: ");


            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    addTask(todoList, scanner);
                    break;
                case 2:
                    editTask(todoList, scanner);
                    break;
                case 3:

                    break;
                case 4:
                    if(todoList.isEmpty()){
                        System.out.println("hey, your todo list is empty");
                    }
                  else {
                        System.out.println("Here are your Tasks: ");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 5:
                    if(todoList.isEmpty()){
                        System.out.println("Dear Terri, your list is already empty.");
                        break;
                    }
                    todoList.clear();
                    System.out.println("list cleared sucessfully");
                    break;

                case 6:
                    System.out.println("Exited");
                    scanner.close();
                    exit(0);
                    break;

                default:
                    System.out.println("invalid choice ,please try again");
            }
        }


    }

    public static void addTask(List<String> todoList, Scanner scanner){
        System.out.println("Enter the task to add:");
        String addedTask = scanner.nextLine();
        todoList.add(addedTask);
        System.out.println(addedTask + " added succesfully");
    }
    public static  void editTask(List<String> todoList, Scanner scanner){
        System.out.println("Enter the task you want to edit");

        String taskToEdit = scanner.nextLine();

        if( !todoList.contains(taskToEdit)){
            System.out.println("Oops! " + taskToEdit + " is not on the list");
            exit(0);
        }
        int indexOfTaskToBeEdited = todoList.indexOf(taskToEdit);

        System.out.println("Enter the task you want to replace with " + taskToEdit);

        String newTask = scanner.nextLine();

        todoList.set(indexOfTaskToBeEdited, newTask);

        System.out.println("Yo! " + taskToEdit + " has been successfully updated");
    }

    public static void removeTask(List<String> todoList, Scanner scanner){
        System.out.println("Enter the task to remove: ");
        String removedTask = scanner.nextLine();
        boolean taskExist = todoList.contains(removedTask);
        if(taskExist){
            todoList.remove(removedTask);
            System.out.println(removedTask +" removed sucessfully.");
        }else {
            System.out.println("sorry" + removedTask + " not found in the list");
        }
    }
}
