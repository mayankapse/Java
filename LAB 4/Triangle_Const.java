class tri_angle {
    int a ;
    int b ;
    int c ;
    tri_angle (int p , int q , int s ){
        a = p ;
        b = q ;
        c = s ;
    }
    void display ()
    {
        double peri = a + b + c ;
        double s = peri / 2 ;
        double area  = (s *(s-a) *(s-b)*(s-c))*0.5*0.5;
        System.out.println("The perimeter of the triangle is " + peri);
        System.out.println("The area of the triangle is " + area);
    }
}
public class Triangle_Const {
    public static void main(String[] args) {
        tri_angle tri = new tri_angle(3, 4, 5);
        tri.display();
    }
}