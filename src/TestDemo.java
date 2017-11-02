
import java.util.Scanner;
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number"); 
		int number = in.nextInt();
		
		//number = in.nextInt();
				
				if (number == 0) {
		    System.out.println("The number is Zero"); // Number must be zero
		    } else if (number > 0 ){
		    System.out.println("You have Entered the Positive Value"); // Number greater than zero so must be positive
		    } else {
		    System.out.println("You have Entered the Negative Value"); // Number less than zero so must be negative
		    }
	}}
				


