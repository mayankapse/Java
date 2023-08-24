public class Number {
public static void findMinMax(int[] arr) {
    int min = arr[0];
    int max = arr[0];
  
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i]; 
      }
      if (arr[i] > max) {
        max = arr[i]; 
      }
    }
  
    System.out.println("The smallest number in the array is " + min);
    System.out.println("The largest number in the array is " + max);
  }
  
  public static void main(String[] args) {

    int[] arr = {10, 5, 8, 3, 12, 7};
  
    findMinMax(arr);
  }
  
}
