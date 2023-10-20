public class LargestElement {
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 14, 9, 5};
        int largest = findLargest(numbers);
        System.out.println("The largest element is: " + largest);
    }
}
