class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check s and t conflict
            if (mapST.containsKey(sChar) && mapST.get(sChar) != tChar) {
                return false;
            }

            // Check t and s conflict
            if (mapTS.containsKey(tChar) && mapTS.get(tChar) != sChar) {
                return false;
            }

            // Create or update mappings
            mapST.put(sChar, tChar);
            mapTS.put(tChar, sChar);
        }

        return true;
    }
}