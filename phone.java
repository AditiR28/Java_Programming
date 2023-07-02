public class phone {
    public phone()
    
    {
        this(12,24, 36);
        System.out.println("Parent Default constructor");

    }
    public phone(int a)
    {
        this();
        System.out.println(" Parent One Parameterized constructor");
    }
    public phone(int a ,int b)
    {
        this(12);
        System.out.println(" Parent Two Parameterized Constructor");
    }
    public phone(int a,int b,int c)
    {
        System.out.println(" Parent Three Parameterized Constructor");
    }
    public static void main (String args []){
        phone obj = new phone(12,24);
    }

}
