/*
 * �}�E�X�̈ʒu�ɎԂ������v���O���� (�ϐ��ȗ���)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa 
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class HandleMouse2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse2());
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
					car.warp(mouseX(), mouseY());
				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}