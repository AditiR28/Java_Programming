class students{
    String name ;
    int roll_no;
    public void setstudent(){
        System.out.println("Assign values using object ");
    }
    public static void main(String args[]){
        students ref = new students();
    ref.name = "John";
    ref.roll_no = 12;
    System.out.println(ref.name);
    System.out.println(ref.roll_no);

    }
}