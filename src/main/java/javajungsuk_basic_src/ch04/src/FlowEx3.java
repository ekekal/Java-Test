package javajungsuk_basic_src.ch04.src;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�.");
        } else {
            System.out.println("�Է��Ͻ� ���ڴ� 0 �� �ƴմϴ�.");
        }

    }
}