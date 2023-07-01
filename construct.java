public class construct{
    public  construct()
    {
        System.out.println("Default Constructor");
    }
public construct(int a)
{
    System.out.println("One Parameterized constructor");
}
public construct(int a,int b)
{
    System.out.println("Two Parameterized constructor");
}
public static void main(String args[]){
    construct obj =new construct();
    construct obj1 = new construct(20);
    construct obj2 = new construct(12,23);
       


}

}