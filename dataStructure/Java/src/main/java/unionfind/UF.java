package unionfind;

/**
 * Created by lzhao on 7/31/17.
 */

class UF {

    private int[] parent;
    private int[] rank;

    UF(int n) {
        this.parent = new int[n];
        this.rank = new int[n];

        for (int i = 0; i < n; i++)
        {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    private int findRoot(int p) {
        while (parent[p] != p) {
            // compress path
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    void union(int p, int q) {
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);

        if (pRoot == qRoot) {
            return;
        }

        if (rank[pRoot] > rank[qRoot]) {
            parent[qRoot] = pRoot;
        } else if (rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        } else {
            parent[qRoot] = pRoot;
            rank[pRoot] ++;
        }
    }
}
