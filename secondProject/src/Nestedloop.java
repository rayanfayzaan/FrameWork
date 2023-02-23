
public class Nestedloop {

	public void dataname()
	{
		System.out.println("My name is Shoaib");
		System.out.println("Place of Birth");
		System.out.println("Okara");
		}
	
	public static void main(String[] args) {
	
		//loop inside the loop is called nested loop. 
	
	
	/* 1 2 3 4
		5 6 7
		8 9 
		 10*/
		int c=1; 
	for(int a=0; a<4; a++)
	{
	 
		for(int b=1; b<=4-a; b++)
		{
			
			  System.out.print(c);     
			    System.out.print("\t");
				    c++;
	
	}
	
		System.out.println(" ");
	
	}
	
	
	}}

	


