class Solution {
    public int trap(int[] height) {
        // leftmax array
        int[] l = new int[height.length];
        l[0] = height[0];
        for(int i=1; i<l.length; i++){
            l[i] = Math.max(height[i],l[i-1]);
        }

        // rightmax array
        int[] r = new int[height.length];
        r[height.length - 1] = height[height.length - 1];
        for(int j=r.length-2; j>=0; j--){
            r[j] = Math.max(height[j],r[j+1]);
        }

        // water level
        int trappedwater = 0;
        for(int k=0; k<height.length; k++){
            int waterlevel = Math.min(r[k],l[k]);
            // trapped water
            trappedwater += (waterlevel - height[k]);
        }
        return trappedwater;
    }
}
