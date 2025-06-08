package baekjoon._1504;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N;
    static int E;
    static ArrayList<int[]>[] edges;

    static int dijkstra(int start, int goal) {
        // 한번 이동했던 간선 다시 이동이 가능하지만 이는 새로운 다이스트라 호출시 사용
        var visited = new boolean[N+1];
        // 거리 오름차순(거리가 가장 짧은 것))
        var queue = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
        queue.add(new int[] {start, 0});
        while (queue.size() > 0) {
            int[] u = queue.remove();
            int node = u[0], distance = u[1];
            if (visited[node]) continue;
            visited[node] = true;
            if (node == goal) return distance;
            for (int[] edge : edges[node]) {
                int neighbor = edge[0], cost = edge[1];
                queue.add(new int[] {neighbor, distance + cost});
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        N = scanner.nextInt(); // 정점의 개수
        E = scanner.nextInt(); // 간선의 개수

        // 간선 목록 생성
        edges = new ArrayList[N + 1];
        for (int i = 1; i <= N; ++i)
            edges[i] = new ArrayList<int[]>();

        for (int i = 0; i < E; i++) { // 간선 추가
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // 간선 양방향 추가
            edges[a].add(new int[]{b, c});
            edges[b].add(new int[]{a, c});
        }
        // 두개의 정점 입력
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        // 1 -> v1 -> v2 -> N
        int d1 = dijkstra(1, v1);
        int d2 = dijkstra(v1, v2);
        int d3 = dijkstra(v2, N);
        // 1 -> v2 -> v1 -> N
        int d4 = dijkstra(1, v2);
        int d5 = dijkstra(v2, v1);
        int d6 = dijkstra(v1, N);

        // 다익스트라 값에 -1이 있는지(목적지 도달이 가능한지) 검사
        // 크기 비교 없음
        if (d1 >= 0 && d2 >= 0 && d3 >= 0 && d1 + d2 + d3 >= d4 + d5 + d6) { // 1 -> v1 -> v2 -> N
            System.out.println(d1+d2+d3);
        } else if (d4 >= 0 && d5 >= 0 && d6 >= 0) { // 1 -> v2 -> v1 -> N
            System.out.println(d4+d5+d6);
        } else {
            System.out.println(-1);
        }
    }
}