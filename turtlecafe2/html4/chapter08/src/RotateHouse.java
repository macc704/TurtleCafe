/*
 * �^�[�g���ŏ������G���܂킷�v���O����
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class RotateHouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateHouse());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // �������s��
					house.rt(5);
				}
				update();
			}
		}
	}

}