/**
 * �v���O�������F�ŏ��l�I��@�i�Q�d���[�v�j 
 * �쐬�ҁF MegumiAraki 
 * �쐬���F Wed Dec 05 21:36:23 JST 2007
 */
public class SelectionSort2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort2());
	}

	// �J�[�h�̑�
	HolderTurtle ��������;
	HolderTurtle �ŏ��l���;
	HolderTurtle �\�[�g�ϑ�;
	HolderTurtle �����ϑ�;

	// �^�[�g���𓮂�������
	public void start() {
		����������();

		while (true) {
			�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
			�`�悷��();

			do {
				// �߂���
				if (��������.�J�[�\���ʒu�ɂ�����̂̐��l() < �ŏ��l���.�J�[�\���ʒu�ɂ�����̂̐��l()) {// (�������Ȃ���΁j
					�����ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
					�`�悷��();
					�ŏ��l���.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
					�`�悷��();
				} else {
					�����ϑ�.�Ō�ɒǉ�����(��������.�J�[�\���ʒu�ɂ������());
					�`�悷��();
				}
			} while (��������.�����Ă�����̂̌�() != 0);
			�\�[�g�ϑ�.�Ō�ɒǉ�����(�ŏ��l���.�J�[�\���ʒu�ɂ������());
			�`�悷��();
			if (�����ϑ�.�����Ă�����̂̌�() == 1) {
				break;
			}
			�����ϑ�.�����Ă���S�Ă̂��̂��ȉ��̓��ꕨ�Ɉړ�����(��������);
			�`�悷��();
		}

		�\�[�g�ϑ�.�Ō�ɒǉ�����(�����ϑ�.�J�[�\���ʒu�ɂ������());// �ŏ��l�����\�[�g�ςݑ��ɒu��
		�`�悷��();
	}

	void ����������() {
		hide();
		Turtle.window.size(550, 400);// �E�C���h�E�T�C�Y�𒲐߂���

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
		TextTurtle �\�[�g�ςݑ��^�O = new TextTurtle("�\�[�g�ϑ�");
		�\�[�g�ςݑ��^�O.fontsize(12);
		�\�[�g�ςݑ��^�O.warp(50, 240);

		�����ϑ� = new HolderTurtle();
		�����ϑ�.warp(50, 190);
		TextTurtle �����ςݑ��^�O = new TextTurtle("�����ϑ�");
		�����ςݑ��^�O.fontsize(12);
		�����ςݑ��^�O.warp(50, 170);

		// �J�[�h��8�����A���������ɓ����
		for (int i = 0; i < 8; i++) {
			��������.�Ō�ɒǉ�����(new CardTurtle(random(100)));
		}

		update();
	}

	void �`�悷��() {
		update();
		sleep(0.1);
	}

}