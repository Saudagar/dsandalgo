class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mpFrequency = new HashMap<>();

        for (int num : nums) {
            mpFrequency.put(num, mpFrequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue((n1, n2) -> mpFrequency.get(n1) - mpFrequency.get(n2));
        
        for(int key : mpFrequency.keySet()) {
            minHeap.add(key);
            if(minHeap.size() > k) minHeap.poll();
        }

        //List<Integer> lst = new ArrayList<>();
        int [] result = new int [k];
        for(int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
