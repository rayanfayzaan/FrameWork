    
    // whenever sub class and super class have same method name is called overriding  
	//  than we use the KEYWORD SUPER.METHODNAME to stop the overriding 
public class childone extends parentclass {

	public void money() {
		System.out.println("MY money");
		super.money();
	}
	public void nofreetime() {
		System.out.println("FREE TIME");
	}
	public void car() {
    System.out.println("Car");
	}
	
	
	public static void main(String[] args) {
		
		childone obj = new childone();
		obj.car();
		obj.nofreetime();
		obj.shop();
	    obj.money();
	}    
	 

}
