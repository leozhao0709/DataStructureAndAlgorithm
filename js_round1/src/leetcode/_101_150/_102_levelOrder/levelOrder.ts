function levelOrder(root: TreeNode | null): number[][] {
  const result: number[][] = [];

  const queue: TreeNode[] = [];
  if (root !== null) {
    queue.push(root);
  }

  while (queue.length > 0) {
    const currentLevelSize = queue.length;
    const currentLevelRes: number[] = [];
    for (let i = 0; i < currentLevelSize; i++) {
      const currentNode = queue.shift()!;
      currentLevelRes.push(currentNode.val);
      if (currentNode.left !== null) {
        queue.push(currentNode.left);
      }
      if (currentNode.right !== null) {
        queue.push(currentNode.right);
      }
    }
    result.push(currentLevelRes);
  }

  return result;
}
