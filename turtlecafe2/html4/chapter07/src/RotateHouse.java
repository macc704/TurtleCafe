/**
 * �^�[�g���ŏ������G���܂킷�v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class RotateHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new RotateHouse());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		//�A�j���[�V�������[�v
		while (true) {

			//�҂�
			sleep(0.1); //0.1�b

			//�������s��
			house.rt(5);

			//�ĕ`�悷��
			update();
		}

	}

}