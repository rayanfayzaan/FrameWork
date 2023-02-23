 //when we have same method name miltiple time in the class is called overloading but can be differ with number of parameter
 // or data type of parameter we pass in the (). 
   public class overloading {
  
   public void datatype(int a) 
   {
	   System.out.println(a);
   }
   public void datatype(int a,int b) 
   {
	   System.out.println(a+b);
   }
   public void datatype(String name) 
   {
	   System.out.println(name);
   }
   
	public static void main(String[] args) {
		
		overloading obj = new overloading();
		obj.datatype(10);
		obj.datatype(10, 20);
		obj.datatype("my name is shoaib"); 
	}

}
