class Solution {
    public int totalFruit(int[] arr) {
        int i=0,j=0,n=arr.length,maxLen=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(j<n){
            if(map.containsKey(arr[j])){
                map.put(arr[j],map.get(arr[j])+1);
            }
            else map.put(arr[j],1);
            if(map.size()>2){
                while(map.size()>2){
                    if(map.get(arr[i])>1)map.put(arr[i],map.get(arr[i])-1);
                    else map.remove(arr[i]);
                    i++;
                }
            }
            int len = j-i+1;
            maxLen=Math.max(maxLen,len);
            j++;
        }
        return maxLen;
    }
}
