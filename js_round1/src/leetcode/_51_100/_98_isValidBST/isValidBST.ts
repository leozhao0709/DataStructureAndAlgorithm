function isValidBST(root: TreeNode | null): boolean {
  return validate(root, Number.MAX_SAFE_INTEGER, Number.MIN_SAFE_INTEGER);
}

function validate(root: TreeNode | null, max: number, min: number) {
  if (root === null) {
    return true;
  }

  if (root.val >= max || root.val <= min) {
    return false;
  }

  return (
    validate(root.left, root.val, min) && validate(root.right, max, root.val)
  );
}
