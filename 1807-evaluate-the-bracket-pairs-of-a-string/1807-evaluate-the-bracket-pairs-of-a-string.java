import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        
        StringBuilder result = new StringBuilder();
        StringBuilder keyBuilder = new StringBuilder();
        boolean insideKey = false;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                insideKey = true;
            } else if (ch == ')') {
                insideKey = false;
                String key = keyBuilder.toString();
                result.append(map.getOrDefault(key, "?"));
                keyBuilder.setLength(0);
            } else if (insideKey) {
                keyBuilder.append(ch);
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}