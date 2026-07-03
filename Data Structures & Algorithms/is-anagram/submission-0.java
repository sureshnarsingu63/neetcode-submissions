class Solution {
    public boolean isAnagram(String s, String t) {
      int lenS = s.length();
      int lenT = t.length();

      if (lenS != lenT) return false;

      int[] arr = new int[26];
      for (int i = 0; i < lenS; i++) {
         arr[s.charAt(i) - 'a']++;
         arr[t.charAt(i) - 'a']--;
      }

      for (int num: arr) {
         if (num != 0) return false;
      }
      return true;
    }
}
