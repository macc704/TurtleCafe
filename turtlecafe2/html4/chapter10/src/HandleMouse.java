/*
 * �}�E�X�̈ʒu�ɎԂ������v���O����
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa 
 */
public class HandleMouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������
		ImageTurtle car = new ImageTurtle("car.gif");// �Ԃ𐶐�

		{// �A�j���[�V�������[�v
			while (true) {
				// --- �҂� ---
				sleep(0.1);

				{// ��R�}�̏���������
					// �Ԃ��}�E�X�̈ʒu�Ɉړ�����
					int mx = mouseX();// �}�E�X��x���W���擾����
					int my = mouseY();// �}�E�X��y���W���擾����
					car.warp(mx, my);
				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}