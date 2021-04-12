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
        
        Map<Integer, Integer> dist = new HashMap();
        for (int i = 1; i <= n; i++) {
            dist.put(i, Integer.MAX_VALUE);
        }
        dist.put(k, 0);
        
        boolean[] visited = new boolean[n+1];
        
        while (true) {
            int candNode = -1;
            int candDist = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && dist.get(i) < candDist) {
                    candDist = dist.get(i);
                    candNode = i;
                }
            }
            
            if (candNode < 0) break;
            
            visited[candNode] = true;
            if (graph.containsKey(candNode)) {
                for (int[] info : graph.get(candNode)) {
                    dist.put(info[0], Math.min(dist.get(info[0]), dist.get(candNode) + info[1]));
                }
            }
        }
        
        int ans = 0;
        for (int cand : dist.values()) {
            if (cand == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, cand);
            System.out.print(cand + " ");
        }

        return ans;
    }
}