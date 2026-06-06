class NextPermutation_Leetcode_31 {
    public void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int markidx = -1;
        int n = nums.length;
        //start from end and find the dip
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                // mark the index of dip
                markidx = i;
                break;
            }
        }
        if(markidx==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>markidx;i--){
            if(nums[markidx]<nums[i]){
                swap(nums,markidx,i);
                break;
            }

        }
        reverse(nums,markidx+1,n-1);
    }
}