/*
 * �Ԃ������v���O����(���܂������Ȃ���)
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class BadFlower extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new BadFlower());
	}

	// �^�[�g���𓮂�������
	public void start() {
		{// �Ԃ������i6���̉Ԃт�������j
			int i = 1;
			while (i <= 6) {
				rt(1);
				fd(1);
				i = i + 1;
			}
		}

		{// �Ԃт��`��
			{// �~�ʂ�`��
				int i = 1;
				while (i <= 120) {
					rt(1);
					fd(1);
					i++;
				}
			}

			{// ���̉~�ʂ̊p�x��
				rt(60);
			}

			{// �~�ʂ�`��
				int i = 1;
				while (i <= 120) {
					rt(1);
					fd(1);
					i++;
				}
			}

		}

	}
}