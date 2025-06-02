package baekjoon._1600;

import java.io.BufferedInputStream;
import java.util.ArrayDeque;
import java.util.Scanner;

    public class Solution {
        static int K, W, H;
        static int[][] canvas;

        public static void main(String[] args){
            Scanner scanner = new Scanner(new BufferedInputStream(System.in));

            K = scanner.nextInt();
            W = scanner.nextInt();
            H = scanner.nextInt();

            canvas = new int[W][H];
            for(int i = 0; i < W; i++) {
                for(int j = 0; j < H; j++) {
                    canvas[i][j] = scanner.nextInt();
                }
            }
            scanner.close();

            System.out.println(BFS(0, 0, W-1, H-1, K));
        }

        public static int BFS(int rStart, int cStart, int rGoal, int cGoal, int maxMagic) {
            var visited = new boolean[W][H][maxMagic+1];
            var queue = new ArrayDeque<int[]>();
            queue.add(new int[] {rStart, cStart, 0, 0}); // 사용한 마법 횟수 0
            var isMagic = false;
            while (queue.size() > 0) {
                int[] u = queue.remove();
                int r = u[0], c = u[1], distance = u[2], magic = u[3];
                if (canvas[r][c] == 1) {
                    if (magic == maxMagic) continue;
                    else {
                        isMagic = true;
                        ++magic;
                    }
                }
                if (visited[r][c][magic]) continue;
                visited[r][c][magic] = true;

                if (r == rGoal && c == cGoal) return distance;

                final int[][] MV1 = {{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2}};
                final int[][] MV2 = {{-1,0},{0,-1},{1,0},{0,1}};

                if(isMagic) {
                    for (int[] mv : MV1) {
                        int rr = r + mv[0], cc = c + mv[1];
                        if (rr < 0 || cc < 0 || rr >= W || cc >= H) continue;
                        queue.add(new int[]{rr, cc, distance + 1, magic});
                    }
                    isMagic = false;
                }
                else {
                    for (int[] mv : MV2) {
                        int rr = r + mv[0], cc = c + mv[1];
                        if (rr < 0 || cc < 0 || rr >= W || cc >= H) continue;
                        queue.add(new int[]{rr, cc, distance + 1, magic});
                    }
                }
            }

            return -1;
        }
}