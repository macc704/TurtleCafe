/*
 * ����񂯂�A�j���[�V�����v���O����
 * 
 * 2003/05/08 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class JankenAnimation extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new JankenAnimation());
	}

	// �^�[�g���𓮂�������
	public void start() {
		Goo g = new Goo();
		Choki c = new Choki();
		Paa p = new Paa();
		{ // c//�����ʒu�Ƀ��[�v
			g.warp(100, 100);
			c.warp(200, 100);
			p.warp(300, 100);
		}
		{ // �A�j���[�V�������[�v
			int i = 0;
			while (true) {
				sleep(0.5);
				{ // ��R�}�̏���
					if ((i % 3) == 0) {
						g.looks(g);
					} else if ((i % 3) == 1) {
						g.looks(c);
					} else {
						g.looks(p);
					}
				}
				i++;
				update();
			}
		}
	}
}