package rukmani;
import java.util.Scanner;
public class largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,d;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number");
        a=sc.nextInt();
        
        System.out.println("Enter 2nd number");
        b=sc.nextInt();
        
        System.out.println("Enter 3rd number");
        c=sc.nextInt();
        
        System.out.println("Enter 4th number");
        d=sc.nextInt();
        
        int maxNum=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;
        System.out.println("the largest number is "+maxNum+" from numbers "+a+", "+b+","+c+","+d);
        
	}
}
