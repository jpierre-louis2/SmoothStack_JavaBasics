//Author: Jameson Pierre-Louis
//This Class returns calculations for a Circle and implements the Shape interface
package com.ss.apr.jb.two;
import java.util.Scanner;

public class Circle implements Shape{
	
	public double calculateArea() {
		Scanner scan = new Scanner(System.in);
		double radius;
		System.out.print("Please enter the radius of your Circle: ");
		
		while(!scan.hasNextDouble()) {
			System.out.println("Invalid number, try again");
			System.out.print("Please enter the radius of your Circle: ");
			scan.nextLine();//Flush out invalid number
		}
		
		radius = scan.nextDouble();
		scan.close();
		return (Math.PI * (radius*radius));
	}
	
	public void display(double area) {
		System.out.println("The area of the Circle is " + area);
	}
	

}
