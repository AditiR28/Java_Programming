import java.util.Scanner;

class primenumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i =2;i<n/2;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime ){
            if(n ==1 ){
                System.out.println("this is neither prime nor composite");
            }else{
                System.out.println("this is prime number");
            }
        }else{
            System.out.println("this is not prime number");
        }

        }

    }
