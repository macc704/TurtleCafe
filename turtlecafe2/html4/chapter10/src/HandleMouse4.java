/*
 * �}�E�X�̉������ʒu�ɎԂ������v���O���� (�E�N���b�N�C���N���b�N�����)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa 
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class HandleMouse4 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse4());
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
					{// ���}�E�X�{�^�����N���b�N���ꂽ���̏���
						if (leftMouseClicked()) {
							car.warp(mouseX(), mouseY());// �Ԃ��}�E�X�̈ʒu�Ɉړ�
						}
					}
					{ // �E�}�E�X�{�^�����_�u���N���b�N���ꂽ���̏���
						if (rightMouseClicked() && doubleClick()) {
							car.show(!car.isShow());// �Ԃ�(����/�B��)
						}
					}
				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}