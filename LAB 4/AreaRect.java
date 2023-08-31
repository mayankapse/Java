import java.util.Scanner;
class area{
    double l;
    double b;
    void setDim(double p,double q){
        l = p;
        b = q;
    }
    double getArea(){
        double area = l*b;
        return area ;
    }
}
class AreaRect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        double length = sc.nextDouble();
        System.out.println("Enter the Breadth : ");
        double breadth = sc.nextDouble();
        area obj = new area();
        obj.setDim(length, breadth);
        System.out.println("Area of Rectangle = " + obj.getArea());
        sc.close();
    }
}