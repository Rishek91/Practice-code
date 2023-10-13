package javaPractice;

import java.util.HashMap;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(110,"Rishek");
		mp.put(111,"Ajay");
		mp.put(120,"Rahul");
		
		Iterator<Integer >it= mp.keySet().iterator();
		while(it.hasNext()) {
			int key =it.next();
			System.out.println("Roll number"+key+"name"+mp.get(key));
			
		}

	}

}
