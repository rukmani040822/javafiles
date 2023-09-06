package rukmani;
import java.util.Scanner;
public class AreaFigure {

	public static void main(String[] args) {
		int choice;
		double n1,n2,ans;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("*****Area of different figures*****");
		System.out.println("1. Area of Reactangle");
		System.out.println("2. Area of Square");
		System.out.println("3. Area of Triangle");
		System.out.println("4. Area of Circle");
		
		System.out.println("please enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter length and breadth of Reactangle");
		        n1=sc.nextDouble();
		        n2=sc.nextDouble();
		        ans=n1*n2;
		        System.out.println("Area of reactangle="+ans);
		        break;
		case 2: System.out.println("Enter side of the Square");
		        n1=sc.nextDouble();
		        ans=n1*n1;
		        System.out.println("Area of the Square="+ans);
		        break;
		case 3: System.out.println("Enter  height and width of Triangle");
		        n1=sc.nextDouble();
		        n2=sc.nextDouble();
		        ans=(n1*n2)/2;
		        System.out.println("Area of the Triangle="+ans);
		        break;
		case 4: System.out.println("Enter raidus of the Circle");
		        n1=sc.nextDouble();
		        ans=3.14*(n1*n1);
		        System.out.println("Area of the circle ="+ans);
		        break;
		        
	    default: System.out.println("Invalid input");
		        }

	}

}
