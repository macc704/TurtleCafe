/*
 * �L�[�ɑΉ����ĎԂ������v���O����
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa 
 */
public class HandleKey extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKey());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������
		ImageTurtle car = new ImageTurtle("car.gif");// �Ԃ𐶐�

		{// �A�j���[�V�������[�v
			while (true) {
				// --- �҂� ---
				sleep(0.025);

				{// ��R�}�̏���������
					// ���L�[��������Ă�����C�Ԃ𓮂���
					int x = car.getX();
					int y = car.getY();
					if (key() == 37) { // ��
						car.warp(x - 5, y);
					}
				}

				// --- �ĕ`�� ---
				update();
			}
		}
	}

}