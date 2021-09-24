package day2;

public class StaticKeyword {
	
	 static
	 {
		 System.out.println("In static block");
	 }
	 
	 public static void M()
	 {
		 System.out.println("In static method");
	 }

	public static void main(String[] args) {
		 
		System.out.println("In main method");
		StaticKeyword.M();
	
	}

}
