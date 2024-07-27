import java.util.*;

class Solution {
    public int missingNumber(int nums[]) {
        int n = nums.length;
        int Tsum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return Tsum - actualSum;
    }
}

public class missingNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int missingNumber = solution.missingNumber(nums);  
        System.out.println("Missing number is: " + missingNumber);
    }
}
