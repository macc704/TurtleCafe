/*
 * ���Q�F�l�p�`���R�`���v���O����
 * �i���\�b�h�����̏����j
 * �쐬�ҁFMegumiAraki
 * �쐬���F2007/06/09
 * ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
 */

public class DrawThreeRectanglesMethod extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawThreeRectanglesMethod());
	}

	// �^�[�g���𓮂�������
	public void start() {
		// �l�p�`���R�`��
		for (int i = 0; i < 3; i++) {
			drawRectangle();// �l�p�`��`��
			move();// ���̕`���ʒu�܂ňړ�����
		}
	}

	// �l�p�`��`��
	void drawRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(50);
			rt(90);
		}
	}

	// ���̕`���ʒu�܂ňړ�����
	void move() {
		up();
		rt(90);
		fd(60);
		lt(90);
		down();
	}
}