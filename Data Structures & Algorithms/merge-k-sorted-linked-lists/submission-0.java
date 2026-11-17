/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 0) {
            return null;
        }
        while (n > 1) {
            ListNode[] mergedLists = new ListNode[(n+1)/2];
            for (int i = 0; i < n; i+=2) {
                if (i+1 < n) {
                    mergedLists[i/2] = merge(lists[i], lists[i+1]);
                } else {
                    mergedLists[i/2] = lists[i];
                }
            }
            lists = mergedLists;
            n = lists.length;
        }
        return lists[0];
    }
    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return dummy.next;
    }
}
