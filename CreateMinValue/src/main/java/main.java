import java.util.Arrays;
import java.util.Collections;

public class main {
    
    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};

        System.out.println(solution(a, b));

    }

    private static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length-1-i];
        }
        return answer;
    }

}
