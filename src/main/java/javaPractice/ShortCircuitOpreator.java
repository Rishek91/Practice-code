package javaPractice;

public class ShortCircuitOpreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//&& opreator is called short circuit operator
		int a =100;
		int b=200;
		int c =300;
		 if(a>b && a>c) {
			 System.out.println("a is greatest");
		 }
		 else if (b>c) {
			 System.out.println("b is greatest");
			 
		 }
		 else {
			 System.out.println("c is greatest");
		 }

	}

}
