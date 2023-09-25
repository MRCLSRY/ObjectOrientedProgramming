package UTS1_2502001164;
// 2502001164 - Marcelius Surya Wijaya

public class MyPoint {
    // set of variables x and y with data type double
    // because no-arg constructor so make private
    private double x;
    private double y;
    
    // set the value to 0
    MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    
    // set the value to specific value
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    // get value x
    public double getValueX(){
        return x;
    }
    
    // get value y
    public double getValueY(){
        return y;
    }
    
    // search the distance use MyPoint class method
    double distance(MyPoint PtoP){
        return Math.sqrt((this.x - PtoP.getValueX()) * ((this.x - PtoP.getValueX())) + (this.y - PtoP.getValueY()) * (this.y - PtoP.getValueY()));
    }

    // search the distance use Point to Point Parameter Method
    double distance(double x, double y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // search the distance use MyPoint Static Method
    public static double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}
