package baekjoon._16401;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Solution {
    static int N;
    static int M;
    static int[] list;

    public static void main(String[] args){
        Scanner scanner = new Scanner (new BufferedInputStream(System.in));
        M = scanner.nextInt();
        N = scanner.nextInt();
        list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(paramatric_max(1, 1000000));
    }

    public static int compare(int middle) {
        int count = 0;

        for (int i = 0; i < N; i++) {
            while(list[i] > middle) {
                list[i] -= middle;
                count++;
            }
        }

        return M-count;
    }

    public static int paramatric_max(int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            int r = compare(middle);
            if (r <= 0)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return right;
    }
}