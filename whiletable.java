import java.util.Scanner;

class whiletable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //print console
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println("Enter a range");
        int range = sc.nextInt();
        int i =1;
        while(i<=range)

{
    System.out.println(num+"*"+i+"="+num * i);
    i++;

}

    }
}