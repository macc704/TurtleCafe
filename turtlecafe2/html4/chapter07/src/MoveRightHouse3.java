/**
 * �Ƃ��E�ɓ������v���O����
 * ����3 : ��Ɍ������܂܉E�ɓ�����(���[�v���g��)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/16
 */
public class MoveRightHouse3 extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse3());
	}

	//�^�[�g���𓮂�������
	public void start() {

		House house = new House(); //�Ƃ𐶐�

		int x; //x���W������ϐ�
		int y; //y���W������ϐ�

		//�A�j���[�V�������[�v
		while (true) {

			//�҂�
			sleep(0.1); //0.1�b

			//�������s��
			x = house.getX(); //�Ƃ�x���W���擾����
			y = house.getY(); //�Ƃ�y���W���擾����
			house.warp(x + 5, y); //�E�Ɉړ�

			//�ĕ`�悷��
			update();
		}

	}

}