/**
 * �v���O�������F�}���@�i��d���[�v�j 
 * �쐬�ҁF MegumiAraki 
 * �쐬���F Wed Dec 05 21:36:23 JST 2007
 */
public class InsertionSortWithButton extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new InsertionSortWithButton());
	}

	// �J�[�h�̑�
	HolderTurtle ��������;
	HolderTurtle �\�[�g�ϑ�;

	// �{�^��
	ButtonTurtle startButton;
	ButtonTurtle resetButton;
	ButtonTurtle stopButton;

	// �v���O�����̏��
	boolean �`�N�^�N = false;

	// �^�[�g���𓮂�������
	public void start() {
		����������();

		// �A�j���[�V�������[�v
		int counter = 0;
		while (true) {
			�{�^�����͂̏���������();

			counter = (counter + 1) % 8;//8�R�}���ƂɎ��s����
			if (counter == 0) {
				�}���@();
			}
		}

	}

	// �J�[�h����ёւ���i���ёւ��̗l�q���A�j���[�V�����ŕ\������j
	void �}���@() {
		if (��������.�����Ă�����̂̌�() <= 0) {
			�`�N�^�N = false;
			return;
		}
		if (��������.�J�[�\���ʒu�ɂ�����̂̐��l() < �\�[�g�ϑ�.�J�[�\���ʒu�ɂ�����̂̐��l()) {
			�\�[�g�ϑ�.�J�[�\���ʒu�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
			�\�[�g�ϑ�.�J�[�\���ʒu��ς���(1);
		} else {
			�\�[�g�ϑ�.�J�[�\����i�߂�();
		}
	}

	void ���Z�b�g����() {
		��������.�����Ă�����̂�S�Ď̂Ă�();
		�\�[�g�ϑ�.�����Ă�����̂�S�Ď̂Ă�();

		for (int i = 0; i < 12; i++) {
			��������.�Ō�ɒǉ�����(new CardTurtle(random(100)));
		}
		�\�[�g�ϑ�.�Ō�ɒǉ�����(new CardTurtle(999));

		update();
	}

	void ����������() {
		hide();

		Turtle.window.size(550, 400);// �E�C���h�E�T�C�Y�𒲐߂���

		// �{�^�������
		startButton = new ButtonTurtle("�X�^�[�g");
		startButton.warp(450, 20);

		resetButton = new ButtonTurtle("���Z�b�g");
		resetButton.warp(450, 50);

		stopButton = new ButtonTurtle("�X�g�b�v");
		stopButton.warp(450, 80);

		// �J�[�h�̑������
		�������� = new HolderTurtle();
		��������.warp(50, 120);
		TextTurtle ���������^�O = new TextTurtle("��������");
		���������^�O.fontsize(12);
		���������^�O.warp(50, 100);

		�\�[�g�ϑ� = new HolderTurtle();
		�\�[�g�ϑ�.warp(50, 260);
		TextTurtle �\�[�g�ϑ��^�O = new TextTurtle("�\�[�g�ϑ�");
		�\�[�g�ϑ��^�O.warp(50, 240);
		�\�[�g�ϑ��^�O.fontsize(12);

		���Z�b�g����();
	}

	void �{�^�����͂̏���������() {
		do {
			// �{�^���̓��͂��󂯕t����
			if (stopButton.isClicked()) {
				�`�N�^�N = false;
			}
			if (resetButton.isClicked()) {
				���Z�b�g����();
			}
			if (startButton.isClicked()) {
				�`�N�^�N = true;
			}

			update();
			sleep(0.025);

		} while (!�`�N�^�N);
	}

}