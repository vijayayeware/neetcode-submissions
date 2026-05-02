class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
int count=0;
int fincount=0;
        for (int n:nums){
            if (n == 1){
count++;
if (count>fincount){
    fincount=count;
}
            } if (n == 0){
         count=0;
            }
        }
   return fincount;     
    }
}