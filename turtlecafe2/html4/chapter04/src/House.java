/*
 * �Ƃ������v���O����
 * 2003/05/08 Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class House extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new House());
	}

	// �^�[�g���𓮂�������
	public void start() {

		{// ����������
			rt(30);
			fd(50);
			rt(120);
			fd(50);
			rt(120);
			fd(50);
			rt(120);
			lt(30);
		}

		{// �{�̂�����
			rt(90);
			fd(50);
			rt(90);
			fd(50);
			rt(90);
			fd(50);
			rt(90);
			fd(50);
		}
	}

}