from collections import deque
import sys


def dfs(v, connection, visited):
    visited[v] = True
    print(v, end = ' ')
    con = []
    
    
    for i in sorted(connection[v]):
        if visited[i] == False:
           dfs(i, connection, visited)
    
    return

    



def bfs(v, connection, visited):
    q = deque([v])
    

    while q:
        v = q.popleft()
    
        if visited[v] == False:
            print(v, end = ' ')
            visited[v] = True


        for i in sorted(connection[v]):
            if visited[i] == False:
                q.append(i)


        
    return 


N, M, V = map(int, sys.stdin.readline().split())

connection =[[] for _ in range(N+1)]
#그래프 표현 방식 = 인접 행렬
for i in range(M):
    a,b = map(int, sys.stdin.readline().split())
    connection[a].append(b)
    connection[b].append(a)



visited = [False] * (N+1)
dfs(V, connection, visited)
visited = [False] * (N+1)
print()
bfs(V,connection, visited)