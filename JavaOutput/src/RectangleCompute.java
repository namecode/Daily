import java.util.Scanner;

public class RectangleCompute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Declare variables
	    double perimeter, area, length, width;
	    final double PI = 3.14159265;
	    
	    // Assign a value to radius
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Length: ");
	    length = scan.nextDouble();
	    System.out.println("Enter width: ");
	    width = scan.nextDouble();
	    
	    perimeter = (2*length)+(2*width);
	    area = length * width;
	    // Print results
	    System.out.print("The Area is ");  // Print description
	    System.out.println(area);          // Print the value stored in the variable
	    System.out.print("The Perimeter is ");
	    System.out.println(perimeter);

	}
}
	



