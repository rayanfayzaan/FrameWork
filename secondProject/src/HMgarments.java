
public class HMgarments extends AbstractClassGarments {

	public static void main(String[] args) {
		HMgarments obj = new HMgarments();
               
	                
	               obj.secondflour(); 
	               obj.thirdflour();
	               obj.groundflour();
	               obj.fifthflour();
	               obj.firstflour();
	               obj.fourthflour();
	
	}            

	@Override                         // we can write in the interface methods by using the abstract 
	public void thirdflour() {
	
		System.out.println("third flour used for kids");
	}

	@Override
	public void fourthflour() {
	
		System.out.println("fourth flour used for Men");
	}

	@Override
	public void fifthflour() {
		System.out.println("fifth flour used for Ladies");
	
	}

}
