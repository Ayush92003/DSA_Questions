class Solution {
    public int countPalindromicSubsequence(String s) {
        int count = 0;
        HashMap<Character,Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> lmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i);
            lmap.put(ch,i);
        }
        for(char ch : fmap.keySet()){
            int fidx = fmap.get(ch);
            int lidx = lmap.get(ch);
            if(fidx!=lidx){
                HashSet<Character> set = new HashSet<>();
                for(int i=fidx+1;i<lidx;i++) set.add(s.charAt(i));
                count+=set.size();
            }
        }
        return count;
    }
}
