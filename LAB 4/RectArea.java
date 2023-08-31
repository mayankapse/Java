class rec_tangle {
    int length ;
    int breadth ;
    rec_tangle(int a , int b){
        length = a ;
        breadth = b;
    }
    int area() {
        return length * breadth ;
    }
}
public class RectArea {
    public static void main(String[] args) {
        rec_tangle rec1 = new rec_tangle(5,8);
        rec_tangle rec2 = new rec_tangle(4,5);
        System.out.println("The area of rectangle with length 5 and breadth 8 is " + rec1.area());
        System.out.println("The area of rectangle with length 4 and breadth 5 is " + rec2.area());

    }
}

