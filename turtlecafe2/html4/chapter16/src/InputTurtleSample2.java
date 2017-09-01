/*
 * �v���O�������F�Q�̓��̓{�b�N�X��؂�ւ���v���O���� 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class InputTurtleSample2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new InputTurtleSample2(), args);
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();

		// ���̓{�b�N�X1
		InputTurtle input1 = new InputTurtle();
		input1.warp(30, 30);

		// ���̓{�b�N�X2
		InputTurtle input2 = new InputTurtle();
		input2.warp(30, 60);
		input2.setActive(false);

		// �\���p�e�L�X�g
		TextTurtle text = new TextTurtle("�����ɕ������\������܂�");
		text.fontsize(10);

		while (true) {

			sleep(0.025);// �҂�

			// �G���^�[�L�[�������ꂽ��
			if (key() == 10) {
				if (input1.isActive()) {
					text.text(input1.text());
					input1.clearText();
				} else if (input2.isActive()) {
					text.text(input2.text());
					input2.clearText();
				}
			}

			// �X�y�[�X�L�[�������ꂽ��
			if (key() == 32) {
				if (input1.isActive()) {
					input1.setActive(false);
					input2.setActive(true);
				} else if (input2.isActive()) {
					input1.setActive(true);
					input2.setActive(false);
				}
			}

			update();// �ĕ`�悷��
		}
	}
}