public class Employee {
    private int ecode;
    private String ename;
    private int sal;

    public void setData(int ecode, String ename, int sal){
        this.ecode=ecode;
        this.ename=ename;
        this.sal=sal;
    }
    public void show(){
        System.out.println(ecode+","+ename+","+sal);
    }
    public static void main(String args[]){
      Employee e1=new Employee();
      Employee e2=new Employee();
      e1.setData(111,"AAA",50000);
      e2.setData(112,"BBB",60000);
      e1.show();
      e2.show();
    }
   
}
