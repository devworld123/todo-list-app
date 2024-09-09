package com.ust.tolist.application;

import java.util.Scanner;

public class ToDoListApplication {
	
	private Task[] tasks;
    private int taskCount;
    
	public ToDoListApplication(int size) {
        tasks = new Task[size];
        taskCount = 0;
	}
	
	public static void main(String[] args) {
		ToDoListApplication toDoList = new ToDoListApplication(10);
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
	}

}
