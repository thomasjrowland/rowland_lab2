package rowland_lab2;

import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		boolean keepGoing = true;
		
		while (keepGoing) {
			
			System.out.print("Please enter the room's length in inches: ");
		
			double length = scnr.nextDouble();
		
			System.out.print("Please enter the room's width in inches: ");
		
			double width = scnr.nextDouble();
		
			System.out.print("Please enter the room's height in inches: ");
				
			double height = scnr.nextDouble();
		
			System.out.println();
		
			double roomArea = length * width;
				
			double roomVolume = length * width * height;
			
			double roomPerim = (length * 2) + (width * 2);
		
			System.out.printf("The area of the room is: %.2f square inches" , roomArea);
			System.out.println();
			
			System.out.printf("The perimeter of the room is: %.2f inches" , roomPerim);
			System.out.println();
		
			System.out.printf("The volume of the room is: %.2f square inches" , roomVolume);
			System.out.println();
			System.out.println();
		
			System.out.print("Would you like to continue? (y/n) " );
			keepGoing = scnr.next().startsWith("y");
			System.out.println();
						
		}
		
		System.out.println();
		System.out.println("Goodbye!");

	}

}
