/*
 * �L�[�ɑΉ����ĎԂ������v���O����2 
 * (�����Ă邩�ǂ������ׂāC���������ɑΉ��ł���o�[�W����)
 * 
 * 2011/11/22 Yoshiaki Matsuzawa 
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class HandleKeyDown extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKeyDown());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������
		ImageTurtle car = new ImageTurtle("car.gif"); // �Ԃ𐶐�

		{// �A�j���[�V�������[�v
			while (true) {
				// --- �҂� ---
				sleep(0.025);

				{ // ��R�}�̏���������
					{// ���L�[�̏���
						if (keyDown(37)) { // ��
							int x = car.getX();
							int y = car.getY();
							car.warp(x - 5, y);
						}
					}
					{// ��L�[�̏���
						if (keyDown(38)) { // ��
							int x = car.getX();
							int y = car.getY();
							car.warp(x, y - 5);
						}
					}
				}
				// --- �ĕ`�� ---
				update();
			}
		}
	}

}