import static java.lang.Math.*;
import java.util.Scanner;
public class Quadratic {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int a,b,c; //
    System.out.println ("Enter the value of a..");
    a=sc.nextInt (); 
    System.out.println ("Enter the value of b..");
    b=sc.nextInt (); 
    System.out.println ("Enter the value of c..");
    c=sc.nextInt ();; 
    quadraticRoots (a,b,c); 
  }
  static void quadraticRoots (int a,int b,int c) {
    if (a == 0) {
      System.out.println ("The value of a cannot be 0.");
      return;
    }
    int d = b * b - 4 * a * c;
    double D = sqrt (abs (d));
    if (d > 0) {
      System.out.println ("The roots of the equation are real and different. n");
      System.out.println ((double) (-b + D) / (2 * a) + "n"+ (double) (-b - D) / (2 * a));
    }
    else if (d == 0) {
      System.out.println ("The roots of the equation are real and same. n");
      System.out.println (- (double)b / (2 * a) + "n"+ - (double)b / (2 * a));
    }
    else {
      System.out.println ("The roots of the equation are complex and different. n");
      System.out.println (- (double)b / (2 * a) + " + i"+ D + "n"+ - (double)b / (2 * a)+ " - i" + D);
    }
  }
}


