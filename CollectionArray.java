package threadclass;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArray {

	public static void main(String[] args) {
	     ArrayList<String> lst=new ArrayList<String>();
	     
	     lst.add("hello");
	     lst.add("hi");
	     lst.add("how r u");
	     System.out.println(lst);
	     ArrayList<Integer> lst1=new ArrayList<Integer>();
	     
	     lst1.add(23);
	     lst1.add(67);
	     lst1.add(89);
	     lst1.add(34);
	     System.out.println(lst1);
	     
	     Scanner sc = new Scanner(System.in);
	     
	     ArrayList<Float>lst2= new ArrayList<Float>();
	     for(int i=1; i<=5;i++) {
	    	 System.out.println("Enter the elements");
	    	 lst2.add(sc.nextFloat());
	    	 
	     }
	     lst2.add(3, 45.2f);
	     System.out.println(lst2);
	     
	     lst2.clear();
	     System.out.println(lst2);

	}

}
