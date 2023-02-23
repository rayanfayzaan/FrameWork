
	//whenever we create an object the constructor is executed.Constructor should have the same name as class.
	//we can create the multiple constructor but with different parameter.

public class Constructor {
	
	public void getdata()
	{
		System.out.println("this is a method");
	}
	public Constructor()
	{
		System.out.println("i am a constructor");
	}
	public Constructor(int a , int b) 
	{
		System.out.println("I am a costructor two");
	}
	public Constructor(String name) 
	{
		System.out.println("my name is shoaib");
	}
	
	public static void main(String[] args) {
		Constructor obj3=new Constructor();
		Constructor obj = new Constructor(10,20);
		Constructor obj2= new Constructor("name");
		
		
		
		            
	}

}
