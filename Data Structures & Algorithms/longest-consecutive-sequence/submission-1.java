class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> s = new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        for(int it : s){
            if(!s.contains(it - 1)){
                int count = 1;
                int x = it;
            
                while(s.contains(x+1)){
                    count++;
                    x = x+ 1;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}
