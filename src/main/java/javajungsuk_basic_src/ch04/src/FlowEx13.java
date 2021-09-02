package javajungsuk_basic_src.ch04.src;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i=1053; i <= 1059; i++) {
            sum += i;
            System.out.printf("1053부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}
