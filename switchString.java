package rukmani;

import java.util.Scanner;

public class switchString {

	public static void main(String[] args) {
         String day;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter day name");
         day = sc.next().toLowerCase();
         switch(day) {
         case "monday": System.out.println("First day of the week");
                        break;
         case "tuesday": System.out.println("Second day of the week");
                        break;
         case "wednesday": System.out.println("Third day of the week");
                        break;
         case "thursday": System.out.println("Fourth day of the weeek");
                        break;
         case "friday": System.out.println("Fifth day of the week");
                        break;
         case "saturday": System.out.println("Sixth day of the week");
                        break;
         case "sunday": System.out.println("Seven day of the week");
                        break;
         default:System.out.println("invalid Input");
         
         }

	}

}
