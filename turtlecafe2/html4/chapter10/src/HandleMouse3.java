/*
 * �}�E�X�̉������ʒu�ɎԂ������v���O����
 * 
 * 2003/06/23 Yoshiaki Matsuzawa 
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class HandleMouse3 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse3());
	}

	// �^�[�g���𓮂�������
	public void start() {
		hide();// �^�[�g��������
		ImageTurtle car = new ImageTurtle("car.gif");// �Ԃ𐶐�

		{// �A�j���[�V�������[�v
			while (true) {
				// -- �҂@---
				sleep(0.1);

				{ // ��R�}�̏���������
					// �}�E�X���N���b�N���ꂽ���̏���
					if (mouseClicked()) {
						car.warp(mouseX(), mouseY());// �Ԃ��}�E�X�̈ʒu�Ɉړ�
					}
				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}