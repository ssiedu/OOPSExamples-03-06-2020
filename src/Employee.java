public class Employee {
    private int ecode;
    private String ename;
    
    public  Employee(Employee tmp){
        ecode=tmp.ecode;
        ename=tmp.ename;
    }
    public  Employee(int x, String y){
        ecode=x;
        ename=y;
    }
    
    public void show(){
        System.out.println(ecode+","+ename);
    }
    public static void main(String args[]){
        Employee e1=new Employee(111,"AAA");
        Employee e2=new Employee(112,"BBB");
        
        Employee e3=new Employee(e2);
        
        e1.show();
        e2.show();
        e3.show();
    }
}
