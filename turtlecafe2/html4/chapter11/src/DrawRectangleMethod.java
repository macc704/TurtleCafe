/*
 * ���P�F�l�p�`��`���v���O����
 * �i���\�b�h�̍����̗��K�j
 * �쐬�ҁFMegumiAraki
 * �쐬���F2007/06/09
 * ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
 */
public class DrawRectangleMethod extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawRectangleMethod());
	}

	// �^�[�g���𓮂�������
	public void start() {
		drawRectangle();
	}

	// �l�p�`��`��
	void drawRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(50);
			rt(90);
		}
	}
}