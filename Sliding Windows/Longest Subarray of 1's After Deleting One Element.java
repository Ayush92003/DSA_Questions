class Solution {
    public int longestSubarray(int[] arr) {
        int n=arr.length, i=0, j=0,maxLen=0, z=0, zeroes=0;
        for(int ele:arr) if(ele==0) z++;
        if(z==0) return n-1; // it means arr has only 1's
        while(i<n && arr[i]==0) i++; // taking i to first 1
        if(i==n) return 0; // this means arr has only 0's and no 1's
        j=i;
        while(j<n){
            if(arr[j]==1) j++;
            else{
                if(zeroes==0){ // this window has no zeroes
                    j++;
                    zeroes++;
                }else{ // this window has one zero
                    int len = j-i-1;
                    maxLen = Math.max(maxLen,len);
                    j++;
                    while(i<n && arr[i]==1) i++; // taking i just after the 0
                    i++;
                }
            }
        }
        if(zeroes==0) return j-i; // this means there is no 0 in btw 1's and loop has ended
        int len = j-i-1;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
}
