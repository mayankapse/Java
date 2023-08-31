import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = sc.nextLine();
    boolean palindrome = true;
    int n = s.length();
    for(int i = 0; i < n / 2; i++) {
      if(s.charAt(i) != s.charAt(n - i - 1)) {
        palindrome = false;
        break;
      }
    }
    if(palindrome) {
      System.out.println(s + " is a palindrome");
    } else {
      System.out.println(s + " is not a palindrome");
    }
    sc.close();
  }
}


