/*
 * �}�E�X�̃h���b�O�����ʒu�ɎԂ������v���O����
 * 
 * 2011/11/22 Yoshiaki Matsuzawa 
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class HandleMouseDown extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouseDown());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������
		ImageTurtle car = new ImageTurtle("car.gif");// �Ԃ𐶐�

		{// �A�j���[�V�������[�v
			while (true) {
				// --- �҂� ---
				sleep(0.1);

				{ // ��R�}�̏���������
					// ���}�E�X�{�^����������Ă��鎞�̏���
					if (leftMouseDown()) {
						car.warp(mouseX(), mouseY());// �Ԃ��}�E�X�̈ʒu�Ɉړ�
					}
				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}