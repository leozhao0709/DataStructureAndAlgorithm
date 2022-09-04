// https://leetcode.com/problems/symmetric-tree/

function isSymmetric(root: TreeNode | null): boolean {
  if (root === null) {
    return true;
  }

  return isTwoTreesSymmetric(root.left, root.right);
}

function isTwoTreesSymmetric(
  root1: TreeNode | null,
  root2: TreeNode | null
): boolean {
  if (root1 === null && root2 === null) {
    return true;
  }

  if (root1 !== null && root2 !== null && root1.val === root2.val) {
    return (
      isTwoTreesSymmetric(root1.left, root2.right) &&
      isTwoTreesSymmetric(root1.right, root2.left)
    );
  }

  return false;
}
