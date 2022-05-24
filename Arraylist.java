package ArrayAndArraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
			
			ArrayList <Integer> al = new ArrayList<>();
			 
			al.add(23);
			al.add(56);
			al.add(57);
			
			
			for (Integer i : al) {
				System.out.println(i);
			}
			
			for (int i = 0 ; i < al.size(); i++) {
				System.out.println(i + " -> " + al.get(i));//arr[i]
			}
			
			
		}

	}
  