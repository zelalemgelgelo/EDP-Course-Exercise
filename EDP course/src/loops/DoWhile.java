package loops;

import java.util.Scanner;

public class DoWhile {

	 public static void main(String[] args) {
	
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        String select= "";
	        
	        do {
	            System.out.println("Enter input 1: ");
	            int value1 = scanner.nextInt();
	            System.out.println("Enter input 2: ");
	            int value2=scanner.nextInt();
	            int result =value1+value2;
	            System.out.println("Result = " +result);
	          
	            System.out.println("Do you want to continue yes or no?");
	            select=scanner.next();
	        }
	        while(select.equalsIgnoreCase("yes"));
	        
	        System.out.println("Thank you");
	    }

}
