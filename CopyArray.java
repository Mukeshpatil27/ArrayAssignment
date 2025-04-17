public class CopyArray {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = new int[first.length];


        for (int i = 0; i < first.length; i++) {
            second[i] = first[i];
        }

        
        System.out.println("Copied Array:");
        for (int num : second) {
            System.out.println(num);
        }
    }
}