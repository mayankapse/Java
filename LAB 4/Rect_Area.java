import java.util.*;
class ar_ea{
    double length ;
    double breadth ;
    ar_ea(double a , double b ){
        length = a;
        breadth = b;
    }
    double returnArea() {
        return length * breadth ;
    }
}
public class Rect_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the rectangle : ");
        double leng = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle : ");
        double bredth = sc.nextDouble();
        ar_ea obj = new ar_ea(leng, bredth);
        System.out.println("The area of the rectangle is " + obj.returnArea());
        sc.close();
    }
}