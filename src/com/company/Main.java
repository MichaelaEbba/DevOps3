package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isRunning = true;

		Scanner in = new Scanner(System.in);

		while (isRunning) {
			System.out.println("What is the meaning of life?");

			try {
				int operator = in.nextInt();
				if (operator == 42) {
					isRunning = false;
					System.out.println("You know now the answer, bye bye");
				}
			} catch (InputMismatchException ex) {
				System.out.println("There's been an error" + ex);
				isRunning = false;
			}

			 System.out.println("Please answer 42");
		}
	}
}
