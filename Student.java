package rukmani;
import java.util.Scanner;
public class Student {
	
		 int age;
		 String name;
		 static String collegename = "Jain college";
		void input(){
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter student name");
		     name = sc.nextLine();
		     
		     System.out.println("Enter age");
		     age = sc.nextInt();
		  }
		  void display(){
		      System.out.println("Name ="+name);
		       System.out.println("Age="+age);
		       System.out.println( "collegename="+ collegename);
		  }
		public static void main(String args[]){
			//array of Student
			Student s[]=new Student[5];  
			
		for(int i=0;i<s.length;i++) { //s[0]
			s[i] = new Student();
				
			}
			System.out.println("Enter "+s.length+" student details");
			for(int i=0;i<s.length;i++) {
				s[i].input();
				
			}
			
			System.out.println("Details of students");
			for(int i=0;i<s.length;i++) {
				s[i].display();
				
			}
		  
		  
		  
		}
}

