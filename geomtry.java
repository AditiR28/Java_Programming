import java.util.Scanner;

class geomtry{
    int length;
    int breadth;
    int area;
    int perimeter;
    public void setDim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length number : " );
        int length = sc.nextInt();
        System.out.println("Enter a rectangle number : " );
        int breadth = sc.nextInt();
        area = length*breadth;
        System.out.println(area);
       

        
    }
    public void perimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length number : " );
        int length = sc.nextInt();
        System.out.println("Enter a rectangle number : " );
        int breadth = sc.nextInt();
        perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }
    public static void main(String args[]){
 geomtry find = new geomtry();
find.setDim();
find.perimeter();

    }
}