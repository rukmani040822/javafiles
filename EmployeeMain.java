package threadclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

 class Employee{

	private int eid;
	private String ename;
	private float esalary;
	private int eage;

	public Employee(int eid, String ename, float esalary, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.eage = eage;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eage=" + eage + "]";
	}

}
 class SortEmployeeAge implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEage() < e2.getEage()) {
			return 1;
		}
		else if(e1.getEage() > e2.getEage()) {
			return -1;
		}
		return 0;
	}
	
 class SortEmployeeName implements Comparator<Employee> {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			
			return e2.getEname().compareTo(e1.getEname());
		}

	}


}
public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employee> elist = new ArrayList<Employee>();

		Employee e1 = new Employee(11, "Rukmani", 78653, 20);
		Employee e2 = new Employee(13, "Priya", 89753, 22);
		Employee e3 = new Employee(14, "kavi", 87542, 19);
		Employee e4 = new Employee(15, "Ravaan", 77652, 18);
		Employee e5 = new Employee(18, "Kumar", 798624, 15);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);

		Iterator<Employee> eit = elist.iterator();
		System.out.println("EID\tName\tAge\tSalary");

		while (eit.hasNext()) {

			Employee eob = eit.next();
			System.out.println(eob.getEid() + "\t" + eob.getEname() +"\t" + eob.getEage()+ "\t" + eob.getEsalary());
		}
		
		//Sorting by Employee Age
		
		System.out.println("");
		System.out.println("Sorting by Employee Age");
		SortEmployeeAge ea =new SortEmployeeAge();
		Collections.sort(elist,ea);
		
		Iterator<Employee> eit1 = elist.iterator();
		System.out.println("EID\tName\tAge\tSalary");

		while (eit1.hasNext()) {

			Employee eob = eit1.next();
			System.out.println(eob.getEid() + "\t" + eob.getEname() +"\t" + eob.getEage()+ "\t" + eob.getEsalary());
		}
		
		//Sorting by Employee Name

		System.out.println("");
		System.out.println("Sorting by Employee Name");
		SortEmployeeAge en =new SortEmployeeAge();
		Collections.sort(elist,en);
		
		Iterator<Employee> eit2 = elist.iterator();
		System.out.println("EID\tName\tAge\tSalary");

		while (eit2.hasNext()) {

			Employee eob = eit2.next();
			System.out.println(eob.getEid() + "\t" + eob.getEname() +"\t" + eob.getEage()+ "\t" + eob.getEsalary());
		}

	}

}

