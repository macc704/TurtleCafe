/*
 * ����񂯂�v���O����
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 ���� Yoshiaki Matsuzawa
 */
public class Janken extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Janken());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int handNumber;// ����񂯂�̎�

		// ����񂯂�̎�́@1���O�[,2���`���L,3���p�[�Ƃ���
		handNumber = random(3) + 1;// random(3)��0����2�܂ł̒l�𔭐�����̂�1�𑫂�

		if (handNumber == 1) {
			{// c//�O�[������
				fd(30);

				lt(30);
				fd(25);
				rt(60);
				fd(25);
				rt(150);
				fd(30);
				lt(180);
				fd(20);

				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);

				fd(65);
			}

		} else if (handNumber == 2) {
			{// c//�`���L������

				fd(30);

				lt(30);
				fd(25);
				rt(60);
				fd(25);
				rt(150);
				fd(30);
				lt(180);
				fd(30);

				lt(15);
				fd(80);
				rt(105);
				fd(20);
				rt(75);
				fd(80);
				lt(75);

				lt(75);
				fd(80);
				rt(75);
				fd(20);
				rt(105);
				fd(80);
				fd(20);
				lt(105);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);

				fd(65);
			}

		} else if (handNumber == 3) {
			{// c//�p�[������

				fd(30);

				lt(30);
				fd(80);
				rt(120);
				fd(20);
				rt(60);
				fd(40);
				lt(150);
				fd(15);

				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);
				lt(90);
				fd(5);

				lt(90);
				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);
				lt(90);
				fd(5);

				lt(90);
				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);
				lt(90);
				fd(5);

				lt(90);
				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);

				fd(75);
			}

		} else { // 1,2,3�ȊO�̏ꍇ

			print("�s���Ȑ��ł��B");

		}

	}

}