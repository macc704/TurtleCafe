/*
 * �Ƃ��E�ɓ������v���O����(����1: �E�Ɍ����ē��������@)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class MoveRightHouse1 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse1());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		house.rt(90);
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // 1�R�}�̏������s��
					house.fd(5);
				}
				update();
			}
		}
	}

}