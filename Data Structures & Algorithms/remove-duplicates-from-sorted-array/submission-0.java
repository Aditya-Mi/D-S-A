class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int firstPointer = 0;
        for(int j=1;j<n;j++){
            if(nums[firstPointer] != nums[j]){
                nums[firstPointer + 1] = nums[j];
                firstPointer++;
            }
        }
        return firstPointer+1;
    }
}