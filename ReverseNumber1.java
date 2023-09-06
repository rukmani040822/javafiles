package rukmani;
import java.util.Scanner;
public class ReverseNumber1 {

		public static void main(String[] args) {
		   int num,d,orgnum, s=0;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter number");
		   num = sc.nextInt();
		   orgnum =  num;
		   
		   while(num>0) {
			   d=num%10;
			   s = s+(d*d*d);
			   num =  num/10;
		   }
		   
		   if(s == orgnum ) {
			   System.out.println(orgnum+ " is armstrong numner");
		   }
		   else {
			   System.out.println(orgnum+" is not a armstrong number");
		   }

		}

}


	


