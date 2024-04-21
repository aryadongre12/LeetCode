class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        for(int k=0; k<nums.length; k++){        // Count no. of occurances
            if(nums[k] == val){
                cnt++;
            }
        }

        if(cnt == nums.length){                 // If all elements are = val
            return 0;
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i] == val){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums.length - cnt;   
    }
}
