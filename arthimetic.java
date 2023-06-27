class arthimetic{
    //problem statement (10*2)-2)+2)-2)/2
    public int sum(int a,int b){// non void default parameter
        int c;
        c=a+b;
        System.out.println("Sum Result "+c);
        return c;
    }
    public int sub(int c,int d){
        int e;
        e=d-c;
        System.out.println("Subtract Result "+e);
        return e;
    }
    public int mul(int x,int y){ // non- void method
        int z;
        z=x*y;
        System.out.println("Multiply "+ z);
        return z;
    }
    public void div(int p,int q){ // void method
        
        int div=p/q;
        System.out.println("Divide "+div); 
    }
    public static void main(String args[]){
        arthimetic result = new arthimetic();
        int sum = result.sum(10, 2);
        int sub = result.sub(sum, 2);
        int sum2 = result.sum(sub, 2);
        int mul= result.mul(sum2, 2);
        result.div(mul, 2);

    }

}