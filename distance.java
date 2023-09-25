package UTS1_2502001164;

public class distance {
    public static void main(String[] args) {
        // Make new point using new value from the question
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);

        // set firstMethod Variabel for search the distance use MyPoint class method
        double firstMethod = p1.distance(p2);

        // set secondMethod Variabel for search the distance use Point to Point Parameter Method
        double secondMethod = p1.distance(p2.getValueX(), p2.getValueY());

        // set thirdMethod Variabel for search the distance use MyPoint Static Method
        double thirdMethod = MyPoint.distance(p1,p2);

        // Print firstMehtod
        System.out.println("The distance between point 1 (0, 0) and point 2 (10, 30.5) use MyPoint Class Method is = " + firstMethod);
        
        // Print secondMehtod
        System.out.println("The distance between point 1 (0, 0) and point 2 (10, 30.5) use Point to Point Paramater Method is = " + secondMethod);

        // Print thirdMehtod
        System.out.println("The distance between point 1 (0, 0) and point 2 (10, 30.5) use MyPoint Static Method is = " + thirdMethod);
    }
}