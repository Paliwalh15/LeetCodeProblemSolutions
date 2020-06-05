package leetcode_30days_challenge_2020;

public class MiddleOfLinkedList {

	ListNode head;

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode middleNode(ListNode head) {
		int count = 1;
		ListNode copyHead = head;
		while (head.next != null) {
			count++;
			head = head.next;
		}
		int c = count / 2 + 1;
		while (c > 1) {
			copyHead = copyHead.next;
			c--;
		}
		return copyHead;
	}
}
