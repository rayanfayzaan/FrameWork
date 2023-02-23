import java.util.Scanner;

public class ifelseprogram {

	public static void main(String[] args) {
		
		int marks;
		System.out.println("Enter your marks:-"); 
		Scanner s=new Scanner(System.in);
		marks=s.nextInt();
		if(marks>=60 && marks<100)
			{
		System.out.println("First Division");
			}
		
		else if(marks>=45 && marks<60)
		{
			System.out.println("second division");
			
		}
		else if(marks<=60 && marks>=33)
		{
		System.out.println("Third Division");	
			
		}
		else
		{
		System.out.println("failed");	
			
		}
	
	
	}


}
