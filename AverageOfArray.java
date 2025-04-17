public class AverageOfArray {
  public static void main(String[] args) {
      double[] values = {12,45,65,98,55,66};
      double sum = 0;

      for (double val : values) {
          sum += val;
      }

      double average = sum / values.length;
      System.out.println("Average Of Array : " + average);
  }
}
