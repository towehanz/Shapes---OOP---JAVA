//1
public class Shape {
    private double height;
    private double width;
    //a
    public void setValues (double height, double width){
        this.height = height;
        this.width = width;
    }
    //b
    public double getHeight(){
        return height;
    } 
    
    public double getWidth(){
        return width;
    }
    //c
    public void getArea(){
        System.out.println("No shape specified");
    }
}
