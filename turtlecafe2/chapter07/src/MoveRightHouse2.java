/**
 * �Ƃ��E�ɓ������v���O����
 * ����2 : ��Ɍ������܂܉E�ɓ�����
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class MoveRightHouse2 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse2());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		//�A�j���[�V�������[�v
		while (true) {

			//�҂�
			sleep(0.1); //0.1�b

			//�������s��
			house.rt(90);
			house.fd(5);
			house.lt(90);

			//�ĕ`�悷��
			update();
		}

	}

}