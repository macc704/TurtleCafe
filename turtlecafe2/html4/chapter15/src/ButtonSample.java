/*
 * �v���O�������F�{�^���̃T���v���v���O����
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class ButtonSample extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ButtonSample());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();

		// �{�^�������
		ButtonTurtle helloButton = new ButtonTurtle("�����Ă��������I");

		// �A�j���V�������[�v
		while (true) {
			sleep(0.025);

			if (helloButton.isClicked()) {// helloButton���N���b�N���ꂽ��
				print("������܂���");
			} else {// �����N���b�N����Ă��Ȃ�������
				// �������Ȃ�
			}

			update();
		}
	}

}