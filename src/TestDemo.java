
import java.util.Scanner;
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MarksJavaPgm;
		//MarksJavaPgm second = new MarksJavaPgm();
		//AvgMarksPCM third = new AvgMarksPCM();
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
			MarksJavaPgm();
			AvgMarksPCM();
	}
			

public static void MarksJavaPgm()
{

	
				
				        int a;
				        int i;
				        float marks=0, avg;
				        Scanner scan = new Scanner(System.in);
						
				        System.out.print("Enter Marks Obtained in the exam : ");
				        marks = scan.nextInt();				
				        System.out.print("Your Grade is:");
				        
				        if(marks>70)
				        {
				            System.out.print("A");
				        }
				        else if(marks>61 && marks<=70)
				        {
				            System.out.print("B");
				        }
				        else if (marks<61)
				        {
				            System.out.print("C");
				        }
				        
				        System.out.print('\n');
				

}	
public static void AvgMarksPCM() {

	
		
		        int mark[] = new int[5];
		        int i;
		        float sum=0, avg;
		        Scanner scan = new Scanner(System.in);
				
		        System.out.print("Enter Marks Obtained in 3 Subjects-P,C,M : ");
		        for(i=0; i<3; i++)
		        {
		            mark[i] = scan.nextInt();
		            sum = sum + mark[i];
		        }
				
		        avg = sum/3;
				
		        System.out.print("Your Grade is ");
		        if(avg>70)
		        {
		            System.out.print("A");
		        }
		        else if(avg>61 && avg<=70)
		        {
		            System.out.print("B");
		        }
		        else if (avg<61)
		        {
		            System.out.print("C");
		        }
		        
		    }

}


