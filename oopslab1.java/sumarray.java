public class sumarray {
    public static void main(String[] args) {

        int arr[] = {1, 15, 30, 60, 120};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
         System.out.println("Sum of array elements = " + sum);
    }
}
