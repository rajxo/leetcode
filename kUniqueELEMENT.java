class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+  1);
        }

        List<int[]> ans= new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(new int[]{entry.getValue(),entry.getKey()});
        }
         
         ans.sort((a,b)->a[0]-b[0]);

        int res[]=new int[k];

    int j =ans.size()-1;
       for(int i =0;i<k;i++){
            res[i]=ans.get(j)[1];
            j--;
       }
       return res;

    }
}