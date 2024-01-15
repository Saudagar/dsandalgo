class TwoSumUnsorted {
    
    public int[] twoSum(int[] nums, int target) {

        /*
         * T = O(n^2) 
         * S = O(1)
        int [] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            int first = nums[i];

            for (int j = 1; j < nums.length; j++) {

                if(first + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        return result;
        */

        /*
         * T = O(n) 
         * S = O(n)
         */
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int expected = target - nums[i];
            if(mp.containsKey(expected)) 
                return new int[] {i, mp.get(expected)};

            mp.put (nums[i], i);            
        }
        return new int[] {};
    }
}
