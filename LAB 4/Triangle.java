class Variable {
    int a;
    int b;
    int c;
    
    Variable(){
        a = 3;
        b = 4;
        c = 5;
    }
}

class Triangle{
public static void main(String[] args) {

    int per;
    Variable v1 = new Variable();
    Variable v2 = new Variable();
    Variable v3 = new Variable();
    int sum = v1.a + v2.b + v3.c;
    int x = v1.a;
    int y = v2.b;
    int z = v3.c;
    per = sum/2;
    System.out.println("Perimeter is "+ per);
    if((x+y)>z && (x+z)>y && (y+z)>x)
    {
      int s=(x+y+z)/2;
      double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
       System.out.println("Area of Triangle is: " + area);    
     }
   else  
     System.out.println("Area of Triangle not exit");
}
}
