class circle{
    float r;
    circle(){
        r=1;
    }
    circle(float a){
        r=a;
    }

    double getArea(){
        return(3.14*r*r);
    }
}
class Radius{
    public static void main(String arg[]){
        circle c1 = new circle(2);
        circle c2 = new circle(12);
        circle c3 = new circle(24);
        System.out.println("A1= "+c1.getArea());
        System.out.println("A2= "+c2.getArea());
        System.out.println("A3= "+c3.getArea());
    }
}