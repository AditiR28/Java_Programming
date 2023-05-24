import java.util.Scanner;

class buttons{
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if (button == 1){
            System.out.println("hello");
        }
        else if(button ==2 ){
            System.out.println("namaste");
        }
        else if(button == 3){
            System.out.println("haahaha");
        }
        else{
            System.out.println("invalid buttons");
        }

    }
}