class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr=new int[nums.length];

        HashMap<Integer,Integer> map = new HashMap<>();
        int j =0;

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                continue;
            }

            map.put(nums[i],i);
            arr[j++]=nums[i];
        }
        int k =0;
        for(int i : arr){
            nums[k++]= i;
        }

        return j;
    }
}