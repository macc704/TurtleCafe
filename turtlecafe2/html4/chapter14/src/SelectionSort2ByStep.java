/**
 * �v���O�������F�ŏ��l�I��@�i�Q�d���[�v�j 
 * �쐬�ҁF MegumiAraki 
 * �쐬���F Wed Dec 05 21:36:23 JST 2007
 */
public class SelectionSort2ByStep extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort2ByStep());
	}

	// �J�[�h�̑�
	HolderTurtle ��������;
	HolderTurtle �ŏ��l���;
	HolderTurtle �\�[�g�ϑ�;
	HolderTurtle �����ϑ�;

	// �{�^��
	ButtonTurtle stepButton;

	// �^�[�g���𓮂�������
	public void start() {
		����������();
		�{�^�����������܂ő҂�();

		while (true) {
			�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
			�{�^�����������܂ő҂�();

			do {
				if (��������.�J�[�\���ʒu�ɂ�����̂̐��l() < �ŏ��l���.�J�[�\���ʒu�ɂ�����̂̐��l()) {// (�������Ȃ���΁j
					�����ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
					�{�^�����������܂ő҂�();
					�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
					�{�^�����������܂ő҂�();
				} else {
					�����ϑ�.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
					�{�^�����������܂ő҂�();
				}
			} while (��������.�����Ă�����̂̌�() != 0);
			�\�[�g�ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
			�{�^�����������܂ő҂�();
			if (�����ϑ�.�����Ă�����̂̌�() == 1) {
				break;
			}
			�����ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
			�{�^�����������܂ő҂�();
		}

		�\�[�g�ϑ�.�Ō�ɒǉ�����(�����ϑ�.�J�[�\���ʒu�ɂ������());// �ŏ��l�����\�[�g�ςݑ��ɒu��
		�{�^�����������܂ő҂�();
	}

	void ����������() {
		hide();
		Turtle.window.size(550, 400);// �E�C���h�E�T�C�Y�𒲐߂���

		// �{�^�������
		stepButton = new ButtonTurtle("�X�e�b�v");
		stepButton.warp(450, 20);

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
		�\�[�g�ϑ��^�O.fontsize(12);
		�\�[�g�ϑ��^�O.warp(50, 240);

		�����ϑ� = new HolderTurtle();
		�����ϑ�.warp(50, 190);
		TextTurtle �����ϑ��^�O = new TextTurtle("�����ϑ�");
		�����ϑ��^�O.fontsize(12);
		�����ϑ��^�O.warp(50, 170);

		// �J�[�h��8�����A���������ɓ����
		for (int i = 0; i < 8; i++) {
			��������.�Ō�ɒǉ�����(new CardTurtle(random(100)));
		}

		update();
	}

	// �P�X�e�b�v���Ƃɕ`�悷��
	void �{�^�����������܂ő҂�() {
		do {// �X�e�b�v�{�^�����������܂ő҂�
			update();
			sleep(0.025);
		} while (!(stepButton.isClicked()));
	}

}