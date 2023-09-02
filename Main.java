import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = new int[] { 0, 1, 0, 3, 12 };
        int[] arr2 = new int[] { 0 };
        int[] arr3 = new int[] { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
        int[] arr4 = new int[] { 1, 0, 0 };
        int[] arr5 = new int[] { 1, 0, 0, 0 };
        int[] arr6 = new int[] { 0, 1 };

        sol.moveZeroes(arr1);
        sol.moveZeroes(arr2);
        sol.moveZeroes(arr3);
        sol.moveZeroes(arr4);
        sol.moveZeroes(arr5);
        sol.moveZeroes(arr6);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
    }
} 
