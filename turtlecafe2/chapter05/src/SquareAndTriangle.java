/*
 * �l�p�ƎO�p����ׂĂ����v���O����
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class SquareAndTriangle extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new SquareAndTriangle());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int length = 50;// �P�ӂ̒���

		// 8��J��Ԃ�
		int i;
		i = 0;
		while (i < 8) {

			if (i % 2 == 0) {// �����Ȃ�
				// �l�p�`������
				int j;
				j = 1;
				while (j <= 4) {
					fd(length);
					lt(90);

					j++;// j��1���₷([j = j + 1] �̏ȗ��`)
				}
			} else {// ��Ȃ�
				// �O�p�`������
				int j;
				j = 1;
				while (j <= 3) {
					fd(length);
					lt(120);

					j++;// j��1���₷([j = j + 1] �̏ȗ��`)
				}
			}

			// ���̐}�`�������ʒu�Ɉړ�
			up();
			rt(135);
			fd(length);
			rt(180);
			down();

			i++;// j��1���₷([i = i + 1] �̏ȗ��`)
		}

	}

}