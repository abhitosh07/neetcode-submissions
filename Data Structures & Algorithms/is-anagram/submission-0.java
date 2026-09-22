class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;

        int[] index=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            index[c-'a']++;

            c=t.charAt(i);
            index[c-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(index[i]!=0)
            return false;
        }
        return true;
   
        

    }
}
