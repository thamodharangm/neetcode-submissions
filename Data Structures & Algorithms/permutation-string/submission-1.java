class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()) return false;

        int[] f1=new int[26];
        int[] f2=new int[26];

        for(char ch:s1.toCharArray()){
            f1[ch-'a']++;
        }
        int window=s1.length();

        for(int i=0;i<s2.length();i++){
            f2[s2.charAt(i)-'a']++;

            if(i>=window){
f2[s2.charAt(i-window)-'a']--;

            }
            if(Arrays.equals(f1,f2)){
                return true;
            }
        }
        return false;
    }
}
