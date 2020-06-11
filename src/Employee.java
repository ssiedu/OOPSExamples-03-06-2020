public class Employee {
    private int ecode;
    private String ename;
    private int sal;
    
    
    void test(){
        //this();
    }
    
    public Employee(){
        test();
    }
    
    public Employee(int a, String b){
        this();
        ecode=a;
        ename=b;
    }
    public Employee(int x, String y, int z){
        //ecode=x; 
        //ename=y; 
        this(x,y);      //using this keyword we are calling a constructor
        sal=z;
        //we already have a constructor for initilizing ecode,ename
        //we need not to write them repeatedly, 
        //we can invoke a two arg constructor for initilizing ecode,ename
        
    }
    public void show(){
        System.out.println(ecode+","+ename+","+sal);
    }
    
    
    public static void main(String args[]){
        Employee e1=new Employee(111,"AAA",50000);
        Employee e2=new Employee(112,"BBB");
        e1.show();
        e2.show();
    }
   
}
