class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> him = new HashMap<>();
        for (List<String> h : knowledge) {
            him.put(h.get(0), h.get(1));

        }
        StringBuilder sb = new StringBuilder();
        StringBuilder curr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                i++;
                while (s.charAt(i) != ')') {
                    curr.append(s.charAt(i));
                    i++;
                }
                if (him.containsKey(curr.toString())) {
                    sb.append(him.get(curr.toString()));
                } else {
                    sb.append('?');
                }
                curr.setLength(0);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}