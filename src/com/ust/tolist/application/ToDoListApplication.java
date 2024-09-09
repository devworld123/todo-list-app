package com.ust.tolist.application;

import java.util.Scanner;

public class ToDoListApplication {
	
	private Task[] tasks;
    private int taskCount;
    
	public ToDoListApplication(int size) {
        tasks = new Task[size];
        taskCount = 0;
	}
	public void addTask(String description, String dueDate) {
	    if (taskCount < tasks.length) {
	        tasks[taskCount++] = new Task(description, dueDate);
	        System.out.println("Task added.");
	    } else {
	        System.out.println("Task list is full.");
	    }
	}
	public static void main(String[] args) {
		ToDoListApplication toDoList = new ToDoListApplication(10);
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		toDoList.addTask("Complete project", "2024-09-10");
	}

}
