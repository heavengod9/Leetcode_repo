class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        
        for(int[] n:points){
            pq.offer(n);
            if(pq.size()>k)
                pq.poll();
        }

        int[][] result = new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            result[i]=pq.poll();
            i++;
        }
        return result;
        
        
    }
}