/*
 * �Ԃ����v���O����
 * 
 * 2003/06/23�@Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class RotateCar extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateCar());
	}

	// �^�[�g���𓮂�������
	public void start() {
		ImageTurtle car = new ImageTurtle("car.gif");
		{ // �A�j���[�V�������[�v
			while (true) {
				sleep(0.1);
				{ // ����
					car.rt(5);
				}
				update();
			}
		}
	}

}