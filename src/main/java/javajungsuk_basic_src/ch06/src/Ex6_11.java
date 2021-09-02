package javajungsuk_basic_src.ch06.src;

class Data_1 {
	int value;
//	Data_1() {} // 기본 생성자를 생성자가 없을시에 처음에는 자동추가로 넣어줌
}

class Data_2 {
	int value;

	Data_2() {} // 기본 생성자
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생
	}
}