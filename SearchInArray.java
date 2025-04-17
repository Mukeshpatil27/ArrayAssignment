public class SearchInArray {
public static void main(String[] args) {
      int[] arr = {52,54,6,2,65,55};
      int target = 2;
      boolean found = false;

      for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
             System.out.println("Number " + target + " found at index " + i);
      found = true;
      break;
          }
      }

      if (!found) {
      System.out.println("Not found in the array.");
      }
  }
}
