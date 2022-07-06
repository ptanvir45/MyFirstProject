package firstProject;

public class MathodCalling {
	
	//This is a static method 
	// no need to create object 
	// we can call static method by classname.methodName
		public static void getSalary() {
			System.out.println("I am static method");
				
		}
		
		//This is non-static method
		// need to create object in order call the method inside the main method.
		// formula is classname objectName ( we can give anything as object name) = new classname();
		
		
		// example: MathodCalling obj = new MathodCalling();
		public void getName() {
			
			System.out.println("I am Non-Static method");
		}
		
		public static void main(String[] args) {
			// This is a main method where we can call/run other method.
			
			MathodCalling.getSalary();// calling static method 
			
			 MathodCalling xyz = new MathodCalling(); // calling non static method. ( I created a object = xyz.)
			 xyz.getName();
			 
			
		}

}
