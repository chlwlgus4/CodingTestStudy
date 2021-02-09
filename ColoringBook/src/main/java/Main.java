import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    private static Set<Integer> duplication(int[][] picture) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                set.add(picture[i][j]);
            }
        }

        return set;
    };


    private static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        Set<Integer> set = duplication(picture);
        numberOfArea = set.size();

        Iterator<Integer> iter = set.iterator();
        int[] areaCount = new int[set.size()];
        int idx = 0;
        while (iter.hasNext()) {
            int num = iter.next();
            int cnt = 0;
            if(num == 0) {
                continue;
            }
            for (int i = 0; i < picture.length; i++) {
                for (int j = 0; j < picture[i].length; j++) {
                    if(num == picture[i][j]) {
                        cnt++;
                        System.out.println(picture[i][j]);
                    }
                }

            }
            areaCount[idx] = cnt;
            idx++;
        }
        Arrays.sort(areaCount);
        maxSizeOfOneArea = areaCount[areaCount.length-1];
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    };

    public static void main(String[] args) {
        int[][] picture = {
                {1, 1, 1, 0}
              , {1, 2, 2, 0}
              , {1, 0, 0, 1}
              , {0, 0, 0, 1}
              , {0, 0, 0, 3}
              , {0, 0, 0, 3}};

        System.out.println(Arrays.toString(solution(6,4, picture)));
    }
}
