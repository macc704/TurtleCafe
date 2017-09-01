/*
 * �l�������A�j���[�V�����v���O����(�w�i�t��)
 * 
 * 2003/06/17 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class WalkingManWithBg extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new WalkingManWithBg());
	}

	// �^�[�g���𓮂�������
	public void start() {

		{// �E�C���h�E���ړ�, �傫������
			window.warp(100, 100);
			window.size(480, 420);
			hide();// �T������
		}

		// �o�b�N�O���E���h�摜��p�ӂ���
		ImageTurtle bg = new ImageTurtle("bg.jpg");

		// �A�j���[�V�����p�摜��p�ӂ���
		ImageTurtle man1 = new ImageTurtle("man1.gif");
		ImageTurtle man2 = new ImageTurtle("man2.gif");
		ImageTurtle man3 = new ImageTurtle("man3.gif");
		ImageTurtle man4 = new ImageTurtle("man4.gif");
		ImageTurtle man5 = new ImageTurtle("man5.gif");
		ImageTurtle man6 = new ImageTurtle("man6.gif");
		ImageTurtle man7 = new ImageTurtle("man7.gif");
		ImageTurtle man8 = new ImageTurtle("man8.gif");

		{ // ����
			man1.warp(240, 240);
			man2.hide();
			man3.hide();
			man4.hide();
			man5.hide();
			man6.hide();
			man7.hide();
			man8.hide();
		}

		{// �A�j���[�V�������[�v
			int i = 0;
			while (true) {

				// --- �҂� ---
				sleep(0.1); // 0.1�b

				{ // ��R�}�̏���
					// �w�i�𓮂���
					int x = bg.getX();
					int y = bg.getY();
					bg.warp(x - 2, y);
					if (i % 8 == 0) {
						man1.looks(man1);
					} else if (i % 8 == 1) {
						man1.looks(man2);
					} else if (i % 8 == 2) {
						man1.looks(man3);
					} else if (i % 8 == 3) {
						man1.looks(man4);
					} else if (i % 8 == 4) {
						man1.looks(man5);
					} else if (i % 8 == 5) {
						man1.looks(man6);
					} else if (i % 8 == 6) {
						man1.looks(man7);
					} else if (i % 8 == 7) {
						man1.looks(man8);
					}
				}

				// --- �ĕ`�悷�� ---
				i++;
				update();

			}
		}

	}

}