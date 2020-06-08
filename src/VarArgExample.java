
public class VarArgExample {

    public static void add(int...v){
        int sum=0;
        for(int n:v){
            sum=sum+n;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
   
        add(10,20,30);  //{10,20,30}
        add(10,20,30,40);
        add(1,2,3,4,5,6,7,8,9,10);  //{1,2,3,4,5,6,7,8,9,10}
    }
}
/*
    for the above requirement , we can write 5 add methods (overloading)
    or
    we can write an add method using varargs.
*/