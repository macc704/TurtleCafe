/*
 * �h��������������v���O����
 * 2003/06/08 Yoshiaki Matsuzawa
 */
public class Doraemon extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Doraemon());
	}

	// �^�[�g���𓮂�������
	public void start() {

		int i;// ���[�v�p1
		int j;// ���[�v�p2

		int length = 10;
		int margin = 24;
		int angle = 0;

		// �ڂ�����
		i = 1;
		while (i <= 2) {

			// �ڂ�����
			length = 1;
			angle = 5;
			j = 1;
			while (j <= 360) {
				fd(length);
				rt(angle);
				j = j + angle;
			}

			// �ړ�
			up();
			rt(90);
			fd(margin);
			lt(90);
			down();

			i++;
		}

		// �@�������ʒu�܂ňړ�
		up();
		lt(90);
		fd(margin);
		fd(margin / 2);
		lt(90);
		fd(margin);
		lt(180);
		down();

		// �@������
		color(java.awt.Color.red);
		length = 1;
		angle = 5;
		i = 1;
		while (i <= 360) {
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// �֊s�������ʒu�܂ňړ�
		up();
		rt(90);
		fd(margin / 2);
		rt(90);
		fd(margin * 2 + 15);
		rt(90);
		down();

		// �֊s������
		color(java.awt.Color.blue);
		length = 1;
		angle = 1;
		i = 1;
		while (i <= 360) {
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// ���̗֊s
		color(java.awt.Color.blue);
		length = 4;
		angle = 5;
		i = 0;
		while (i < 360) {
			if (i <= 150 || i > 210) {
				down();
			} else {
				up();
			}
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// ���������ʒu�܂ňړ�
		up();
		bk(length / 2);
		rt(90);
		fd(20);
		lt(90);
		down();

		// ��������
		color(java.awt.Color.black);
		length = 4;
		angle = 5;
		fd(length / 2);
		i = 1;
		while (i <= 360) {
			if (i <= 60 || i >= 300) {
				down();
			} else {
				up();
			}
			fd(length);
			rt(angle);
			i = i + angle;
		}

		// �����̂Ђ�������
		length = 35;
		lt(15);
		up();
		i = 1;
		while (i <= 3) {
			// �ړ�
			rt(15);
			fd(30);

			// �Ђ�
			down();
			fd(length);
			up();

			// �߂�
			rt(180);
			fd(length);
			fd(30);
			rt(180);
			i++;
		}
		lt(45);
		rt(15);

		// �E�̂Ђ����������߂ɉ�]
		rt(180);

		// �E���̂Ђ�������
		length = 35;
		rt(15);
		up();
		i = 1;
		while (i <= 3) {
			// �ړ�
			lt(15);
			fd(30);

			// �Ђ�������
			down();
			fd(length);
			up();

			// �߂�
			rt(180);
			fd(length);
			fd(30);
			rt(180);

			i++;
		}
		rt(45);
		lt(15);

		// ���̑���
		down();
		lt(90);
		fd(margin * 2 + 15 - 20 - margin / 2);

		// �ڋʂ������ʒu�Ɉړ�
		up();
		fd(margin + margin / 2);
		down();

		// ���ڋʂ�����
		i = 5;
		while (i <= 15) {

			// �~������
			length = 1;
			angle = i;
			j = 1;
			while (j <= 360) {
				fd(length);
				lt(angle);
				j = j + angle;
			}
			lt(360 - j);// ���[�̒���

			i++;
		}

		// ����
		lt(1);

		// �E�ڋʂ�����
		i = 5;
		while (i <= 15) {
			// �~������
			length = 1;
			angle = i;
			j = 1;
			while (j <= 360) {
				fd(length);
				rt(angle);
				j = j + angle;
			}
			rt(360 - j);// ���[�̒���

			i++;
		}

		// �ړ����ĉ���ďI��
		up();
		fd(100);
		rt(2000);

	}

}