class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        ArrayList<String> lst = new ArrayList<>();
        // HashSet<String> lst = new Hashset<>();
        for(String s : words){
            for(String s1 : words){
                if(!s.equals(s1) && s1.contains(s)){
                    lst.add(s);
                    break;
                }
            }
        }
        return lst;
    }
}