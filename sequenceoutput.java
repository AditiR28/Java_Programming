
public class sequenceoutput{
    public sequenceoutput()
    {
        this(12,24,36); //it will call three paramertized constructor
System.out.println("Default Constructor");
    }
    public sequenceoutput(int a)
    {
        this(); //it will call default paramterized
System.out.println("One Parametized Constructor");
    }
    public sequenceoutput(int a,int b)
   {
     this(12,24,36,48);  // it will call four parameterized constructor
        System.out.println("Two Parameterized Constructor");
    }
    public sequenceoutput(int a ,int b,int c)
    {

        System.out.println("Three Paramerterized Constructor");
    }
    public sequenceoutput(int a,int b,int c,int d)

    {
      this(12); // it will call one parameterized constructor
        System.out.println("Four Parameterized Constructor");
    }
public static void main(String args []){
    sequenceoutput obj = new sequenceoutput(12,24);
    
}
}