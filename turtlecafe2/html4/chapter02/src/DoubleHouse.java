/*
 * �Ƃ�2�����v���O���� (�v�Z������v���O�����̗�)
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class DoubleHouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new DoubleHouse());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int length = 100;// 1�ӂ̒���
		int smallHouseLength;// �������Ƃ�1�ӂ̒���
		int rightAngle = 90;// ���p
		smallHouseLength = length / 2;

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

		{// �������Ƃ������ʒu�܂ňړ�����
			up();
			lt(rightAngle * 2);
			fd(length * 2);
			lt(rightAngle);
			down();
		}

		{// �������Ƃ̉���������
			rt(30);
			fd(smallHouseLength);
			rt(120);
			fd(smallHouseLength);
			rt(120);
			fd(smallHouseLength);
		}

		{ // �������Ƃ̖{�̂�����
			lt(rightAngle);
			fd(smallHouseLength);
			lt(rightAngle);
			fd(smallHouseLength);
			lt(rightAngle);
			fd(smallHouseLength);
			lt(rightAngle);
			fd(smallHouseLength);
		}
	}

}