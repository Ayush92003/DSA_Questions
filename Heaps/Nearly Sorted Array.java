class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        ArrayList<Integer>ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : arr){
            pq.add(x);
            if(pq.size()>k) ans.add(pq.remove());
        }
        while(!pq.isEmpty()) ans.add(pq.remove());
        return ans;
    }
}
