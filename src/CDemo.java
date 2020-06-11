
public class CDemo {
    
    public CDemo(int p){
        System.out.println("One Arg");
    }
    public CDemo(int p, int q){
        System.out.println("Two Args");
    }
    public static void main(String[] args) {
        //CDemo ob1=new CDemo();
        CDemo ob2=new CDemo(10);
        CDemo ob3=new CDemo(10,20);
    }
}
/*
Constructors
----------------
1) method like body having same name as their class and no return type (not even void also)
2) can be parameterized also.
3) can be overloaded.
4) are called implicitly during object creation. (matching args)
5) if you do not write any constructor from your side, one zero arg constructor is internally provided
   (called default constructor)
6) once you write your own constructor, default will lost.
7) constructors are mainly used for initilization purpose. initializing properties during object creation
   itself. 
8) java do not supports copy constructor (clone object create).
9) one constructor can explicitly call another constructor using this keyword.
    
        for using this keyword for calling a constructor.
        -----------------------------------------------------

        1) matching constructor must exists.
        2) this must be the 1st statement in constructor.
        3) we cant call more than one constructor directly
        4) chaining is allowed
        5) recursive calls are not allowed for constructors.
        6) only a constructor can call another constructor (we cant call a constructor in a method)
        



 */
