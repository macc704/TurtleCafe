/*
 * �Ƃŉ~��`���v���O����
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 ���� Yoshiaki Matsuzawa
 */
public class CircleHouse extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new CircleHouse());
	}

	// �^�[�g���𓮂�������
	public void start() {
		House house = new House();
		{ // �Ԃ��O�Ղ�`������
			house.color(java.awt.Color.red);
			house.down();
		}
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // c//1�R�}�̏������s��
					house.rt(5);
					house.fd(5);
				}
				update();
			}
		}
	}

}