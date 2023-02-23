
public class Enhancedforloop {

	public static void main(String[] args) {
	//2 ways to declare enhanced for loop First way
		
		String family[] = {"Shoaib","Romana","Rayan","fayzaan","Amal"};
		 
		for(String name:family)
		{
			System.out.print(name);
		}
		//Second Way.
		
		String x[] = new String [5];
		x[0]="shoaib";
		x[1]="Romana";
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		int a[] = {10,11,12,13,14,15};
		for(int b:a)
				{
			        System.out.print(b);
				}
		
		String txt = "We are learing java online";
		
		String value[]= txt.split(" ");
		for( String i:value)
		{
			System.out.println(i);
		}
		
		}
		
			}

