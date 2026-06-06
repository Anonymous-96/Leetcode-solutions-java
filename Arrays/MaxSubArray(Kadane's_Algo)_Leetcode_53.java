class MaxSubArray_Leetcode_53 {
    // Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < n; i++) {
            //everytime sum is zero means we again starting
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        //for printing the subarray
        System.out.println(start + " " + end);
        return maxSum;
    }
}