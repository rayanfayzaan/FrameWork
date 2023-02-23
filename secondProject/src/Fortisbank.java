
public class Fortisbank implements PCBanking{

public static void main(String[] args) {
		
	 Fortisbank obj = new  Fortisbank();
	 obj.Mastercard();
	 obj.Goldcard();
	 obj.visacard();
	 obj.Endcall();
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
   
	public void Endcall() {
	System.out.println("Press 4 End call");
	
	}
	

	
	
	{
		
		
	}




	@Override
	public void othersoptions() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}

