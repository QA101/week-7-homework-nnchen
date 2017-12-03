import java.util.Scanner;

public class Palindrome {

	 public static void main(String args[]) {
		  String original, reverse = "";
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter number of inputs you want : ");
		  int numOfInt = in.nextInt();
		  original = in.nextLine();
		do {
		  if (numOfInt == 0) {
		    System.out.println("Your Input Conplete");
		   } 
		  else {
		    System.out.println("Enter a string to check Palindrome");
		    original = in.nextLine();

		    StringBuffer buffer = new StringBuffer(original);
		    reverse = buffer.reverse().toString();

		  if (original.equalsIgnoreCase(reverse)) {
		    System.out.println("The entered string is Palindrome:"+reverse);
		   } 
		  else {
		    System.out.println("The entered string is not Palindrome:"+reverse);
		    }
		 }
		
		   numOfInt--;
		  } while (numOfInt >= 0);
		}
		}

