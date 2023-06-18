public class calculate{
    //problem statement = 
    // ->>(10*2)-2+)2)-2/2)
    
    public int add(int a,int b) // non-void method // taking input and return output
    {
        int c;
        c = a+b;
        System.out.println("Sum Result"  +c);
        return c;
    }
    public int sub(int c,int d)
    {
        int e;
        e=d-c;
        System.out.println("Subtract Result" +e);
        return e;
    }
    public int mul(int f, int g)
    {
        int h;
        h=f*g;
        System.out.println("Multiply" +h);
        return h;

    }
    public void div(int x ,int y) // void method (//taking input but do not return output)
    {
        
        int div = x/y;
        System.out.println("Divide" +div);
        
    }
     
    public static void main(String args[]){
        calculate result = new calculate();
        int a1 = result.mul(10,2); // non-void result...
        int a2 = result.sub(a1, 2);
        int a3 = result.add(a2,2);
        int a4 =result.sub(a3, 2);
        result.div(a4,2); 
    }
}
