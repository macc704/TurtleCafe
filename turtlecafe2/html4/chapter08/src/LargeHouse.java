/*
 * �Ƃ�傫������v���O����(�傫���𑪂�)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class LargeHouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LargeHouse());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // 1�R�}�̏������s��
					house.size(200, 200);
				}
				update();
			}
		}
	}

}