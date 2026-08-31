/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int atmin = -1;

        int max = -1;

        int smin = -1;
        ListNode temp = head.next;
        ListNode prev = head;
        int i = 2;
        while (temp.next != null) {
            if (temp.val > prev.val && temp.val > temp.next.val) {
                if (atmin == -1) {
                    atmin = i;
                }

                if (max != -1) {
                    if (smin == -1) {
                        smin = i - max;
                    } else {
                        smin = Math.min(smin, i - max);
                    }

                }
                max = i;
            }
            if (temp.val < prev.val && temp.val < temp.next.val) {
                if (atmin == -1) {
                    atmin = i;
                }
                if (max != -1) {
                    if (smin == -1) {
                        smin = i - max;
                    } else {
                        smin = Math.min(smin, i - max);
                    }
                }

                max = i;
            }
            i++;
            prev = temp;
            temp = temp.next;
        }

        if (max == -1 || max == atmin) {
            return new int[] { -1, -1 };
        }
        return new int[] { smin, max - atmin };
    }
}