class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int n1 = S.length;
        int n2 = T.length;
        if(n1!=n2)
            return false;
        Arrays.sort(S);
        Arrays.sort(T);
        for(int i=0;i<n1;i++){
            if(S[i]!=T[i])
                return false;
        }
        return true;
        
    }
}