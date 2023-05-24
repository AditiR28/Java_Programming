import java.util.Scanner;

class greater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
      if( a == b){
        System.out.println("a is equal to b");
      }
      else if(a>b){
        System.out.println("a is greater than b");
      }
      else{
        System.out.println("a is lesser than b");
      }
    

}
}