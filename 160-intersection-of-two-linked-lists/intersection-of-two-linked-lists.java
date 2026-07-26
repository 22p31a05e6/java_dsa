/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode tmp1 = headA;
       ListNode tmp2 = headB;
       int cnt = 0;
       int mnt = 0;
       while(tmp1!=null){
        tmp1 = tmp1.next;
        cnt++;
       }
       tmp1 = headA;
       while(tmp2!= null){
        tmp2  = tmp2.next;
        mnt++;
       }
       tmp2 = headB;
        if(cnt>mnt){
            int sub = cnt-mnt;
            while(sub != 0){
                tmp1 = tmp1.next;
                sub--;
            }
        }
        else{
           int sub = mnt-cnt;
            while(sub != 0){
                tmp2 = tmp2.next;
                sub--;
            } 
        }

        while(tmp1!=null ){
            if(tmp1 == tmp2){
                return tmp1;
            }
            tmp1= tmp1.next;
            tmp2 = tmp2.next;
        }
        return null;
    }
}