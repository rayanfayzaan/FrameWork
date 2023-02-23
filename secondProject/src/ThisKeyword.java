	//whenever a variable is declared inside the method is called local varible.used for particular method
	//whenever a variable is declared outide the method is called Global varible.and can be used through out the class
 	//keyword THIS is used to call the global variable whenever have same name. 
	

public class ThisKeyword {

	  int a =200;      //Global variable because its outside the method
	  
	  public void login() {
		  System.out.println(a);
	  }
	  
	  public void getdata()
	  {
		  int a =100;	// int a=100 is a local variable because its used for particular method.
		//  System.out.println(a);
	      System.out.println(this.a);
	  }
	  
	public static void main(String[] args) {
		 
		ThisKeyword obj = new ThisKeyword();
	     obj.getdata();
	     obj.login();
	
	
	}
	

}
