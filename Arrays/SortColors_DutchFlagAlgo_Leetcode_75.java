// Simple intuition is we make four areas in array and one will be unsorted and from unsorted we pick element and place in right sorted area
class SortColors_DutchFlagAlgo_Leetcode_75 {
    void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0;
        int mid =0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
}
