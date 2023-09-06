package rukmani;

import java.util.Scanner;

public class Voting {



   public static void main(String[] args) {
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a age:");
    age = sc.nextInt();
    if (age>=18) {
    	System.out.println("Eligible for voting");
    	
    }
    else {
    	System.out.println("Not eligible for voting");
    }

}

}