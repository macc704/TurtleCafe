/*
 * �Ԃт�������v���O����
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class Petal extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Petal());
	}

	// �^�[�g���𓮂�������
	public void start() {
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