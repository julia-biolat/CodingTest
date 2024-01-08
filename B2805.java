package JavaP;
import java.util.Scanner;
public class B2805 {
     private static int N;
    private static int M;
    private static int[] trees;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        trees = new int[N + 1];

        for (int i = 0; i < N; i++) {
            trees[i] = scanner.nextInt();
        }
        int max = 0;
        for(int i = 0; i < N; i++){
            if(max < trees[i]){
                max = trees[i];
            }
        }

        int start = 0;
        int end = max;

        while (start <= end) {
            int mid = (start + end) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            if (sum >= M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
    
}

