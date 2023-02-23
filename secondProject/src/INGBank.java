
public class INGBank implements PCBanking {

	public static void main(String[] args) {
		
		INGBank obj = new INGBank();
	            obj.visacard();
	            obj.Mastercard();
	            obj.Goldcard();
	
	}         
	@Override 
	public void visacard() {
	System.out.println("Press 1 for French.");
		
	}

	@Override
	public void Mastercard() {
	System.out.println("Press 2 for Nederland.");
		
	}

	@Override
	public void Goldcard() {
		System.out.println("Press 3 for english.");
	}
	@Override
	public void othersoptions() {
		// TODO Auto-generated method stub
		
	}
    
	
	
	
}
