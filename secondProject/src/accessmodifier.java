
//there is four type of Access Modifier
//1 PUBLIC.when variables and methods which are declared as PUBLIC can be accessed by any class 
/*from the same package and other package also.*/
//2 DEFAULT:when variables and methods which are declared as DEFAULT can be accessed by any class within the same package.
//3 PROTECTED:when variables and methods which are declared as PROTECTED can be accessed by any class within the same package
/* and the child class of the other package*/
//4 PRIVATE:when variables and methods which are declared as PRIVATE can be accessed in the same class. cannot be accessed 
/* by other class and other packages.*/// belongs to other class accessmodifier2

public class accessmodifier {

	public void publicmethod()
	{
		System.out.println("i am public modifier");
	}
	void defaultmethod() {
		System.out.println("i am a default modifier");
	}
	protected void protectedmethod()
	{
		System.out.println("i am a protrcted modifier");
	}
	private void privatemethod() 
	{
		System.out.println("i am a private modifier");
	}
	public static void main(String[] args) {
		
		accessmodifier obj = new accessmodifier();
		     obj.publicmethod();
		     obj.defaultmethod();
		     obj.protectedmethod();
		     obj. privatemethod();

	}

}
