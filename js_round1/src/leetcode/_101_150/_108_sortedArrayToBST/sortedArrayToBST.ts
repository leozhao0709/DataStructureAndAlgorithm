function sortedArrayToBST(nums: number[]): TreeNode | null {
  return createBST(nums);
}

function createBST(
  nums: number[],
  start = 0,
  end = nums.length - 1
): TreeNode | null {
  if (start > end) {
    return null;
  }

  const mid = start + Math.floor((end - start) / 2);
  const root = new TreeNode(nums[mid]);

  root.left = createBST(nums, start, mid);
  root.right = createBST(nums, mid + 1, end);

  return root;
}
