package threadclass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

	
class Student{
	int sid;
	String sname;
	float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}
	
class SortStudentFees implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.sfees > s2.sfees)
			return 1;
		else if(s1.sfees<s2.sfees)
			return -1;
		return 0;
	}



 }

public class MainApp1{
	public static void main(String[]args) {
		
		ArrayList<Student>slist = new ArrayList<Student>();
		
		
		Student s1 = new Student(11,"Manoj",8767);
		Student s2 = new Student(12,"Rukmani",5767);
		Student s3 = new Student(13,"Deepak",98767);
		Student s4 = new Student(14,"Anbu",78767);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		System.out.println(slist);
		
		Iterator<Student> sit= slist.iterator();
		SortStudentFees sf=new SortStudentFees();


		// Collections.sort(slist ,new SortStudentFees());
		 
		 
		 Collections.sort(slist ,sf);
		 
		 System.out.println("After sorting fees");
		 Iterator<Student>sit1 = slist.iterator();
		 
		 System.out.println("SID\tFees\tName");
		 while(sit1.hasNext()) {
		 	//System.out.println(sit.next());
		 	Student sob = sit1.next();
		 	System.out.println(sob.sid+"\t"+sob.sfees+"\t"+sob.sname);
		
			
		}
	}
	
}


