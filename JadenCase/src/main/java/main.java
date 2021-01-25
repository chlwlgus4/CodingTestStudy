
public class main {

    public static String solution(String s) {
        String answer = "";
        String[] sArray;
        sArray = s.toLowerCase().split("");
        boolean blank = false;
        for (String str : sArray) {

            if(str.equals(" ")) {
                answer += str;
                blank = false;
            } else {
                if(!blank) {
                    answer += str.toUpperCase();
                    blank = true;
                } else {
                    answer += str;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = " for the last week";
        System.out.println(solution(s));
    }
}
