class p implements Comparable<p> {
    int a;
    char c;

    p(int a, char c) {
        this.a = a;
        this.c = c;
    }

    public int compareTo(p that) {
        return that.a - this.a;
    }
}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<p> him = new PriorityQueue<>();
        if (a > 0) {
            him.add(new p(a, 'a'));
        }
        if (b > 0) {
            him.add(new p(b, 'b'));
        }
        if (c > 0) {
            him.add(new p(c, 'c'));
        }
        StringBuilder ans = new StringBuilder();
        while (!him.isEmpty()) {
            p h = him.poll();
            if (ans.length() > 1 && ans.charAt(ans.length() - 1) == h.c && ans.charAt(ans.length() - 2) == h.c) {
                if (him.isEmpty()) {
                    break;
                }
                p h1 = him.poll();
                ans.append(h1.c);
                h1.a--;
                if (h1.a > 0) {
                    him.add(new p(h1.a, h1.c));
                }

            } else {
                ans.append(h.c);
                h.a--;
            }
            if (h.a > 0) {
                him.add(new p(h.a, h.c));
            }
        }
        return ans.toString();
    }
}