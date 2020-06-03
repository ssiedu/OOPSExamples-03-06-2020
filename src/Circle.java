
//Blueprint of a Circle
public class Circle {
    
    double radius;      //instance variable
    double area, circumference;
    
    public void calculateArea(){
        area=3.14*radius*radius;
        
        System.out.println("Area    : "+area);
        
    }
    public void calculateCircumference(){
        circumference=2*3.14*radius;
        System.out.println("Circfr  : "+circumference);
    }
    public void showRadius(){
        System.out.println(radius);
    }
    public void setRadius(double r){

        radius=r;
        
        System.out.println(radius);
    }
    
    public static void main(String args[]){
    
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        c1.setRadius(10);
        c1.calculateArea();
        
        
        
        
    }
    
}
