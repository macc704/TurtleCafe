/*
 * �v���O�������F�����ޕԂ��v���O�����i���̓^�[�g���o�[�W�����j 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class InputTurtleSample1 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new InputTurtleSample1(), args);
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
