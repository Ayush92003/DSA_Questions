class MedianFinder {
    PriorityQueue<Integer> min  = new PriorityQueue<>();
    PriorityQueue<Integer> max  = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(max.size()==0) max.add(num);
        else if(num>max.peek()) min.add(num);
        else max.add(num);
        if(min.size()-max.size()>=2) max.add(min.remove());
        if(max.size()-min.size()>=2) min.add(max.remove());
    }

    public double findMedian() {
        if(min.size()-max.size()==1) return min.peek();
        else if(max.size()-min.size()==1) return max.peek();
        else return (min.peek() + max.peek()) / 2.0 ;
    }
}
