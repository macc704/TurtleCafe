/**
 * �}�E�X�̃h���b�O�����ʒu�ɎԂ������v���O����
 * 
 * Yoshiaki Matsuzawa 2011/11/22
 */
public class Kadai02 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Kadai02());
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

			// �����C���}�E�X�{�^����������Ă�����
			if (leftMouseDown() && car.contains(mouseX(), mouseY())) {
				car.warp(mouseX(), mouseY());// �Ԃ��}�E�X�̈ʒu�Ɉړ�
			}

			// --- �ĕ`�� ---
			update();
		}

	}

}