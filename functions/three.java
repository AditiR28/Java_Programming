package functions;

import java.util.Scanner;

public class  three {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a  :");
        int a= sc.nextInt();
        System.out.println("Enter a number b  :");
        int b = sc.nextInt();
        System.out.println("Enter a number c :");
        int c = sc.nextInt();
        System.out.println("Average number : ");
        int average =a+b+c/3;
        System.out.println(average);
    }
    
}
