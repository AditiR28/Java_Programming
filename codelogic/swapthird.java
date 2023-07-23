package codelogic;

import java.util.Scanner;

public class swapthird {
	public void thirdvar() {
		System.out.println("Swapping of two variable using third variable");
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a = ob.nextInt();
		System.out.println("Enter the value of b :");
		int b =ob.nextInt();
		//implement the code logic
		 int c;
		 c= a+b;
		 b = c-a;
		 a = c-b;
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		
		
	}

      public static void main(String[] args) {
     swapthird obj1 = new swapthird();
     obj1.thirdvar();
	

	}

}
