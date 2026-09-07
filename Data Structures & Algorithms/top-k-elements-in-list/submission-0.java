class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);    
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);// a,b is telling compare a[0] to b[0] == freq of arr1 to frw of arr2

        for(int num : map.keySet()){ //map.keySet() gives:1,2,3

            int frequency = map.get(num);

            pq.add(new int[]{frequency, num});

            if(pq.size() > k){
                pq.poll();
            }

        }
        int[] result = new int[k];

        for(int i = 0 ; i < k ; i++){
            result[i] = pq.poll()[1];
        }
        return result;
    }
}
