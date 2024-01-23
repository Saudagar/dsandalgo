class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int left, right, triple;

        List<List<Integer>> lstResults = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {

            left = i + 1;
            right = nums.length - 1;
            if ( i == 0 || nums[i -1] != nums[i]) {
                while (left < right) {
                    triple = nums[i] + nums[left] + nums[right];
                    if (triple < 0) left++;
                    else if (triple > 0) right--;
                    else {
                        List<Integer> lstInnerList = new ArrayList<>();
                        lstInnerList.add(nums[i]);
                        lstInnerList.add(nums[left]);
                        lstInnerList.add(nums[right]);
                        lstResults.add(lstInnerList);
                        left++;
                        right--;
                        while(left < right && nums[left - 1] == nums[left]) left++ ;
                    }
                }
            }

        }

        return lstResults;
        
    }
}
