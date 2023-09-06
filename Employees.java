package rukmani;

import java.util.Scanner;

public class Employees {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Eid ,Ename,Eage,Esalary,Edepartment, Egender
       int Eid, Eage;
       double Esalary;
       String Ename, Edepartment;
       char Egender;
       System.out.println("Enter Employee ID:");
       Eid = sc.nextInt();
       sc.nextLine();
       System.out.println("Enter Employee Name:");
       Ename = sc.nextLine();
       System.out.println("Enter Empolyee Age:");
       Eage = sc.nextInt();
       System.out.println("Enter Empolyee Salary:");
       Esalary = sc.nextDouble();
       System.out.println("Enter Empolyee Department:");
       Edepartment = sc.nextLine();
       sc.nextLine();
       System.out.println("Enter Empolyee Gender:");
       Egender = sc.next().charAt(0);
       
       System.out.println("Entered Detalis are:");
       System.out.println("Empolyee ID: "+ Eid);
       System.out.println("Empolyee Name:"+Ename);
       System.out.println("Empolyee Age:"+Eage);
       System.out.println("Empolyee Salary:"+Esalary);
       System.out.println("Empolyee Department:"+Edepartment);
       System.out.println("Empolyee Gender:"+Egender);
       
      
       
	}

}