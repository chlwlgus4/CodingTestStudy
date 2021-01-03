public class Application {
    public static void main(String[] args) {

        int n = 25;
        int k = 5;
        int result = 0;

        while (n > 1) {
            n -= 1;
            n /=k;
            if(n == 1) {
                break;
            }
            result++;
        }

        System.out.println(result);
    }
}
