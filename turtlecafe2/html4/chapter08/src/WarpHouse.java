/*
 * 4�̉Ƃ����[�v���g���Ĕz�u����v���O����
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class WarpHouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new WarpHouse());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house1 = new House();
		House house2 = new House();
		House house3 = new House();
		House house4 = new House();
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // �������s��
					house1.warp(100, 100);
					house2.warp(100, 200);
					house3.warp(200, 100);
					house4.warp(200, 200);
				}
				update();
			}
		}
	}

}