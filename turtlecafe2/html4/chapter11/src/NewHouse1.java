/*
 * �Ƃ�`���v���O�����i�l�p�`�ƎO�p�`���������́j
 * �쐬�ҁFYoshiaki Matsuzawa
 * �쐬���F2011/12/06
 */
public class NewHouse1 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new NewHouse1());
	}

	// �^�[�g���𓮂�������
	public void start() {
		drawTriangle(100);
		rt(90);
		drawRectangle(100);
	}

	// �O�p�`������
	void drawTriangle(int size) {
		rt(30);
		for (int i = 0; i < 3; i++) {
			fd(size);
			rt(120);
		}
		lt(30);
	}

	// �l�p�`������
	void drawRectangle(int size) {
		for (int i = 0; i < 4; i++) {
			fd(size);
			rt(90);
		}
	}

}