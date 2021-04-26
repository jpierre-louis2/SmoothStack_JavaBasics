//Author: Jameson Pierre-Louis
//This Class returns calculations for a rectangle and implements the Shape interface
package com.ss.apr.jb.two;
import java.util.Scanner;

public class Rectangle implements Shape{

	public double calculateArea() {	
		Scanner scan = new Scanner(System.in);
		double width, height;
		System.out.print("Please enter the width of your Rectangle: ");
		while(!scan.hasNextDouble()) {
			System.out.println("Invalid number, try again");
			System.out.print("Please enter the width of your Rectangle: ");
			scan.nextLine();//Flush out invalid number
		}
		width = scan.nextInt();
		System.out.print("Please enter the height of your Rectangle: ");
		while(!scan.hasNextDouble()) {
			System.out.println("Invalid number, try again");
			System.out.print("Please enter the height of your Rectangle: ");
			scan.nextLine();//Flush out invalid number
		}
		height = scan.nextInt();
		
		
		scan.close();
		return (width*height);
	}
	
	
	public void display(double area) {
		System.out.println("The area of the Rectangle is " + area);
	}
	

}
