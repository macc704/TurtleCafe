/*
 * �l�p����ׂĂ����v���O����
 * 2011/10/25
 * Yoshiaki Matsuzawa
 */
public class TenBlocks extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new TenBlocks());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int length = 10;// �l�p�̑傫��
		int margin = 5;// �ׂ̎l�p�Ƃ̊Ԋu

		// ����10��J��Ԃ����߂̃��[�v
		int i;
		i = 1;
		while (i <= 10) {

			// �l�p�`���������߂̃��[�v
			int j;
			j = 1;
			while (j <= 4) {
				fd(length);
				rt(90);

				j++;
			}

			// �l�p�`����������ׂɈړ�
			up();
			rt(90);
			fd(length);
			fd(margin);
			lt(90);
			down();

			i++;
		}

	}

}