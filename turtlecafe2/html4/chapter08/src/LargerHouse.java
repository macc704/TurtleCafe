/*
 * �Ƃ�傫������v���O����(����1: �傫�����Ă���)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class LargerHouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LargerHouse());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // 1�R�}�̏������s��
					int width = house.getWidth();
					int height = house.getHeight();
					house.size(width + 2, height + 2);
				}
				update();
			}
		}
	}

}