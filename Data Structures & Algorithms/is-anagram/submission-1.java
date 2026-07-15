class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> count = new HashMap<>();
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();

        for(int i=0;i<s.length();i++){
            if(count.containsKey(ch[i])){
                count.put(ch[i],count.get(ch[i])+1);
            } else{
                count.put(ch[i],1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(count.containsKey(ch1[i])){
                count.put(ch1[i],count.get(ch1[i]) - 1);
            } else{
                return false;
            }

            if(count.get(ch1[i]) < 0){
                return false;
            }
        }

        return true;

    }
}
