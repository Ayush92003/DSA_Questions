class Solution {
    class Pair implements Comparable<Pair>{
    int diff;
    int ele;
    Pair(int diff,int ele){
        this.diff=diff;
        this.ele=ele;
    }
    public int compareTo(Pair p){
       if(this.diff==p.diff) return this.ele-p.ele;
       else return this.diff-p.diff;
    }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int diff = Math.abs(x-arr[i]);
            pq.add(new Pair(diff,arr[i]));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            Pair p = pq.remove();
            ans.add(p.ele);
        }
        Collections.sort(ans);
        return ans;
    }
}
