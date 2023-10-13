package javaPractice;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		//40 41 42 43 44
		
		//Nested Loop
		for (int i=0; i<=4 ;i++) {
			for (int k=0;k<=4;k++) {
				System.out.print(i+""+k+" ");
		}
		System.out.println();	
	}

}
}