// https://leetcode.com/problems/delete-node-in-a-linked-list/

class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val = 0, next: ListNode | null = null) {
    this.val = val;
    this.next = next;
  }
}

/**
 Do not return anything, modify it in-place instead.
 */
function deleteNode(root: ListNode | null): void {
  const nextNode = root!.next!;
  root!.val = nextNode.val;
  root!.next = nextNode.next;
}

// export let undefined;

export let undefined;
