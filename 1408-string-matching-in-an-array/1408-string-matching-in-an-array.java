class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        
        HashSet<String> lst = new HashSet<>();
        for(String s : words){
            for(String s1 : words){
                if(!s.equals(s1) && s1.contains(s)){
                    lst.add(s);
                }
            }
        }
        ArrayList<String> set = new ArrayList<>(lst);
        return set;
    }
}