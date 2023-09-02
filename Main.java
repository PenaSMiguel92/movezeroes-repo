import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = new int[] { 0, 1, 0, 3, 12 };
        int[] arr2 = new int[] { 0 };

        sol.moveZeroes(arr1);
        sol.moveZeroes(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
} 
