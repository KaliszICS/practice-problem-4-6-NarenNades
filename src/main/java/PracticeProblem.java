/**
	* File: Lesson 4.6 - Data type checking
	* Author: Naren Nades
	* Date Created: April 12, 2023
	* Date Last Modified: June 22, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int intChecker() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		while (!(s.hasNextInt())) {
			s.nextLine();
			System.out.print("Input an integer: ");
		}
		return s.nextInt();
	}

	public static double doubleChecker() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		while (!(s.hasNextDouble())) {
			s.nextLine();
			System.out.print("Input a number: ");
		}
		return s.nextDouble();
	}

	public static Boolean booleanChecker() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		while (!(s.hasNextBoolean())) {
			s.nextLine();
			System.out.print("Input a boolean: ");
		}
		return s.nextBoolean();
	}

	public static Boolean multipleIntChecker() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Input an integer: ");

			while (!(s.hasNextInt())) {
				s.nextLine();
				System.out.print("Input an integer: ");
			}
			s.nextInt();
		}
		return true;
	}

	
}
