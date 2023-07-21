//4
public class Main {
 public static void main(String[] args){
    //a 
    Shape shapes = new Shape();
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();
    
    
    shapes.setValues(45, 60);
    rectangle.setValues(100, 150);
    triangle.setValues(80, 190);
    
    
    shapes.getArea();
    rectangle.getArea();
    triangle.getArea();
 }   
}
