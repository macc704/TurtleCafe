/*
 * �}�E�X�̂����蔻�������v���O����
 * (�}�E�X���Ԃɂ�����ƁC�Ԃ��������Ȃ�)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class ContainsJudge extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ContainsJudge());
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
					// �Ԃ��}�E�X�̈ʒu�Ɋ܂܂�Ă���ꍇ�̏���
					if (car.contains(mouseX(), mouseY())) {
						car.small(5);// �Ԃ�����������
					}
				}

				// --- �ĕ`�� ---
				update();
			}
		}

	}

}