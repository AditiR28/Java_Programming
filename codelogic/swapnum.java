package codelogic;

import java.util.Scanner;

public class swapnum {
	public void swap() {
		System.out.println("Swapping of two numbers using two variable");
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of a  :");
		int a= ob.nextInt();
		System.out.println("Enter the value of b :");
		int b= ob.nextInt();
		a =a+b;
  		b= a -b;    //logic of swap numbers using two variable
		a= a-b;
		System.out.println("A =" +a);
		System.out.println("B ="+b);
		
	}

	public static void main(String[] args) {
		swapnum obj1 = new swapnum();
		obj1.swap(); 

	}

}
