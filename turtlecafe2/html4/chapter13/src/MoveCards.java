/**
 * �v���O�������F�J�[�h����ꕨ�P������ꕨ�Q�Ɉړ�����v���O����
 * �쐬�ҁF MegumiAraki 
 * �쐬���F Wed Dec 05 13:24:46 JST 2007
 */
public class MoveCards extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveCards());
	}

	// ���ꕨ
	HolderTurtle holder1;
	HolderTurtle holder2;

	// �^�[�g���𓮂�������
	public void start() {

		����������();
		print("�A�j���[�V�������[�v���J�n���܂�");

		// �A�j���V�������[�v
		while (true) {

			// �҂�
			sleep(0.5);

			// �������s��
			if (holder1.�����Ă�����̂̌�() != 0) {
				holder2.�Ō�ɒǉ�����(holder1.�J�[�\���ʒu�ɂ������());// ���ꕨ�P������ꕨ�Q�ɃJ�[�h���ړ�����
			} else if (holder1.�����Ă�����̂̌�() == 0) {
				print("�J�[�h�ړ����I�����܂�");
				break;// �A�j���[�V�������[�v�𔲂���
			} else {
				print("�G���[");
			}

			// �ĕ`�悷��
			update();

		}
		print("�A�j���[�V�������[�v���I�����܂���");
	}

	void ����������() {
		Turtle.window.size(550, 300);// �E�C���h�E�T�C�Y�𒲐߂���
		hide();

		// ���ꕨ�����
		holder1 = new HolderTurtle();
		holder2 = new HolderTurtle();

		// ���ꕨ�����₷���ʒu�ɒu��
		holder1.warp(50, 50);
		holder2.warp(50, 100);

		// ���ꕨ�ɂP�O���̃J�[�h������
		for (int i = 0; i < 10; i++) {
			holder1.�Ō�ɒǉ�����(new CardTurtle(i * 10));
		}

		update();
	}

}