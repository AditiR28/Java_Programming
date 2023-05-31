package Functions;

import java.util.Scanner;

public class multiply {
    public static int mulnum(int a,int b){
        int multiply = a*b;
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = mulnum(a, b);
        System.out.println("multiply answ  ="+ multiply);
    }
}
