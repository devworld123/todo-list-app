package com.ust.tolist.application;

import java.util.Scanner;

public class ToDoListApplication {

	private Task[] tasks;
	private int taskCount;

	public ToDoListApplication(int size) {
		tasks = new Task[size];
		taskCount = 0;
	}


	public void addTask(String description, String dueDate, int priority) {
		if (taskCount < tasks.length) {
			tasks[taskCount++] = new Task(description, dueDate, priority);
			System.out.println("Task added with priority.");
		} else {
			System.out.println("Task list is full.");
		}
	}


	public void removeTask(int index) {
	    if (index >= 0 && index < taskCount) {
	        for (int i = index; i < taskCount - 1; i++) {
	            tasks[i] = tasks[i + 1];
	        }
	        tasks[--taskCount] = null;
	        System.out.println("Task removed.");
	    } else {
	        System.out.println("Invalid index.");

	    }
	}
	public void displayTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }

	public static void main(String[] args) {
		ToDoListApplication toDoList = new ToDoListApplication(10);
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		while (!exit) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. Display Tasks\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter due date (yyyy-mm-dd):");
                    String dueDate = scanner.nextLine();
                    toDoList.addTask(description, dueDate,1);
                    break;
                case 2:
                    System.out.println("Enter task number to remove:");
                    int index = scanner.nextInt() - 1;
                    toDoList.removeTask(index);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Successfully logged out.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();

	}

}
