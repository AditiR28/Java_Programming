public class staticoverload {
    public void  arthimetic(int a,int b){
        int c;
        c= a+b;
        System.out.println("The result is" +c );
    }
    public void arthimetic (int x,int y,int z){
        int result;
        result =x*y*z;
        System.out.println("The result is " +result);
    }
    
    public static void main(String args[]){
        staticoverload obj1= new staticoverload();
        obj1.arthimetic(12,24);
        obj1.arthimetic(12,24,36);

    }
}
