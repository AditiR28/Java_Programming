package Functions;

import java.util.Scanner;

public class sum {
    public static int summynum (int a,int b){
int sum = a+b;
return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a");
        int a = sc.nextInt();
        System.out.println("Enter a number b");
        
        int b = sc.nextInt();
        int sum =summynum(a, b);
        System.out.println("Sum of two number =ssssss" + sum);

    }
    
}
