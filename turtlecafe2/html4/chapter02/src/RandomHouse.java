/*
 * �Ƃ������v���O���� (�����_���ȑ傫���ɂ���)
 * 2003/05/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class RandomHouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RandomHouse());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int length;// 1�ӂ̒���
		int rightAngle = 90;// ���p

		length = random(100);// 1�ӂ̒�����0-99�܂ł̃����_���l�ɐݒ肷��

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

}