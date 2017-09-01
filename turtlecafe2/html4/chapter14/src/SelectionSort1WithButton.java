/**
 * �v���O�������F�ŏ��l�I��@
 * �쐬�ҁFMegumiAraki 
 * �o�[�W�����F 1.0 (���t)2007/12/8
 */
public class SelectionSort1WithButton extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort1WithButton());
	}

	// �J�[�h�̑�
	HolderTurtle ��������;
	HolderTurtle �ŏ��l���;
	HolderTurtle �\�[�g�ϑ�;
	HolderTurtle �����ϑ�;

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
			sleep(0.025);

			// �{�^���̓��͂��󂯕t����
			if (startButton.isClicked()) {
				�`�N�^�N = true;
			}
			if (resetButton.isClicked()) {
				���Z�b�g����();
			}
			if (stopButton.isClicked()) {
				�`�N�^�N = false;
			}

			// �ŏ��l�I��@�̂P�X�e�b�v�̏���������
			counter = (counter + 1) % 8;//8�R�}���ƂɎ��s����
			if (�`�N�^�N && counter == 0) {
				�ŏ��l�I��@();
			}

			update();
		}
	}

	void ����������() {
		hide();
		Turtle.window.size(550, 400);// �E�C���h�E�T�C�Y�𒲐߂���

		// �{�^�������
		startButton = new ButtonTurtle("�X�^�[�g");
		resetButton = new ButtonTurtle("���Z�b�g");
		stopButton = new ButtonTurtle("�X�g�b�v");

		startButton.warp(450, 20);
		resetButton.warp(450, 50);
		stopButton.warp(450, 80);

		// �J�[�h�̑������
		�������� = new HolderTurtle();
		��������.warp(50, 120);
		TextTurtle ���������^�O = new TextTurtle("��������");
		���������^�O.fontsize(12);
		���������^�O.warp(50, 100);

		�ŏ��l��� = new HolderTurtle();
		�ŏ��l���.warp(50, 50);
		TextTurtle �ŏ��l���^�O = new TextTurtle("�ŏ��l���");
		�ŏ��l���^�O.fontsize(12);
		�ŏ��l���^�O.warp(50, 30);

		�\�[�g�ϑ� = new HolderTurtle();
		�\�[�g�ϑ�.warp(50, 260);
		TextTurtle �\�[�g�ϑ��^�O = new TextTurtle("�\�[�g�ϑ�");
		�\�[�g�ϑ��^�O.warp(50, 240);
		�\�[�g�ϑ��^�O.fontsize(12);

		�����ϑ� = new HolderTurtle();
		�����ϑ�.warp(50, 190);
		TextTurtle �����ϑ��^�O = new TextTurtle("�����ϑ�");
		�����ϑ��^�O.fontsize(12);
		�����ϑ��^�O.warp(50, 170);

		// �J�[�h��8�����A���������ɓ����
		for (int i = 0; i < 8; i++) {
			��������.�Ō�ɒǉ�����(new CardTurtle(random(100)));
		}

		// ���������̐擪����J�[�h��1�����o���A�ŏ��l���ɒu��
		�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());

		update();
	}

	void ���Z�b�g����() {
		�ŏ��l���.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
		�����ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
		�\�[�g�ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);

		��������.�����܂���();

		�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());

		update();
	}

	void �ŏ��l�I��@() {
		if (��������.�����Ă�����̂̌�() != 0) {
			if (��������.�J�[�\���ʒu�ɂ�����̂̐��l() < �ŏ��l���.�J�[�\���ʒu�ɂ�����̂̐��l()) {
				�����ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
				�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
			} else {
				�����ϑ�.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
			}
			if (��������.�����Ă�����̂̌�() != 0) {
			} else {
				�\�[�g�ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
				�����ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
				�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
			}
		} else {
			�\�[�g�ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
			�`�N�^�N = false;
		}
	}

}
