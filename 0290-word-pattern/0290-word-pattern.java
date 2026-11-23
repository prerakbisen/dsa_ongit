class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String ss [] = s.split(" ");
        int i = 0;
        char[] ca = pattern.toCharArray();
        if (ca.length != ss.length) return false;
        for(char c : ca){
            if(map.containsKey(c) ){
                if(!map.get(c).equals(ss[i])){
                    return false;
                }
                
            }else{
                if (map.containsValue(ss[i])) {
                    return false;
                }
                map.put(c,ss[i]);
            }
            
            i++;
        }
        return true;
    }
}