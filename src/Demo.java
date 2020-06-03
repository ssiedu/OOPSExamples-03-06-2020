
public class Demo {

    int x, y;           //instance (non-static)
    static int p, q;    //class     (static)
    static final int MAX=100;
    
    public static void main(String[] args) {

        //instantiating Demo class  (new keyword) (object creation)
        
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.x=10; d2.x=20; d3.x=30;
        System.out.println(d1.x);
        System.out.println(d2.x);
        System.out.println(d3.x);
        System.out.println("___________________________________________");
        d1.p=100;
        d2.p=200;
        d3.p=300;
        System.out.println(d1.p);
        System.out.println(d2.p);
        System.out.println(d3.p);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
