/*
 * �Ƃ��E�ɓ������v���O����(����2: ��Ɍ������܂܉E�ɓ�����)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class MoveRightHouse2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse2());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // 1�R�}�̏������s��
					house.rt(90);
					house.fd(5);
					house.lt(90);
				}
				update();
			}
		}
	}

}