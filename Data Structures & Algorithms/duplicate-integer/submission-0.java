class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> tstmp= new HashMap<Integer,Integer>();
        for (int i :nums){
            tstmp.put(i,tstmp.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:tstmp.entrySet()){
            if (entry.getValue()>1){
                return true;
            }
        }
        return false;
    }
    
}