class Solution {
    public int longestOnes(int[] arr, int k) {
        int i=0,j=0,n=arr.length,zero=0,maxLen=0;;
        while(j<n){
            if(arr[j]==1) j++;
            else{
                if(zero<k){
                    j++;
                    zero++;
                }else{
                    int len = j-i;
                    maxLen = Math.max(maxLen,len);
                    while(i<n && arr[i]==1) i++;
                    i++;
                    j=i;
                    zero=0;
                }
            }
        }
        int len = j-i;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
}
