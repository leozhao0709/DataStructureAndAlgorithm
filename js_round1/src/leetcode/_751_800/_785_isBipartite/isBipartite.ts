// https://leetcode.com/problems/is-graph-bipartite/

function isBipartite(graph: number[][]): boolean {
  const n = graph.length;

  const colors = new Array(n).fill(-1);

  const canFillColor = (i: number, color: number) => {
    colors[i] = color;
    const edges = graph[i];
    for (const edge of edges) {
      if (colors[edge] === -1) {
        if (!canFillColor(edge, 1 - color)) {
          return false;
        }
      } else {
        if (colors[edge] === color) {
          return false;
        }
      }
    }
    return true;
  };

  // the graph may have single vertex which not connected to other vertex, so need to check all vertex
  for (let i = 0; i < n; i++) {
    if (colors[i] === -1) {
      if (!canFillColor(i, 0)) {
        return false;
      }
    }
  }

  return true;
}

export default isBipartite;
