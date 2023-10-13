package javaPractice;

public class ConditnalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=10;
//		int b=5;
//		
//		if (a==b) {
//			System.out.println("Test Case Pass:" );
//		}
//		else {
////			System.out.println("test case fail");
////			
////			int number =100;
////			//nested if
////			if(number <=100) {
////				System.out.println("Calculating your marks");
////				if (number >=90) {
////					System.out.println("You Got Grade A");
////				}
////				 if (number ==100) {
////					 System.out.println("You got the 100 % schoolarship");
////				 }
////			}
//
//	}}
//	
	    String browser= "chrome";
	    if(browser.equals("chrome")) {
	    	   System.out.println("Launch Chrome Browsewr");
	       }
	    else if (browser.equals("IE")) {
	    	System.out.println("Launch IE browser");
	    	
	    }
	    else if (browser.equals("Safari")) {
	    	System.out.println("Launch Safari Browser");
	    }
	    else {
	    	System.out.println("Please pass the correct browser");
	    }
	    

}
}
