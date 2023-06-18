package SeleniumPack;

public class FinalTesting extends AllTestingforAirline {

	public static void main(String[] args) {
		
		FinalTesting obj1 = new FinalTesting();
		
		initbrowsing("https://book.spicejet.com/");
		
		
		obj1.selectpassenger("2", "1", 1);
		obj1.fromto("BLR","KQH");
		
		
		
	}

}
