/*
 * �Ԃ�_�ł�����v���O����
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 ���� Yoshiaki Matsuzawa
 */
public class OnAndOffCar extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new OnAndOffCar());
	}

	// �^�[�g���𓮂�������
	public void start() {
		ImageTurtle car = new ImageTurtle("car.gif");
		{ // �A�j���[�V�������[�v
			int i = 0;
			while (true) {
				sleep(0.2);
				{ // 1�R�}�̏���
					if ((i % 2) == 0) {
						car.show();
					} else {
						car.hide();
					}
				}
				i++;
				update();
			}
		}
	}

}