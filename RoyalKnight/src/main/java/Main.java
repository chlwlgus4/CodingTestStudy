public class Main {
    public static void main(String[] args) {
        String nightPoint = "a1";

        //char -> int 형변환
        int row = nightPoint.charAt(1) - '0';
        //row의 위치 값을 얻기 위해
        int column = nightPoint.charAt(0) - 'a' + 1;

        //컬럼, 로우
        int[][] point = {
                  {-2,-1},{-1, -2}
                , {1, -2}, {2, -1}
                , {2, 1}, {1, 2}
                , {-1, 2}, {-2, 1}};
        int count = 0;

        for (int i = 0; i < point.length; i++) {
            int nextRow = row + point[i][0];
            int nextColumn = column + point[i][1];
            if(nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <=8) {
                count++;
            }
        }

        System.out.println(count);
    }
}