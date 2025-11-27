class Solution {
    public Map<Character,Integer> count(String s){
         Map<Character,Integer> map = new HashMap<>();
        char[] charray = s.toCharArray();
        for(char ch : charray){
            if(map.containsKey(ch)){
                int temp = map.get(ch);
                temp++;
                map.put(ch,temp);
            }else{
                 map.put(ch,1);
            }
        }
        return map; 
    }
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> smap = count(s);
        Map<Character,Integer> tmap = count(t);

        return smap.equals(tmap);
    }
}