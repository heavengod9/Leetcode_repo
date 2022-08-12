class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int total_gas=0,total_cost=0,current=0,start=0;
        
        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_gas<total_cost)
            return -1;
        
        for(int i=0;i<gas.length;i++){
            current+=gas[i]-cost[i];
            if(current<0){
                start=i+1;
                current=0;
            }
        }
        return start;
        
    }
}