class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        List<Integer> ones = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') ones.add(i);
        }
        if (ones.size() < k) return "";

        String best = "";
        for (int i = 0; i + k - 1 < ones.size(); i++) {
            int l = ones.get(i), r = ones.get(i + k - 1);
            String cand = s.substring(l, r + 1);
            if (best.isEmpty()
                || cand.length() < best.length()
                || (cand.length() == best.length() && cand.compareTo(best) < 0)) {
                best = cand;
            }
        }
        return best;
    }
}