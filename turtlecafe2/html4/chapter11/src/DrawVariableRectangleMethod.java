/*
 * �l�p�`��`���v���O����
 * �i�������胁�\�b�h�̗��K�j
 * �쐬�ҁFMegumiAraki
 * �쐬���F2007/06/09
 * ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
 */
public class DrawVariableRectangleMethod extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawVariableRectangleMethod());
	}

	// �^�[�g���𓮂�������
	public void start() {
		// ��ӂ̒����̓��͂��󂯎��
		int inputLength = 0;
		print("��ӂ̒�������͂��Ă�������");
		inputLength = input();

		drawRectangle(inputLength);// ���͂��ꂽ��������ӂ̒����Ƃ��Ďl�p�`��`��
	}

	// �l�p�`��`��
	void drawRectangle(int length) {
		for (int i = 0; i < 4; i++) {
			fd(length);
			rt(90);
		}
	}
}