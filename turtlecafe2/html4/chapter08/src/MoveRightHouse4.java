/*
 * �Ƃ��E�ɓ������v���O����(����4: �E�[�ɍs�����獶�[�ɖ߂�(���[�v���g��))
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class MoveRightHouse4 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse4());
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
					{ // �E�Ɉړ�
						house.warp(x + 5, y);
					}
					{ // �E�[�������獶�[�Ƀ��[�v
						if (x >= 300) {
							house.warp(0, y);
						}
					}
				}
				update();
			}
		}
	}

}