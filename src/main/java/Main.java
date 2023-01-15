import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2};
        System.out.println(Solution.removeDuplicates(nums));
    }

    public static class Solution {
        public static int removeDuplicates(int[] nums) {
            // Runtime = 1 ms; Memory = 40.2 MB
            int n = nums.length;
            int[] temp = new int[n];
            int j = 0;
            for (int i = 0; i < n - 1; i++)
                if (nums[i] != nums[i + 1])
                    temp[j++] = nums[i];
            temp[j++] = nums[n - 1];
            if (j >= 0) System.arraycopy(temp, 0, nums, 0, j);
            return j;
        }
    }
}


