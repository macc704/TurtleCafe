/*
 * �l�p���`���v���O�����i�傫���������Ƃ������́j
 * �쐬�ҁFYoshiaki Matsuzawa
 * �쐬���F2011/12/06
 */
public class DrawTwoRectangles2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTwoRectangles2());
	}

	// �^�[�g���𓮂�������
	public void start() {
		drawRectangle(100);
		drawRectangle(20);
	}

	// ��ӂ�size�̎l�p�`������
	void drawRectangle(int size) {
		for (int i = 0; i < 4; i++) {
			fd(size);
			rt(90);
		}
	}

}