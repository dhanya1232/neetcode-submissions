class Solution {
    public boolean isAnagram(String s, String t) {
     if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Step 4: Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    
}
