class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                //swap(nums[i],nums[cnt])
                int temp = nums[i];
                nums[i] = nums[cnt];
                nums[cnt] = temp;
                cnt++;
            }
        }
    }
}
