package javajungsuk_basic_src.ch04.src;

public class FlowEx18 {
    public static void main(String[] args) {
        for(int i =2; i<=9;i++) {
            System.out.printf("%d´Ü%n", i);
            System.out.println("------------");

            for (int j=1;j<=9;j++) {
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
            System.out.println();
        }
    }
}
