public class MaxInArray {
  public static void main(String[] args) {
      int[] numbers = {455,89,565,245,22,1,0};
      int max = numbers[0];

      for (int num : numbers) {
      if (num > max) {
      max = num;
      }
      }

      System.out.println("Maximum Array Valeu: " + max);
  }
}
