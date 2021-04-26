//Author: Jameson Pierre-Louis
//This Class returns calculations for a Triangle and implements the Shape interface
package com.ss.apr.jb.two;
import java.util.Scanner;

public class Triangle implements Shape{

	public double calculateArea() {
		Scanner scan = new Scanner(System.in);
		double width, height;
		System.out.print("Please enter the base of your Triangle: ");
		while(!scan.hasNextDouble()) {
			System.out.println("Invalid number, try again");
			System.out.print("Please enter the base of your Triangle: ");
			scan.nextLine();//Flush out invalid number
		}
		width = scan.nextDouble();
		System.out.print("Please enter the height of your Triangle: ");
		while(!scan.hasNextDouble()) {
			System.out.println("Invalid number, try again");
			System.out.print("Please enter the height of your Triangle: ");
			scan.nextLine();//Flush out invalid number
		}
		
		height = scan.nextDouble();
		scan.close();
		return (width*height)/2;
	}
	
	public void display(double area) {
		System.out.println("The area of the Triangle is " + area);
	}
	

}
