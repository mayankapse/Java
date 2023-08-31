class Rect{
    float l;
    float b;
    Rect(){
        l=1;
        b=1;
    }
    Rect(float x,float y){
        l=x;
        b=y;
    }

    double getArea(){
        return(l*b);
    }
}

class Area{
    public static void main(String arg[]){
        Rect c1 = new Rect(2,4);
        Rect c2 = new Rect(6,4);
        Rect c3 = new Rect(8,4);
        System.out.println("A1= "+c1.getArea());
        System.out.println("A2= "+c2.getArea());
        System.out.println("A3= "+c3.getArea());
    }
}