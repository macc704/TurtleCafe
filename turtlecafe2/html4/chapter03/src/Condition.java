/*
 * ���͂��ꂽ�ԍ��̊G�������v���O����
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class Condition extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Condition());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int pictureNumber;// �G�̔ԍ�

		{// ���[�U������͂��󂯎��
			print("���������G�̔ԍ�����͂��Ă��������B(1.��, 2.��)");
			pictureNumber = input();
		}

		if (pictureNumber == 1) {// ���͂��ꂽ�ԍ���1�Ȃ��
			{// c//�Ƃ�����

				int length = 50;// 1�ӂ̒���
				int rightAngle = 90;// ���p

				{// ����������
					rt(30); // 30�x�E�ɉ��
					fd(length); // x���O�ɐi��
					rt(120);
					fd(length);
					rt(120);
					fd(length);
				}

				{// �{�̂�����
					lt(rightAngle);
					fd(length);
					lt(rightAngle);
					fd(length);
					lt(rightAngle);
					fd(length);
					lt(rightAngle);
					fd(length);
				}
			}

		} else {// ���͂��ꂽ�ԍ���1�ȊO�Ȃ��
			{// c//��������

				int length = 100;// 1�ӂ̒���
				int angle = 144;// ���������Ƃ��ɋȂ���p�x

				{// ��������
					rt(18);
					fd(length);
					rt(angle);
					fd(length);
					rt(angle);
					fd(length);
					rt(angle);
					fd(length);
					rt(angle);
					fd(length);
				}
			}

		}

	}

}