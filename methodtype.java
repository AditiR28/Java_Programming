public class methodtype{
    public void m(){
     this.m3(12,24,36);
     System.out.println("Default Method");
    }
    public void m1(int a){
                this.m();
                 System.out.println("One Parameterized Method");
    }
    public void m2(int a,int b)
    {
        this.m4(12,24,36,48);
        System.out.println("Two Parameterized Method");
    }
    public void m3(int a,int b,int c)
    {
        System.out.println("Three Paramterized Method");
    }
    public void m4(int a,int b,int c,int d)
    {
        this.m1(12);
        System.out.println("Four Parameterized Method");
    }
    public static void main(String args[]){
        methodtype obj = new methodtype();
        obj.m2(12,24);
    }
}