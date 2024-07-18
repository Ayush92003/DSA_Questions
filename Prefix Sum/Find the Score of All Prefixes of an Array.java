class Solution {
    public static long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        long[]ans=new long[n];
        ans[0]=nums[0]* 2L;
        max=Math.max(max,nums[0]);
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            nums[i]+=max;
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}
