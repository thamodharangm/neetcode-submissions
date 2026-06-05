class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxFreq=0;
        int  left=0;
        int result=0;

        for(int right = 0; right < s.length(); right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;

            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            int window=right-left+1;

            if(window-maxFreq>k){
             freq[s.charAt(left)-'A']--;
              left++;
            }
            result=Math.max(result,right-left+1);
        }
    return result;
    }

}
