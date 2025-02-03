import java.util.ArrayList;
import java.util.Arrays;

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int [] result = new int[m+n];

        for (int i = 0; i < nums1.length; i++) {

            System.arraycopy(nums1, 0, result, 0, m);

        }
        for (int j = 0; j < nums2.length; j++) {

            System.arraycopy(nums2, 0, result, m, n);


        }

        Arrays.sort(result);
        String string = Arrays.toString(result);

        System.out.println(string);

    }
}