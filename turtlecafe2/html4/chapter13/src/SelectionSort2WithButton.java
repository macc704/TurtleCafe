/**
 * �v���O�������F�ŏ��l�I��@�i��d���[�v�j 
 * �쐬�ҁF MegumiAraki 
 * �쐬���F Wed Dec 05 21:36:23 JST 2007
 */
public class SelectionSort2WithButton extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort2WithButton());
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
		while (true) {
			�{�^�����͂̏���������();
			�ŏ��l�I��@();
			�`�N�^�N = false;
		}
	}

	// �J�[�h����ёւ���i���ёւ��̗l�q���A�j���[�V�����ŕ\������j
	void �ŏ��l�I��@() {
		while (true) {
			�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
			�{�^�����͂̏���������();

			do {
				if (��������.�J�[�\���ʒu�ɂ�����̂̐��l() < �ŏ��l���.�J�[�\���ʒu�ɂ�����̂̐��l()) {
					�����ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
					�{�^�����͂̏���������();
					�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
					�{�^�����͂̏���������();
				} else {
					�����ϑ�.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
					�{�^�����͂̏���������();
				}

			} while (��������.�����Ă�����̂̌�() != 0);

			�\�[�g�ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
			�{�^�����͂̏���������();

			if (�����ϑ�.�����Ă�����̂̌�() == 1) {
				�\�[�g�ϑ�.�Ō�ɒǉ�����(�����ϑ�.�J�[�\���ʒu�ɂ������());
				�{�^�����͂̏���������();
				break;
			} else {
				�����ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
				�{�^�����͂̏���������();
			}
		}

	}

	void ���Z�b�g����() {
		�ŏ��l���.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
		�����ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
		�\�[�g�ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);

		��������.�����܂���();
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

		// �J�[�h��20�����A���������ɓ����
		for (int i = 0; i < 8; i++) {
			��������.�Ō�ɒǉ�����(new CardTurtle(random(100)));
		}

		update();
	}

	void �{�^�����͂̏���������() {
		do {
			sleep(0.1);

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

		} while (!�`�N�^�N);
	}

}