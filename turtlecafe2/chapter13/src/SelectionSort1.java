/**
 * �v���O�������F�ŏ��l�I��@�iSqueak�Ɠ����j
 * �쐬�ҁF MegumiAraki 
 * �쐬���F Wed Dec 05 21:36:23 JST 2007
 */
public class SelectionSort1 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort1());
	}

	// �J�[�h�̑�
	HolderTurtle ��������;
	HolderTurtle �ŏ��l���;
	HolderTurtle �\�[�g�ϑ�;
	HolderTurtle �����ϑ�;

	// �^�[�g���𓮂�������
	public void start() {

		����������();

		// �J�[�h����ёւ���i���ёւ��̗l�q���A�j���[�V�����ŕ\������j
		while (true) {
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
				�`�悷��();
				break;
			}
			�`�悷��();
		}
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

	// �`�悷��
	void �`�悷��() {
		update();
		sleep(0.1);
	}

}