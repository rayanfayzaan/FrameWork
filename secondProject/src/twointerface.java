
public class twointerface implements PCBanking, Newinterface{
	 

	public static void main(String[] args) {
	 
		
		twointerface obj = new twointerface();
		obj.Mastercard();
		 obj.Goldcard();
		 obj.visacard();
		 obj.appointment();
		 obj.cancelappointment();
		 obj.othersoptions();
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
		


	@Override
	public void appointment() {
		System.out.println("Press 5 for Appointment");
		
	}

	@Override
	public void cancelappointment() {
		System.out.println("press 0 for cancel");
		
	}

	@Override
	public void othersoptions() {
		System.out.println("Press * for Others Options");
		
	}

}
