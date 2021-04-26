//Author: Jameson Pierre-Louis
//This Program tests our Shape classes
package com.ss.apr.jb.two;

import java.util.Scanner;


public class ShapeTest {
	
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Triangle t = new Triangle();
		Scanner scan = new Scanner(System.in);
		int input = 0;
		boolean valid = true;
		
		System.out.println("Menu");
		System.out.println("1. Calculate Area for a Rectangle");
		System.out.println("2. Calculate Area for a Circle");
		System.out.println("3. Calculate Area for a Triangle");
		System.out.println("Input any other integer to exit\n");
		System.out.print("Input: ");
		
		//Error checking for an integer
		while(!scan.hasNextInt()) {
			System.out.println("Invalid number, try again");
			System.out.print("Input: ");
			scan.nextLine();//Flush out invalid number
		}
		input = scan.nextInt();
		
		switch(input) {
			case 1: 
				r.display(r.calculateArea());
				break;
			case 2:
				c.display(c.calculateArea());
				break;
			case 3:
				t.display(t.calculateArea());
				break;
		}
		System.out.println("Goodbye!");
	}
	
	
}
