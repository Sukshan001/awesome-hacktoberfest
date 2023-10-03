class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele : nums){
            if(map.containsKey(ele)){

                return ele;

            }

            else{
                map.put(ele, 1);
            }
        }



  return 0;     
    }
}
