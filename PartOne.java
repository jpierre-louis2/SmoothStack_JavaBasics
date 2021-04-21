//Author: Jameson Pierre-Louis
//This Program produces a 10x10 2D array and returns the largest value along with it's position
package SecondAssignment;
import java.util.Random;

public class PartOne {

	
	//Returns a 10x10 Array of random integers (100 values)
	public static int[][] RandomArray(){
		
		int[][] array = new int[10][10];
		Random rand = new Random();
		//Generates and inserts random integers into array
		for(int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				array[i][j] = rand.nextInt(1001);	
			}
		}		
		return array;
	}
	
	
	//Parses through a 2D array and prints out all values
	public static void PrintArray(int[][] array) {
		System.out.println("Two Dimensional Array:");
		for(int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int[][] array = RandomArray();
		PrintArray(array);
		int row = 0;
		int col = 0;
		int max = array[0][0];
		//Parses for Max value and position
		for(int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				if (array[i][j] > max) {
					max = array[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("\n\nMax Number: " + max + "\nLocated at Position [Column: "+ (col + 1) + ", Row: " + (row + 1) + "]");	
	}
	
}
