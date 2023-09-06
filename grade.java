package rukmani;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		
     Scanner sc = new Scanner (System.in);
     
     System.out.println("Enter your grade");
     grade = sc.next().charAt(0);
     if(grade == 'a'|| grade == 'A') {
    	 System.out.println("your marks is between 90 to 100");
     }
     else if (grade =='b'|| grade == 'B') {
    	 System.out.println("your marks is between 70 to 89");
     }
     else if (grade == 'c'|| grade == 'C') {
    	 System.out.println("your marks is between 50 to 69");
     }
     else if (grade == 'd'|| grade == 'D') {
    	 System.out.println("your marks is between 0 to 50");
     }
     else 
    	 System.out.println("please enter valid grade");
	}

}
