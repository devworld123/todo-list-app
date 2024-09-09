package com.ust.tolist.application;

import java.util.Scanner;

public class ToDoListApplication {
	
	private Task[] tasks;
    private int taskCount;
    
	public ToDoListApplication(int size) {
        tasks = new Task[size];
        taskCount = 0;
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
	public static void main(String[] args) {
		ToDoListApplication toDoList = new ToDoListApplication(10);
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		toDoList.removeTask(0);
	}

}
