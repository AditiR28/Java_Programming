import java.util.Scanner;

class circle{
    public static void main(String args[]){
       int r;
       double pi = 3.14,area;
       Scanner sc = new Scanner(System.in);
        r= sc.nextInt();
        area = pi * r *r;
        System.out.println(area);
    }
}