
	//wrapper class is predifined by java contains primitive data type.And used to wraps to primitive values
	//int = Integer
	//double=Double
	//char=Character
	//boolean=Boolean
public class wrapperclass {

	public static void main(String[] args) {
		
		String jacketprice ="5500";	//here we wrap the string values into integer values
		String pentprice ="2500";
		
		int jacket=Integer.parseInt(jacketprice);
		int pent=Integer.parseInt(pentprice);
		int totalprice=jacket+pent;
		System.out.println(totalprice);
	   
		String tvprice = "599.550";
		String dvdprice="100.440";
		
		double tv = Double.parseDouble(tvprice);
		double dvd= Double.parseDouble(dvdprice);
		double result=tv+dvd;
		System.out.println(result);
		
		
	
		
	}
	

}
