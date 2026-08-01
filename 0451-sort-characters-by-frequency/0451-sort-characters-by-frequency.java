class Solution {
    public String frequencySort(String s) {
        Map <Character , Integer> t = new HashMap<>();
        int co =1;
        for(int i =0;i<s.length();i++){
            
            if(t.containsKey(s.charAt(i))){
                int v = t.get(s.charAt(i));
                t.put(s.charAt(i),++v);
            }else{
               t.put(s.charAt(i),co); 
            }
            
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(t.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}