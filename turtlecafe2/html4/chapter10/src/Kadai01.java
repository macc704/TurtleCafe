/*
 * 
 * 
 * Yoshiaki Matsuzawa 2011/11/22
 */
public class Kadai01 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Kadai01());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������

		// �Ԃ𐶐�
		ImageTurtle car = new ImageTurtle("car.gif");

		while (true) {

			// --- �҂� ---
			sleep(0.025);

			// --- ���� ---
			// �L�[��������Ă�����C�Ԃ𓮂���
			if (keyDown(37)) { // ��
				int x = car.getX();
				int y = car.getY();
				car.warp(x - 5, y);
			}
			if (keyDown(38)) { // ��
				int x = car.getX();
				int y = car.getY();
				car.warp(x, y - 5);
			}
			if (keyDown(39)) { // �E
				int x = car.getX();
				int y = car.getY();
				car.warp(x + 5, y);
			}
			if (keyDown(40)) { // ��
				int x = car.getX();
				int y = car.getY();
				car.warp(x, y + 5);
			}

			// --- �ĕ`�� ---
			update();
		}
	}

}