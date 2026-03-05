package back;

import java.util.Arrays;

public class main {
    static int[] a = {1, 2, 3, 4};
    public static void main(String[] args) {
        int[] arr = new int[4];
        int idx = 0;

        back(arr, idx);

    }

    public static void back(int arr[], int idx) {
        if (idx == 4) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 0; i < 4; i++) {
            arr[idx] = a[i];
            back(arr, idx + 1);
            arr[idx] = 0;
        }
    }
}
