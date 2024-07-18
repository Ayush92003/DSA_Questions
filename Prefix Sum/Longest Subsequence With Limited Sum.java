class Solution {
    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[]ans=new int[queries.length];
        for(int i=1;i<nums.length;i++) nums[i]+=nums[i-1];
        for(int i=0;i<queries.length;i++){
            int lo=0,hi=nums.length-1;
            while (lo<=hi){
                int len =0;
                int mid = (lo+hi)/2;
                if(nums[mid]>queries[i]) hi=mid-1;
                else {
                    len = Math.max(len,mid+1);
                    ans[i]=len;
                    lo=mid+1;
                }
            }
        }
        return ans;
    }
}
