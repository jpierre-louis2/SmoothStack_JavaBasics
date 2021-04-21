//Author: Jameson Pierre-Louis
//This Program adds all number values passed through the commandline
package SecondAssignment;

public class PartTwo {

	public static void main(String[] args) {
			
		double sum = 0;
		//Reads through all arguments
		for(int i = 0; i < args.length; ++i) {
			//Exception handling will test for if an argument is a number, will print error message on failure
			try {		
				sum = Double.parseDouble(args[i]) + sum;
			}
			catch(NumberFormatException ex) {
				System.out.println("A non-number has been detected at position " + i);
			}
		}
		
		System.out.println("\nThe Sum of all numbers entered is: " + sum);

		//Prints out all arguments given
		System.out.println("\nArguments Entered:");
		for(int i = 0; i < args.length; ++i) {
			System.out.print(args[i] + " ");
		}

		
	}
}
