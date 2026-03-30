class Solution:
    def minCost(self, houses):
        n = len(houses)
        
        visited = [False] * n
        min_dist = [float('inf')] * n
        
        min_dist[0] = 0
        total_cost = 0
        
        for _ in range(n):
            u = -1
            
            # Pick minimum distance unvisited node
            for i in range(n):
                if not visited[i] and (u == -1 or min_dist[i] < min_dist[u]):
                    u = i
            
            visited[u] = True
            total_cost += min_dist[u]
            
            # Update distances
            for v in range(n):
                if not visited[v]:
                    dist = abs(houses[u][0] - houses[v][0]) + abs(houses[u][1] - houses[v][1])
                    if dist < min_dist[v]:
                        min_dist[v] = dist
        
        return total_cost