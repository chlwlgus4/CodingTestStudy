import java.util.*;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        System.out.println("입력 시작");
        Scanner sc = new Scanner(System.in);

        System.out.print("n 입력 : ");
        int n = sc.nextInt();
        System.out.print("m 입력 : ");
        int m = sc.nextInt();
        int result = 0;
        List<Integer> minCardList = new ArrayList();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print(n + "번 행 카드번호 입력 : ");
            int cards = sc.nextInt();
            int[] card = Stream.of(String.valueOf(cards).split("")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < card.length; j++) {
                list.add(card[j]);
            }
            minCardList.add(Collections.min(list));
        }
        result = Collections.min(minCardList);
        System.out.println(result); // 최종 답안 출력
    }
}
