/*
 * �v���O�������F�J�[�h�����X�g�P���烊�X�g�Q�Ɉړ�����v���O�����i���F�{�^���łP�X�e�b�v���i�ށj
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class MoveCards2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveCards2());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();
		Turtle.window.size(550, 300);

		// ���X�g���Q���
		ListTurtle<CardTurtle> list1 = new ListTurtle<CardTurtle>(true, "���X�g1");
		list1.warp(50, 60);
		ListTurtle<CardTurtle> list2 = new ListTurtle<CardTurtle>(true, "���X�g2");
		list2.warp(50, 130);

		// ���X�g�P�ɂP�O���̃J�[�h������
		for (int i = 0; i < 10; i++) {
			list1.addLast(new CardTurtle(i * 10));
		}

		// �{�^�������
		ButtonTurtle stepButton = new ButtonTurtle("Step");
		stepButton.warp(200, 20);

		// �A�j���V�������[�v
		do {
			sleep(0.025);

			if (list1.getSize() != 0) {
				list2.addLast(list1.getObjectAtCursor());// ���ꕨ�P������ꕨ�Q�ɃJ�[�h���ړ�����
				waitForPushButton(stepButton);
			} else if (list1.getSize() == 0) {
				break;// �A�j���[�V�������[�v�𔲂���
			}

			update();
		} while (true);

		print("�A�j���[�V�������[�v���I�����܂����D");
	}

	// �X�e�b�v�{�^�����������܂ő҂�
	void waitForPushButton(ButtonTurtle button) {
		do {
			update();
			sleep(0.025);
		} while (!(button.isClicked()));
	}

}