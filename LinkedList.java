
public class LinkedList {

  public static void main(String[] args) {}

//   Node deleteNode(Node head, int x) {
//     if (head == null) {
//       return null;
//     }
//     Node y = head;
//     if (x == 1 && y.next == null) {
//       return null;
//     }
//     if (x == 1 && y.next != null) {
//       head = head.next;
//       return head;
//     }
//     Node temp = null;
//     for (int i = 1; i < x - 1; i++) {
//       y = y.next;
//     }
//     temp = y.next.next;
//     Node del = y.next;
//     del.next = null;
//     y.next = temp;
//     return head;
//   }

//   public ListNode reverseList(ListNode head) {
//     if (head == null) {
//       return null;
//     }

//     if (head.next == null) {
//       return head;
//     }
//     ListNode prev = null;
//     ListNode curr = head;
//     while (curr != null) {
//       ListNode currp1 = curr.next;
//       curr.next = prev;
//       prev = curr;
//       curr = currp1;
//     }
//     return prev;
//   }

//   public ListNode middleNode(ListNode head) {
//     ListNode slow = head, fast = head;
//     while (fast != null && fast.next != null) {
//       slow = slow.next;
//       fast = fast.next.next;
//     }
//     return slow;
//   }

//   public ListNode detectCycle(ListNode head) {
//     ListNode slow = head, fast = head;
//     while (fast != null && fast.next != null) {
//       slow = slow.next;
//       fast = fast.next.next;

//       if (slow == fast) break;
//     }
//     if (fast == null || fast.next == null) return null;

//     fast = head;
//     while (fast != slow) {
//       fast = fast.next;
//       slow = slow.next;
//     }
//     return fast;
//   }

//   public void deleteNode(ListNode node) {
//     node.val = node.next.val;
//     node.next = node.next.next;
//   }

//   public ListNode deleteDuplicates(ListNode head) {
//     if (head == null) {
//       return null;
//     }

//     ListNode current = head;
//     while (current.next != null) {
//       if (current.val == current.next.val) {
//         ListNode currentp2 = current.next.next;
//         current.next = currentp2;
//       } else {
//         current = current.next;
//       }
//     }
//     return head;
//   }

//   public void reorderList(ListNode head) {
//     if (head == null || head.next == null) return;
//     ListNode s = head;
//     ListNode f = head;
//     while (f.next != null && f.next.next != null) {
//       s = s.next;
//       f = f.next.next;
//     }
//     ListNode Prev = null;
//     ListNode Curr = s.next;
//     s.next = null;
//     while (Curr != null) {
//       ListNode Currp1 = Curr.next;
//       Curr.next = Prev;
//       Prev = Curr;
//       Curr = Currp1;
//     }

//     ListNode left = head;
//     ListNode right = Prev;
//     while (right != null) {
//       ListNode leftp1 = left.next;
//       ListNode rightp1 = right.next;

//       left.next = right;
//       right.next = leftp1;
//       left = leftp1;
//       right = rightp1;
//     }
  }

