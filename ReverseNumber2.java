package rukmani;
import java.util.Scanner;
public class ReverseNumber2 {

		public static void main(String[] args) {
		   int num,d,orgnum, s=0,i;
		   Scanner sc = new Scanner(System.in);
		   /*System.out.println("Enter number");
		   num = sc.nextInt();*/
		   
		   for(i=1;i<=1000;i++) {
			num=i;   
		   orgnum =num;
		   s=0;
		   while(num>0) {
			   d=num%10;
			   s = s+(d*d*d); //1
			   num =  num/10; 
			  // System.out.println(num);
		   }
		   
		   if(s == orgnum ) {
			  // System.out.println(orgnum+ " is armstrong numner");
			   System.out.println(orgnum);
		   }
		}//for

		}

	}

