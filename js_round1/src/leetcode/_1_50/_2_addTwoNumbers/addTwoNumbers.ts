class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

function addTwoNumbers(
  l1: ListNode | null,
  l2: ListNode | null
): ListNode | null {
  const dummyHeader = new ListNode(0);
  let curr = dummyHeader;
  let carry = 0;
  while (l1 !== null && l2 !== null) {
    const val = (l1.val + l2.val + carry) % 10;
    carry = l1.val + l2.val + carry >= 10 ? 1 : 0;
    curr.next = new ListNode(val);
    curr = curr.next;
    l1 = l1.next;
    l2 = l2.next;
  }

  while (l1 !== null) {
    const val = (l1.val + carry) % 10;
    carry = l1.val + carry >= 10 ? 1 : 0;
    curr.next = new ListNode(val);
    curr = curr.next;
    l1 = l1.next;
  }

  while (l2 !== null) {
    const val = (l2.val + carry) % 10;
    carry = l2.val + carry >= 10 ? 1 : 0;
    curr.next = new ListNode(val);
    curr = curr.next;
    l2 = l2.next;
  }

  if (carry === 1) {
    curr.next = new ListNode(1);
  }
  return dummyHeader.next;
}

export default addTwoNumbers;
