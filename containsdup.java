class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Set<Integer> uniq = new HashSet<>();
       for(int i : nums){
            uniq.add(i);
       }

       int unil= uniq.size();
       int len= nums.length;
        return !(unil==len);
    }
}