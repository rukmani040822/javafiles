package threadclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainSet {

	public static void main(String[] args) {
     HashSet<Integer> hobj = new HashSet<Integer>();
		
		hobj.add(45);
		hobj.add(56);
		hobj.add(89);
		hobj.add(76);
		hobj.add(null);
		hobj.add(98);
		
		System.out.println(hobj);
		
		//LinkHashSet
     LinkedHashSet<Integer> lobj = new LinkedHashSet<Integer>();
		
		lobj.add(45);
		lobj.add(56);
		lobj.add(89);
		lobj.add(76);
		lobj.add(null);
		lobj.add(98);
		
		System.out.println(lobj);
		//TreeSet
		 TreeSet<Integer> tobj = new TreeSet<Integer>();
			
			tobj.add(45);
			tobj.add(56);
			tobj.add(89);
			tobj.add(76);
			tobj.add(98);
			tobj.add(98);
			
			System.out.println(tobj);
		

	}

}
