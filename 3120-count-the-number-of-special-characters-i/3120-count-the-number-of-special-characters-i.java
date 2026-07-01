class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> setu = new HashSet<>();
        HashSet<Character> setl = new HashSet<>();
        int n = word.length();
        int count = 0;
        for(int i=0;i<n;i++){
            // if(set.contains(Character.toLowerCase(word.charAt(i)))||(set.contains( Character.toUpperCase(word.charAt(i)))){
            //     count++;
            // }
            // set.add(word.charAt(i));
            if(Character.isLowerCase(word.charAt(i))){
                setl.add(word.charAt(i));
            }else{
                setu.add(word.charAt(i));
            }


        }
        for(char c:setu){
            if(setl.contains(Character.toLowerCase(c))){
                count++;
            }
        }
        return count;
    }
}