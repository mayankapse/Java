public class Search_Array {
public static int search(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }
  
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int x = 20;
    int result = search(arr, x);
    if (result == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index " + result);
    }
  }
  
}
