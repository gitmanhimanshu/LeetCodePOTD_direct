class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int one = 0;
        List<Integer> him = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                if (i == 0 || s.charAt(i - 1) == '1')
                    him.add(1);
                else
                    him.set(him.size() - 1, him.get(him.size() - 1) + 1);
            }
        }

        int ans = 0;
        for (int i = 0; i + 1 < him.size(); i++) {
            ans = Math.max(ans, him.get(i) + him.get(i + 1));
        }

        return one + ans;
    }
}