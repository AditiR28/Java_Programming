public class dell {
    public void method(){
        System.out.println("Parent default method");
    }
     public  void method1(int a){
        System.out.println("Parent one parameterized method");
    }
     public void method2 (int a,int b){
        System.out.println("Parent two parameterized method");
    }
     public void method3(int a,int b,int c){
        System.out.println("Parent three parameterized method");
    }
    public static void main(String args[]){
        dell obj = new dell();
        obj.method2(12,24);

    }

    
}
