/**
 * �v���O�������F�����ޕԂ��v���O�����i���̓^�[�g���o�[�W�����j 
 * �쐬�ҁFMegumiAraki 
 * �o�[�W�����F 1.0 �i20071215�j
 */
public class RepeatWord extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RepeatWord());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();
		// ���̓{�b�N�X
		InputTurtle input = new InputTurtle();
		input.warp(30, 30);
		// �\���p�e�L�X�g
		TextTurtle text = new TextTurtle("�����ɕ������\������܂�");
		text.fontsize(14);

		while (true) {
			sleep(0.025);// �҂�

			// �G���^�[�L�[�������ꂽ��
			if (key() == 10) {
				text.text(input.text());// �\���p�e�L�X�g�̓��e����̓{�b�N�X�̓��e�ɕς���
				input.clearText();// �\���p�e�L�X�g�̓��e�����Z�b�g����
			}

			update();// �ĕ`�悷��
		}
	}
}
