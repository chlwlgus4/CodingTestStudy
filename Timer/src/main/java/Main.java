import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int n = 5; //시간

        int count = 0;

        //시간
        for (int i = 0; i < n; i++) {
            //분
            for (int j = 0; j < 60; j++) {
                //초
                for (int k = 0; k < 60; k++) {

                    if(String.valueOf(i).indexOf("3") > -1 || String.valueOf(j).indexOf("3") > -1 || String.valueOf(k).indexOf("3") > -1) {
                        count ++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
