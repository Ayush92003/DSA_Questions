class Solution {
    class Pair2 implements Comparable<Pair2>{
    int ele;
    int freq;
    Pair2(int ele,int freq) {
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(Pair2 p){
        return this.freq-p.freq;
    }
}
    public int[] topKFrequent(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[]ans=new int[k];
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        for(int x : arr){
            if(map.containsKey(x)){
                int freq = map.get(x);
                map.put(x,freq+1);
            }else{
                map.put(x,1);
            }
        }
        for(int key : map.keySet()){
            pq.add(new Pair2(key,map.get(key)));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            Pair2 p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
}
