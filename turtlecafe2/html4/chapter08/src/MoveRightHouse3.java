/*
 * �Ƃ��E�ɓ������v���O����(����3: ��Ɍ������܂܉E�ɓ�����(���[�v���g��))
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class MoveRightHouse3 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse3());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // 1�R�}�̏������s��
					int x = house.getX();
					int y = house.getY();
					house.warp(x + 5, y);
				}
				update();
			}
		}
	}

}