/*
 * �^�C���������v���O����
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class Tire extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Tire());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int length = 1;
		int angle = 1;

		lt(90);

		{// �^�C��������
			{// �^�C���̃f�R�{�R��`��
				int i = 1;
				while (i < 360) {

					{// 1�̓ʂ�����
						int j = 1;
						while (j <= 3) {
							fd(10);
							rt(90);
							j++;
						}
					}

					{// ���̓ʂ����������Ɉړ�
						rt(180);
						lt(82);
					}

					i = i + 8;
				}
			}

			{// �^�C���̒��̉~�������ʒu�Ɉړ�
				up();
				lt(4);
				lt(180);
				fd(15);
				lt(90);
				down();
			}

			{// �^�C���̒��̉~������
				int i = 1;
				while (i <= 360) {
					rt(angle);
					fd(length);
					i = i + angle;
				}
			}
		}

	}

}