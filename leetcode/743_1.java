/*
    https://leetcode.com/problems/network-delay-time/
    743. Network Delay Time (Medium)
*/
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap();
        for (int[] edge : times) {
            if (!graph.containsKey(edge[0])) {
                graph.put(edge[0], new ArrayList<int[]>());
            }
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((info1, info2) -> info1[0] - info2[0]);
        pq.offer(new int[]{0, k});

        Map<Integer, Integer> dist = new HashMap();

        while (!pq.isEmpty()) {
            int[] info = pq.poll();
            int d = info[0];
            int node = info[1];
            if (!dist.containsKey(node)) {
                dist.put(node, d);
                if (graph.containsKey(node)) {
                    for (int[] edge : graph.get(node)) {
                        int nnode = edge[0];
                        int nd = edge[1];
                        if (!dist.containsKey(nnode)) {
                            pq.offer(new int[]{d+nd, nnode});
                        }
                    }
                }
            }
        }

        if (dist.size() != n) {
            return -1;
        }

        int ans = 0;
        for (int cand : dist.values()) {
            ans = Math.max(ans, cand);
        }
        return ans;
    }
}