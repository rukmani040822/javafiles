package rukmani;
import java.util.Scanner;
public class Areaofrectangle {

	public static void main(String[] args) {
		float length,breadth,area;
		Scanner sc = new Scanner(System .in);
		System.out.println("Enter length");
		length = sc.nextInt();
		System.out.println("Enter breadth");
		breadth = sc.nextInt();
		
		area = length * breadth;
		System.out.println(" The area of rectangle of length = "+ length+" and breadth = "+breadth+" is "+area);

	}

}
