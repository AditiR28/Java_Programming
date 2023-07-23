package codelogic;

import java.util.Scanner;

public class checkprime {
	
	
	public void primenum() {
		{
		      int num= 12, i, count=0;
		      System.out.println("Whether a number is prime or not");
		     Scanner s = new Scanner(System.in);
		       System.out.print("Enter a Number: ");
		        num = s.nextInt();
		      
		      for(i=2; i<num; i++)
		      {
		         if(num%i == 0)
		         {
		            count++;
		            break;
		         }
		      }
		      
		      if(count==0)
		         System.out.println(" It is a Prime Number.");
		      else
		         System.out.println(" It is not a Prime Number.");
		   }
		}
	public static void main(String[] args) {
		checkprime abcd = new checkprime();
		abcd.primenum();

	}

}
