package javaPractice;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//with new keyword
//		int a[]=new int [4];
//		
//		
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
		
//		System.out.println(a[0]);
//		int len=a.length;
//		System.out.println(len);
		
		
	//without using foor loop
		
//		System.out.println(Arrays.toString(a));
		
//		String emp[]= new String[3];
//		emp[0]="Urvija";
//		emp[1]="Rishek";
//		emp[2]="Urvi";
//		System.out.println(Arrays.toString(emp));
		
//		for(int i=0;i<emp.length;i++) {
//			System.out.println(emp[i]);
//			
//			if(emp[i].equals("Urvija")) {
//				System.out.println("Print urvija salary");
//			}
//		}
//		}
//		
		// Array literal
		
		int a[]= {1,3,5,7,9,101};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
}
}