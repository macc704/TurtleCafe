/*
 * �L�[�ԍ��𒲂ׂ�v���O����
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class CheckKeycode extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new CheckKeycode());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������
		TextTurtle taro = new TextTurtle("");// ����(���Y)�𐶐�

		{// �A�j���[�V�������[�v
			while (true) {
				// --- �҂� ---
				sleep(0.1);

				{ // ��R�}�̏���������
					int keycode = key(); // ��������Ă���L�[���擾����
					taro.text(keycode); // ������Ă���L�[�ԍ��𕶎��ɂ��ĕ\������
				}

				// --- �ĕ`�� ---
				update();
			}
		}
	}

}