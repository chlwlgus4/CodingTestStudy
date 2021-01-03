import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        String[] move = {"R", "R", "R", "U", "D", "D"};
        int[] xy = {1,1};

        for (int i = 0; i < move.length; i++) {

            switch (move[i]) {
                case "R":
                    if(xy[1] <= n) {
                        xy[1]++;
                    }
                    break;
                case "L":
                    if(xy[1] > 1) {
                        xy[1]--;
                    }
                    break;
                case "U":
                    if(xy[0] > 1) {
                        xy[0]--;
                    }
                    break;
                case "D":
                    if(xy[0] <= n) {
                        xy[0]++;
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println(Arrays.toString(xy));
    }
}
