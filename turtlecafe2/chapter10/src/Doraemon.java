/*
 * �h��������������v���O����
 * 2003/06/08
 * Yoshiaki Matsuzawa
 */
public class Doraemon extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Doraemon());
	}

	//�^�[�g���𓮂�������
	public void start() {

		int i; //���[�v�p1
		int j; //���[�v�p2
		int k; //���[�v�p3

		int length = 10; //�傫��
		int margin = 24; //�ׂ̖ڂƂ̊Ԋu
		int angle = 0;

		//�ڂ�����
		i = 1;
		while (i <= 2) {
			//�ڂ�����
			j = 1;
			angle = 5;
			while (j <= 360) {
				rt(angle);
				fd(1);
				j = j + angle;
			}
			//�ړ�
			up();
			rt(90);
			fd(margin);
			lt(90);
			down();

			i = i + 1;
		}

		//�@�������ʒu�܂ňړ�
		up();
		lt(90);
		fd(margin);
		fd(margin / 2);
		lt(90);
		fd(margin);
		lt(180);
		down();

		//�@������
		color(java.awt.Color.red);
		j = 1;
		angle = 5;
		while (j <= 360) {
			rt(angle);
			fd(1);
			j = j + angle;
		}

		//�֊s�������ʒu�܂ňړ�
		up();
		rt(90);
		fd(margin / 2);
		rt(90);
		fd(margin * 2 + 15);
		rt(90);
		down();

		//�֊s������
		color(java.awt.Color.blue);
		j = 1;
		angle = 1;
		while (j <= 360) {
			rt(angle);
			fd(1);
			j = j + angle;
		}

		//�֊s�Q��
		color(java.awt.Color.blue);
		j = 1;
		length = 4;
		fd(length / 2);
		angle = 5;
		while (j <= 360) {
			if (j <= 150 || j >= 210) {
				down();
			} else {
				up();
			}
			rt(angle);
			fd(length);
			j = j + angle;
		}

		//���������ʒu�܂ňړ�
		up();
		bk(length / 2);
		rt(90);
		fd(20);
		lt(90);
		down();

		//��������
		color(java.awt.Color.black);
		j = 1;
		length = 4;
		fd(length / 2);
		angle = 5;
		while (j <= 360) {
			if (j <= 60 || j >= 300) {
				down();
			} else {
				up();
			}
			rt(angle);
			fd(length);
			j = j + angle;
		}

		//�Ђ�������
		length = 35;
		lt(15);

		i = 1;
		while (i <= 3) {
			rt(15);
			up();
			fd(30);
			down();
			fd(length);
			up();
			rt(180);
			fd(length);
			fd(30);
			rt(180);
			i = i + 1;
		}
		lt(30);

		rt(180);

		//�E�̂Ђ�������
		rt(15);
		i = 1;
		while (i <= 3) {
			lt(15);
			up();
			fd(30);
			down();
			fd(length);
			up();
			rt(180);
			fd(length);
			fd(30);
			rt(180);
			i = i + 1;
		}
		rt(30);

		//���̑���
		down();
		lt(90);
		fd(margin * 2 + 15 - 20 - margin / 2);

		//�ړ�
		up();
		fd(margin + margin / 2);
		down();

		//�Ō�
		//���ڋʂ�����
		i = 5;
		while (i <= 15) {
			angle = i;
			j = 1;
			while (j <= 360) {
				lt(angle);
				fd(1);
				j = j + angle;
			}
			lt(360 - j);

			i = i + 1;
		}

		lt(1);

		//�E�ڋʂ�����
		i = 5;
		while (i <= 15) {
			angle = i;
			j = 1;
			while (j <= 360) {
				rt(angle);
				fd(1);
				j = j + angle;
			}
			rt(360 - j);
			i = i + 1;
		}

		up();
		fd(100);
		//�����̂�������
		i = 0;
		while (i < 100) {
			rt(5);
			i = i + 1;
		}
	}

}