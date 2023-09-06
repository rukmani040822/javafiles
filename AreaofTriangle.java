package rukmani;
import java.util.Scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
		double height,base,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Width of the Triangle:");
		base = sc.nextDouble();
		System.out.println("Enter the height of the Triangle:");
		height = sc.nextDouble();
		
		area = (base*height)/2;
		
		System.out.println("Area of Triangle is:" + area);
		
		

	}

}
