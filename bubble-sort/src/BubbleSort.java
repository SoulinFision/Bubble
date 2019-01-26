public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {55, 60, 72, 43, 45, 60, 37, 74, 72, 40, 9, 111, 6, 39, 85, 16, 10, 52, 7, 12, 22, 35, 32, 9, 48, 6, 70, 13, 57};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.err.print(i + ",");
        }
    }
}
