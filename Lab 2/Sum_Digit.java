import java.util.Scanner;
public class Sum_Digit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    long n = sc.nextLong();
    long sum = 0, lastDigit;
    for(;n != 0; n /= 10) {
      lastDigit = n % 10;
      sum += lastDigit;
    }
    System.out.println("The sum of digits is: " + sum);
    sc.close();
  }
}
