
public class VarArgExample {

    public static void add(){
        System.out.println("NOTHING TO ADD");
    }
    public static void add(int x, int y){
        System.out.println("SUM = "+(x+y));
    }
    public static void add(String... v){
        String res="";
        for(String s:v){
            res=res+s;
        }
        System.out.println(res);
    }
    public static void add(int... v){
        int sum=0;
        for(int i=0; i<v.length; i++){
            sum=sum+v[i];
        }
        /*
        for(int n:v){
            sum=sum+n;
        }
        */
        System.out.println(sum);
    }
    
    public static void main(String... args) {
   
        add();
        
        add(10,20);//(int,int)      (int...)
        
        add(10,20,30);
        add(10,20,30,40);
        
        add("aa","bb");
        add("xx","yy","zz");
    }
}
/*
    for using varargs

    1) only one varargs per method is allowed.
    2) but you can take normal parameter with varargs
    3) varargs must be on last place (no parameter is allowed after varargs)
    4) varargs methods can be overloaded.
    5) exact match will always have a preference over varargs.
*/