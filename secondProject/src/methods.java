
public class methods {
    
	public void firstmethod()
	{
	
		System.out.println("Enter your  First name");
		System.out.println("Enter your Last Name");
		System.out.println("Enter your e-mail");
		}
	
	
	   public static void main(String[] args) {
		/*whenever we feel some set of lines of code multiple time  
		 * and should be outside the main and called by objects
		 */
		
       /*syntax to create the Object is First Class name than Object name = new Class Name
        * and for call the object with the name of Method. exp=obj.Firstmethod
        */
		  
		   methods obj = new methods();
	       obj.firstmethod();
	      
	       method1 obj2 = new method1();
	       
	       obj2.secondmethod();
	       obj2.getClass();
	       
	       obj2.thirdmethod();
	       obj2.getClass();
	       
	       
	   }
	   
    }
