class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] ch=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        
        HashSet<Integer> set=new HashSet<>(map.values());
        return set.size()==1;
    }
}