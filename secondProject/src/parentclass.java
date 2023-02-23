
    // this is concept called Inheritance.we use the keyword EXTENDS to call another class
	//one class extends to another class is called inheritance.
	// whenever sub class and super class have same method name than we use the  
	//KEYWORD SUPER.METHODNAME to stop the overriding

public class parentclass{
	
	public void money() 
	{
		System.out.println("MONEY");
	}
	public void freetime() 
	{
		System.out.println("Free time");
	}
   public void shop() {
	     System.out.println("SHOP");
   }
	public static void main(String[] args) {
		
		 parentclass obj = new  parentclass();
		 obj.money();
		 obj.freetime();
		 obj.shop();
	 
	
	}
	

}
