public class hp extends dell{
     public void method(){
        System.out.println("Child default method");
    }
     public  void method1(int a){
        super.method3(12, 24, 36); // super keyword is used for calling the parent paramertized constructor from child class constructor
        super.method();
        super.method1(12);
        super.method2(12, 24);
        this.method2(12, 24); // "this"  constructor is used from one calling constructor to another constructor 
       this.method();
       this.method3(12,24,36);
  System.out.println("Child one parameterized method");
    }
     public void method2 (int a,int b){
        System.out.println("Child two parameterized method");
    }
     public void method3(int a,int b,int c){
        System.out.println("Child three parameterized method");
    }
     public static void main(String args[]){
        hp obj1 = new hp();
        obj1.method1(12);;

    }

}