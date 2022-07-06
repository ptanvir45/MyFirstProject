package firstProject;

public class BasicVariables {
	static int Number = 99; // > Static variable/global ( After the class & before any method with static keyword)
	
										
									/*
									 * 
									 * Static variable can be access from any package, class, and method within the project
									 * 
									 */								
										

	
	
	String name = "Smart Tech"; // > Instance variable/Non static variable  ( After the class & before any method )
	
									/*
									 * 	Instance variable can be accessible any method within the class
									 * 								
									 */

	public static void localMethod() {
		int a = 20;
		String name1 = "Batch-27!$%"; // > Local variable ( always inside any method)
														//Only work inside its own method. 
														//its not accessible other method, class, package. 
		
		
		
		char sign = '$'; // > 1 Digit any character with signal quote >' '
		
		
		
		System.out.println("This is a whole number : " + a);
		System.out.println("This is a alphanumeric characters : " + name1);
		System.out.println("This is a signal character : " + sign);

	}

	public static void main(String[] args) {
		
		BasicVariables.localMethod();
	

}
	
	
	
	
	
	
	
	
	//Signal line command

	//------------------------------
	/*
	 * multi-line command 
	 */

}
