class Solution {
    public String smallestSubsequence(String s) {
        int get[] = new int[26];
        int ind[] = new int[26];
        int i = 0;
        for (char c : s.toCharArray()) {
            ind[c - 'a'] = i;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < s.length(); i++) {
            if (get[s.charAt(i) - 'a'] == 1) {
                continue;
            }
            while (sb.length() > 0 && s.charAt(i) < sb.charAt(sb.length() - 1)
                    && ind[sb.charAt(sb.length() - 1) - 'a'] > i) {

                get[sb.charAt(sb.length() - 1) - 'a'] = 0;
                sb.setLength(sb.length() - 1);

            }
            sb.append(s.charAt(i));
            get[s.charAt(i) - 'a'] = 1;

        }
        return sb.toString();
    }
}