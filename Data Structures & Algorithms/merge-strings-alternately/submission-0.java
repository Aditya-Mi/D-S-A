class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        int n1 = w1.length;
        int n2 = w2.length;

        char[] result = new char[n1 + n2];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n1 && j < n2){
            result[k++] = w1[i++];
            result[k++] = w2[j++];
        }

        while(i < n1){
            result[k++] = w1[i++];
        }

        while(j < n2){
            result[k++] = w2[j++];
        }
        return new String(result);
    }
}