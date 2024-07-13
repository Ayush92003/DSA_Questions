class Solution {
    class Triplet implements Comparable<Triplet>{
    int d;
    int x;
    int y;
    Triplet(int d,int x,int y){
        this.d=d;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Triplet t){
        return this.d-t.d;
    }
}
    public int[][] kClosest(int[][] arr, int k) {
        int[][]ans=new int[k][2];
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int x = arr[i][0],y=arr[i][1];
            int d = (x*x) + (y*y);
            pq.add(new Triplet(d,x,y));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
}
