

/*
 * ���W���P�F�ċA���g���Ė؂�`���v���O����
 * �i���\�b�h�̍ċA�Ăяo���j
 * �쐬�ҁFMegumiAraki
 * �쐬���F2007/06/09
 * ���[���A�h���X�Fgarnet@sfc.keio.ac.jp
 */
public class DrawTree extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTree());
	}

	// �^�[�g���𓮂�������
	public void start() {
		bk(100);// �؂�`���ʒu�܂ňړ�����
		drawTree(1, 100);// �}������̐����P�Ƃ��A���̒������P�O�O�Ƃ��āA�؂�`���B

	}

	// �؂�`��
	void drawTree(int branchNumber, int length) {
		// ���\�b�h�J�n�̃f�o�b�O�o�͂�����
		debugStart(branchNumber, length);

		if (branchNumber == 6) {

			fd(length);
			bk(length);

		} else {

			fd(length);

			// �E�̎}��`��
			rt(30);
			drawTree(branchNumber + 1, length / 2);
			lt(30);

			// ���̎}��`��
			lt(30);
			drawTree(branchNumber + 1, length / 2);
			rt(30);

			bk(length);

		}

		// ���\�b�h�I���̃f�o�b�O�o�͂�����
		debugEnd(branchNumber);
	}

	// ���\�b�h�J�n�̃f�o�b�O�o�͂�����
	void debugStart(int outputBranchNum, int outputLength) {
		for (int i = 0; i < outputBranchNum; i++) {
			System.out.print("\t");// �^�u�ŋ󔒂��󂯂�
		}

		print("�؂�`���i�}������̐��F" + outputBranchNum + "�A���̒����F" + outputLength + "�j�B");

	}

	// ���\�b�h�J�n�̃f�o�b�O�o�͂�����
	void debugEnd(int drawnBranchNum) {
		for (int i = 0; i < drawnBranchNum; i++) {
			System.out.print("\t");// �^�u�ŋ󔒂��󂯂�
		}

		print("�^�^");

	}

}