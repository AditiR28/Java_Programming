public class laptop extends phone{
    public laptop()
    {
        super(12, 24);
        System.out.println("Child Default Constructor");
    }
     public laptop(int a)
    {
        this(12, 24, 36);
        System.out.println("Child One Parameterized Constructor");
    }
     public laptop(int a,int b)
    {
        this(12);
        System.out.println("Child Two Paramterized Constructor");
    }
     public laptop(int a,int b,int c)
    {
        this();
        System.out.println("Child Three Parameterized Constructor");
    }
    public static void main(String args[]){
    laptop obj = new laptop(12, 24);
    }

    
}
