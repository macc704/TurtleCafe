/*
 * �l�p���`���v���O�����i�������Ȃ����\�b�h���g�������́j
 * �쐬�ҁFYoshiaki Matsuzawa
 * �쐬���F2011/12/06
 */
public class DrawTwoRectangles1 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTwoRectangles1());
	}

	// �^�[�g���𓮂�������
	public void start() {
		drawBigRectangle();
		drawSmallRectangle();
	}

	// ���100�̑傫�Ȏl�p�`������
	void drawBigRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(100);
			rt(90);
		}
	}

	// ���20�̏����Ȏl�p�`������
	void drawSmallRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(20);
			rt(90);
		}
	}
}