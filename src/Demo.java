
public class Demo {

    private int x, y;
    
    //we are writing a method to compare two objects of Demo class.
    public boolean equals(Demo obj){
        if(x==obj.x && y==obj.y){
            return true;
        }else{
            return false;
        }
    }
    
    public void show(){
        System.out.println(x+","+y);
    }
    
    public Demo(int a, int b){
        x=a; y=b;
    }
    
    public static void main(String[] args) {
        
       
        Demo d1=new Demo(10,20);
        Demo d2=new Demo(10,20);
        Demo d3=d2;
        
        boolean res1=(d1==d2);
        System.out.println(res1);
        
        boolean res2=d1.equals(d2);
        System.out.println(res2);
        
        /*
        Demo d1;                    //declaring a reference of type Demo
        new Demo(10,20);            //object created but address is not stored in any ref (cant be accessed)
        Demo d2=new Demo(30,40);
        Demo d3=d2;
        d1=d3;
        System.out.println(d1.x+","+d1.y);
        System.out.println(d2.x+","+d2.y);
        System.out.println(d3.x+","+d3.y);
        System.out.println("_________________________________________");
        d3=new Demo(50,60);
        d2=d3;
        System.out.println(d1.x+","+d1.y);
        System.out.println(d2.x+","+d2.y);
        System.out.println(d3.x+","+d3.y);
       */
    }
}
