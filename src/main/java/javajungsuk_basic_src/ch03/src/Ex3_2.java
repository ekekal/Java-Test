package javajungsuk_basic_src.ch03.src;

class Ex3_2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i; // ������
		i++;

		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);

		i=5;        // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;

		++i;
		j = i; //������

		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
	}
}