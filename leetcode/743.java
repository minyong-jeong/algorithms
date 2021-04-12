/*
    https://leetcode.com/problems/network-delay-time/
    743. Network Delay Time (Medium)
*/
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap();
        for (int[] info : times) {
            // info[0]: sourceNode, info[1]: targetNode, info[2]: time
            if (!graph.containsKey(info[0])) {
                graph.put(info[0], new ArrayList<int[]>());
            }
            graph.get(info[0]).add(new int[]{info[1], info[2]});
        }

        Map<Integer, Integer> dist = new HashMap();
        for (int i = 1; i <= n; i++) {
            dist.put(i, Integer.MAX_VALUE);
        }
        dist.put(k, 0);

        boolean[] visited = new boolean[n+1];

        while (true) {
            int node = -1;
            int nodeDist = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && dist.get(i) < nodeDist) {
                    nodeDist = dist.get(i);
                    node = i;
                }
            }

            if (node < 0) break;

            visited[node] = true;
            if (graph.containsKey(node)) {
                for (int[] info : graph.get(node)) {
                    dist.put(info[0], Math.min(dist.get(info[0]), dist.get(node) + info[1]));
                }
            }
        }

        int ans = 0;
        for (int d : dist.values()) {
            if (d == Integer.MAX_VALUE) {
                return -1;
            }
            ans = Math.max(ans, d);
        }

        return ans;
    }
}