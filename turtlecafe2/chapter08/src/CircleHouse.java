/**
 * �Ƃŉ~��`���v���O����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class CircleHouse extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new CircleHouse());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		//�Ԃ��O�Ղ�`������
		house.color(java.awt.Color.red);
		house.down();

		//�A�j���[�V�������[�v
		while (true) {

			//�҂�
			sleep(0.1); //0.1�b

			//�������s��
			house.rt(5);
			house.fd(5);

			//�ĕ`�悷��
			update();
		}

	}

}