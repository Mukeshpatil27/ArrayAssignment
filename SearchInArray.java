public class SearchInArray {
public static void main(String[] args) {
      int[] arr = {5, 10, 15, 20, 25};
      int target = 20;
      boolean found = false;

      for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
              System.out.println("Element " + target + " found at index " + i);
        found = true;
        break;
          }
      }

      if (!found) {
      System.out.println("Element not found in the array.");
      }
  }
}
