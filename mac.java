public class mac extends window {
    public void arthimetic(int a,int b){
        int result;
        result=a*b;
        System.out.println("The result is" +result);
    }
    public static void main(String args[]){
        mac obj1 = new mac();
     obj1.hp();
     obj1.arthimetic(12,24); //overriding method
    }
    
}
